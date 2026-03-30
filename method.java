import java.util.SortedMap;

public class method {
    public static void main(String[]args){

        //method = a block of reusable code that is executed when called()
        String name ="Rishi";
        int age = 21;

        happyBirthday(name,age);    // when we add the variable name it is called argument

    }
//            static void happyBirthday(String name){      //it is not declare directly in this line we should add the data type and the name in ();
//                System.out.println("Happy Birthday to You!");
//                System.out.printf("Happy birthday dear %s\n", name);
//                System.out.println("You are 21 years old!\n");
                static void happyBirthday(String name,int age){      //it is not declare directly in this line we should add the data type and the name in ();
                    System.out.println("Happy Birthday to You!");
                    System.out.printf("Happy birthday dear %s\n", name);
                    System.out.println("You are "+age + " years old!\n");
            }

}
