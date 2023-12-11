package com.example.createdrecuclerview.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.createdrecuclerview.databinding.FragmentHomeBinding
import com.example.createdrecuclerview.ui.home.adapter.TaskAdapter

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val adapter = TaskAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
        binding.rvTask.adapter = adapter
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}