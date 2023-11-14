package basics;

import java.util.Arrays;

public class basic_03 {
    public static void main(String[] args) {
        Status s = Status.FAILED;
        System.out.println(s.ordinal());
        System.out.println(s);

        Status t[] = Status.values();
        System.out.println(Arrays.toString(t));
        for(Status curr : t){
            System.out.println(curr);
        }

        //Enums - 2 - (using with if else and switch)
        Status h = Status.PENDING;
        if(h == Status.PENDING) System.out.println("Hello pending status");
        else if(h == Status.FAILED) System.out.println("failed brother");
        else System.out.println("Works!");


        switch(h){
            case RUNNING:
                System.out.println("running fast");
                break;
            case FAILED:
                System.out.println("Failed brother");
                break;
            default:
                System.out.println("I am the default behaviour");
        }

        //Now Basically - laptop enum what we have done
        //We have created 3 objects - windows, xp and thinkpad and we have also set the value of initial variable for all of them
        //So now there is a constructor also created and we can get the value of price from there

        Laptops m = Laptops.WINDOWS;
        System.out.println(m);
        System.out.println(m.getPrice());

        //Private constructor works in enum
        //you can have default constructor in there as well - basically whatever you can do in class


    }

    //ENUMS - you should know these in JAVA - actually used at many places inside codebases
    //Basically they are named constants
    //You can not extend any other class with ENUMS - (important point)
}

//Status is a class and everything inside is an object
enum Status {
    RUNNING, FAILED, PENDING, SUCCESS;
}

enum Laptops {
    WINDOWS(2000), XP(1400), THINKPAD(1800);
    private int price;
    //private constructor also works for enum!! PRIVATE CONSTRUCTOR
    private Laptops(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}