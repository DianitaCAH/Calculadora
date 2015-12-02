package com.electiva.calculadora;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.isNaN;

public class Calculadora extends AppCompatActivity {

    private Toolbar toolbar;
    public double firstNum;
    public double secondNum;
    public double resultado;
    public String operador;
    public String[] variables;
    public TextView screen;
    private ImageView one, two, three, four, five, six, seven, eight, nine, zero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        screen = (TextView) findViewById(R.id.screen);
        zero = (ImageView) findViewById(R.id.zero);
        one = (ImageView) findViewById(R.id.one);
        two = (ImageView) findViewById(R.id.two);
        three = (ImageView) findViewById(R.id.three);
        four = (ImageView) findViewById(R.id.four);
        five = (ImageView) findViewById(R.id.five);
        six = (ImageView) findViewById(R.id.six);
        seven = (ImageView) findViewById(R.id.seven);
        eight = (ImageView) findViewById(R.id.eight);
        nine = (ImageView) findViewById(R.id.nine);

    }

    public void one(View v) {
        String resultado = "";
        if (screen.getText().toString().isEmpty()) {
            resultado = "1";
        } else {
            resultado = screen.getText() + "1";
        }
        this.screen.setText(resultado);
    }

    public void two(View v) {
        String resultado = "";
        if (screen.getText().toString().isEmpty()) {
            resultado = "2";
        } else {
            resultado = screen.getText() + "2";
        }
        this.screen.setText(resultado);
    }

    public void three(View v) {
        String resultado = "";
        if (screen.getText().toString().isEmpty()) {
            resultado = "3";
        } else {
            resultado = screen.getText() + "3";
        }
        this.screen.setText(resultado);
    }

    public void four(View v) {
        String resultado = "";
        if (screen.getText().toString().isEmpty()) {
            resultado = "4";
        } else {
            resultado = screen.getText() + "4";
        }
        this.screen.setText(resultado);
    }

    public void five(View v) {
        String resultado = "";
        if (screen.getText().toString().isEmpty()) {
            resultado = "5";
        } else {
            resultado = screen.getText() + "5";
        }
        this.screen.setText(resultado);
    }

    public void six(View v) {
        String resultado = "";
        if (screen.getText().toString().isEmpty()) {
            resultado = "6";
        } else {
            resultado = screen.getText() + "6";
        }
        this.screen.setText(resultado);
    }

    public void seven(View v) {
        String resultado = "";
        if (screen.getText().toString().isEmpty()) {
            resultado = "7";
        } else {
            resultado = screen.getText() + "7";
        }
        this.screen.setText(resultado);
    }

    public void eight(View v) {
        String resultado = "";
        if (screen.getText().toString().isEmpty()) {
            resultado = "8";
        } else {
            resultado = screen.getText() + "8";
        }
        this.screen.setText(resultado);
    }

    public void nine(View v) {
        String resultado = "";
        if(screen.getText().toString().isEmpty()){
            resultado = "9";
        }else{
            resultado =  screen.getText() + "9";
        }
        this.screen.setText(resultado);
    }

    public void zero(View v) {
        String resultado = "";
        if (screen.getText().toString().isEmpty() || screen.getText().toString().equals("0")) {
            resultado = "0";
        } else {
            resultado = screen.getText() + "0";
        }
        this.screen.setText(resultado);
    }

    /*
    * Metodos para las operaciones (+, -, *, /.... etc)
    */
    public void suma(View v) {
            String result = screen.getText().toString();
        if (!result.isEmpty()) {
            screen.setText(result + "+");
            //hago la operacion
            operador = "+";
        }else{
            Toast.makeText(this, "Debe ingresar algun numero!",Toast.LENGTH_SHORT).show();
        }
    }

    public void resta(View v) {
        String result = screen.getText().toString();
        if (!result.isEmpty()) {
            screen.setText(result+"-");
            //hago la operacion
            operador = "-";
        }else{
            Toast.makeText(this, "Debe ingresar algun numero!",Toast.LENGTH_SHORT).show();
        }
    }

    public void dividir(View v) {
        String result = screen.getText().toString();
        if (!result.isEmpty()) {
            screen.setText(result+"/");
            //hago la operacion
            operador = "/";
        }else{
            Toast.makeText(this, "Debe ingresar algun numero!",Toast.LENGTH_SHORT).show();
        }
    }

    public void multiplicar(View v) {
        String result = screen.getText().toString();
        if (!result.isEmpty()) {
            screen.setText(result+"*");
            //hago la operacion
            operador="*";
        }else{
            Toast.makeText(this, "Debe ingresar algun numero!",Toast.LENGTH_SHORT).show();
        }
    }

    public void exponente(View v) {
        String result = screen.getText().toString();
        if (!result.isEmpty()) {
            screen.setText(result+"^");
            //hago la operacion
            operador="^";
        }else{
            Toast.makeText(this, "Debe ingresar algun numero!",Toast.LENGTH_SHORT).show();
        }
    }

    public void exponencial(View v){
        String result = screen.getText().toString();
        if (!result.isEmpty()) {
            firstNum = Double.parseDouble(result);
            screen.setText("e(" + result + ")");
        }else {
            screen.setText("2.7182818285");
        }
        //hago la operacion
        operador="e";
    }

    public void logaritmo(View v) {
        String result = screen.getText().toString();
        if (!result.isEmpty()) {
            firstNum =  Double.parseDouble(result);
            screen.setText("log("+result+")");
            //hago la operacion
            operador="log";
        }else{
            Toast.makeText(this, "Debe ingresar algun numero!",Toast.LENGTH_SHORT).show();
        }
    }

    public void raiz(View v){
        String result = screen.getText().toString();
        if (!result.isEmpty()) {
            screen.setText(result+"√");
            //hago la operacion
            operador="√";
        }else{
            Toast.makeText(this, "Debe ingresar algun numero!",Toast.LENGTH_SHORT).show();
        }
    }

    public void seno(View v){
        String result = screen.getText().toString();
        if (!result.isEmpty()) {
            firstNum =  Double.parseDouble(result);
            screen.setText("sin("+result+")");
            //hago la operacion
            operador="sin";
        }else{
            Toast.makeText(this, "Debe ingresar algun numero!",Toast.LENGTH_SHORT).show();
        }
    }

    public void coseno(View v){

        String result = screen.getText().toString();
        if (!result.isEmpty()) {
            firstNum =  Double.parseDouble(result);
            screen.setText("cos("+result+")");
            //hago la operacion
            operador="cos";
        }else{
            Toast.makeText(this, "Debe ingresar algun numero!",Toast.LENGTH_SHORT).show();
        }
    }

    public void tangente(View v){
        String result = screen.getText().toString();
        if (!result.isEmpty()) {
            firstNum =  Double.parseDouble(result);
            screen.setText("tan("+result+")");
            //hago la operacion
            operador="tan";
        }else{
            Toast.makeText(this, "Debe ingresar algun numero!",Toast.LENGTH_SHORT).show();
        }
    }

    public void arcoSeno(View v){
        String result = screen.getText().toString();
        if (!result.isEmpty()) {
            firstNum =  Double.parseDouble(result);
            screen.setText("tan-1("+result+")");
            //hago la operacion
            operador="sin-1";
        }else{
            Toast.makeText(this, "Debe ingresar algun numero!",Toast.LENGTH_SHORT).show();
        }
    }

    public void arcoCoseno(View v){
        String result = screen.getText().toString();
        if (!result.isEmpty()) {
            firstNum =  Double.parseDouble(result);
            screen.setText("tan-1("+result+")");
            //hago la operacion
            operador="cos-1";
        }else{
            Toast.makeText(this, "Debe ingresar algun numero!",Toast.LENGTH_SHORT).show();
        }
    }

    public void arcoTangente(View v){
        String result = screen.getText().toString();
        if (!result.isEmpty()) {
            firstNum =  Double.parseDouble(result);
            screen.setText("tan-1("+result+")");
            //hago la operacion
            operador="tan-1";
        }else{
            Toast.makeText(this, "Debe ingresar algun numero!",Toast.LENGTH_SHORT).show();
        }
    }

    public void clear(View v){
        this.screen.setText("");
        firstNum = 0f;
        secondNum = 0f;
    }

    public void dot(View v) {
        String resultado = "";
        if(screen.getText().toString().isEmpty()){
            resultado = "0.";
        }else{
            resultado = screen.getText() + "0";
        }
        this.screen.setText(resultado);
    }

    public void equals(View v){
        String result = screen.getText().toString();
        variables = result.split("\\"+operador);
        String num1 = variables[0];
        String num2 = "";
        if(!result.isEmpty()) {
            if (variables.length == 1 && operador.equals("*")) {
                num2 = "1";
            } else if (variables.length == 1) {
                num2 = "0";
            } else if (variables.length > 1) {
                num2 = variables[1];
            }
            if (firstNum == 0f) {
                firstNum = Double.parseDouble(num1);
            }
            secondNum = Double.parseDouble(num2);
            if (isNaN(operacion(operador))) {//Si el resultado es infinito
                screen.setText("∞");
                Toast.makeText(this, "El resultado es Infinito (∞)", Toast.LENGTH_SHORT).show();
            } else {
                screen.setText(String.valueOf(operacion(operador)));
            }
        }else{
            Toast.makeText(this, "Debe ingresar alguna operacion para obtener un resultado",Toast.LENGTH_SHORT).show();
        }
    }

    public Double operacion(String operador){

        String result = screen.getText().toString();
        double answer = 0f;
        double angulo = 0f;
        if(!result.isEmpty()){
            switch(operador){
                case "+":
                    answer = firstNum + secondNum;
                    break;
                case "-":
                    answer = firstNum - secondNum;
                    break;
                case "*":
                    answer = firstNum * secondNum;
                    break;
                case "/":
                    answer = firstNum / secondNum;
                    break;
                case "^":
                    answer = Math.pow(firstNum, secondNum);
                    break;
                case "√":
                    answer = Math.sqrt(firstNum);
                    break;
                case "sin":
                    angulo  = Math.toRadians(firstNum);
                    answer = Math.sin(angulo);
                    break;
                case "cos":
                    angulo = Math.toRadians(firstNum);
                    answer = Math.cos(angulo);
                    break;
                case "tan":
                    angulo = Math.toRadians(firstNum);
                    answer = Math.tan(angulo);
                    break;
                case "sin-1":
                    angulo = Math.toRadians(firstNum);
                    answer = Math.asin(angulo);
                    break;
                case "cos-1":
                    angulo = Math.toRadians(firstNum);
                    answer = Math.acos(angulo);
                    break;
                case "tan-1":
                    angulo = Math.toRadians(firstNum);
                    answer = Math.atan(angulo);
                    break;
                case "e":
                    answer = Math.exp(firstNum);
                    break;
                case "log":
                    answer = Math.log(firstNum);
                    break;
            }
        }

        return answer;
    }











}
