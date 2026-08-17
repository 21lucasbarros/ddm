package br.unisanta.meuapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome = findViewById<EditText>(R.id.edt_nome);
        val edtIdade = findViewById<EditText>(R.id.edt_idade);
        val btnCalcular = findViewById<Button>(R.id.btn_botao)
        val txvResultado = findViewById<TextView>(R.id.txv_resultado)

        btnCalcular.setOnClickListener {
            val nome = edtNome.text.toString();
            val idade = edtIdade.text.toString();

            txvResultado.text = "Olá, $nome! Você tem $idade anos."

            edtNome.text.clear();
            edtIdade.text.clear();
        }
    }
}