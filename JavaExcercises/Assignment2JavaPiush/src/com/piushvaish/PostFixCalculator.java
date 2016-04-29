package com.piushvaish;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by piush on 11/03/2016.
 */
public class PostFixCalculator{
    // Scanner for getting input
    private Scanner in;
    private String strInput;
    // Array List String
    //private ArrayList<String> strInput;

    /**
     * add a string using scanner
     *
     * @param
     */
    public void userInput() {
        // create a new scanner with the specified String
        in = new Scanner(System.in);
        //strInput = new ArrayList<String>();
        //Prompt the user to enter
        System.out.print("Please enter a string (separate each with a blank): ");
        while(in.hasNext()) {
            // Read in values
            strInput = in.next();

            //output
            System.out.println("You entered :" + strInput);
        }

        //double total = 0;

        //stringArray = new ArrayList<String>();
        //
            //read data from input and add to an array List
            //strInput.add(in.next());

        //}


        in.close();
    }

    public static String infixToPostFix(String infix) {
        String postfix = "";
        // is the current operator unary?
        boolean unary = true;

        PostFixStack stack = new PostFixStack();

        StringTokenizer st = new StringTokenizer(infix);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
//                if (token.equals("")) { // skip any empty token
//                } else
            if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                String op;
                while (!(op = stack.pop()).equals("(")) {
                    postfix += " " + op;
                }
            } else if (token.equals("*")
                    || // an operator
                    token.equals("+") || token.equals("-")
                    || token.equals("%") || token.equals("/")) {
                if (unary) {
                    token = "u" + token;
                    // a unary op always goes on
                    // the stack without popping any other op
                    stack.push(token);
                } else {
                    int p = precedence(token);
                    while (!stack.isEmpty() && !stack.peek().equals("(") && precedence(stack.peek()) >= p) {
                        String op = stack.pop();
                        postfix += " " + op;
                    }
                    stack.push(token);
                }
                unary = true; // if an operator is after this one, it
                // has to be unary
            } else { // an operand
                //Integer.parseInt(token); // just to check that
                // it is a number
                // If not a number, an exception is
                // thrown
                postfix += " " + token;
                unary = false; // any operator after an operand is binary
            }
        }
        while (!stack.isEmpty()) {
            String op = stack.pop();
            postfix += " " + op;
        }
        return postfix;

    }
    private static int precedence(String operator) {
        if (operator.equals("*") || operator.equals("/") || operator.equals("%"))
            return 1;
        else if(operator.equals("-") || operator.equals("+"))

            return 0;
        else
            return -1;

    }


}








