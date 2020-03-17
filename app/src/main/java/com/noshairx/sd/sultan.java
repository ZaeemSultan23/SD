package com.noshairx.sd;

import com.google.gson.annotations.SerializedName;

public class sultan {


   @SerializedName("name")
    private String mName;
   @SerializedName("age")
    private int mAge;
   @SerializedName("mail")
    private String mMail;
   @SerializedName("cities")
   private Cities mCities;

    public sultan(String name, int age, String mail, Cities cities) {
        mName = name;
        mAge = age;
        mMail = mail;
        mCities = cities;


    }
}
