package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController



class DashboardFragment: Fragment(R.layout.fragment_dashboard) {
    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editText = view.findViewById(R.id.editTextTextPersonName)
        button = view.findViewById(R.id.button)

        button.setOnClickListener {

            val name = editText.text.toString()

            val action = DashboardFragmentDirections.actionDashboardFragmentToNotificationFragment(name)

            findNavController().navigate(action)

        }
    }


}
