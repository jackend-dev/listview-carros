package br.com.desafio02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carros = arrayOf("Gol", "Jetta", "Voyage", "UP", "Polo", "Saveiro", "Fox",
                "Virtus",  "Nivus")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, carros)

        list_view_carros.adapter = adapter

        list_view_carros.onItemClickListener = AdapterView.OnItemClickListener {
            parent, view, position, id ->

            var itemCliclado = parent.getItemAtPosition(position)
            val intent = Intent(this,ImagemCarro::class.java)
            intent.putExtra("imgCarro", itemCliclado.toString())
            startActivity(intent)
        }
    }
}