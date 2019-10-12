package com.example.lv_icon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Ruby",   "Ruby is an opensource and fully object-oriented programming language.",   R.drawable.ruby ))
        list.add(Model("Rails",   "Ruby on Rails is a server-side web application",   R.drawable.rails))
        list.add(Model("Python", "Python is interpreted scripting and object-oriented programming lang", R.drawable.python  ))
        list.add(Model("Java Script",  "JS is an object oriented based scripting lang",  R.drawable.js  ))
        list.add(Model("PHP",  "PHP is an interpreted lang",  R.drawable.php))

        listView.adapter = MyListAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                Toast.makeText(this@MainActivity, "This is Ruby",   Toast.LENGTH_SHORT).show()
            }
            if (position==1){
                Toast.makeText(this@MainActivity, "This is Rails",   Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this@MainActivity, "This is Python", Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this@MainActivity, "This is JS",  Toast.LENGTH_SHORT).show()
            }
            if (position==4){
                Toast.makeText(this@MainActivity, "This is PHP",  Toast.LENGTH_SHORT).show()
            }
        }


    }
}
