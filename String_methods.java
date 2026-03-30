public class String_methods {
    public static void main(String[] args){

        String name = "Rishikesh Raj";
        int lenght = name.length();
        char letter = name.charAt(5);
        char letter1 = name.charAt(0);
        char letter2 = name.charAt(7);
        int index1 = name.indexOf(" ");
        int index = name.indexOf(" k ");


//        name = name.toLowerCase();
//        name= name.toUpperCase();
        name = name.replace("s", "j");


        System.out.println(lenght);
        System.out.println(letter);
        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(index);
        System.out.println(index1);
        System.out.println(name);


    }
}
