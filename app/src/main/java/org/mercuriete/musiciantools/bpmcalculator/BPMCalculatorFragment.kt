package org.mercuriete.musiciantools.bpmcalculator

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import org.mercuriete.musiciantools.R.layout.bpm_calculator_fragment
import org.mercuriete.musiciantools.databinding.BpmCalculatorFragmentBinding
import javax.inject.Inject

@AndroidEntryPoint
class BPMCalculatorFragment @Inject constructor() : Fragment(bpm_calculator_fragment), BPMCalculatorContract.View {

    @Inject
    lateinit var presenter: BPMCalculatorContract.Presenter

    private lateinit var binding: BpmCalculatorFragmentBinding

    override fun showBPM(bpm: String) {
        binding.bpmText.text = bpm
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = BpmCalculatorFragmentBinding.bind(view)

        binding.tapMe.setOnClickListener {
            presenter.addBeat()
        }
    }

    override fun onResume() {
        super.onResume()
        presenter.takeView(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        // prevent leaking activity in
        // case presenter is orchestrating a long running task
        presenter.dropView()
        // prevent memory leak of view binding
        // we chose to be leaky here by design
        // https://developer.android.com/topic/libraries/view-binding#fragments
        // _binding = null
    }

}
