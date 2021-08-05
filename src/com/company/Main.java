package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here

       Set<Integer> values = new HashSet<>();

       values.add(10);
       values.add(45);
       values.add(125);

       for ( int i :values){
           System.out.println(i);
       }
    }
}
