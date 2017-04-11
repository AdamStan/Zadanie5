package zadanie5;
/*Tu bedzie się działo, dużo różnych meteod do obsługi jebanych wektorów*/
 import java.util.Scanner;
 import java.util.ArrayList;

public class Wektor {
    public static ArrayList<Integer> read(Scanner scan){
        ArrayList<Integer> wektor_int= new ArrayList<>();
        String input = scan.nextLine();
        String[] numbersStr = input.split(" ");

        for(int i = 0; i < numbersStr.length; i++ ){
            wektor_int.add(Integer.parseInt(numbersStr[i]));
        }
        return wektor_int;
    }
    public static ArrayList<Integer> addition(ArrayList<Integer> first, ArrayList<Integer> second){
        ArrayList<Integer> result_add = new ArrayList<Integer>();
        
        for(int i=0; i<first.size();i++){
            result_add.add(first.get(i) + second.get(i));
        }

        return result_add;
    }
}