package com.example.allinone.wallpaper;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
ImageView img;
int birdnum=0;
int birdohoto[]={R.drawable.bird1,
        R.drawable.bird2,
        R.drawable.bird3,
        R.drawable.bird4,
        R.drawable.bird5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=(ImageView)findViewById(R.id.imageView);
    }

    public void btm(View view) {
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getBaseContext());
        try{
            wallpaperManager.setResource(birdohoto[birdnum]);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void img(View view) {
        if(birdnum<4){
            birdnum++;
            img.setImageResource(birdohoto[birdnum]);
        }else
            birdnum=0;
    }
}
