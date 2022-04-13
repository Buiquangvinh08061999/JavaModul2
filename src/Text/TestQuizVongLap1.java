package Text;

public class TestQuizVongLap1 {
    public static void main(String[] args) {
//        Test1:
//        for(int i=0;i<4;i++){
//            while(3 < 5){
//                System.out.println("Hello");
//                break;
//            }
//        } => 4 lần Hello;


//        Test2:
//        int i = 1;
//        while(i < 5){
//            if(i % 3 != 0){
//                i++;
//                continue;
//            }
//            System.out.println("Hello");
//            i++;
//        }=> 1 lần Hello;


//        while(3 < 5){
//            System.out.println("Hello");
//            break;
//        }=>1 lần Hello

        for(int i=1;i <= 5;i++){
            System.out.println("Hello");
        }/*5 lần Hello*/

        for(int i=1; i<=5; i++){
            if(i==1) break;
            System.out.println("Hello");
        } /*0 lần nào đc thực hiện.*/

        int x = 5;
        do{

            System.out.println("CodeGym");
            x--;
        } while(x == 5);/* thực hiện 1 lần*/
    }
}