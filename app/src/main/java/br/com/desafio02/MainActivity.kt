package br.com.desafio02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val carros = arrayOf("Gol", "Jetta", "Voyage", "UP", "Polo", "Saveiro", "Fox",
                "Virtus",  "Nivus")

        val descricao = arrayOf("Novo Gol com aparência esportiva sem perder a elegância.",
                "Novo Jetta com aparência esportiva sem perder a elegância.",
                "Novo Voyage com aparência esportiva sem perder a elegância.",
                "Novo Up com aparência esportiva sem perder a elegância.",
                "Novo Polo com aparência esportiva sem perder a elegância.",
                "Novo Saveiro com aparência esportiva sem perder a elegância.",
                "Novo Fox com aparência esportiva sem perder a elegância.",
                "Novo Virtus com aparência esportiva sem perder a elegância.",
                "Novo Nivus com aparência esportiva sem perder a elegância.", )

        val imagemId = arrayOf(R.drawable.gol, R.drawable.jetta, R.drawable.voyage, R.drawable.up,
                R.drawable.polo, R.drawable.saveiro, R.drawable.fox, R.drawable.virtus,
                R.drawable.nivus)

        val novaListAdapter = MyListAdapter(this, carros, descricao, imagemId)

        list_view_carros.adapter = novaListAdapter
//        list_view_carros.setOnItemClickListener(){
//            adapterView, view, position, id ->
//
//            val itemAtPosicao = adapterView.getItemAtPosition(position)
//            val itemIdPosicao = adapterView.getItemIdAtPosition(position)
//
//            Toast.makeText(this, "Click on item at $itemAtPosicao its item id " +
//                    "$itemIdPosicao", Toast.LENGTH_LONG).show()
//
//        }

//        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, carros)

//        list_view_carros.adapter = adapter

        list_view_carros.onItemClickListener = AdapterView.OnItemClickListener {
            parent, view, position, id ->

            var itemCliclado = parent.getItemAtPosition(position)
            val intent = Intent(this,ImagemCarro::class.java)
            intent.putExtra("imgCarro", itemCliclado.toString())
            startActivity(intent)
        }
    }
}