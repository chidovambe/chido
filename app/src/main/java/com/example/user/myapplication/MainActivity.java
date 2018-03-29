package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        {

        public void toastMe(View view){
            // Toast myToast = Toast.makeText(this, message, duration);
            Toast myToast = Toast.makeText(this, "Hello Toast!",
                    Toast.LENGTH_SHORT);
            myToast.show();


        }

       public void countMe (View view) {
            // Get the text view
            TextView showCountTextView =
                    (TextView) findViewById(R.id.textView);
            String countString = showCountTextView.getText().toString();
            Integer count = Integer.parseInt(countString);
            count++;
            showCountTextView.setText(count.toString());

        }
// Start the new activity.


                public void randomMe (View view) {
                        Intent randomIntent = new Intent(this, SecondActivity.class);

            // Get the text view that shows the count.
                         TextView showCountTextView = (TextView) findViewById(R.id.textView);

            // Get the value of the text view.
                             String countString = showCountTextView.getText().toString();

            // Convert the count to an int
                            int count = Integer.parseInt(countString);

            // Add the count to the extras for the Intent.
                              randomIntent.putExtra(TOTAL_COUNT, count);

            // Start the new activity.
                              startActivity(randomIntent);
                    // TextView showCountTextView = (TextView) findViewById(R.id.text);




                    // Start the new activity.
                            startActivity(randomIntent);


                    public void showRandomNumber () {
                // Get the text view where the random number will be displayed
                TextView randomView = (TextView)
                        findViewById(R.id.textview_random);

                // Get the text view where the heading is displayed
                TextView headingView = (TextView)
                        findViewById(R.id.textview_label);

                // Get the count from the intent extras
                int count = getIntent().getIntExtra(TOTAL_COUNT, 0);

                // Generate the random number
                Random random = new Random();
                int randomInt = 0;
                if (count>0) {
                    randomInt = random.nextInt(count);
                }


                }



            }



        }
    }
}
