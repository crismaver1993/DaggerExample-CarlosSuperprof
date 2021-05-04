package com.dot7.daggerexample1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dot7.daggerexample1.R
import com.dot7.daggerexample1.databinding.ActivityMainBinding
import com.dot7.daggerexample1.utils.preferences.IPreferences
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding
  @Inject
  lateinit var prefs: IPreferences

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    AndroidInjection.inject(this)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val myOldUrl = prefs.url // Lees
    binding.urlText.text = myOldUrl

    prefs.url = "www.facebook.com" // actualizas/Escribes
  }
}