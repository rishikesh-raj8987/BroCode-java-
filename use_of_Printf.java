public class use_of_Printf {
    public static void main(String[]args){

//        printf() = is a method used to format output
//        %[flags][width][precision][specifier-character]
//        like char = %c;
//        int = %d;
//        double = %f;

        String name = "Rishikesh Raj";
        char firstletter = 'R';
        int age = 21;
        double height = 5.11;
        boolean isEmployed= true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("your first name is start with %c \n", firstletter);
        System.out.printf("you are %d years old\n", age );
        System.out.printf("You are %f feets tall\n", height );
        System.out.printf("Employed: %b \n ", isEmployed);
    }
}
