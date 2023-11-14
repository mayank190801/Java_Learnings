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

    }

    //ENUMS - you should know these in JAVA - actually used at many places inside codebases
    //Basically they are named constants
}

//Status is a class and everything inside is an object
enum Status {
    RUNNING, FAILED, PENDING, SUCCESS;
}
