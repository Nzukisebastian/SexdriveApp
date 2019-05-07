package com.example.sexdriveapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Pesa extends AppCompatActivity implements View.OnClickListener {
EditText phones,amounts;
Button etsubscribe;
String emails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesa);
        Intent intent=getIntent();
        emails=intent.getExtras().getString("emailid");
        phones = (EditText) findViewById(R.id.etphone);
        amounts = (EditText) findViewById(R.id.etamount);
        etsubscribe = (Button) findViewById(R.id.btn_subscribe);
        etsubscribe.setOnClickListener(this);
    }
    private void sub(){
        //User user=new User(phone,amount);
        // sendnetworkrequest(user);
        String phone =phones.getText().toString();
        String amount=amounts.getText().toString();
        String email=emails;
        //Integer amountsx=Integer.parseInt(amounts.getText().toString());
        //Toast.makeText(Pesa.this,email,Toast.LENGTH_LONG).show();
            String type="subscribe";
            Mpesabackgroundtask mpesabackgroundtask=new Mpesabackgroundtask(this);
            mpesabackgroundtask.execute(type,phone,amount,email);
        Toast.makeText(Pesa.this,email,Toast.LENGTH_LONG).show();

    }
    @Override
    public void onClick(View v) {
        if(v==etsubscribe){
            sub();
        }
    }

}
