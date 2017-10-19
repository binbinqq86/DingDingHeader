package com.example.tb.dingdingheader;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by : tb on 2017/10/18 下午1:21.
 * Description :头像群组
 */
public class HeaderInfo implements Serializable {
    public String presentName;//要显示的名字
    public String uri;//要显示的头像地址，如果无则显示颜色值
    public long id;//每个人唯一的id
    public Bitmap bitmap;
    
    public HeaderInfo(String presentName, String uri, long id) {
        this.presentName = presentName;
        this.uri = uri;
        this.id = id;
    }
}
