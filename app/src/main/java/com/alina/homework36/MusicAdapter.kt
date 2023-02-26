package com.alina.homework36

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.alina.homework36.databinding.ItemMusicBinding

class MusicAdapter(
    val musicList: ArrayList<MusicList>, private val onClick: (nameOfSong: String) -> Unit
) : Adapter<MusicAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemMusicBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(musicList[position])

    }

    override fun getItemCount(): Int = musicList.size

    inner class ViewHolder(private val binding: ItemMusicBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: MusicList) {
            binding.apply {
                tvOne.text = item.number
                tvNameOfMusic.text = item.nameOfSong
                tvNameOfSinger.text = item.nameOfSinger
                tvTime.text = item.timeOfSong
                root.setOnClickListener {
                    onClick(musicList[adapterPosition].nameOfSong)
                }
            }

        }


    }

}
