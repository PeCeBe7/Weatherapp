package com.example.weatherapp

import android.graphics.Color
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.antonioleiva.weatherapp.R


class ForecastListAdapter(val items: List<String>) :
    RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    /*inner class ViewHolder(listItemView: View) : RecyclerView.ViewHolder(listItemView){
        val nameTextView = itemView.findViewById<TextView>(R.id.forecast_list)
        val messageButton = itemView.findViewById<Button>(R.id.changeScrean)
    }*/
    /*override fun getItemViewType(position: Int): Int {
        return position
    }*/
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false)
        return ViewHolder(TextView(parent.context))
    }


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
        holder.textView.setTextColor(Color.RED)
        holder.textView.setTextSize(20F)
        holder.textView.setBackgroundColor(Color.BLACK)
        holder.textView.setPadding(200, 35, 345, 0)
        /*val button = holder.messageButton
        button.text="Cambiar Pantall"*/
    }
    /*@RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
        holder.textView.setTextColor(Color.RED)
        holder.textView.setTextSize(20F)
        holder.textView.setBackgroundColor(Color.BLACK)
        holder.textView.setPadding(200,35,0,0)
    }*/

    override fun getItemCount(): Int = items.size

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}