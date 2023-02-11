package com.example.beratbadanzhr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nama :EditText
    private lateinit var tinggiBadan : EditText
    private lateinit var jkLakilaki : RadioButton
    private lateinit var jkPerempuan: RadioButton
    private lateinit var Hitung :TextView
    private lateinit var Hasil : TextView
    private var tb : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nama = findViewById(R.id.etNama)
        tinggiBadan = findViewById(R.id.etTinggiBdn)
        jkLakilaki = findViewById(R.id.rbLaki)
        jkPerempuan = findViewById(R.id.rbPrempuan)
        Hitung = findViewById(R.id.btnHitung)
        Hasil= findViewById(R.id.hasil)

        Hitung.setOnClickListener {

            var tinggi = tinggiBadan.text.toString().toInt()

            if (jkLakilaki.isChecked){
                tb= (tinggi-100)-((tinggi-100)* 10/100)
                Hasil.setText(tb.toString()+"kg")

            } else{
                tb = (tinggi-100)-((tinggi-100)* 15/100)
                Hasil.setText(tb.toString()+"kg")
            }
        }
    }
}