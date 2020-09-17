package com.Jacob;

public class Calculator {

    /*
    Goal of project: Make a calculator class that will be used in the main script to decipher long strings of equations
    and compute each task individually.
    Goal of main: To be able to decipher a stringed equation according to user's specifications and execute proper
    methods and turn it into an equation or results.
    Next Goal: Create an inversed queue class that will be used to allow the calculator to contain a history of all
    calculations as a string as well as variable
    variable will be made to take either doubles or strings.
     */

    //A private variable that will hold the last given results
    private double lastResult;

    //A private variable to undo a single calculation, should be changed into an inversed queue, will be next project
    private double undoResult;

    //We will later add a more complex constructor once the queue is built (as well as setters and getters)
    public Calculator(){
        //A default constructor
        undoResult = 0;
        lastResult = 0;
    }

    //Standard setters and getters

    public void setLastResult(double lastResult){
        this.lastResult = lastResult;
    }
    public double getLastResult(){
        return lastResult;
    }
    public void setUndoResult(double undoResult){
        this.undoResult = undoResult;
    }
    public double getUndoResult(){
        return undoResult;
    }

    //an undo method, if ever the last action made was a mistake
    public double undo(){
        double tmp = undoResult;
        undoResult = lastResult;
        lastResult = tmp;
        return tmp;
    }

    //A method that will yield the result of two integer types added together
    public int sum(int value1, int value2){
        int result = value1 + value2;
        undoResult = lastResult;
        lastResult = result;
        return result;
    }

    //A method that will yield the result of two double types added together
    public double sum(double value1, double value2){
        double result = value1 + value2;
        undoResult = lastResult;
        lastResult = result;
        return result;
    }

    //A method that will add a value to the last result achieved
    public double add(double value){
        double result = lastResult + value;
        undoResult = lastResult;
        lastResult = result;
        return result;
    }

    //A method that will subtract value2 from value1 and return the int version
    public int subtract(int value1, int value2){
        int result = value1 - value2;
        undoResult = lastResult;
        lastResult = result;
        return result;
    }

    //A method that will subtract value2 from value1 and return the double version
    public double subtract(double value1, double value2){
        double result = value1 - value2;
        changeResults(result);
        return result;
    }

    //A method that will subtract a given value to the last results achieved
    public double sub(double value){
        double result = lastResult - value;
        changeResults(result);
        return result;
    }

    //A method that will return the multiplication of two integer values together
    public int multiply(int value1, int value2){
        int result = value1 * value2;
        changeResults(result);
        return result;
    }

    //A method that will return the multiplication of two double values together
    public double multiply(double value1, double value2){
        double result = value1 * value2;
        changeResults(result);
        return result;
    }

    //A method that will multiply the lastResult by the new value
    public double multi(double value){
        double result = lastResult * value;
        changeResults(result);
        return result;
    }

    //A method that will return the divison of vlaue1 by value2
    public double divid(double value1, double value2){
        double result = value1 / value2;
        changeResults(result);
        return result;
    }

    //A method that wil return the divison of lastResult by value;
    public double div(double value) {
        double result = lastResult / value;
        changeResults(result);
        return result;
    }

    //A basic round method that will round up to the tenth value, and if there's a decimal it will be removed
    public int round(){
        //This will be used to check if it has a decimal and remove it
        double decimalCheck = lastResult % 1;
        int result = (int)lastResult;
        if(decimalCheck < 1 && decimalCheck % 1 > -1 || lastResult % 1 != 0){
            result = Integer.parseInt(Double.toString(lastResult).split("\\.")[0]);
        }

        int tmp = result % 10;
        if(tmp >= 5)
            result = result + (10 - tmp);
        else
            result -= tmp;

        changeResults(result);
        return result;

    }


    
    //I kid you not, I got fed up of rewriting the same thing over and over again, I made a method to do it for me
    private void changeResults(double result){
        undoResult = lastResult;
        lastResult = result;
    }




}
