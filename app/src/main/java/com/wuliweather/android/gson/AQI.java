package com.wuliweather.android.gson;

/**
 * Created by wenyuheng on 2018/12/29.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
