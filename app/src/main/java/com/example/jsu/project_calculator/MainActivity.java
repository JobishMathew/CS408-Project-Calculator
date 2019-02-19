package com.example.jsu.project_calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget. *;

public class MainActivity extends AppCompatActivity {


    private Button btnZero;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnAdditoin;
    private Button btnSubtract;
    private Button btnMultiply;
    private Button btnDivision;
    private Button btnSquareroot;
    private Button btnModulas;
    private Button btnDecimal;
    private Button btnSign;
    private Button btnEqual;
    private Button btnClear;

    private TextView txtResult;
    private TextView txtInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createObjectsVariables();
       /* btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.append(btnZero.getText());
            }
        }); */
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.append(btnOne.getText());
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.append(btnTwo.getText());
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.append(btnThree.getText());
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.append(btnFour.getText());
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.append(btnFive.getText());
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.append(btnSix.getText());
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.append(btnSeven.getText());
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.append(btnEight.getText());
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.append(btnNine.getText());
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInput.setText(null);
            }
        });

    }

    public void checkButtonClock(View V){
        String id = (btnZero.getResources().getResourceName(btnZero.getId())).split("/")[1];
        txtInput.append(id);
    }

    private void createObjectsVariables(){
        btnZero = (Button) findViewById(R.id.btn0);
        btnOne = (Button) findViewById(R.id.btn1);
        btnTwo = (Button) findViewById(R.id.btn2);
        btnThree = (Button) findViewById(R.id.btn3);
        btnFour = (Button) findViewById(R.id.btn4);
        btnFive = (Button) findViewById(R.id.btn5);
        btnSix = (Button) findViewById(R.id.btn6);
        btnSeven = (Button) findViewById(R.id.btn7);
        btnEight = (Button) findViewById(R.id.btn8);
        btnNine= (Button) findViewById(R.id.btn9);
        btnAdditoin = (Button) findViewById(R.id.btnAdd);
        btnSubtract = (Button) findViewById(R.id.btnSub);
        btnMultiply = (Button) findViewById(R.id.btnMulty);
        btnDivision = (Button) findViewById(R.id.btnDiv);
        btnSquareroot = (Button) findViewById(R.id.btnSqrt);
        btnModulas = (Button) findViewById(R.id.btnModulas);
        btnDecimal = (Button) findViewById(R.id.btnDecimal);
        btnSign = (Button) findViewById(R.id.btnSign);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnClear = (Button) findViewById(R.id.btnClear);

        txtResult = (TextView) findViewById(R.id.txtResult);
        txtInput = (TextView) findViewById(R.id.txtInput);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
