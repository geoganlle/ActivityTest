package com.example.activitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.activitytest.databinding.FirstLayoutBinding

class FirstActivity : AppCompatActivity() {

    private lateinit var firstLayoutBinding: FirstLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        firstLayoutBinding = FirstLayoutBinding.inflate(layoutInflater)
        setContentView(firstLayoutBinding.root)

        firstLayoutBinding.button1.setOnClickListener {
            Toast.makeText(this,"You clicked Button 1", Toast.LENGTH_SHORT).show()

            val intent = Intent("com.example.activitytest.ACTION_START")
            intent.addCategory("com.example.activitytest.MY_CATEGORY")
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.main,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){

            R.id.add_item -> Toast.makeText(this,"You clicked menu add", Toast.LENGTH_SHORT).show()

            R.id.remove_item -> {
                Toast.makeText(this,"You clicked menu remove", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

        return true
    }
}