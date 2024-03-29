package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by min.xiang on 2019/9/16.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
