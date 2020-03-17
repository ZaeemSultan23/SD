package com.noshairx.sd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Gson gson = new Gson();
/* Serialization or Deserialization ho rhi hai agar aik chalana hai to dosray to comment bna den or dosra chalana hai to pehly ko
serialize or deserialize dono kam ho rhy hain ismai

        Cities cities = new Cities ("Pakistan", "Lahore");
        sultan sultan = new sultan ("ZAEEM", 30 , "addzupzaeem1@gmail.com",cities);
        String json = gson.toJson(sultan);
*/

        String json = "{\"cities\":{\"city\":\"Lahore\",\"country\":\"Pakistan\"},\"age\":30,\"name\":\"ZAEEM\",\"mail\":\"addzupzaeem1@gmail.com\"}";
        sultan sultan1 = gson.fromJson(json, sultan.class);

    }
}
