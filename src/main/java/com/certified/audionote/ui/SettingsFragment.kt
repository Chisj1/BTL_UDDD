package com.certified.audionote.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.certified.audionote.R
import com.certified.audionote.databinding.FragmentSettingsBinding
import com.certified.audionote.utils.Extensions.flags
import com.certified.audionote.utils.Extensions.safeNavigate

class SettingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        binding.apply {
            btnBack.setOnClickListener { navController.safeNavigate(SettingsFragmentDirections.actionSettingsFragmentToHomeFragment()) }
//            groupAbout.setOnClickListener { navController.safeNavigate(SettingsFragmentDirections.actionSettingsFragmentToAboutFragment()) }
        }
    }

    override fun onResume() {
        super.onResume()
        flags(R.color.fragment_background)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}