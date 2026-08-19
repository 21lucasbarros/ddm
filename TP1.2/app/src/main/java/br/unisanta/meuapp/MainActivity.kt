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

        val edtCelsius = findViewById<EditText>(R.id.edt_celsius)
        val btnConverter = findViewById<Button>(R.id.btn_converter)
        val txvResultado = findViewById<TextView>(R.id.txv_resultado)

        btnConverter.setOnClickListener {
            val celsius = edtCelsius.text.toString().toDouble()

            val fahrenheit = (celsius * 9 / 5) + 32

            txvResultado.text = "Temperatura em Fahrenheit: $fahrenheit °F"

            edtCelsius.text.clear()
        }
    }
}