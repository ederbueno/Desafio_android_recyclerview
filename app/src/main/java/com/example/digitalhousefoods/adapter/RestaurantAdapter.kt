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
import com.example.digitalhousefoods.view.RestaurantDetailsActivity
import java.io.Serializable

class RestaurantAdapter(private val restaurantList: MutableList<Restaurant>) :
        RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantAdapter.RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.restaurant_item, parent, false)
        return RestaurantViewHolder(view)
    }

    override fun getItemCount() = restaurantList.size

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {

        val image = holder.imageview
        image.setImageResource(restaurantList[position].image)

        val name = holder.name
        name.text = restaurantList[position].name

        val address = holder.address
        address.text = restaurantList[position].address

        val close = holder.close
        close.text = restaurantList[position].close


        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, RestaurantDetailsActivity::class.java)
            intent.putExtra("NOME", restaurantList[position].name)
            intent.putExtra("IMAGEM", restaurantList[position].image)
            intent.putExtra("MENU", restaurantList[position].menu as Serializable)
           it.context.startActivity(intent)
        }
    }


    inner class RestaurantViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val name by lazy { view.findViewById<TextView>(R.id.tv_name) }
    val address by lazy { view.findViewById<TextView>(R.id.tv_address) }
    val close by lazy { view.findViewById<TextView>(R.id.tv_close) }
    val cardView by lazy { view.findViewById<CardView>(R.id.card_view) }
    val imageview  by lazy { view.findViewById<ImageView>(R.id.imageView) }
}

}
