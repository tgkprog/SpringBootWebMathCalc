package s2n.mentalMaths.v1.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s2n.mentalMaths.model.Response;
import s2n.mentalMaths.model.User;
import s2n.mentalMaths.service.UserService;

import java.util.Set;

@RestController ()
@RequestMapping("/v1/nodeInfo")
public class UserWeb {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/postTest", method = RequestMethod.POST, produces="application/json", consumes="application/json")
    public ResponseEntity<String> postTest(@RequestAttribute String user){
        System.out.println("postTest user :" + user + ". ");
        return ResponseEntity.ok("postTest2 " + new java.util.Date());

        /* String name,@RequestAttribute  String email,@RequestAttribute  String pwd){
        System.out.println("Math Quiz web user add name :" + name + " , eml " + email);
        Response rsp = userService.addOrUpdate(name, email, pwd);
        return ResponseEntity.ok(rsp);
        */
    }

    @PostMapping("/postTest2")
    public ResponseEntity<String> postTest2(){

        return ResponseEntity.ok("postTest2 " + new java.util.Date());

        /* String name,@RequestAttribute  String email,@RequestAttribute  String pwd){
        System.out.println("Math Quiz web user add name :" + name + " , eml " + email);
        Response rsp = userService.addOrUpdate(name, email, pwd);
        return ResponseEntity.ok(rsp);
        */
    }

    //PostMapping("/add")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces="application/json", consumes="application/json")

    public ResponseEntity<Response> signUp( User user){/// FYI Dont add @RequestAttribute to the User param.
        System.out.println("Math Quiz web user add user (v2) :" + user + ". ");
        Response rsp = userService.addOrUpdate(user);
            return ResponseEntity.ok(rsp);

        /* String name,@RequestAttribute  String email,@RequestAttribute  String pwd){
        System.out.println("Math Quiz web user add name :" + name + " , eml " + email);
        Response rsp = userService.addOrUpdate(name, email, pwd);
        return ResponseEntity.ok(rsp);
        */
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
