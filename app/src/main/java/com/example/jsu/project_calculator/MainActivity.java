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

import java.math.BigDecimal;
import java.text.DecimalFormat;

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

    private double  valueOne;
    private double valueTwo;
    private double inputOne;
    private double inputTwo;
    private DecimalFormat decimal;

    boolean add,sub,div,mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createObjectsVariables();

        decimal = new DecimalFormat("#.##########");
        valueOne = 0;
        valueTwo = 0 ;


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

    public void Onlclick(View view)
    {
        switch(view.getId()){
            case R.id.btn0:
                if(txtInput.getText().toString().equals("0")) {
                    txtInput.setText(btnZero.getText().toString());
                }
                else {
                    txtInput.append(btnZero.getText().toString());
                }
                break;
            case R.id.btn1:
                if(txtInput.getText().toString().equals("0")) {
                    txtInput.setText(btnOne.getText().toString());
                }
                else {
                    txtInput.append(btnOne.getText().toString());
                }
                break;
            case R.id.btn2:
                if(txtInput.getText().toString().equals("0")) {
                    txtInput.setText(btnTwo.getText().toString());
                }
                else {
                    txtInput.append(btnTwo.getText().toString());
                }
                break;
            case R.id.btn3:
                if(txtInput.getText().toString().equals("0")) {
                    txtInput.setText(btnThree.getText().toString());
                }
                else {
                    txtInput.append(btnThree.getText().toString());
                }
                break;
            case R.id.btn4:
                if(txtInput.getText().toString().equals("0")) {
                    txtInput.setText(btnFour.getText().toString());
                }
                else {
                    txtInput.append(btnFour.getText().toString());
                }
                break;
            case R.id.btn5:
                if(txtInput.getText().toString().equals("0")) {
                    txtInput.setText(btnFive.getText().toString());
                }
                else {
                    txtInput.append(btnFive.getText().toString());
                }
                break;
            case R.id.btn6:
                if(txtInput.getText().toString().equals("0")) {
                    txtInput.setText(btnSix.getText().toString());
                }
                else {
                    txtInput.append(btnSix.getText().toString());
                }
                break;
            case R.id.btn7:
                if(txtInput.getText().toString().equals("0")) {
                    txtInput.setText(btnSeven.getText().toString());
                }
                else {
                    txtInput.append(btnSeven.getText().toString());
                }
                break;
            case R.id.btn8:
                if(txtInput.getText().toString().equals("0")) {
                    txtInput.setText(btnEight.getText().toString());
                }
                else {
                    txtInput.append(btnEight.getText().toString());
                }
                break;
            case R.id.btn9:
                if(txtInput.getText().toString().equals("0")) {
                    txtInput.setText(btnNine.getText().toString());
                }
                else {
                    txtInput.append(btnNine.getText().toString());
                }
                break;
            case R.id.btnDecimal:
                if(!txtInput.getText().toString().contains("."))
                    txtInput.setText(txtInput.getText()+".");
                break;

            case R.id.btnAdd:
                if(!(mul | div | add | sub)) {
                    inputOne = Double.parseDouble(txtInput.getText().toString());
                    valueOne = inputOne;
                    add = true;
                    txtInput.setText("");
                }
                break;
            case R.id.btnSub:
                if(!(mul | div | add | sub)) {
                    inputOne = Double.parseDouble(txtInput.getText().toString());
                    valueOne = inputOne;
                    div = true;
                    txtInput.setText("");
                }
                break;
            case R.id.btnMulty:
                if(!(mul | div | add | sub)) {
                    inputOne = Double.parseDouble(txtInput.getText().toString());
                    valueOne = inputOne;
                    mul = true;
                    txtInput.setText("");
                }
                break;
            case R.id.btnDiv:
                if(!(mul | div | add | sub)) {
                    inputOne = Double.parseDouble(txtInput.getText().toString());
                    valueOne = inputOne;
                    div = true;
                    txtInput.setText("");
                }
                break;

            case R.id.btnClear:
                txtInput.setText("");
                mul = false;
                div = false;
                sub = false;
                add = false;
                break;

            case R.id.btnSqrt:
                inputOne = Math.sqrt(Double.parseDouble(txtInput.getText().toString()));
                txtInput.setText(decimal.format(inputOne ));
                break;

            case R.id.btnModulas:
                inputOne = Double.parseDouble(txtInput.getText().toString());
                double temp = inputOne/100;
                txtInput.setText(decimal.format(temp));
                break;

            case R.id.btnSign:
                if(!txtInput.getText().toString().equals("0")) {
                    inputOne = Double.parseDouble(txtInput.getText().toString());
                    Double temp2 = inputOne * -1;
                    txtInput.setText(decimal.format(temp2));
                }
                break;

            case R.id.btnEqual:
                inputTwo = Double.parseDouble(txtInput.getText().toString());
                valueTwo = inputTwo;

                if(add){
                    double addSolution = (valueOne + valueTwo);
                    txtInput.setText(decimal.format(addSolution));
                    add = false;
                }

                if(sub){
                    double subSolution = (valueOne - valueTwo);
                    txtInput.setText(decimal.format(subSolution));
                    sub = false;
                }

                if(mul){
                    double mulSolution = (valueOne * valueTwo);
                    txtInput.setText(decimal.format(mulSolution));
                    mul = false;
                }

                if(div){
                    double divSolution = (valueOne / valueTwo);
                    txtInput.setText(decimal.format(divSolution));
                    div = false;
                }

                break;


        }
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
