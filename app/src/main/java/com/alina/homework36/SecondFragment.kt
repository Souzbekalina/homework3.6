package com.alina.homework36

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import com.alina.homework36.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private lateinit var adapter: MusicAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var list = ArrayList<MusicList>()

        MusicList("1" ,"Some old Love", "Selena Gomes" , "3")
        MusicList("2" ,"7 rigs", "Ariana Grande" , "3.45")
        MusicList("3" ,"Say my Name ", "David Guetta" , "3.19")
        MusicList("4" ,"Lemon", "Kenshi Yonesi" , "4.48")
        MusicList("5" ,"So hot", "Blacpink" , "2.21")
        MusicList("6" ,"love story", "Indila" , "3.54")
        MusicList("7" ,"Dimple", "BTS" , "3.18")
        MusicList("8" ,"Go GO", "BTS" , "4")
        MusicList("9" ,"Type girl", "BTS" , "3.18")
        MusicList("10" ," The Greatest", "Sea" , "3.28")

        adapter= MusicAdapter(list,this::onClick)
        binding.rvContainer.adapter = adapter
    }

     private  fun  onClick(nameOfSong: String){
         requireActivity().supportFragmentManager.findFragmentById(R.id.one_container)?.view?.isGone =true

         val  bundle=Bundle()
         bundle.putString("Key",nameOfSong)
         val fragment=NameSongFragment()
         fragment.arguments=bundle
         requireActivity().supportFragmentManager.
                 beginTransaction().replace(R.id.two_container, fragment).commit()


     }

}