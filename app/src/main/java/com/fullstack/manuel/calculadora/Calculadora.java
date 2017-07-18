package com.fullstack.manuel.calculadora;

import android.widget.Toast;

/**
 * Created by Manuel on 12/07/2017.
 */

public class Calculadora {
    public float suma(float a, float b){
        return a+b;
    }
    public float resta(float a, float b){
        return a-b;
    }
    public float division(float a, float b){
        if(a!=0)
            return a/b;
        else
            return -1;
    }
    public float multiplicacion(float a, float b){
        return a*b;
    }
    public float raizCuadrada(float a){
        return (float)Math.sqrt(a);
    }


}
