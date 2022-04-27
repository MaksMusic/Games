package com.games

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.games.databinding.ItemListBinding
import java.time.chrono.JapaneseEra.values

class AdapterGamesList(
    private var list: ArrayList<Games>) :
    RecyclerView.Adapter<AdapterGamesList.ViewHolder>() {

    @SuppressLint("NotifyDataSetChanged")
    fun setItem(game: Games) {
        list.add(game)
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.addGamesFun(list[position])
    }

    override fun getItemCount(): Int {

       return list.size
    }


    inner class ViewHolder(
        var itemListBinding: ItemListBinding
    ) :
        RecyclerView.ViewHolder(itemListBinding.root) {

        fun addGamesFun(game: Games) {
            itemListBinding.BtnGames.setText(game.getNameGame())
            itemListBinding.Image.setImageResource(R.drawable.xo);
            when(game.getNomer()){
                1 ->        itemListBinding.Image.setImageResource(R.drawable.xo);
                2 ->        itemListBinding.Image.setImageResource(R.drawable.xo2);
                else ->     itemListBinding.Image.setImageResource(R.drawable.xo2);
            }



        }

    }
}
