package com.example.homework_glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView= findViewById(R.id.recyclerView)

        var img= ArrayList<image>()


        img.add(image("https://images.theconversation.com/files/223749/original/file-20180619-126537-5l632j.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=1200&h=1200.0&fit=crop"))
        img.add(image("https://images.theconversation.com/files/233003/original/file-20180822-149484-cs44to.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=1200&h=1200.0&fit=crop"))
        img.add(image("https://cdn.mos.cms.futurecdn.net/hdo9PNtcQoQzVNp7K5PU78-320-80.jpg"))
        img.add(image("https://www.nasa.gov/sites/default/files/thumbnails/image/cold_quasar_comp_02c.jpg"))
        img.add(image("https://timesknowledge.wwmindia.com/content/2019/may/star1557918247.jpg"))
        img.add(image("https://cdn.mos.cms.futurecdn.net/9iy8m3D9hLsJQNfaszJx8k.jpg"))
        img.add(image("https://www.worldatlas.com/upload/fb/fb/a7/shutterstock-517659922.jpg"))
        img.add(image("https://i.pinimg.com/originals/a8/ec/7e/a8ec7e9a4c56ec7daa8675e6d407d48a.png"))

        val adapter = adapt(img,this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter=adapter
    }

}