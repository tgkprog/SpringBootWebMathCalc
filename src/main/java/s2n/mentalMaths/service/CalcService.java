package s2n.mentalMaths.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import s2n.mentalMaths.mathQuiz.MyBean1;
import s2n.mentalMaths.model.Calc;
import s2n.mentalMaths.model.Operation;

import java.util.Random;

@Service
public class CalcService { //"calcService"
    final static Random rnd =  new Random();
    @Autowired
    MyBean1 myBeanGlobal;

    @Autowired
    MyBean1 myBeanNew;



    @Autowired
    @Qualifier ("myBeanNew")
    MyBean1 myBeanNew2;

    //Get a math problem/
    public Calc getAMathQuestion(){

        final double o1 = rnd.nextInt(50) + 10;
        final double o2 = rnd.nextInt(50) + 10;
        final int opi = rnd.nextInt(4);
        Operation op = Operation.getInstance(opi);
        final Calc calc = new Calc(o1, o2, op);
        ///below is academic code for understanding bean scopes/
        traceToCalc("myBeanNew " + myBeanNew.getName(), calc);
        traceToCalc("myBeanNew2 " + myBeanNew2.getName(), calc);
        traceToCalc("myBeanGlobal " + myBeanGlobal.getName(), calc);



        //myBean3
        return calc;
    }


    //
    public static void traceToCalc(Object s, Calc calc) {
        calc.addTrace(s);
        System.out.println(" " + s);
    }

}
