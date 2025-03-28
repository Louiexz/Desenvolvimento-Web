package com.example.myapplication.states;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class AtividadeUm extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade);

        Log.d(TagDeRegistro.LOG_TAG_UI, "Criacao da atividade principal.");

        TextView tv = findViewById(R.id.meuRest);

        tv.setText("Ciclo de Vida");
        setTitle("Ciclo de Vida");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button = findViewById(R.id.btn_atividade_dois);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(AtividadeUm.this, AtividadeDois.class);
            startActivity(intent);
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TagDeRegistro.LOG_TAG_UI, "Inicio da atividade principal");
        tv.setText("onStart(): Inicio da atividade principal");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TagDeRegistro.LOG_TAG_UI, "Parada da atividade principal");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TagDeRegistro.LOG_TAG_UI, "Destruindo atividade principal");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TagDeRegistro.LOG_TAG_UI, "Pausa da atividade principal");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TagDeRegistro.LOG_TAG_UI, "Resumo da atividade principal");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TagDeRegistro.LOG_TAG_UI, "Reinicio da atividade principal");
    }
}