package com.lqy.muitlchannelpack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_main = findViewById(R.id.tv_main);
        String applicationId = BuildConfig.APPLICATION_ID;
        //当前版本
        String flavor = BuildConfig.FLAVOR;
        //接口环境
        String apiHost = BuildConfig.API_HOST;
        //是否是debug版本
        boolean isDebug = BuildConfig.DEBUG;

        tv_main.setText("applicationId：----->" + applicationId + "\n"
                + "flavor：----->" + flavor + "\n"
                + "apiHost：----->" + apiHost + "\n"
                + "isDebug：----->" + isDebug);
    }
}
