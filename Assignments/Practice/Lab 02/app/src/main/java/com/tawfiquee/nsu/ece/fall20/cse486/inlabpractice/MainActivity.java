package com.tawfiquee.nsu.ece.fall20.cse486.inlabpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int count = 0;
    public TextView countTextView= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countTextView = (TextView)findViewById(R.id.textView_count);
    }

    public void ShowToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_label_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void updateCount(View view) {
        count++;
        if (countTextView !=null) {
            countTextView=setText(count);
        }
    }
}