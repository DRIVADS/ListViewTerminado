package com.raulcastaneda.listviewter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_imagenes.*

class ImagenesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagenes)

        Picasso.get().load("https://www.planetadelibros.com/usuaris/libros/fotos/273/m_libros/portada_assassins-creed-conspiradores_jean-baptiste-hostache_201909051319.jpg").into(imageView)

    }

}
