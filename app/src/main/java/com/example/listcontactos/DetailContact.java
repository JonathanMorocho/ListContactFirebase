package com.example.listcontactos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailContact extends AppCompatActivity {

    private TextView Nombre, Telefono,Ciudad, Descripcion;
    private ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_contact);

        //Obtener los datos
        String direccion = getIntent().getStringExtra("Direccion");
        String nombre = getIntent().getStringExtra("Nombre");
        String apellidos = getIntent().getStringExtra("Apellidos");
        String telefono = getIntent().getStringExtra("Telefono");
        String foto = getIntent().getStringExtra("Foto");
        String correo = getIntent().getStringExtra("Correo");

        //ubicacion = findViewById(R.id.deta)
        imagen = findViewById(R.id.detailContactImage);
        Nombre = findViewById(R.id.detailContactName);
        Ciudad = findViewById(R.id.detailContactCity);
        Descripcion = findViewById(R.id.detailContactDescription);
        Telefono = findViewById(R.id.detailContactNumber);
        Descripcion = findViewById(R.id.detailContactDescription);

        Nombre.setText(nombre +" "+ apellidos+"\n");
        Telefono.setText(telefono);
        Ciudad.setText(direccion);
        Descripcion.setText(correo);
        Glide.with(this)
                .load(foto)
                .into(imagen);
    }


}
