package com.example.snc.threaddemo;
import android.widget.TextView;

/**
 * Created by SNC on 19-07-2017.
 */

public class ThreadOne implements Runnable
{
    TextView textView;

    public ThreadOne(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void run() {
        for (int i=0;i<10000000;i++){

            textView.setText(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}