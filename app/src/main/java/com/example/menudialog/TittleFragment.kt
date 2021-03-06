package com.example.menudialog

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.menudialog.databinding.FragmentTitleBinding
class TitleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil
            .inflate<FragmentTitleBinding>(inflater,
                R.layout.fragment_title,container,false)
        binding.playButton.setOnClickListener { view : View ->
            view.findNavController()29
            .navigate(R.id.action_titleFragment_to_gameFragment)
        }
        return binding.root
    }
}