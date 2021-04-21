package com.cubidevs.sesion3fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cubidevs.sesion3fragments.databinding.FragmentWonderWomanBinding

class WonderWomanFragment : Fragment() {

    private lateinit var wonderWomanBinding: FragmentWonderWomanBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        wonderWomanBinding = FragmentWonderWomanBinding.inflate(inflater, container, false)

        return wonderWomanBinding.root
    }
}