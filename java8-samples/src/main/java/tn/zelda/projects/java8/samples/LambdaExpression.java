package tn.zelda.projects.java8.samples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by zelda on 14/01/17.
 */
public class LambdaExpression {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter","anna","mike","xenia");
        Collections.sort(names,(String a, String b)->{
            return a.compareTo(b);
        });
        names.forEach((a)-> {
            System.out.println("name -> " +a);
        });
    }
}
