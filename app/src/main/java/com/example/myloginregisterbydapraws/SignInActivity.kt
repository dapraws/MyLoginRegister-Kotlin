package com.example.myloginregisterbydapraws

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myloginregisterbydapraws.databinding.ActivitySignInBinding


class SignInActivity : AppCompatActivity() {
    // Jika menggunakan View Binding
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengakses elemen layout melalui binding
        binding.tvGoregister.setOnClickListener {
            // Lakukan sesuatu saat tombol diklik
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

}
