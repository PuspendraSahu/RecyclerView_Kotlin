package com.psdevelop.rviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView : RecyclerView
    private lateinit var newArrayList : ArrayList<news>
    private lateinit var titleImage : Array<Int>
    private lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        titleImage = arrayOf(
            R.drawable.photo11,
        R.drawable.a,
        R.drawable.b,
        R.drawable.c,
        R.drawable.d,
        R.drawable.e,
        R.drawable.f,
        R.drawable.g,
        R.drawable.h,
        R.drawable.i,
        R.drawable.k,







        )

        heading = arrayOf(

            "I am very excited because this is my first recycler view app and i am trying to make it good",
            "I am very excited because this is my first recycler view app and i am trying to make it good",
            "I am very excited because this is my first recycler view app and i am trying to make it good",
            "I am very excited because this is my first recycler view app and i am trying to make it good",
            "I am very excited because this is my first recycler view app and i am trying to make it good",
            "I am very excited because this is my first recycler view app and i am trying to make it good",
            "I am very excited because this is my first recycler view app and i am trying to make it good",
            "I am very excited because this is my first recycler view app and i am trying to make it good",
            "I am very excited because this is my first recycler view app and i am trying to make it good",
            "I am very excited because this is my first recycler view app and i am trying to make it good",
            "I am very excited because this is my first recycler view app and i am trying to make it good",
        )



        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)




        newArrayList = arrayListOf<news>()
        getUserdata()









       }

    private fun getUserdata() {

        for (i in titleImage.indices){

        val News = news(titleImage[i] , heading[i])
        newArrayList.add(News)

        }

        var adaptor = MyAdaptor(newArrayList)
        newRecyclerView.adapter = adaptor
        adaptor.setOnItemClickListener((object : MyAdaptor.onItemClickLestener{
            override fun onItemClick(position: Int) {
                Toast.makeText(this@MainActivity, "You Click On Number $position", Toast.LENGTH_SHORT).show()
            }


        }))





        }


    }








