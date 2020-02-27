package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText editTextInicial, editTextFinal;
     TextView TextViewResultado;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void SorteiaNumero (View view) {

       TextView textView = findViewById(R.id.TextViewResultado);
       EditText editTextInicial = findViewById(R.id.editTextInicial);
        EditText editTextFinal = findViewById(R.id.EditTextfinal);

        int valorInicial = Integer.parseInt(editTextInicial.getText().toString());
        int valorFinal = Integer.parseInt(editTextFinal.getText().toString());

       int  numeroSorteado = valorInicial + (int) (Math.random()*(valorFinal - valorInicial));;

        textView.setText(Integer.toString(numeroSorteado));


    }
}
