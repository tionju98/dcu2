package com.cookandroid.dcu2;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabSpec tabSpecSong = tabHost.newTabSpec("HOME").setIndicator("HOME");
        tabSpecSong.setContent(R.id.home);
        tabHost.addTab(tabSpecSong);

        TabSpec tabSpecArtist = tabHost.newTabSpec("PAYMENT_HISTORY")
                .setIndicator("결제내역");
        tabSpecArtist.setContent(R.id.payment_history);
        tabHost.addTab(tabSpecArtist);

        TabSpec tabSpecAlbum = tabHost.newTabSpec("SHOPPING_BAG").setIndicator("장바구니");
        tabSpecAlbum.setContent(R.id.shopping_bag);
        tabHost.addTab(tabSpecAlbum);

        tabHost.setCurrentTab(0);


    }
    //메뉴선택 하면 메뉴선택 화면으로 넘어가기
    public void onClick(View v){
        Intent intent = new Intent(getApplicationContext(), select_menu.class);
        startActivity(intent);
    }
}
