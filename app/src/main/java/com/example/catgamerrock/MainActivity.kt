package com.example.catgamerrock

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mostrarInicio()
    }

    private fun mostrarInicio() {
        val pantalla = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 80, 40, 40)
            setBackgroundColor(0xFF171329.toInt())
        }

        pantalla.addView(texto("🐱 CATGAMERROCK", 30f))
        pantalla.addView(texto("Videojuegos • Rock • Gatos", 18f))

        val explorar = Button(this).apply {
            text = "EXPLORAR VIDEOJUEGOS"
            setOnClickListener {
                mostrarCatalogo()
            }
        }

        pantalla.addView(explorar)
        setContentView(pantalla)
    }

    private fun mostrarCatalogo() {
        val pantalla = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(35, 50, 35, 35)
            setBackgroundColor(0xFF171329.toInt())
        }

        pantalla.addView(texto("CATÁLOGO DE VIDEOJUEGOS", 24f))
        pantalla.addView(texto("Elden Ring", 20f))
        pantalla.addView(texto("God of War Ragnarök", 20f))
        pantalla.addView(texto("Hollow Knight", 20f))
        pantalla.addView(texto("DOOM Eternal", 20f))

        val volver = Button(this).apply {
            text = "VOLVER AL INICIO"
            setOnClickListener {
                mostrarInicio()
            }
        }

        pantalla.addView(volver)
        setContentView(pantalla)
    }

    private fun texto(contenido: String, tamaño: Float): TextView {
        return TextView(this).apply {
            text = contenido
            textSize = tamaño
            setTextColor(0xFFFFFFFF.toInt())
            setPadding(0, 20, 0, 20)
        }
    }
}


