package basics;

class AA extends Thread{
    public void run(){
        for(int i = 0; i < 1000_000_00; i++){
            System.out.println("Hello");
        }
    }
}

class BB extends Thread{
    public void run(){
        for(int i = 0; i < 1000_000_00; i++){
            System.out.println("Hi there brother");
        }
    }
}

public class basic_05 {
    public static void main(String[] args) {
       //studying threads basics - no matter what let's just study about it - no loss no gain
        AA obj1 = new AA();
        BB obj2 = new BB();

        obj1.start();  //this will create thread 1
        obj2.start(); //this will create thread 2

        //this will continue in its current thread and keep on working - simple as that
        for(int i = 0; i < 1000_000_00; i++){
            System.out.println("I am running as well bro!!! How amazing is that!!");
        }
    }
}
