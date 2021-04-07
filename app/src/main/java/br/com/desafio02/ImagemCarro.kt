package br.com.desafio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_imagem_carro.*

class ImagemCarro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagem_carro)

        var nomeCarro = intent.getStringExtra("imgCarro")


        if (nomeCarro.toString() == "Jetta") {
            carroImage.setImageResource(R.drawable.jetta)
            

        } else if (nomeCarro.toString() == "Nivus") {
            carroImage.setImageResource(R.drawable.nivus)

        } else if (nomeCarro.toString() == "Gol")  {
            carroImage.setImageResource(R.drawable.gol)

        } else if (nomeCarro.toString() == "Fox") {
            carroImage.setImageResource(R.drawable.fox)

        } else if (nomeCarro.toString() == "Polo") {
            carroImage.setImageResource(R.drawable.polo)

        } else if (nomeCarro.toString() == "Saveiro") {
            carroImage.setImageResource(R.drawable.saveiro)

        } else if (nomeCarro.toString() == "UP") {
            carroImage.setImageResource(R.drawable.up)

        } else if (nomeCarro.toString() == "Virtus") {
            carroImage.setImageResource(R.drawable.virtus)

        } else if (nomeCarro.toString() == "Voyage") {
            carroImage.setImageResource(R.drawable.voyage)

        }


    }
}