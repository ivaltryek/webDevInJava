/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tags;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author user1
 */
public class Calculate extends SimpleTagSupport {

    private String op1;
    private String op2;
    private String opr;
    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     * @throws JspException
     */
    @Override
    public void doTag() throws JspException {
        double result=0;
        double opr1=Double.parseDouble(op1);
        double opr2=Double.parseDouble(op2);
        
        try (JspWriter out = getJspContext().getOut();){
            switch(opr)
            {
                case "+":
                    result=opr1+opr2;
                    break;
                case "-":
                    result=opr1-opr2;
                    break;
                case "*":
                    result=opr1*opr2;
                    break;
                case "/":
                    result=opr1/opr2;
                    break;
                case "%":
                    result=opr1%opr2;
                    break;
                default:
                    throw new IllegalStateException("Operation not Supported:"+opr);
            }
            JspFragment f=getJspBody();
            out.println(op1+opr+op2+"="+result);
        } catch (java.io.IOException ex) {
            throw new JspException("Error in Calculate tag", ex);
        }
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public void setOpr(String opr) {
        this.opr = opr;
    }
    
}
