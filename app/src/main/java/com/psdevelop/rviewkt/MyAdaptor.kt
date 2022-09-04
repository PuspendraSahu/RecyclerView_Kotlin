package com.psdevelop.rviewkt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import java.util.*

class MyAdaptor(private val newsList : ArrayList<news>) : RecyclerView.Adapter<MyAdaptor.MyViewHolder>() {

    private lateinit var mListener : onItemClickLestener
            interface onItemClickLestener{
                fun onItemClick(position: Int)

            }

    fun setOnItemClickListener(listener : onItemClickLestener){

        mListener = listener
    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdaptor.MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
        parent, false)
        return MyViewHolder(itemView, mListener)




    }


    override fun onBindViewHolder(holder: MyAdaptor.MyViewHolder, position: Int) {


        val currentItem = newsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text = currentItem.heading
    }

    override fun getItemCount(): Int {
        return newsList.size

    }

    class MyViewHolder(itemView: View, listener : onItemClickLestener) : RecyclerView.ViewHolder(itemView){

        val titleImage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val tvHeading : TextView = itemView.findViewById(R.id.tvHeading)

        init {
            itemView.setOnClickListener {

                listener.onItemClick(adapterPosition)
            }
        }










    }


}
