public class HelloWorld { 

    public static void main (String[] args){
        System.out.println("HelloWorld");

        boolean flag = true ;
        int number = 5;
        System.out.println(number++);
        
        System.out.println(1+1); // * / - %


        if (number < 10 || number > 0){
            System.out.println("yeya");
        }

       /*  for(int i = 0; i < 10; i++){

       } */
       
        int counter = 0;
        while(flag){
            counter++;
            if(counter == 10){
                System.out.println("vsjo");
                flag = false;
            }
        }

       int[] numberArray = new int [] {1,2,3,4,5};

       for(int element : numberArray){
           System.out.println(element);

       }
    
        for(int i = 0; i < numberArray.length; i++){
            System.out.println(numberArray[i]);
        }

        String myName = "Oliver";

        System.out.println(myName);

        printSomething(10);
    
        String name = name();
        System.out.println(name);

    }

    static String name(){
        return "Oliver";
    }

    static  void printSomething(int number){
        for(int i = 1; i < 10; i++){
            number += i;
        }
        System.out.println(number);

    }

}
