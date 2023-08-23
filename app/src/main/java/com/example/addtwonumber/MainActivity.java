package com.example.addtwonumber;

// MainActivity.java

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumberEditText;
    private EditText secondNumberEditText;
    private TextView resultTextView;
    private EditText minRangeEditText;
    private EditText maxRangeEditText;
    private TextView randomNumberTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        firstNumberEditText = findViewById(R.id.firstNumberEditText);
        secondNumberEditText = findViewById(R.id.secondNumberEditText);
        resultTextView = findViewById(R.id.resultTextView);
        minRangeEditText = findViewById(R.id.minRangeEditText);
        maxRangeEditText = findViewById(R.id.maxRangeEditText);
        randomNumberTextView = findViewById(R.id.randomNumberTextView);

        // Set click listener for Add button
        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNumbers();
            }
        });

        // Set click listener for Generate button
        Button generateButton = findViewById(R.id.generateButton);
        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateRandomNumber();
            }
        });
    }

    private void addNumbers() {
        // Get user input from EditText fields
        int num1 = Integer.parseInt(firstNumberEditText.getText().toString());
        int num2 = Integer.parseInt(secondNumberEditText.getText().toString());

        // Add the numbers
        int sum = num1 + num2;

        // Display the result
        resultTextView.setText("Result: " + sum);
    }

    private void generateRandomNumber() {
        // Get user input from EditText fields
        int minRange = Integer.parseInt(minRangeEditText.getText().toString());
        int maxRange = Integer.parseInt(maxRangeEditText.getText().toString());

        // Generate a random number within the specified range
        int randomNum = new Random().nextInt((maxRange - minRange) + 1) + minRange;

        // Display the random number
        randomNumberTextView.setText("Random Number: " + randomNum);
    }
}
