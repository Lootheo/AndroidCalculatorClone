package com.fullstack.manuel.calculadora;

import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;


import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;


public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener{
    private String[] mPlanetTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        }
    }

    public void DeleteFunction(View view){
        EditText mainText = (EditText) findViewById(R.id.mainText);
        ImageButton b = (ImageButton)view;
        if(mainText.getText().length()>0)
        mainText.setText(mainText.getText().toString().substring(0,mainText.getText().toString().length()-1));
    }

    public void ButtonFunction(View view){
        EditText mainText = (EditText) findViewById(R.id.mainText);
        Button b = (Button)view;
        String input = b.getText().toString();
        switch (input){
            case "C":
                mainText.setText("0");
                break;
            case "( )":
                mainText.setText(mainText.getText().append("1"));
                break;
            case "%":
                mainText.setText(mainText.getText().append("%"));
                break;
            case "+":
                mainText.setText(mainText.getText().append("+"));
                break;
            case "-":
                mainText.setText(mainText.getText().append("-"));
                break;
            case "/":
                mainText.setText(mainText.getText().append("/"));
                break;
            case "X":
                mainText.setText(mainText.getText().append("x"));
                break;
            case "=":
                mainText.setText(mainText.getText().append("1"));
                break;
            case "0":
                mainText.setText(mainText.getText().append("0"));
                break;
            case "1":
                mainText.setText(mainText.getText().append("1"));
                break;
            case "2":
                mainText.setText(mainText.getText().append("2"));
                break;
            case "3":
                mainText.setText(mainText.getText().append("3"));
                break;
            case "4":
                mainText.setText(mainText.getText().append("4"));
                break;
            case "5":
                mainText.setText(mainText.getText().append("5"));
                break;
            case "6":
                mainText.setText(mainText.getText().append("6"));
                break;
            case "7":
                mainText.setText(mainText.getText().append("7"));
                break;
            case "8":
                mainText.setText(mainText.getText().append("8"));
                break;
            case "9":
                mainText.setText(mainText.getText().append("9"));
                break;
            case ".":
                mainText.setText(mainText.getText().append("."));
                break;
            default:
                mainText.setText("");
                break;
        }

    }
    public void HistorialFunction(View view){
        Toast.makeText(getApplicationContext(),"Abriendo Historial",Toast.LENGTH_LONG).show();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        //ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        //        this, drawer,  R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        //drawer.setDrawerListener(toggle);
        //toggle.syncState();
        if(!drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.openDrawer(Gravity.START);
        }
        else{
            drawer.closeDrawer(Gravity.START);
        }
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

}
