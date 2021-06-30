package s2n.mentalMaths.model;

import java.util.Objects;

public class Calc {

    private double op1;
    private Operation operation;
    private double op2;
    private double calcAnswer;///system calculated answer
    private double userAnswer;//user response

    private String trace;

    public Calc(){

    }

    public Calc(double op1, double op2, Operation op){
        this.op1 = op1;
        this.op2 = op2;
        this.operation = op;
    }

    public String getTrace() {
        return trace;
    }

    public void addTrace(Object o) {
        if(trace == null)trace = "";
         trace = trace + " ; " + o;
    }

    //add getter setter to string  etc
    public boolean isCorrect(){
        //TODO impl
        boolean result = calcAnswer == userAnswer;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calc)) return false;
        Calc calc = (Calc) o;
        return Double.compare(calc.op1, op1) == 0 &&
                Double.compare(calc.op2, op2) == 0 &&
                operation == calc.operation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(op1, operation, op2, calcAnswer, userAnswer);
    }

    public double getOp1() {
        return op1;
    }



    public Operation getOperation() {
        return operation;
    }



    public double getOp2() {
        return op2;
    }



    public double getCalcAnswer() {
        return calcAnswer;
    }

    public void putAnswer(double calcAnswer) {
        this.calcAnswer = calcAnswer;
    }

    public double getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(double userAnswer) {
        this.userAnswer = userAnswer;
    }
}
