package es.travelworld.ejercicio51_toolbar;

import static es.travelworld.ejercicio51_toolbar.tools.References.KEY_USER;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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

        user = (User)getIntent().getSerializableExtra(KEY_USER);

        //setActionBarSettings();

        Log.i("---Datos usuario","Nombre: " + user.getName() + "\nApellidos: " + user.getLastname() + "\nEdad:" + user.getAgeGroup());
    }

    private void setActionBarSettings() {
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(getString(R.string.home_title));
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ac_menu);

    }
}