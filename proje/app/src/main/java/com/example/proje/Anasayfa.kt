package com.example.proje

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.proje.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar


class Anasayfa : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(layoutInflater,container,false)

        binding.detayButton.setOnClickListener {
            Snackbar.make(it,"Selam",Snackbar.LENGTH_SHORT).show()


            val urun = Urunler(1,"pc")
            val gecis = AnasayfaDirections.detayGecis()
            Navigation.findNavController(it).navigate(gecis)
        }

        return binding.root


    }
}