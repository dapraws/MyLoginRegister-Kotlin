package com.example.myloginregisterbydapraws

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myloginregisterbydapraws.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    // Jika menggunakan View Binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengakses elemen layout melalui binding
        binding.btnSignin.setOnClickListener {
            // Lakukan sesuatu saat tombol diklik
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }

}
