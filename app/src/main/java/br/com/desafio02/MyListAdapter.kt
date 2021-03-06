package br.com.desafio02

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.*
class MyListAdapter(private val context: Activity, private val title: Array<String>, private val description: Array<String>, private val imgid: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.list_customizada, title) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.list_customizada, null, true)

        val titleText = rowView.findViewById(R.id.titulo) as TextView
        val imageView = rowView.findViewById(R.id.iconCarro) as ImageView
        val subtitleText = rowView.findViewById(R.id.descricao) as TextView

        titleText.text = title[position]
        imageView.setImageResource(imgid[position])
        subtitleText.text = description[position]

        return rowView
    }
}