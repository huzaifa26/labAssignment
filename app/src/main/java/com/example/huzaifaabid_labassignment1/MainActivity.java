package com.example.huzaifaabid_labassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE="com.example.explicit_intent_datapassing_1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayImageBtnHandler(View view) {
        Intent intent=new Intent(this,DisplayImageActivity.class);
        EditText gettext=findViewById(R.id.number);
        String number=gettext.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,number);
        startActivity(intent);
    }
}