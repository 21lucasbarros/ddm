package br.unisanta.meuapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtTensao = findViewById<EditText>(R.id.edt_tensao)
        val edtResistencia = findViewById<EditText>(R.id.edt_resistencia)
        val edtCorrente = findViewById<EditText>(R.id.edt_corrente)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)
        val txvResultado = findViewById<TextView>(R.id.txv_resultado)

        btnCalcular.setOnClickListener {
            val tensaoTexto = edtTensao.text.toString()
            val resistenciaTexto = edtResistencia.text.toString()
            val correnteTexto = edtCorrente.text.toString()

            if (tensaoTexto.isNotEmpty() && resistenciaTexto.isNotEmpty()) {

                val tensao = tensaoTexto.toDouble()
                val resistencia = resistenciaTexto.toDouble()

                val corrente = tensao / resistencia

                txvResultado.text = "Corrente: $corrente A"

            } else if (tensaoTexto.isNotEmpty() && correnteTexto.isNotEmpty()) {

                val tensao = tensaoTexto.toDouble()
                val corrente = correnteTexto.toDouble()

                val resistencia = tensao / corrente

                txvResultado.text = "Resistência: $resistencia Ω"

            } else if (resistenciaTexto.isNotEmpty() && correnteTexto.isNotEmpty()) {

                val resistencia = resistenciaTexto.toDouble()
                val corrente = correnteTexto.toDouble()

                val tensao = resistencia * corrente

                txvResultado.text = "Tensão: $tensao V"

            } else {
                txvResultado.text = "Preencha pelo menos dois campos."
            }
        }
    }
}