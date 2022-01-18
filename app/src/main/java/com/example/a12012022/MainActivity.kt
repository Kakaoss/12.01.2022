package com.example.a12012022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var liczba = 1;

        findViewById<Button>(R.id.btnLewo).setOnClickListener {

            if (liczba == 1)
                liczba = 4;
            else
                liczba -= 1;

            if (liczba == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tf);
            }
            if (liczba == 2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tfgiga);
            }
            if (liczba == 3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tfsadeg);
            }
            if (liczba == 4){
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tfusmiiech);
            }

        }

        findViewById<Button>(R.id.btnPrawo).setOnClickListener {

            if (liczba == 4)
                liczba = 1;
            else
                liczba += 1;

            if (liczba == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tf);
            }
            if (liczba == 2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tfgiga);
            }
            if (liczba == 3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tfsadeg);
            }
            if (liczba == 4){
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tfusmiiech);
            }
        }

        findViewById<Button>(R.id.btnObrotLewo).setOnClickListener {

            var rotacja = "-" + findViewById<EditText>(R.id.Dane1).text;
            findViewById<ImageView>(R.id.imageView).rotation = rotacja.toString().toFloat();
        }

        findViewById<Button>(R.id.btnObrotPrawo).setOnClickListener {

            var rotacja = findViewById<EditText>(R.id.Dane1).text;
            findViewById<ImageView>(R.id.imageView).rotation = rotacja.toString().toFloat();
        }

        findViewById<Button>(R.id.btnSkala).setOnClickListener {

            var skala = findViewById<EditText>(R.id.Dane2).text;
            findViewById<ImageView>(R.id.imageView).scaleX = skala.toString().toFloat();
            findViewById<ImageView>(R.id.imageView).scaleY = skala.toString().toFloat();
        }

    }
}