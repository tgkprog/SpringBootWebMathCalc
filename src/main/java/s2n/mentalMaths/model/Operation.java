package s2n.mentalMaths.model;

public enum Operation {
    ADD, SUBTRCT, Multiply, Division;



    Operation(){

    }

    public int getValue(){
        return this.getValue();
    }

    public static Operation getInstance(int i){
        if(i == 0)return ADD;
        return SUBTRCT;
    }


}
