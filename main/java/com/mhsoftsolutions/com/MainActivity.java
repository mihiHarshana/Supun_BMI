package com.mhsoftsolutions.com;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtWeight;
    EditText txtHeight;
    TextView txtOutPut;
    Button btnCalculate;
    Button btnClear;
    TextView lblRange1;
    Button btnClose;


    /**
     * Calculate  BMI using weight and height and returns the result
     *
     * @param weight
     * @param height
     * @return
     */
    public static double calculateBMI(double weight, double height) {
        double result = (weight / (height * height));

        return result;
    }

    /**
     * Return a String value depening on the value of the BMI
     *
     * @param BMvalue
     * @return
     */
    public static String BMIMessage(double BMvalue) {
        if (BMvalue < 18.5) {
            return "Under Weight";
        } else if (BMvalue <= 22.9) {
            return "Normal";
        } else if (BMvalue <= 24.9) {
            return "Over weight";
        } else if (BMvalue <= 29.9) {
            return "Obesity class1";
        } else if (BMvalue <= 34.9) {
            return "Obesity class2";
        } else if (BMvalue >= 35) {
            return "Obesity class3";
        } else {
            return "Not in defined range";
        }
    }

    public void changeColorbyMessage(String message, TextView txtoutput) {
        if (message == "Under Weight") {
            txtoutput.setBackgroundColor(Color.BLUE);
        } else if (message == "Normal") {
            txtoutput.setBackgroundColor(Color.GREEN);
        } else if (message == "Over weight") {
            txtoutput.setTextColor(Color.BLACK);
            txtoutput.setBackgroundColor(Color.YELLOW);
        } else if (message == "Obesity class1") {
            txtoutput.setBackgroundColor(Color.RED);
        } else if (message == "Obesity class2") {
            txtoutput.setBackgroundColor(Color.RED);
        } else if (message == "Obesity class3") {
            txtoutput.setBackgroundColor(Color.RED);
        }

    }

    public void clearFields() {
        txtWeight.setText("");
        txtHeight.setText("");
        txtOutPut.setText("0");

        lblRange1.setText("");
        txtWeight.requestFocus();
        txtOutPut.setBackgroundColor(Color.WHITE);
    }
}