package com.example.digitalhousefoods.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R
import com.example.digitalhousefoods.model.Menu
import com.example.digitalhousefoods.model.Restaurant
import com.example.digitalhousefoods.view.MenuDetailsActivity


class MenuAdapter (private val menuList: MutableList<Menu>) :
        RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuAdapter.MenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.menu_item, parent, false)
        return MenuViewHolder(view)
    }

    override fun getItemCount() = menuList.size

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {

        val image = holder.imageview
        image.setImageResource(menuList[position].imgMenu)

        val name = holder.name
        name.text = menuList[position].name


        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, MenuDetailsActivity::class.java)
            intent.putExtra("NOME", menuList[position].name)
            intent.putExtra("IMAGEM", menuList[position].imgMenu)
            intent.putExtra("DESC", menuList[position].descripton)
            it.context.startActivity(intent)
        }
    }


    inner class MenuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name by lazy { view.findViewById<TextView>(R.id.tv_name_menu) }
        val cardView by lazy { view.findViewById<CardView>(R.id.card_view) }
        val imageview  by lazy { view.findViewById<ImageView>(R.id.img_menu) }
    }

}
