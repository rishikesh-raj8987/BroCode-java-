public class use_of_nested_if_statement {
    public static void main(String[] args ){

        boolean isStudent = false;
        boolean issenior = false;
        double price = 100;

        if(isStudent) {
            if (issenior) {
                System.out.println("You get a senior  20% Discount: ");
                System.out.println("You get a  student 10% Discount: ");
                price *= 0.7;
            } else {
                System.out.println("You get a  student 10% Discount: ");
                price *= 0.9;
            }
        }
        else {
                System.out.println("the price of a product is : "+price );
            }
        }


}
