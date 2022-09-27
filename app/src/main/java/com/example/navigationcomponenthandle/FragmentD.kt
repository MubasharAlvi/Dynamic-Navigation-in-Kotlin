package com.example.navigationcomponenthandle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponenthandle.databinding.FragmentBBinding
import com.example.navigationcomponenthandle.databinding.FragmentDBinding
import com.example.navigationcomponenthandle.utils.navigate

class FragmentD : Fragment(){
    private lateinit var binding : FragmentDBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_d,container,false)
        binding.button.setOnClickListener {
            findNavController().popBackStack(R.id.fragmentA,false)
        }
        return binding.root
    }
}
