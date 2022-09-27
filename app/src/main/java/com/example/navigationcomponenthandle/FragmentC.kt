package com.example.navigationcomponenthandle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.navigationcomponenthandle.databinding.FragmentCBinding
import com.example.navigationcomponenthandle.utils.navigate

class FragmentC : Fragment() {
    lateinit var binding : FragmentCBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(layoutInflater,R.layout.fragment_c,container,false)
        binding.button.setOnClickListener {
            navigate(this, "fragment_d")
        }
        return binding.root
    }
}