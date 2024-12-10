package com.example.motivation.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.motivation.R
import com.example.motivation.infra.SecuritySharedPreference
import com.example.motivation.databinding.ActivityUserBinding
import com.example.motivation.infra.MotivationConstants

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.buttonSendUsername.setOnClickListener(this)
        verifyUser()
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_send_username) {
            handleUsername()
        }
    }

    fun handleUsername() {
        val userName = binding.editUsername.text.toString()
        if (userName.isNullOrBlank()) {
            Toast.makeText(this, R.string.validation_mandatory_name, Toast.LENGTH_SHORT).show()
            return
        }
        SecuritySharedPreference(this).storeString(MotivationConstants.KEY.USER_NAME, userName)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    private fun verifyUser() {
        val name = SecuritySharedPreference(this).getString(MotivationConstants.KEY.USER_NAME)
        if (name != "") {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}