package az.zero.navigationcomponent_cat.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.HashSet;
import java.util.Set;

import az.zero.navigationcomponent_cat.R;

public class MainActivity extends AppCompatActivity {

    AppBarConfiguration appBarConfiguration;
    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//         // if you use fragment
//        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
//        NavController navController = Navigation.findNavController(this,R.id.nav_host_fragment);
//        NavigationUI.setupWithNavController(bottomNavigationView,navController);

        // if you use navHostFragment
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(bottomNavigationView, navController);


        // setup appbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);

        Set<Integer> topLevelDestinations = new HashSet<>();
        topLevelDestinations.add(R.id.homeFragment);
        topLevelDestinations.add(R.id.profileFragment);
        topLevelDestinations.add(R.id.categoryFragment);

        appBarConfiguration = new AppBarConfiguration
                .Builder(topLevelDestinations)
                .setOpenableLayout(drawerLayout)
                .build();

        NavigationUI.setupWithNavController(toolbar, navController, appBarConfiguration);

        // setup slider
        NavigationView slider = findViewById(R.id.nav_drawer_slider);
        NavigationUI.setupWithNavController(slider,navController);
    }
}