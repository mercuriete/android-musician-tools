package org.mercuriete.musiciantools

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.main_activity.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity)

        val navController = Navigation.findNavController(this, R.id.content)
        NavigationUI.setupWithNavController(navigation, navController)
    }
}
