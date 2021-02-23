package org.mercuriete.musiciantools

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import dagger.hilt.android.AndroidEntryPoint
import org.mercuriete.musiciantools.databinding.MainActivityBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        NavigationUI.setupWithNavController(
            binding.navigation,
            (supportFragmentManager.findFragmentById(R.id.content) as NavHostFragment).navController
        )
    }
}
