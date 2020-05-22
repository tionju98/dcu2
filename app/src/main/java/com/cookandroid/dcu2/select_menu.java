package com.cookandroid.dcu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_menu);


        //주문하기 버튼 누르면 결제 창으로 넘어가기
        final Button order = (Button) findViewById(R.id.order);

        order.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), order.class);
                startActivity(intent);
            }
        });
    }
}
