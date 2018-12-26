package com.wuliweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by wenyuheng on 2018/12/26.
 */

public class City extends LitePalSupport{

    private int id;

    private String cityName;//城市名称

    private int cityCode;//城市代号

    private int provinceid;//当前市所属省份的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(int provinceid) {
        this.provinceid = provinceid;
    }
}
