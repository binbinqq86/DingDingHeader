package com.example.tb.dingdingheader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    
    private Button mButton1Button;
    private Button mButton2Button;
    private Button mButton3Button;
    private Button mButton4Button;
    private HeaderImageView mHiHeaderImageView;
    private List<HeaderInfo> list=new ArrayList<>();
    private HeaderInfo i1,i2,i3,i4,i5;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1Button = (Button) findViewById(R.id.button1);
        mButton2Button = (Button) findViewById(R.id.button2);
        mButton3Button = (Button) findViewById(R.id.button3);
        mButton4Button = (Button) findViewById(R.id.button4);
        mHiHeaderImageView = (HeaderImageView) findViewById(R.id.hi);
        
        mButton1Button.setOnClickListener(this);
        mButton2Button.setOnClickListener(this);
        mButton3Button.setOnClickListener(this);
        mButton4Button.setOnClickListener(this);
    
        i1=new HeaderInfo("上的当然a","http://img1.3lian.com/2015/a2/251/d/296.jpg",1115);
        i2=new HeaderInfo("上的当","http://img2.3lian.com/2014/f2/44/d/108.jpg",1110);
        i3=new HeaderInfo("上的","",1112);
        i4=new HeaderInfo("上","",1113);
        i5=new HeaderInfo("上的当然","",111);
        
        list.clear();
        list.add(i1);
        mHiHeaderImageView.setTextSize1(20f).setTextSizeOther(15f).setList(list);
    }
    
    @Override
    public void onClick(View view) {
        switch (view.getId()){
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
}
