package s2n.mentalMaths.v1.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class WebInit {

    @Autowired
    private RequestMappingHandlerMapping requestMappingHandlerMapping;

    @PostConstruct
    private void runAfterSpringInit() {
        System.out.println("Starting run runAfterSpringInit web ");
        try {
            System.out.println("Starting run after " + new Date() + ", mappings " +  requestMappingHandlerMapping.getHandlerMethods().keySet());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
