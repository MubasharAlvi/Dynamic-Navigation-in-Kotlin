package com.example.navigationcomponenthandle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.navigationcomponenthandle.databinding.FragmentABinding
import com.example.navigationcomponenthandle.utils.navigate

class FragmentA : Fragment() {
    lateinit var binding: FragmentABinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_a, container, false)
        binding.button.setOnClickListener {
            navigate(this, "fragment_b")
        }
        return binding.root
    }
}