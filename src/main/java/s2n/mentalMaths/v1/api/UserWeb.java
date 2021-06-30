package s2n.mentalMaths.v1.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s2n.mentalMaths.model.Response;
import s2n.mentalMaths.model.User;
import s2n.mentalMaths.service.UserService;

@RestController ()
@RequestMapping("/v1/users")
public class UserWeb {
    @Autowired
    private UserService userService;


    //PostMapping("/add")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces="application/json", consumes="application/json")

    public ResponseEntity<Response> signUp(@RequestBody User user){/// FYI Dont add @RequestAttribute to the User param.
        System.out.println("Math Quiz web user add user (v2) :" + user + ". ");
        Response rsp = userService.addOrUpdate(user);
            return ResponseEntity.ok(rsp);

        /* String name,@RequestAttribute  String email,@RequestAttribute  String pwd){
        System.out.println("Math Quiz web user add name :" + name + " , eml " + email);
        Response rsp = userService.addOrUpdate(name, email, pwd);
        return ResponseEntity.ok(rsp);
        */
    }



    @GetMapping("/sample")
    public ResponseEntity<User> sample(){
        User user = new User();
        user.setEmail("samle.s.ff");
        user.setName("Tom Young");
        //ignore password
        return ResponseEntity.ok(user);
    }

    @GetMapping("/list")
    public ResponseEntity<Response> list(){
        return ResponseEntity.ok(userService.list());
    }

    @GetMapping("/ping")
    public ResponseEntity<String> ping(){
        return ResponseEntity.ok("ping (v3) response at " + new java.util.Date());
    }
}
