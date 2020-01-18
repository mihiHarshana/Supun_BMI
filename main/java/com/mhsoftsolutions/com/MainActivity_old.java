/**
 * Copyright @mhsoftsolutons.site40.net.
 * Developed and maintained by Mihindu Wijesena,
 * Prof. Kumara Mendis, Dr.Supun Withana
 */
package com.mhsoftsolutions.com;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity_old extends AppCompatActivity {
    EditText txtWeight;
    EditText txtHeight;
    TextView txtOutPut;
    Button btnCalculate;
    Button btnClear;
    TextView lblRange1;
    Button btnClose;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    //private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtWeight = (EditText) findViewById(R.id.txtWeight);
        txtHeight = (EditText) findViewById(R.id.txtHeight);
        txtOutPut = (TextView) findViewById(R.id.lblOutput);
        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        btnClear = (Button) findViewById(R.id.btnClear);
        lblRange1 = (TextView) findViewById(R.id.lblRange1);
        btnClose = (Button) findViewById(R.id.btnClose);
        this.clearFields();

        btnCalculate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double result = 0.0;
                try {
                    double weight = Double.parseDouble(String.valueOf(txtWeight.getText()));
                    double height = Double.parseDouble(String.valueOf(txtHeight.getText()));

                    result = calculateBMI(weight, height);
                    lblRange1.setText(BMIMessage(result));
                    String strResult = String.format("%.3f", result);
                    txtOutPut.setText(String.valueOf(strResult));
                   changeColorbyMessage(lblRange1.getText().toString(),txtOutPut);

                } catch (Exception ex) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Check height and weight", Toast.LENGTH_SHORT);
                    clearFields();
                    toast.show();
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearFields();
            }
        });

        btnClose.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
   //     client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * Calculate  BMI using weight and height and returns the result
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
    public static String BMIMessage (double BMvalue) {
        if (BMvalue < 18.5) {
            return "Under Weight";
        } else if (BMvalue <= 22.9) {
            return "Normal";
        } else if (BMvalue <= 24.9) {
            return "Over weight";
        }else if (BMvalue <= 29.9) {
            return "Obesity class1";
        }else if (BMvalue <= 34.9) {
            return "Obesity class2";
        }else if (BMvalue >=35){
            return "Obesity class3";
        }
        else{
            return "Not in defined range";
        }
    }
    public void changeColorbyMessage(String message,TextView txtoutput ) {
        if (message == "Under Weight") {
            txtoutput.setBackgroundColor(Color.BLUE);
        }else if (message == "Normal" ){
            txtoutput.setBackgroundColor(Color.GREEN);
        }else if (message == "Over weight"){
            txtoutput.setTextColor(Color.BLACK);
            txtoutput.setBackgroundColor(Color.YELLOW);
        }else if (message == "Obesity class1"){
            txtoutput.setBackgroundColor(Color.RED);
        }else if (message == "Obesity class2"){
            txtoutput.setBackgroundColor(Color.RED);
        }else if (message == "Obesity class3"){
            txtoutput.setBackgroundColor(Color.RED);
        }

    }
    public void clearFields(){
        txtWeight.setText("");
        txtHeight.setText("");
        txtOutPut.setText("0");

        lblRange1.setText("");
        txtWeight.requestFocus();
        txtOutPut.setBackgroundColor(Color.WHITE);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
/*        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://net.site40.mhsoftsolutions.bmicalculator/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);*/
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
/*        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://net.site40.mhsoftsolutions.bmicalculator/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();*/
    }
}
