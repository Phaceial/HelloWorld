package edu.temple.helloworld;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.clickButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView message = (TextView) findViewById(R.id.textView);
                message.setText("You have clicked the button");
            }
        });
    }
}
