package com.peakfinn.task1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_summary.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SummaryFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_summary, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rating = arguments?.getFloat(RATING)
        val name = arguments?.getString(NAME)

        summary.text = String.format("You rated %s with %.1f stars!", name, rating)

        restartButton.setOnClickListener {
            findNavController().navigate(R.id.action_summaryToStart)
        }
    }
}