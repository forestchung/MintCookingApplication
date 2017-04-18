package com.example.desmond.mintcookingapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class HomeActivity extends ActionBarActivity {
    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;
    ImageButton btn5;
    ImageButton btn6;
    ImageButton btn7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        btn1 = (ImageButton) findViewById(R.id.btnLogout);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        /*
        btn2 = (ImageButton) findViewById(R.id.ibtnstickrice);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, StickricerecipeActivity.class);
                startActivity(intent);
            }
        });
*/
        btn3 = (ImageButton) findViewById(R.id.btnprofile);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        btn4 = (ImageButton) findViewById(R.id.btntips);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, TipsActivity.class);
                startActivity(intent);
            }
        });
        btn5 = (ImageButton) findViewById(R.id.btnicebox);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, IceboxActivity.class);
                startActivity(intent);
            }
        });
        btn6 = (ImageButton) findViewById(R.id.btnrecipe);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, RecipeActivity.class);
                startActivity(intent);
            }
        });
        btn7 = (ImageButton) findViewById(R.id.btnhome);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

     // setupHomeButton();
     //  setupRecipeButton();
     //  setupIceboxButton();
      //  setupTipsButton();
      //  setupProfileButton();
      // setupStickriceButton();
       // setupLogoutButton();
    }

    private void setupLogoutButton() {
        btn1 = (ImageButton) findViewById(R.id.btnLogout);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupStickriceButton() {
        btn2 = (ImageButton) findViewById(R.id.btnstickrice);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, StickricerecipeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupProfileButton() {
        btn3 = (ImageButton) findViewById(R.id.btnprofile);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupTipsButton() {
        btn4 = (ImageButton) findViewById(R.id.btntips);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, TipsActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupIceboxButton() {
         btn5 = (ImageButton) findViewById(R.id.btnicebox);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, IceboxActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupRecipeButton() {
         btn6 = (ImageButton) findViewById(R.id.btnrecipe);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, RecipeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupHomeButton() {

         btn7 = (ImageButton) findViewById(R.id.btnhome);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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
