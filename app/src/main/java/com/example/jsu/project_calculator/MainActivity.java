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
    char operator;

    boolean add,sub,div,mul,sqrt,modulas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createObjectsVariables();
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

    public void btnZeroonClick(View v) {
        txtInput.setText(txtInput.getText()+"0");
    }
    public void btnOneOnClick(View v) {
        txtInput.setText(txtInput.getText()+"1");
    }
    public void btnTwoOnClick(View v) {
        txtInput.setText(txtInput.getText()+"2");
    }
    public void btnThreeOnClick(View v) {
        txtInput.setText(txtInput.getText()+"3");
    }
    public void btnFourOnClick(View v) {
        txtInput.setText(txtInput.getText()+"4");
    }
    public void btnFiveOnClick(View v) {
        txtInput.setText(txtInput.getText()+"5");
    }
    public void btnSixOnClick(View v) {
        txtInput.setText(txtInput.getText()+"6");
    }
    public void btnSevenOnClick(View v) {
        txtInput.setText(txtInput.getText()+"7");
    }
    public void btnEightOnClick(View v) {
        txtInput.setText(txtInput.getText()+"8");
    }
    public void btnNineOnClick(View v) {
        txtInput.setText(txtInput.getText()+"9");
    }
    public void BtnDecimalOnClick(View v){
        txtInput.setText(txtInput.getText()+".");

    }
    public void BtnSignClick(View v){

    }

    //Caluclation Buttons.
    public void BtnAdditoinOnClick(View v){
        valueOne = Double.parseDouble(txtInput.getText() + "");
        add=true;
        txtInput.setText(null);
        txtResult.append(String.valueOf(valueOne)+ "+");
    }
    public void BtnSubtractionOnClick(View v){
        valueOne = Double.parseDouble(txtInput.getText() + "");
        sub=true;
        txtInput.setText(null);
        txtResult.append(String.valueOf(valueOne)+"-");
    }
    public void BtnMultiplicationOnClick(View v){
        valueOne = Double.parseDouble(txtInput.getText() + "");
        mul=true;
        txtInput.setText(null);
        txtResult.append(String.valueOf(valueOne)+"*");
    }
    public void BtnDivisionOnClick(View v){
        valueOne = Double.parseDouble(txtInput.getText() + "");
        div=true;
        txtInput.setText(null);
        txtResult.append(String.valueOf(valueOne)+"/");
    }

    public void BtnSqrtOnClick(View v){
        valueOne = Double.parseDouble(txtInput.getText() + "");
        sqrt=true;
        txtInput.setText(null);
        txtResult.append("\u221a"+ String.valueOf(valueOne));

    }
    public void BtnModulasOnClick(View v){

    }

    public void BtnEqualOnClick(View v){
        valueTwo = Double.parseDouble(txtInput.getText()+"");
        txtResult.append(String.valueOf(valueTwo)+"=");
        if(add == true){
            txtInput.setText(valueOne +valueTwo+"");
            add=false;
        }
        if(sub == true){
            txtInput.setText(valueOne - valueTwo+"");
            sub=false;
        }
        if(mul == true){
            txtInput.setText(valueOne * valueTwo+"");
            mul=false;
        }
        if(div == true){
            txtInput.setText(valueOne / valueTwo+"");
            div=false;
        }
        if(sqrt == true) {
            txtInput.setText(Math.sqrt(valueOne) + "");
            sqrt = false;
        }
    }


    public void BtnClearOnClick(View v){
        txtInput.setText("");
        txtResult.setText("");
        valueOne = 0 ;
        valueTwo = 0 ;

    }

    /*public void calculations(){


        switch(operator){
            case ADDITION:
                valueOne = valueOne.add(valueTwo);
                txtResult.setText(valueOne.toString());
                txtInput.setText(Character.toString(ADDITION));
                break;
            case SUBTRACTION:
                valueOne = valueOne.subtract(valueTwo);
                txtResult.setText(valueOne.toString());;
                txtInput.setText(Character.toString(SUBTRACTION));
                break;
            case MULTIPLICATION:
                valueOne = valueOne.multiply(valueTwo);
                txtResult.setText(valueOne.toString());
                txtInput.setText(Character.toString(MULTIPLICATION));
                break;
            case DIVISION:
                valueOne = valueOne.divide(valueTwo);
                txtResult.setText(valueOne.toString());
                txtInput.setText(Character.toString(DIVISION));
                break;
            case EQUAL:
                txtResult.setText(valueOne.toString());
                txtInput.setText(null);
                break;
            default:
                break;
        }
    } */

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
