/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

/**
 *
 * @author user1
 */
public class Calculator {
    
    private String operator;
    private float op1;
    private float op2;
    private float result;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public float getOp1() {
        return op1;
    }

    public void setOp1(float op1) {
        this.op1 = op1;
    }

    public float getOp2() {
        return op2;
    }

    public void setOp2(float op2) {
        this.op2 = op2;
    }

    public Calculator() {
    }
    
    public float getResult(){
        
        switch(this.operator){
            
            case "+": result = op1+op2;
                      break;
            case "-": result = op1-op2;
                        break;
            case "/": result = op1/op2;
                        break;
            case "*": result = op1*op2;
                        break;
            case "%": result = op1%op2;
                        break;
        }
        return result;
    }
    
}
