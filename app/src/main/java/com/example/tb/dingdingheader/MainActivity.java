package com.example.tb.dingdingheader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    
    private Button mButton1Button;
    private Button mButton2Button;
    private Button mButton3Button;
    private Button mButton4Button;
    private HeaderImageView mHiHeaderImageView;
    private List<HeaderInfo> list = new ArrayList<>();
    private HeaderInfo i1, i2, i3, i4, i5;
    private static final String url1 = "http://img1.3lian.com/2015/a2/251/d/296.jpg";
    private static final String url2 = "http://img2.3lian.com/2014/f2/44/d/108.jpg";
    private static final String url3 = "http://imgsrc.baidu.com/forum/w=580/sign=ed73425a31d3d539c13d0fcb0a86e927/021597fd5266d0162dbdfc8c902bd40734fa353f.jpg";
    private static final String url4 = "http://img5.niutuku.com/phone/1301/1830/1830-niutuku.com-306096.jpg";
    
    private CheckBox cb1, cb2, cb3, cb4;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1Button = (Button) findViewById(R.id.button1);
        mButton2Button = (Button) findViewById(R.id.button2);
        mButton3Button = (Button) findViewById(R.id.button3);
        mButton4Button = (Button) findViewById(R.id.button4);
        mHiHeaderImageView = (HeaderImageView) findViewById(R.id.hi);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);
        
        mButton1Button.setOnClickListener(this);
        mButton2Button.setOnClickListener(this);
        mButton3Button.setOnClickListener(this);
        mButton4Button.setOnClickListener(this);
        
        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);
        cb3.setOnCheckedChangeListener(this);
        cb4.setOnCheckedChangeListener(this);
        
        //https需另做支持
        i1 = new HeaderInfo("上的当然a", "", 1115);
        i2 = new HeaderInfo("上的当", "", 1110);
        i3 = new HeaderInfo("上的", "", 1112);
        i4 = new HeaderInfo("上", "", 1113);
        i5 = new HeaderInfo("上的当然", "", 111);
        
        list.clear();
        list.add(i1);
        mHiHeaderImageView.setTextSize1(20f).setTextSizeOther(15f).setList(list);
    }
    
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                list.clear();
                list.add(i1);
                break;
            case R.id.button2:
                list.clear();
                list.add(i1);
                list.add(i2);
                break;
            case R.id.button3:
                list.clear();
                list.add(i1);
                list.add(i2);
                list.add(i3);
                break;
            case R.id.button4:
                list.clear();
                list.add(i1);
                list.add(i2);
                list.add(i3);
                list.add(i4);
                break;
        }
        mHiHeaderImageView.setList(list);
    }
    
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()) {
            case R.id.cb1:
                if (b) {
                    i1.uri = url1;
                } else {
                    i1.uri = "";
                }
                break;
            case R.id.cb2:
                if (b) {
                    i2.uri = url2;
                } else {
                    i2.uri = "";
                }
                break;
            case R.id.cb3:
                if (b) {
                    i3.uri = url3;
                } else {
                    i3.uri = "";
                }
                break;
            case R.id.cb4:
                if (b) {
                    i4.uri = url4;
                } else {
                    i4.uri = "";
                }
                break;
        }
        mHiHeaderImageView.dealPic();
    }
}
