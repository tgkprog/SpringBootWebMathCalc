package s2n.mentalMaths.service;

import org.springframework.stereotype.Service;
import s2n.mentalMaths.model.Response;
import s2n.mentalMaths.model.User;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private Map<String, User> users = new HashMap<>();

    public Response addOrUpdate(User user) {
        return addOrUpdate(user.getName(), user.getEmail(), user.getPwd());
    }


    public Response addOrUpdate(String n, String e, String p) {

        Response rsp = new Response();
        if (n == null || n.length() < 3) {
            rsp.setErrCode("1");
            rsp.setMsg("Error name too short, might have other errors too :" + n + ".");
            return rsp;
        }

        User user = new User(n, e, p);
        rsp.setUser(user);
        users.put(e, user);
        return rsp;
    }

    public Response list() {
        Response rsp = new Response();
        Collection e = users.values();
        if (e.size() == 0) {
            e = Arrays.asList(new User("Test 1", "d@f.lp", "p232f"));
        }
        rsp.setObj(e);
        return rsp;
    }
}
