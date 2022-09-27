package com.example.navigationcomponenthandle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.navigationcomponenthandle.databinding.FragmentBBinding
import com.example.navigationcomponenthandle.utils.navigate

class FragmentB : Fragment(){
    lateinit var binding : FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_b,container,false)
        binding.button.setOnClickListener {
            navigate(this, "fragment_c")
        }
        return binding.root
    }
}