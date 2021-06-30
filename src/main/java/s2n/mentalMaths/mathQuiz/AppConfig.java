package s2n.mentalMaths.mathQuiz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import java.text.SimpleDateFormat;

import java.text.SimpleDateFormat;

@Configuration //means this class defines how spring beans are to be created (their properties & dependancies) and their scope etc
public class AppConfig {
 ///dont do this --> private static SimpleDateFormat sdf = new SimpleDateFormat("YYYY mm");

    @Bean
    @Scope("prototype")//give me a new instance every time
    public java.text.SimpleDateFormat sdf(){
        return new SimpleDateFormat("yyyy mm dd");
    }



    @Bean
    //no scope so default is Singleton.
    public MyBean1 myBeanGlobal(){
        return new MyBean1("global " + MyBean1.getCnt());
    }

    @Bean
    @Scope("prototype")//give me a new instance every time
    public MyBean1 myBeanNew(){
        return new MyBean1("new " + MyBean1.getCnt());
    }

    @Bean
    @Scope("session")//give me a new instance every time
    public MyBean1 myBeanSes(){
        return new MyBean1("new " + MyBean1.getCnt());
    }
}
