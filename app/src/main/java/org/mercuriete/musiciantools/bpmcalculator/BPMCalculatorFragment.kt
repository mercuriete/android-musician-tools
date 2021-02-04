package org.mercuriete.musiciantools.bpmcalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import org.mercuriete.musiciantools.databinding.BpmCalculatorFragmentBinding
import javax.inject.Inject

@AndroidEntryPoint
class BPMCalculatorFragment @Inject constructor() : Fragment(), BPMCalculatorContract.View {

    @Inject
    lateinit var presenter: BPMCalculatorContract.Presenter

    private var _binding: BpmCalculatorFragmentBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun showBPM(bpm: String) {
        binding.bpmText.text = bpm
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BpmCalculatorFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
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
        _binding = null
    }

}
