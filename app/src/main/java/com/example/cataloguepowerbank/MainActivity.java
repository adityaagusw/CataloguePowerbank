package com.example.cataloguepowerbank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.cataloguepowerbank.Fragment.HomeFragment;
import com.example.cataloguepowerbank.Fragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottom_navigation;
    private Fragment selectedfragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottom_navigation = findViewById(R.id.bottom_navigation);
        bottom_navigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

        displayFragment(new HomeFragment());

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                    selectedfragment = new HomeFragment();
                    break;
                case R.id.nav_profile:
                    selectedfragment = new ProfileFragment();
            }
            if (selectedfragment != null){
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        selectedfragment).commit();
            }
            return true;
        }
    };

    private void displayFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                //disini relative layout akan di replace menggantikan fragment
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}
