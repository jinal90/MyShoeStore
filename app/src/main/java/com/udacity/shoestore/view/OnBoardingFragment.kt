package com.udacity.shoestore.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentOnBoardingBinding

/**
 * OnBoardingFragment: Welcome/On boarding  screen
 */
class OnBoardingFragment : Fragment() {

    private var _binding: FragmentOnBoardingBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        (requireActivity() as AppCompatActivity).supportActionBar?.hide()
        binding.nextButton.setOnClickListener @kotlin.Suppress("UNUSED_ANONYMOUS_PARAMETER")
        { view: View ->
            view.findNavController()
                .navigate(R.id.action_onBoardingFragment_to_instructionsFragment)
        }
        return binding.root
    }
}