package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.addContact->Toast.makeText(this,"you clicked add contacts",Toast.LENGTH_LONG).show()
            R.id.favourite->Toast.makeText(this,"you clicked favourites",Toast.LENGTH_LONG).show()
            R.id.feedback->Toast.makeText(this,"you clicked feedback",Toast.LENGTH_LONG).show()
            R.id.settings->Toast.makeText(this,"you clicked settings",Toast.LENGTH_LONG).show()
            R.id.close->Toast.makeText(this,"you clicked close",Toast.LENGTH_LONG).show()
        }
        return true
    }
}