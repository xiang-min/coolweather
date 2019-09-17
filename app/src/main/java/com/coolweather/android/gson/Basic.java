package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by min.xiang on 2019/9/16.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

//    这里GSON无法解析weatherId，所以注解掉
//    @SerializedName("id")
//    public int weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }

}
