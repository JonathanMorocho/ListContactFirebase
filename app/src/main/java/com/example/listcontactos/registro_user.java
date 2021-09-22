package com.example.listcontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.listcontactos.database.ContactLab;
import com.example.listcontactos.database.Contacto;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class registro_user extends AppCompatActivity implements View.OnClickListener {

    TextView txtNombre;
    TextView txtApellido;
    TextView txtDireccion;
    TextView txtDescripcion;
    TextView txtTelefono;
    Button btnGuardar;
    DatabaseReference database;


    private Contacto contacto;
    private ContactLab contactLab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_user);

        txtNombre = findViewById(R.id.nombre);
        txtApellido = findViewById(R.id.apellidos);
        txtDireccion = findViewById(R.id.ciudad);
        txtDescripcion = findViewById(R.id.descripcion);
        txtTelefono = findViewById(R.id.telefono);
        btnGuardar = findViewById(R.id.btnguardar);
        database = FirebaseDatabase.getInstance().getReference("Contact");
    }

    public void guardarBD() {
        String nombre = txtNombre.getText().toString();
        String apellido = txtApellido.getText().toString();
        String direccion = txtDireccion.getText().toString();
        String descripcion = txtDescripcion.getText().toString();
        String telefono = txtTelefono.getText().toString();

        if (!nombre.isEmpty()) {
            String id = database.push().getKey();
            contacto = new Contacto(id, nombre, apellido, direccion, descripcion, telefono, "");
            database.child("Datos").child(id).setValue(contacto);
            Toast.makeText(this, "Guardado con exito", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    public void onClick(View v) {
        if(btnGuardar == v){
            guardarBD();
            Toast.makeText(this, "Guardado", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "ELSEEE", Toast.LENGTH_SHORT).show();
        }
    }
}