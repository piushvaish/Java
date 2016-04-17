package com.company;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        //set of tests
        inputOutput("1.0 / 1 - 2.71828");
        inputOutput("1.0 / ( 1 - 2.71828 )");
        inputOutput("1 + 2 + 3 + 4 / 10.0");
        inputOutput("( 1 + 2 + 3 + 4 ) / 10");
        inputOutput("( 1 / 2 ) + ( 1 / 4 ) + ( 1 / 8 ) + ( 1 / 16 )");
        inputOutput("( ( 8.2 + 1.89 ) * 19.3 ) - ( ( 6.9 + 3.0 ) / 55.5 )");
    }

    /**
     * Input an infix expression and output of postfix expression and evaluation of the the expression
     * Catch any exception if there is no space in string in the expression or if any letter, it prints out Invalid expression
     * @param input is a string
     */

    public static void inputOutput(String input){
        // line input by the user
        Scanner in = new Scanner(input);

        try {
            //prompt
            System.out.println("Infix expression: " + input);
            input = in.nextLine();
            String postfix = infixToPostFix(input);
            System.out.println("Postfix expression: " + postfix);
            System.out.println("Evaluation: " + PostFixCalculator(postfix));
        } catch (Exception e) {
            System.out.println("Invalid expression");
        }
    }

    /**
     * Converting an infix expression to a postfix expression
     * @param infix is a string input
     * @return a string in postfix format.
     */

    public static String infixToPostFix(String infix) {
        // Initialise an empty postfix string
        String postfix = "";
        // Initialise an empty operator stack
        PostFixStack stack = new PostFixStack();
        // scanning tokens from a string.
        StringTokenizer st = new StringTokenizer(infix);
        while (st.hasMoreTokens()) {
            //Fetch the next token as nextToken
            String token = st.nextToken();
            //If nextToken is a right parenthesis
            if (compareToOperator(token,")")) {
                String top;
                while (!(top = stack.pop()).equals("(")) {
                    postfix += " " + top;
                }
            } else if (compareToOperator(token,"(")) //if nextToken is left parenthesis
            {
                stack.push(token);
            } else if (compareToOperator(token,"*") || compareToOperator(token,"+") || compareToOperator(token,"-") || compareToOperator(token,"%") || compareToOperator(token,"/")) {
                int p = precedence(token);
                //if nextToken has lower precedence
                while (!stack.isEmpty() && precedence(stack.peek()) >= p && !stack.peek().equals("(")) {
                    String top = stack.pop();
                    postfix += " " + top;
                }
                stack.push(token);
            } else {
                postfix += " " + token;
            }
        }
        //Pop any remaining operators from the stack and append them to the postfix string
        while (!stack.isEmpty()) {
            String top = stack.pop();
            postfix += " " + top;
        }
        return postfix;

    }

    /**
     * Check the precedence of the operators
     * @param  operator is a string
     * @return an integer
     */

    private static int precedence(String operator) {
        if (compareToOperator(operator,"*")|| compareToOperator(operator,"/")|| compareToOperator(operator,"%")) {
            return 1;
        }else if (compareToOperator(operator,"-") || compareToOperator(operator,"+")) {
            return 0;
        }else {
            return -1;
        }

    }

    /**
     *  Evaluating a postfix expression
     * @param postfix is the string it takes and computes it. If there is a zero as a divisor is zero, returns infinity
     * @return result of the postfix calculation
     */
    public static double PostFixCalculator(String postfix) {
        // Initialise an empty operator stack
            PostFixStack stack = new PostFixStack();
            // scanning tokens from a string.
            StringTokenizer st = new StringTokenizer(postfix);
            double result = 0;
            while (st.hasMoreTokens()) {
                //Fetch the next token as nextToken
                String token = st.nextToken();
                //If the token is an operand
                if (!(compareToOperator(token,"*") || compareToOperator(token,"+")|| compareToOperator(token,"-") || compareToOperator(token,"%") || compareToOperator(token,"/"))) {
                    //push it on the stack
                    stack.push(token);
                } else {
                    //Pop the previous two operands from the stack
                    String rightSide = stack.peek();
                    stack.pop();
                    String leftSide = stack.peek();
                    stack.pop();
                    //Evaluate with the operator
                    if (compareToOperator(token,"+")) {
                        result = Double.parseDouble(leftSide) + Double.parseDouble(rightSide);
                    } else if (compareToOperator(token,"-")) {
                        result = Double.parseDouble(leftSide) - Double.parseDouble(rightSide);
                    } else if (compareToOperator(token,"/")) {
                        result = Double.parseDouble(leftSide) / Double.parseDouble(rightSide);
                    } else if (compareToOperator(token,"%")) {
                        result = Double.parseDouble(leftSide) % Double.parseDouble(rightSide);
                    } else if (compareToOperator(token,"*")) {
                        result = Double.parseDouble(leftSide) * Double.parseDouble(rightSide);
                    } else {
                        result = -1;
                    }
                    //Push the result back to the stack
                    stack.push(Double.toString(result));
                }

            }
        return result;

    }

    /**
     * to check if two strings are comparable
     * @param a is a string
     * @param b is a string
     * @return true if it the two strings are same
     */
    private static boolean compareToOperator(String a, String b){
        if(a.compareTo(b) == 0){
            return true;
        }else {
            return false;
        }
    }

}


