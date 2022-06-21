package com.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
         super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menubarra, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.itElemento1)  {
            Toast.makeText(this, "has pulsado elemento 1", Toast.LENGTH_SHORT).show()
        }
        else if (item.itemId == R.id.itElemento2)  {
            Toast.makeText(this, "has pulsado elemento 2", Toast.LENGTH_SHORT).show()
        }
        else if (item.itemId == R.id.itElemento3)  {
            Toast.makeText(this, "has pulsado elemento 3", Toast.LENGTH_SHORT).show()
        }
        else if (item.itemId == R.id.itSubmenu)  {
            Toast.makeText(this, "has pulsado en el submenu", Toast.LENGTH_SHORT).show()
        }


        return true
    }
}