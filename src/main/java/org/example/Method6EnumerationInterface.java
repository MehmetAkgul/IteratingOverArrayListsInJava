package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Method5Lambda {
   public static void main (String[] args){
       List <Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
       numbers.forEach(System.out::println);
       //numbers.forEach(number->System.out.println(number));
   }
}
