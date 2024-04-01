import java.util.Scanner;

public class CDA_Alternate {

    public static int FactorialCalculator(){
        int startingPlace, count, result = 0;
        Scanner in = new Scanner(System.in);
        startingPlace = in.nextInt();
        count = startingPlace;
        for(int i = count; i != 1; i--){
            result = startingPlace * (count - 1);
            startingPlace = result;
            count--;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.print(FactorialCalculator());
    }
}
