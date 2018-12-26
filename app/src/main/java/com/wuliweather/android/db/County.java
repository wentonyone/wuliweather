package com.wuliweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by wenyuheng on 2018/12/26.
 */

public class County extends LitePalSupport{

    private int id;

    private String countyName;//县名

    private String weatherId;//县所对应的天气id

    private int cityId;//当前县所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
