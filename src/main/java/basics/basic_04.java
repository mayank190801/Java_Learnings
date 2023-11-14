package basics;


//we are mentioning this annotation just so that we know for sure there will be only functino inside this interface
//this way no one can add any other function
@FunctionalInterface
interface A {
   public void show();
}


public class basic_04 {
   //basically lamba expression mostly only work with functional interface
   //interface that have only one functions inside them -
   public static void main(String[] args) {
      //Without this below implementation, you would have to create a class and then implement this function and create this objection
      //or you would have to do some weird smart stuff to create this object without creating this class
      A obj = () -> {
         System.out.println("Hey there everyeone");
         System.out.println("I am a super lambda function");
      };
      obj.show();
   }


}
