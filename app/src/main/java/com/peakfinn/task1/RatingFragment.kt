package com.peakfinn.task1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_rating.*

const val RATING = "rating"
const val NAME = "name"

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class RatingFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rating, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        game.text = listOf(
            "Portal 1 & 2", "League of Legends", "Minecraft"
        ).random()

        toSummaryButton.setOnClickListener {
            val bundle = Bundle()
            bundle.putFloat(RATING, ratingBar.rating)
            bundle.putString(NAME, game.text.toString())

            findNavController().navigate(R.id.action_ratingToSummary, bundle)
        }
    }
}