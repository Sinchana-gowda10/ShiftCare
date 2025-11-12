package com.example.shiftcare.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.shiftcare.R
import com.example.shiftcare.databinding.FragmentAnalyticsBinding
import com.example.shiftcare.ui.viewmodel.ShiftViewModel
import com.example.shiftcare.util.DataGenerator

class AnalyticsFragment : Fragment() {

    private var _binding: FragmentAnalyticsBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: ShiftViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAnalyticsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this)[ShiftViewModel::class.java]
        setupUI()
        setupRestAlert()
    }

    private fun setupUI() {
        // Set user info - USING RESOURCE STRINGS
        val user = DataGenerator.getCurrentUser()
        binding.textGreeting.text = getString(R.string.hello_dr, user.name)
        binding.textRole.text = "${user.role}, ${user.specialization}"

        // Set overview data - Use hardcoded values that match XML
        binding.textTotalHours.text = "160"
        binding.textHoursTarget.text = "/ 180 hrs"

        // Overtime calculation: 160 - 180 = -20 (20 hours remaining)
        binding.textOvertimeHours.text = "~20 hrs remaining"

        // Set successful swaps to match XML (8/10)
        binding.textSuccessfulSwaps.text = "8 / 10"

        // Set swap statistics to match XML
        binding.textSwapRequested.text = "12"
        binding.textSwapAccepted.text = "10"
        binding.textApprovalRate.text = "83%"
    }

    private fun setupRestAlert() {
        // Always show rest alert to match XML design
        binding.restAlert.visibility = View.VISIBLE
        binding.textRestAlert.text = "Rest Alert: You've accepted more than 2 swaps this month. Ensure you take adequate rest."
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}