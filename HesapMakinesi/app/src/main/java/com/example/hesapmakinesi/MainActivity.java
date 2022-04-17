package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import com.example.hesapmakinesi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private TextView islem;

    private ActivityMainBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());
        islem = tasarim.Islem;

        tasarim.button0.setOnClickListener(view -> {
            islem.setText(islem.getText().toString()+"0");
        });
        tasarim.button1.setOnClickListener(view -> {
            islem.setText(islem.getText().toString()+"1");
        });
        tasarim.button2.setOnClickListener(view -> {
            islem.setText(islem.getText().toString()+"2");
        });
        tasarim.button3.setOnClickListener(view -> {
            islem.setText(islem.getText().toString()+"3");
        });
        tasarim.button4.setOnClickListener(view -> {
            islem.setText(islem.getText().toString()+"4");
        });
        tasarim.button5.setOnClickListener(view -> {
            islem.setText(islem.getText().toString()+"5");
        });
        tasarim.button6.setOnClickListener(view -> {
            islem.setText(islem.getText().toString()+"6");
        });
        tasarim.button7.setOnClickListener(view -> {
            islem.setText(islem.getText().toString()+"7");
        });
        tasarim.button8.setOnClickListener(view -> {
            islem.setText(islem.getText().toString()+"8");
        });
        tasarim.button9.setOnClickListener(view -> {
            islem.setText(islem.getText().toString()+"9");
        });

        tasarim.buttonTopla.setOnClickListener(view -> {
            String ilk_sayi = islem.getText().toString();
            String son_sayi = ilk_sayi.substring((ilk_sayi.length()-1));
            if(!son_sayi.equals("+")){
                islem.setText((islem.getText().toString()+"+"));
            }
        });
        tasarim.buttonEsittir.setOnClickListener(view -> {
            String[] dizi = islem.getText().toString().split("\\+");
            int boyut = dizi.length;
            int [] dizi_2 = new int[(int)boyut];
            for (int i = 0; i<boyut;i++){
                dizi_2[i] =Integer.parseInt(dizi[i]);
            }
            int toplam = 0;
            for(int i : dizi_2){
                toplam+= i;
            }
            islem.setText(String.valueOf(toplam));
        });
        tasarim.buttonSifirla.setOnClickListener(view -> {
            islem.setText(null);
        });
    }
}
