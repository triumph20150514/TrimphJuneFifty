package com.trimh.nuannuan;

import android.app.DatePickerDialog;
import android.app.NotificationManager;
import android.os.Environment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.TextView;

import com.trimh.nuannuan.utils.FileUtil;
import com.trimh.nuannuan.view.DataSetAdapter;
import com.trimh.nuannuan.view.VerticalRollingTv;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] mStrs = {
                "君不见，黄河之水天上来，奔流到海不复回",
                "君不见，高堂明镜悲白发，朝如青丝暮成雪",
                "人生得意须尽欢，莫使金樽空对月",
                "天生我材必有用，千金散尽还复来",
                "烹羊宰牛且为乐，会须一饮三百杯",
                "岑夫子，丹丘生，将进酒，杯莫停"
        };
        VerticalRollingTv verticalRollingTv = (VerticalRollingTv) findViewById(R.id.rollingTv);


        verticalRollingTv.setDataSetAdapter(new DataSetAdapter<String>(Arrays.asList(mStrs)) {

            @Override
            protected String text(String s) {
                return s;
            }
        });

        verticalRollingTv.run();


//        Log.e("Environment path", Environment.getExternalStorageDirectory().getAbsolutePath() + "");
//        Log.e("Environment state", Environment.getExternalStorageState() + "");
//        Log.e("Environment getName", Environment.getExternalStorageDirectory().getName() + "");
//        Log.e("Environment getName", this.getCacheDir().getAbsolutePath() + "");
//        Log.e("Environment getName", this.getFilesDir().getPath() + "");
//
//        Log.e("Environment getName", this.getExternalFilesDir("file").getPath() + "");
//        Log.e("Environment getName", this.getExternalCacheDirs()[0].getPath() + "null");
//
//        Log.e("Environment getName", FileUtil.getInstance(this).getSavePath() + "");


    }
}
