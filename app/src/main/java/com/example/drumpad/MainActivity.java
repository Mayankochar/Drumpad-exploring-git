package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Measure;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
ImageButton im,im1,im2,im3,im4,im5,im6,im7,im8,im9,im10,im11;
MediaPlayer m,m1,m2,m3,m4,m5,m6,m7;
int m11=1,m21=1,m31=1,m41=1,m51=1,m61=1,m71=1,m81=1;

    @Override
    protected void onPause() {
        super.onPause();
        onStop();
            }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im=findViewById(R.id.imageButton1);
        im1=findViewById(R.id.imageButton2);
        im2=findViewById(R.id.imageButton3);
        im3=findViewById(R.id.imageButton4);
        im4=findViewById(R.id.imageButton5);
        im5=findViewById(R.id.imageButton6);
        im6=findViewById(R.id.imageButton7);
        im7=findViewById(R.id.imageButton8);
        im8=findViewById(R.id.imageButton9);
        im9=findViewById(R.id.imageButton10);
        im10=findViewById(R.id.imageButton11);
        im11=findViewById(R.id.imageButton12);
        m= MediaPlayer.create(this,R.raw.one);
        m1= MediaPlayer.create(this,R.raw.two);
        m2= MediaPlayer.create(this,R.raw.three);
        m3= MediaPlayer.create(this,R.raw.four);
        m4= MediaPlayer.create(this,R.raw.fv);
        m5= MediaPlayer.create(this,R.raw.sixth);
        m6= MediaPlayer.create(this,R.raw.seventh);
        m7= MediaPlayer.create(this,R.raw.eighth);

    }
    public void pressed(View v) throws IOException {
        switch (v.getId()){
            case R.id.imageButton1:
                Toast.makeText(getApplicationContext(),"1",Toast.LENGTH_SHORT).show();
                if(m1.isPlaying())
                    m1.pause();
                if(m2.isPlaying())
                    m2.pause();if(m3.isPlaying())
                    m3.pause();if(m4.isPlaying())
                    m4.pause();if(m5.isPlaying())
                    m5.pause();if(m6.isPlaying())
                    m6.pause();if(m7.isPlaying())
                    m7.pause();
                    m.seekTo(0);
                 m.start();
                break;
            case R.id.imageButton2:
                Toast.makeText(getApplicationContext(),"2",Toast.LENGTH_SHORT).show();
                if(m1.isPlaying())
                    m1.pause();
                if(m.isPlaying())
                    m.pause();if(m2.isPlaying())
                m2.pause();if(m3.isPlaying())
                m3.pause();if(m4.isPlaying())
                m4.pause();if(m5.isPlaying())
                m5.pause();if(m6.isPlaying())
                m6.pause();if(m7.isPlaying())
                m7.pause();
                m1.seekTo(0);
                m1.start();
                break;
            case R.id.imageButton3:
                Toast.makeText(getApplicationContext(),"3",Toast.LENGTH_SHORT).show();
                if(m2.isPlaying())
                m2. pause();
                if(m1.isPlaying())
                    m1.pause();if(m.isPlaying())
                m.pause();if(m3.isPlaying())
                m3.pause();if(m4.isPlaying())
                m4.pause();if(m5.isPlaying())
                m5.pause();if(m6.isPlaying())
                m6.pause();if(m7.isPlaying())
                m7.pause();
                m2.seekTo(0);
                m2.start();
                break;
            case R.id.imageButton4:
                Toast.makeText(getApplicationContext(),"4",Toast.LENGTH_SHORT).show();
                if(m3.isPlaying())
                {  m3. pause();
                    Toast.makeText(getApplicationContext(),"41",Toast.LENGTH_SHORT).show();
                }
                if(m1.isPlaying()){
                    m1.pause();
                    Toast.makeText(getApplicationContext(),"42",Toast.LENGTH_SHORT).show();}
                    if(m2.isPlaying()){
                m2.pause();
                        Toast.makeText(getApplicationContext(),"43",Toast.LENGTH_SHORT).show();}
                    if(m.isPlaying()){
                m.pause();
                        Toast.makeText(getApplicationContext(),"44",Toast.LENGTH_SHORT).show();}
                    if(m4.isPlaying()){
                m4.pause();
                        Toast.makeText(getApplicationContext(),"45",Toast.LENGTH_SHORT).show();}
                    if(m5.isPlaying()){
                m5.pause();
                        Toast.makeText(getApplicationContext(),"46",Toast.LENGTH_SHORT).show();}
                    if(m6.isPlaying()){
                m6.pause();
                        Toast.makeText(getApplicationContext(),"47",Toast.LENGTH_SHORT).show();}
                    if(m7.isPlaying()){
                m7.pause();
                        Toast.makeText(getApplicationContext(),"48",Toast.LENGTH_SHORT).show();}
                m3.seekTo(0);
                Toast.makeText(getApplicationContext(),"4",Toast.LENGTH_SHORT).show();
                m3.start();
                break;
            case R.id.imageButton5:
                Toast.makeText(getApplicationContext(),"5",Toast.LENGTH_SHORT).show();
                if(m4.isPlaying())
                m4. pause();
                if(m1.isPlaying())
                    m1.pause();if(m2.isPlaying())
                m2.pause();if(m3.isPlaying())
                m3.pause();if(m.isPlaying())
                m.pause();if(m5.isPlaying())
                m5.pause();if(m6.isPlaying())
                m6.pause();if(m7.isPlaying())
                m7.pause();
                m4.seekTo(0);
                m4.start();
                break;
            case R.id.imageButton6:
                Toast.makeText(getApplicationContext(),"6",Toast.LENGTH_SHORT).show();
                if(m5.isPlaying())
                m5. pause();
                if(m1.isPlaying())
                    m1.pause();if(m2.isPlaying())
                m2.pause();if(m3.isPlaying())
                m3.pause();if(m4.isPlaying())
                m4.pause();if(m.isPlaying())
                m.pause();if(m6.isPlaying())
                m6.pause();if(m7.isPlaying())
                m7.pause();
                m5.seekTo(0);
                m5.start();
                break;
            case R.id.imageButton7:
                Toast.makeText(getApplicationContext(),"7",Toast.LENGTH_SHORT).show();
                if(m6.isPlaying())
                m6. pause();
                if(m1.isPlaying())
                    m1.pause();if(m2.isPlaying())
                m2.pause();if(m3.isPlaying())
                m3.pause();if(m4.isPlaying())
                m4.pause();if(m5.isPlaying())
                m5.pause();if(m.isPlaying())
                m.pause();if(m7.isPlaying())
                m7.pause();
                m6.seekTo(0);
                m6.start();
                break;
            case R.id.imageButton8:
                Toast.makeText(getApplicationContext(),"8",Toast.LENGTH_SHORT).show();
                if(m7.isPlaying())
                m7. pause();
                if(m1.isPlaying())
                    m1.pause();if(m2.isPlaying())
                m2.pause();if(m3.isPlaying())
                m3.pause();if(m4.isPlaying())
                m4.pause();if(m5.isPlaying())
                m5.pause();if(m6.isPlaying())
                m6.pause();if(m.isPlaying())
                m.pause();
                m7.seekTo(0);
                m7.start();
                break;
            case R.id.imageButton9:
                Toast.makeText(getApplicationContext(),"9",Toast.LENGTH_SHORT).show();
                if(m4.isPlaying())
                m4. pause();
                if(m1.isPlaying())
                    m1.pause();if(m2.isPlaying())
                m2.pause();if(m3.isPlaying())
                m3.pause();if(m.isPlaying())
                m.pause();if(m5.isPlaying())
                m5.pause();if(m6.isPlaying())
                m6.pause();if(m7.isPlaying())
                m7.pause();
                m4.seekTo(0);
                m4.start();
                break;
            case R.id.imageButton10:
                Toast.makeText(getApplicationContext(),"10",Toast.LENGTH_SHORT).show();
                if(m6.isPlaying())
                m6. pause();
                if(m1.isPlaying())
                    m1.pause();if(m2.isPlaying())
                m2.pause();if(m3.isPlaying())
                m3.pause();if(m4.isPlaying())
                m4.pause();if(m5.isPlaying())
                m5.pause();if(m.isPlaying())
                m.pause();if(m7.isPlaying())
                m7.pause();
                m6.seekTo(0);
                m6.start();
                break;
            case R.id.imageButton11:
                Toast.makeText(getApplicationContext(),"11",Toast.LENGTH_SHORT).show();
                if(m1.isPlaying())
                m1.pause();
                if(m.isPlaying())
                    m.pause();if(m2.isPlaying())
                m2.pause();if(m3.isPlaying())
                m3.pause();if(m4.isPlaying())
                m4.pause();if(m5.isPlaying())
                m5.pause();if(m6.isPlaying())
                m6.pause();if(m7.isPlaying())
                m7.pause();
                m1.seekTo(0);
                m1.start();
                break;
            case R.id.imageButton12:
                Toast.makeText(getApplicationContext(),"12",Toast.LENGTH_SHORT).show();
                if(m7.isPlaying())
                m7. pause();
                if(m1.isPlaying())
                    m1.pause();if(m2.isPlaying())
                m2.pause();if(m3.isPlaying())
                m3.pause();if(m4.isPlaying())
                m4.pause();if(m5.isPlaying())
                m5.pause();if(m6.isPlaying())
                m6.pause();if(m.isPlaying())
                m.pause();
                m7.seekTo(0);
                m7.start();
                break;
        }
    }
}
