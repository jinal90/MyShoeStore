package com.udacity.shoestore.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding

/**
 * LoginFragment
 * Login screen: Email and password fields
 */
class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.loginButton.setOnClickListener @kotlin.Suppress("UNUSED_ANONYMOUS_PARAMETER")
        { view: View ->
            view.findNavController().navigate(R.id.action_loginFragment_to_onBoardingFragment)
        }
        return binding.root
    }
}