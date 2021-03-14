package com.example.digitalhousefoods.view

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R
import com.example.digitalhousefoods.adapter.RestaurantAdapter
import com.example.digitalhousefoods.model.Menu
import com.example.digitalhousefoods.model.Restaurant

class HomeActivity : AppCompatActivity() {

    val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_view) }
    val toolbar by lazy { findViewById<Toolbar>(R.id.toolbar) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    setSupportActionBar(toolbar)

    val restaurant = getRestaurants()

    recycler.layoutManager = LinearLayoutManager(this)


    val adapter = RestaurantAdapter(restaurant)
    recycler.adapter = adapter

}

    private fun getRestaurants(): MutableList<Restaurant> {
        val restaurantList = mutableListOf<Restaurant>()

    restaurantList.add(
        Restaurant(
            "Tony Roma's",
            "Av. Lavandisca, 717 - Indianópolis, São Paulo",
            "Fecha às 22:0",
            R.drawable.tony_restaurant,
            getMenu()
        )
    )
    restaurantList.add(
        Restaurant(
            "Aoyama - Moema",
            "Alameda dos Arapanés, 532 - Moema",
            "Fecha às 00:00",
            R.drawable.aoyama_restaurant,
            getMenu()
        )
    )
    restaurantList.add(
        Restaurant(
            "Outback - Moema",
            "Av. Moaci, 187, 187 - Moema, São Paulo",
            "Fecha às 00:00",
            R.drawable.outback_restaurant,
            getMenu()
        )
    )
    restaurantList.add(
        Restaurant(
            "Sí Señor!",
            "Alameda Jauaperi, 626 - Moema",
            "Fecha às 01:00",
            R.drawable.sisenor_restaurant,
            getMenu()
        )
    )

        return restaurantList
    }

    private fun getMenu():  MutableList<Menu>{
        val menuList = mutableListOf<Menu>()

        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )

        return menuList
    }
}