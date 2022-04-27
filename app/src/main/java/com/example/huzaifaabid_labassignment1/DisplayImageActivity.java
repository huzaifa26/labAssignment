package com.example.huzaifaabid_labassignment1;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_image);

        Intent intent=getIntent();
        String msg=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        System.out.println(msg);

        TextView showNumber=findViewById(R.id.showNumber);
        ImageView setImage=findViewById(R.id.imageView);

        showNumber.setText(msg);
        setImage.setImageResource(R.drawable.fastfood);




//        if(msg == "1"){
//            setImage.setImageResource(R.drawable.fastfood);
//        } else if(msg == "2"){
//            setImage.setImageResource(R.drawable.buildings);
//            showNumber.setText(msg);
//        } else if(msg == "3"){
//            setImage.setImageResource(R.drawable.technology);
//            showNumber.setText(msg);
//        } else if(msg == "4"){
//            setImage.setImageResource(R.drawable.flowers);
//            showNumber.setText(msg);
//        } else if(msg == "5"){
//            setImage.setImageResource(R.drawable.fruits);
//            showNumber.setText(msg);
//        } else showNumber.setText("No Image Found");
    }
}