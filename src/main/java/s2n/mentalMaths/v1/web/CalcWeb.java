package s2n.mentalMaths.v1.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s2n.mentalMaths.model.Calc;
import s2n.mentalMaths.model.UserScore;

@RestController()
@RequestMapping("/v1/calc")
public class CalcWeb {

    @GetMapping("/getaq")
    ///get a question
    public ResponseEntity<Calc> getAQuestion(@RequestAttribute String userEmail){
        System.out.println(userEmail);
        return null;//TODO impl
    }

    @GetMapping("/sample")
    ///get a question
    public ResponseEntity<Calc> sample(){
        Calc calc =  new Calc();
        //fill sample after yoo create gettersetters
        System.out.println("sample ");
        return ResponseEntity.ok(calc);
    }

    @PostMapping("/check")
    public ResponseEntity<UserScore> checkQuestion(Calc calc){
        System.out.println(calc);
    return null;//TODO impl
    }


}
