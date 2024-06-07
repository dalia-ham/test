//package com.example.test;
//
//import android.os.Bundle;
//import android.view.MenuItem;
//import android.widget.Toast;
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.ActionBarDrawerToggle;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//import androidx.core.view.GravityCompat;
//import androidx.drawerlayout.widget.DrawerLayout;
//import com.google.android.material.navigation.NavigationView;
//
//public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
//
//    private DrawerLayout drawerLayout;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        drawerLayout = findViewById(R.id.drawer_layout);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        NavigationView navigationView = findViewById(R.id.navigation_view);
//        navigationView.setNavigationItemSelectedListener(this);
//
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();
//    }
//
//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//        int id = item.getItemId();
//
//        switch (id) {
//            case R.id.nav_personal:
//                // Handle profile click
//                break;
//            case R.id.tripparticipated:
//                // Handle trips click
//                break;
//            case R.id.savepost:
//                // Handle saved posts click
//                break;
//            case R.id.Tripcreated:
//                // Handle favorite trips click
//                break;
//            case R.id.app_bar_switch:
//                // Handle dark mode toggle
//                break;
//            case R.id.savetrip:
//                // Handle saved trips click
//                break;
//            case R.id.nav_logout:
//                handleLogout();
//                break;
//            default:
//                return false;
//        }
//
//        drawerLayout.closeDrawer(GravityCompat.START);
//        return true;
//    }
//
//    private void handleLogout() {
//        // Implement your logout logic here
//        Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show();
//        // For example, clear user data and navigate to login activity
//        // Intent intent = new Intent(this, LoginActivity.class);
//        // startActivity(intent);
//        // finish();
//    }
//
//    @Override
//    public void onBackPressed() {
//        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
//            drawerLayout.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
//    }
//}
