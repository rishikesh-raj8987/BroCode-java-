public class substring {
    public static void main(String [] args){

        // .substring() = A method used to extract a portion of string
//        .substring(start, end)

        String email = "rishikeshthakur8987@gmail.com";
        String username = email.substring(0,6);
        String domain = email.substring(7);


        System.out.println(domain);
    }
}
