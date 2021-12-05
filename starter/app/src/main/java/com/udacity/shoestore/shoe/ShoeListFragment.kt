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
import com.udacity.shoestore.databinding.FragmentShoeListBinding

/**
 * ShoeListFragment: Screen to show list of shoes
 */
class ShoeListFragment : Fragment() {

    private var _binding: FragmentShoeListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ShoeViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (requireActivity() as AppCompatActivity).supportActionBar?.title = getString(R.string.shoe_list_screen_title)
        (requireActivity() as AppCompatActivity).supportActionBar?.show()
        val shoeListAdapter = ShoeListAdapter(viewModel.shoeList.value)

        viewModel.shoeList.observe(viewLifecycleOwner, {
            shoeListAdapter.notifyDataSetChanged()
        })
        _binding = FragmentShoeListBinding.inflate(inflater, container, false)
        binding.addShoeFloatingButton.setOnClickListener @kotlin.Suppress("UNUSED_ANONYMOUS_PARAMETER")
        { view: View ->
            view.findNavController().navigate(R.id.action_shoeListFragment_to_shoeDetailFragment)
        }
        binding.shoeListRecyclerView.adapter = shoeListAdapter
        return binding.root
    }
}