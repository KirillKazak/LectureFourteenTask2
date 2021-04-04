package com.example.lecturefourteentask2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            method();
        } catch (Exception exception) {
            Log.d("TAG1", String.valueOf(exception));
        }
        palindrom();
    }

    public void method() throws Exception {
        char[] arrayName = {'K','i','r','i','l','l'};
        String nameDir = "C:\\User\\sadmin\\Desktop";
        File file = new File(nameDir);
        file.mkdirs();
        if (file.mkdir()) {
            Log.d("TAG", "OK");
        } else {
            Log.d("TAG", "HEOK");
        }
        OutputStream output = new FileOutputStream(file);
        for (char chr : arrayName) {
        output.write(chr);
        }
        output.close();
    }

    public void palindrom () {
        String str = "Android Developer";
        char[]result = new char[str.length()];
        int count = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[chars.length-1-count];
            count++;
        }
        Log.d("PAL", String.valueOf(result));
    }
}