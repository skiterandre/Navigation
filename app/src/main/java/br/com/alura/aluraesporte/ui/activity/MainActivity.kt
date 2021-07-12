package br.com.alura.aluraesporte.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import br.com.alura.aluraesporte.R


class MainActivity : AppCompatActivity() {

    private val controlador  by lazy{
        findNavController(R.id.main_activity_navhost)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        controlador.addOnDestinationChangedListener { controller, destination, arguments ->

            title = destination.label

            when(destination.id){
                R.id.listaProdutos -> supportActionBar?.show()
                R.id.Login -> supportActionBar?.hide()
            }
        }
    }




}
