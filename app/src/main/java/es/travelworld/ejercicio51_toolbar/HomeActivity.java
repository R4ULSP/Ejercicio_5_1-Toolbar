package es.travelworld.ejercicio51_toolbar;

import static es.travelworld.ejercicio51_toolbar.tools.References.KEY_USER;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Objects;

import es.travelworld.ejercicio51_toolbar.databinding.ActivityHomeBinding;
import es.travelworld.ejercicio51_toolbar.tools.User;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        //setActionBarSettings();

    //    Log.i("---Datos usuario","Nombre: " + user.getName() + "\nApellidos: " + user.getLastname() + "\nEdad:" + user.getAgeGroup());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.eurodisney) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.disneylandparis.com/es-es/"));
            startActivity(intent);
        }

        if (item.getItemId() == R.id.rentacar) {
            Toast.makeText(this, "icono en toolbar pulsado", Toast.LENGTH_SHORT).show();
            return true;
            /* TODO: PONER FRAGMENT */
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.home_menu_toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

}