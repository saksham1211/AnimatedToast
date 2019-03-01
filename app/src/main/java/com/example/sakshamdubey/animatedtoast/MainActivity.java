package com.example.sakshamdubey.animatedtoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.animtoast.ToastAnim;
import com.shashank.sony.fancytoastlib.FancyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void fail(View view) {

        ToastAnim.makeText(MainActivity.this, "FAIL", ToastAnim.LENGTH_LONG, R.raw.error,
                R.drawable.fail_shape).show();


    }

    public void success(View view) {

        ToastAnim.makeText(MainActivity.this,"SUCCESS", ToastAnim.LENGTH_LONG, R.raw.animation,
                R.drawable.success_shape).show();

    }
}
