package com.wuliweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by wenyuheng on 2018/12/26.
 */

public class Province extends LitePalSupport{

    private int id;

    private String provinceName;//省名称

    private int provinceCode;//省代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }




}
