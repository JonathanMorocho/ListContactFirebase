package com.example.listcontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SaveActivity extends AppCompatActivity {

    TextView txtNombre;
    TextView txtApellido;
    TextView txtDireccion;
    TextView txtDescripcion;
    TextView txtTelefono;
    Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);
    }
}