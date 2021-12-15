package com.codechef;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	  You are given an interface AdvancedArithmetic which contains a method signature int
      divi_sum(int n). You need to write a class called MyCalculator which implements the
      interface.
      diviSum function just takes an integer as input and return the sum of all its divisors. For
      example: divisors of 6 are 1, 2, 3 and 6, so divi_sum should return 12. The value of n will
      be at most 1000.

	 */
Mycalculator m1 = new Mycalculator();
int total = m1.divi_sum(8);
        System.out.println(total);
    }
}
class Mycalculator implements AdvancedArithmetic{
    @Override
    public int divi_sum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}
interface AdvancedArithmetic{
    int divi_sum(int n);
}
