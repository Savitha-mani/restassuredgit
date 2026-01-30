package javaprograms;

import java.util.*;
public class Exercise {
    
    public static void main (String[] args) {
        ArrayList<String> a=new ArrayList<String>();
        a.add("apple");
        a.add("banana");
        a.add("cherry");
        a.add("mango");
        a.add("apple");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
       if(a.contains("orange")){
           System.out.println("Orange found");
           
       } 
       else{
           System.out.println("Orange not found");
       }
       System.out.println(a.size());
       for(String a1:a){
           System.out.println(a1);
       }
    }

}
