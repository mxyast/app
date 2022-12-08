package com.mit.odev5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.mit.odev5.databinding.ActivityMainBinding;

import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        AtomicReference<Double> hafiza= new AtomicReference<>((double) 0);
        AtomicReference<Double> hafizaGecmis= new AtomicReference<>((double) 0);






        binding.button0.setOnClickListener(view->{
            String yeni=binding.sonuc.getText().toString()+"0";
            binding.sonuc.setText(yeni);
        });
        binding.button1.setOnClickListener(view->{
            String yeni=binding.sonuc.getText().toString()+"1";
            binding.sonuc.setText(yeni);
        });
        binding.button2.setOnClickListener(view->{
            String yeni=binding.sonuc.getText().toString()+"2";
            binding.sonuc.setText(yeni);
        });
        binding.button3.setOnClickListener(view->{
            String yeni=binding.sonuc.getText().toString()+"3";
            binding.sonuc.setText(yeni);
        });
        binding.button4.setOnClickListener(view->{
            String yeni=binding.sonuc.getText().toString()+"4";
            binding.sonuc.setText(yeni);
        });
        binding.button5.setOnClickListener(view->{
            String yeni=binding.sonuc.getText().toString()+"5";
            binding.sonuc.setText(yeni);
        });
        binding.button6.setOnClickListener(view->{
            String yeni=binding.sonuc.getText().toString()+"6";
            binding.sonuc.setText(yeni);
        });
        binding.button7.setOnClickListener(view->{
            String yeni=binding.sonuc.getText().toString()+"7";
            binding.sonuc.setText(yeni);
        });
        binding.button8.setOnClickListener(view->{
            String yeni=binding.sonuc.getText().toString()+"8";
            binding.sonuc.setText(yeni);
        });
        binding.button9.setOnClickListener(view->{
            String yeni=binding.sonuc.getText().toString()+"9";
            binding.sonuc.setText(yeni);
        });
        binding.buttonArti.setOnClickListener(view->{
            if(binding.textViewGecmis.getText().toString()!=""){
                String gecmis=binding.textViewGecmis.getText().toString();
                hafiza.set(Double.parseDouble(binding.sonuc.getText().toString()));
                hafizaGecmis.set(Double.parseDouble(gecmis.substring(0,gecmis.length()-1)));

                double son=hafiza.get()+hafizaGecmis.get();
                String sontext=String.valueOf(son)+"+";
                binding.textViewGecmis.setText(sontext);

            }else{
                String yeni=binding.sonuc.getText().toString()+"+";
                binding.textViewGecmis.setText(yeni);
            }
            binding.sonuc.setText("");
            String yeni=binding.sonuc.getText().toString()+"+";

            Log.e("Hafıza",hafiza.toString());
        });
        binding.buttonEksi.setOnClickListener(view->{

        });
        binding.buttonBolme.setOnClickListener(view->{

        });
        binding.buttonCarpma.setOnClickListener(view->{

        });
        binding.buttonCE.setOnClickListener(view->{
            binding.sonuc.setText("");
            binding.textViewGecmis.setText("");
        });
        binding.buttonEsit.setOnClickListener(view->{
            if(binding.textViewGecmis.getText().toString()!=""){
                String gecmis=binding.textViewGecmis.getText().toString();
                hafiza.set(Double.parseDouble(binding.sonuc.getText().toString()));
                hafizaGecmis.set(Double.parseDouble(gecmis.substring(0,gecmis.length()-1)));

                double son=hafiza.get()+hafizaGecmis.get();
                String sontext=String.valueOf(son);
                binding.sonuc.setText(sontext);
                binding.textViewGecmis.setText("");

            }else{
                String yeni=binding.sonuc.getText().toString();
                binding.textViewGecmis.setText(yeni);
            }
        });




    }
}