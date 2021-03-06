package com.udacity.shoestore.shoe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding

/**
 * ShoeDetailFragment: Screen to add new shoe item to the list
 */
class ShoeDetailFragment : Fragment() {
    private var _binding: FragmentShoeDetailBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ShoeViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (requireActivity() as AppCompatActivity).supportActionBar?.title =
            getString(R.string.shoe_detail_screen_title)
        (requireActivity() as AppCompatActivity).supportActionBar?.show()
        _binding = FragmentShoeDetailBinding.inflate(inflater, container, false)
        binding.shoeViewModel = viewModel
        binding.saveButton.setOnClickListener {
            viewModel.addShoe()
            it.findNavController().popBackStack()
        }
        return binding.root
    }
}