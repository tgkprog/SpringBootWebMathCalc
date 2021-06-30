package s2n.mentalMaths.v1.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s2n.mentalMaths.mathQuiz.MyBean1;
import s2n.mentalMaths.model.Calc;
import s2n.mentalMaths.model.UserScore;
import s2n.mentalMaths.service.CalcService;
import s2n.mentalMaths.service.UserService;

@RestController()
@RequestMapping("/v1/calc")
public class CalcWeb {

    @Autowired
    private CalcService calcService;

    @Autowired
    private UserService userService;

    @Autowired
    @Qualifier("userService")
    private UserService userServiceAnotherRef;

    //@Autowired
    //@Qualifier ("myBeanSes")
    //MyBean1 myBean3;

    @GetMapping("/getaq")
    ///get a question getaq
    public ResponseEntity<Calc> getAQuestion(@RequestParam String userEmail){
        final Calc c = calcService.getAMathQuestion();

        //academic
        System.out.println(userEmail);//only for trace.
        userService.beansInfoTrace(c);
        userServiceAnotherRef.beansInfoTrace(c);
        ///CalcService.traceToCalc("web ses " + myBean3.getName(), c);

        ///to user/
        return ResponseEntity.ok(c);
    }

    @GetMapping("/sample")
    ///get a question
    public ResponseEntity<Calc> sample(){
        Calc calc =  new Calc();
        //fill sample after yoo create gettersetters
        System.out.println("sample ");
        return ResponseEntity.ok(calc);
    }



//    public Calc getAQuestion(){
//        Random rnd = new Random();
//        int op = rnd.nextInt(4);
//        Calc calc = new Calc();
//        calc.setOp1(rnd.nextInt(30));
//        Operation opo = Operation.ADD;
//        if(op == 1 ){
//            opo = Operation.Division;
//        }//etc
//
//        return calc;
//    }

    @PostMapping("/check")
    public ResponseEntity<UserScore> checkQuestion(@RequestBody Calc calc){
        System.out.println(calc);
        return null;//TODO impl
    }


}
