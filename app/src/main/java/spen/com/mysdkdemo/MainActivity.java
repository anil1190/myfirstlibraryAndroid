package spen.com.mysdkdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import spen.com.mypreflibrary.MyPrefrence;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = MainActivity.class.getSimpleName();
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        init();
    }

    public void init(){
        MyPrefrence.getInstance(context).saveBoolean("is_Logged_in",true);
        boolean isLoggedIn = MyPrefrence.getInstance(context).getBoolean("is_logged_in");
        Log.d(TAG, "init(): isLoggedIn=" + isLoggedIn);
        MyPrefrence.getInstance(context).clear();
    }
}
