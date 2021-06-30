package s2n.mentalMaths.mathQuiz;

public class MyBean1 {

    static long cnt = 0;
    long value;
    private String name = "Default";

    public MyBean1(){
        cnt++;
    }

    public MyBean1(String name){
        this.name = name;
        cnt++;
    }

    public String getName() {
        return name;
    }

    public static long getCnt() {
        return cnt;
    }


    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
