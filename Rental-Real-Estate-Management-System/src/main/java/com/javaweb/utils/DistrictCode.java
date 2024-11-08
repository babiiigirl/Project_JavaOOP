package com.javaweb.utils;

import java.util.Map;
import java.util.TreeMap;


public enum DistrictCode {
    QUAN_BA_DINH ("Quận Ba Đình"),
    QUAN_CAU_GIAY ("Quận Cầu Giấy"),
    QUAN_DONG_DA ("Quận Đống Đa"),
    QUAN_HAI_BA_TRUNG ("Quận Hai Bà Trưng"),
    QUAN_HOAN_KIEM ("Quận Hoàn Kiếm"),
    QUAN_THANH_XUAN ("Quận Thanh Xuân"),
    QUAN_HOANG_MAI ("Quận Hoàng Mai"),
    QUAN_LONG_BIEN ("Quận Long Biên"),
    QUAN_HA_DONG ("Quận Hà Đông"),
    QUAN_TAY_HO ("Quận Tây Hồ"),
    QUAN_NAM_TU_LIEM ("Quận Nam Từ Liêm"),
    QUAN_BAC_TU_LIEM ("Quận Bắc Từ Liêm");


    private final String districtName;
    DistrictCode(String districtName) {
        this.districtName = districtName;
    }

    public String getDistrictName() {
        return districtName;
    }


    public static Map<String,String> type(){
        Map<String,String> listType = new TreeMap<>();
        for(DistrictCode item : DistrictCode.values()){
            listType.put(item.toString() , item.districtName);
        }
        return listType;
    }

}
