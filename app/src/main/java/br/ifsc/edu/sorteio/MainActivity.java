package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextInicial, editTextFinal;
     TextView TextViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInicial = findViewById(R.id.editTextInicial);
        editTextFinal = findViewById(R.id.editTextFinal);
        View textViewResultado = findViewById(R.id.TextViewResultado);
    }

    public void Sorteio(View view) {
        int inicial = Integer.parseInt (editTextInicial.getText().toString());

        textViewResultado.setText(Integer.toString(inicial));
    }
}
