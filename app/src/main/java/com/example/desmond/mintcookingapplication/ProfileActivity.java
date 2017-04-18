package com.example.desmond.mintcookingapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class ProfileActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        setupHomeButton();
        setupRecipeButton();
        setupIceboxButton();
        setupTipsButton();
        setupProfileButton();
        setupStickRiceButton();
        setupEditProfileButton();
        setupUploadRecipeButton();
        setupLogoutButton();
    }

    private void setupLogoutButton() {
        ImageButton btn = (ImageButton) findViewById(R.id.btnLogout);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupUploadRecipeButton() {
        Button myButton = (Button) findViewById(R.id.btnUploadRecipe);

        myButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ProfileActivity.this, UploadrecipeActivity.class));
            }
        });
    }

    private void setupEditProfileButton() {
        Button myButton = (Button) findViewById(R.id.btnEditProfile);

        myButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ProfileActivity.this, EditprofileActivity.class));
            }
        });
    }

    private void setupStickRiceButton() {
        ImageButton btn = (ImageButton) findViewById(R.id.btnstickrice);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, StickricerecipeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupProfileButton() {
        ImageButton btn = (ImageButton) findViewById(R.id.btnprofile);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupTipsButton() {
        ImageButton btn = (ImageButton) findViewById(R.id.btntips);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, TipsActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupIceboxButton() {
        ImageButton btn = (ImageButton) findViewById(R.id.btnicebox);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, IceboxActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupRecipeButton() {
        ImageButton btn = (ImageButton) findViewById(R.id.btnrecipe);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, RecipeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupHomeButton() {

        ImageButton btn = (ImageButton) findViewById(R.id.btnhome);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
