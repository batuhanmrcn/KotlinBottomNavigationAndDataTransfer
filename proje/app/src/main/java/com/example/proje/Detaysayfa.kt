package com.example.proje

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.example.proje.databinding.FragmentDetaysayfaBinding


class Detaysayfa : Fragment() {

    private lateinit var binding : FragmentDetaysayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetaysayfaBinding.inflate(layoutInflater,container,false)


        val bundle : DetaysayfaArgs by navArgs()
        val gelenAd = bundle.ad
        val gelenYas = bundle.yas
        val gelenBekarMi = bundle.bekar
        val urunAd = bundle.urun.ad
        val urunId = bundle.urun.id


        binding.textView2.text = "$gelenAd - $gelenYas - $gelenBekarMi - $urunId - $urunAd"

        //Aşağıdaki kodlar geri tusunu aktif eder.
        val backPress = object : OnBackPressedCallback(false){
            override fun handleOnBackPressed() {

            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backPress)

        return binding.root
    }
}