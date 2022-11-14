package com.codegym.Refactoring.tachbien;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        if(number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";

        if(number % 3 == 0)
            return "Fizz";

        if(number % 5 == 0)
            return "Buzz";

        return number + "";
    }
}

//public class FizzBuzz {
//    public static String fizzBuzz(int number){
//        boolean isFizz = number % 3 == 0;
//        boolean isBuzz = number % 5 == 0;
//
//        if(isFizz && isBuzz)
//            return "FizzBuzz";
//
//        if(isFizz)
//            return "Fizz";
//
//        if(isBuzz)
//            return "Buzz";
//
//        return number + "";
//    }
//
//}



