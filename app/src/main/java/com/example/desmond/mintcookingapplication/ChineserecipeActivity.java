package com.example.desmond.mintcookingapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class ChineserecipeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chineserecipe);

        setupstickriceButton();
        setupbackButton();
        setupHomeButton();
        setupRecipeButton();
        setupIceboxButton();
        setupTipsButton();
        setupProfileButton();
        setupLogoutButton();
    }

    private void setupLogoutButton() {
        ImageButton btn = (ImageButton) findViewById(R.id.btnLogout);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChineserecipeActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupProfileButton() {
        ImageButton btn = (ImageButton) findViewById(R.id.btnprofile);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChineserecipeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupTipsButton() {
        ImageButton btn = (ImageButton) findViewById(R.id.btntips);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChineserecipeActivity.this, TipsActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupIceboxButton() {
        ImageButton btn = (ImageButton) findViewById(R.id.btnicebox);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChineserecipeActivity.this, IceboxActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupRecipeButton() {
        ImageButton btn = (ImageButton) findViewById(R.id.btnrecipe);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChineserecipeActivity.this, RecipeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupHomeButton() {

        ImageButton btn = (ImageButton) findViewById(R.id.btnhome);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChineserecipeActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupbackButton() {
        ImageButton btn = (ImageButton) findViewById(R.id.btnback);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChineserecipeActivity.this, RecipeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupstickriceButton() {
        Button btn = (Button) findViewById(R.id.btnstickrice);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChineserecipeActivity.this, StickricerecipeActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chineserecipe, menu);
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
