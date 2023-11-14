package basics;

public class basic_01 {
    public static void main(String[] args) {
        System.out.println("hello world?cc");

        String s1 = "Name";
        String s2 = "Name";

        //The above two variables have same address! - how crazy is that???
        System.out.println(s1 == s2);


        //basically what is happening -
        //There is a string constant pool present inside heap --
        //when you create a new string(object) it gets stored inside this
        //when you create another string same as above, what will happen is that it will check first inside the constant pool
        //If the constant pool is having the exact String, it will simply store the address of that String in the new variable!!
        //So now they both are pointing at the same location!!! (insane)

        //Mutable and Immutable Strings -
        //Strings are immutable by default --
        //MUTABLE STRINGS?????? - you can stringbuffer or stringbuilder!!!!

        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity());
        //always gives you extra space for 16 characters
        sb.append(" Singh");
        System.out.println(sb);
//        String str = sb;  //no possible without using toString();
        sb.deleteCharAt(1);
        sb.insert(0, "Jave - ");

        //more methods you can explore basically
        //subString, setLength, ensureCapactiy

        //Difference between StringBuilder and StringBuffer ????
        //StringBuilder is not thread safe !! (HOW COOL IS THAT)

    }
}





















