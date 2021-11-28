package com.udacity.shoestore.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstructionsBinding

/**
 * InstructionsFragment: Instructions screen
 */
class InstructionsFragment : Fragment() {
    private var _binding: FragmentInstructionsBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInstructionsBinding.inflate(inflater, container, false)
        binding.nextButton.setOnClickListener @kotlin.Suppress("UNUSED_ANONYMOUS_PARAMETER")
        { view: View ->
            view.findNavController().navigate(R.id.action_instructionsFragment_to_shoeListFragment)
        }
        return binding.root
    }
}