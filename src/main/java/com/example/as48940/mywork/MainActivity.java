package com.example.as48940.mywork;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button callWs = (Button) findViewById(R.id.ClickForWsCall);
        callWs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AsyncTask<String, Void, String> task = new WsCall().execute("https://172.24.57.193:8080/springPractise/getAnswer", "GET");
                String answer = "Nothing here yet!";
                try {
                    answer = task.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
                System.out.println(answer);
            }
        });
    }
}
