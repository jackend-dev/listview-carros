package br.com.desafio02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variavel carros recebe recebe um array de strings
        val carros = arrayOf("Gol", "Jetta", "Voyage", "UP", "Polo", "Saveiro", "Fox",
                "Virtus",  "Nivus")

        // Variável descrição recebe um array de strings
        val descricao = arrayOf("Novo Gol com aparência esportiva sem perder a elegância.",
                "Novo Jetta com aparência esportiva sem perder a elegância.",
                "Novo Voyage com aparência esportiva sem perder a elegância.",
                "Novo Up com aparência esportiva sem perder a elegância.",
                "Novo Polo com aparência esportiva sem perder a elegância.",
                "Novo Saveiro com aparência esportiva sem perder a elegância.",
                "Novo Fox com aparência esportiva sem perder a elegância.",
                "Novo Virtus com aparência esportiva sem perder a elegância.",
                "Novo Nivus com aparência esportiva sem perder a elegância.", )

        // Variável imagemId recebe um arrays com o objeto de cada imagem
        val imagemId = arrayOf(R.drawable.gol, R.drawable.jetta, R.drawable.voyage, R.drawable.up,
                R.drawable.polo, R.drawable.saveiro, R.drawable.fox, R.drawable.virtus,
                R.drawable.nivus)

        // Recebe a classe e passa as variáveis de acordo com cada argumento
        val novaListAdapter = MyListAdapter(this, carros, descricao, imagemId)

        list_view_carros.adapter = novaListAdapter

        // recebe a lista adaptada e ao clicar chama outra intent com a imagem do carro
        list_view_carros.onItemClickListener = AdapterView.OnItemClickListener {
            parent, view, position, id ->

            var itemCliclado = parent.getItemAtPosition(position)
            val intent = Intent(this,ImagemCarro::class.java)
            intent.putExtra("imgCarro", itemCliclado.toString())
            startActivity(intent)
        }
    }
}