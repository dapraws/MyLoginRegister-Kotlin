package com.example.myloginregisterbydapraws

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myloginregisterbydapraws.databinding.ActivityRegisterBinding


class RegisterActivity : AppCompatActivity() {
    // Jika menggunakan View Binding
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengakses elemen layout melalui binding
        binding.tvGologin.setOnClickListener {
            // Lakukan sesuatu saat tombol diklik
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }

}
