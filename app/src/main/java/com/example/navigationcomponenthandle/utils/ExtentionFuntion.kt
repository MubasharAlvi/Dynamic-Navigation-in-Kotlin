package com.example.navigationcomponenthandle.utils

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponenthandle.R
fun navigate(fragment: Fragment, action: String) {
    fragment.findNavController().navigateToRoute(action)
}

private fun NavController.navigateToRoute(action: String) {
    try {
        val screenId = when (action) {
            "fragment_a" -> R.id.fragment_a
            "fragment_b" -> R.id.fragment_b
            "fragment_c" -> R.id.fragment_c
            "fragment_d" -> R.id.fragment_d
            else -> R.id.fragment_a
        }
        navigate(screenId)

    } catch (e: IllegalArgumentException) {
        e.printStackTrace()
        Log.e("Error", "${e.message}")
        Toast.makeText(context, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
    }
}
