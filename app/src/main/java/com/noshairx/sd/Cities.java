package com.noshairx.sd;

import com.google.gson.annotations.SerializedName;

public class Cities {
    @SerializedName("country")
    private String mCountry;
    @SerializedName("city")
    private String mCity;

    public Cities(String country, String city) {
        mCountry = country;
        mCity = city;
    }


}
