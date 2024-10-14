import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukkan bilangan bulat : ");
        int x = inputUser.nextInt();

        boolean prima = true;

        if(x < 2){
            prima = false;
        }else{
//          ngecek apakah x habis dibagi dengan bilangan
//            selain dirinya sendiri atau 1
            for(int i = 2 ; i < x ; i++){
                if(x % i == 0){
                    prima = false;
                    break;
                }
            }
        }
        if(prima){
            System.out.println("bilangan prima");
        }else{
            System.out.println("bukan bilangan prima");
        }




    }
}