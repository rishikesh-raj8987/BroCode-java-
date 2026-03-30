public class Logical_operator {
    public static void main (String[] args){

        //&& = AND
        // || = OR
        // ! = NOT

        double temp = 29;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is Good 😊");
            System.out.println("It is sunny outside ☀️");
        }
        else if (temp <= 30 && temp >= 0 &&  !isSunny) {
            System.out.println("The weather is Good 😊");
            System.out.println("It is cloudy outside ☁️");
        } else if (temp > 30 || temp <0) {
            System.out.println("The weather is bad 😒");

        }
    }
}
