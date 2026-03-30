public class break_continue {
    public static void main(String[] args){
        //break = break out of loop (STOP)
        //continue = skip current iteration of loop(SKIP)

        for(int i =0;i <10; i++){

            if ( i==5){
//                break;
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
