/**
 * Here is a header comment for the file for the 317 class.
 */

package com.example.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     Here is a comment for the function
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Y
        super.onCreate(savedInstanceState);
        // Z
        setContentView(R.layout.activity_main);

        // Add a comment!

        System.out.println("hi");
    }

    private void anotherFunction() {
        System.out.println("another");
    }
}