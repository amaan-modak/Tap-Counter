package com.application.amaan.tapcounter;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity implements OnClickListener {

    Button btn1;
    Button btn2;
    TextView textInfo;
    EditText scoreText;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.addButton);
        btn2 = (Button)findViewById(R.id.resetButton);
        scoreText = (EditText)findViewById(R.id.editText);
        scoreText.setInputType(InputType.TYPE_NULL);
        scoreText.setText(Integer.toString(counter));
        textInfo = (TextView)findViewById(R.id.textView);
        textInfo.setInputType(InputType.TYPE_NULL);
        textInfo.setBackgroundResource(android.R.color.transparent);
        textInfo.setSingleLine(false);

//—set on click listeners on the buttons—–
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

// change font size of the text
        //textTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
    }

    @Override
    public void onClick(View v) {
        if (v == btn1){
            counter++;
            scoreText.setText(Integer.toString(counter));
        }

        if (v == btn2){
            counter = 0;
            scoreText.setText(Integer.toString(counter));
        }
    }

}