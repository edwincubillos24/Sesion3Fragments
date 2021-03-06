package com.cubidevs.swipetabsexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cubidevs.buttonnavigationexample.databinding.FragmentFlashBinding

class FlashFragment : Fragment() {

    private lateinit var flashBinding: FragmentFlashBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        flashBinding = FragmentFlashBinding.inflate(inflater, container, false)

        return flashBinding.root
    }
}