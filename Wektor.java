package zadanie5;
/*Tu bedzie się działo, dużo różnych meteod do obsługi jebanych wektorów*/
 import java.util.Scanner;
 import java.util.ArrayList;

public class Wektor {
    public static ArrayList<Integer> read(Scanner scan){
        ArrayList<Integer> wektor_int= new ArrayList<>();
        String input = scan.nextLine();
        String[] numbersStr = input.split(" ");

        for(int i = 0; i < numbersStr.length; i++ )
        {
            wektor_int.add(Integer.parseInt(numbersStr[i]));
        }
        return wektor_int;
    }
    public static ArrayList<Integer> addition_first_version(ArrayList<Integer> first, ArrayList<Integer> second){
        ArrayList<Integer> result_add;
        result_add = new ArrayList<>();

        result_add.addAll(first);
        result_add.addAll(second);

        return result_add;
    }
    public static ArrayList<Integer> addition(ArrayList<Integer> first, ArrayList<Integer> second){
        ArrayList<Integer> result_add;
        result_add = new ArrayList<>();
        Integer[] element1 = first.toArray(new Integer[first.size()]);
        Integer[] element2 = second.toArray(new Integer[second.size()]);
        Integer[] result = new Integer[second.size()];
        
        for(int i=0; i<first.size();i++){
            result[i] = element1[i] + element2[i];
            result_add.add(result[i]);
        }

        return result_add;
    }
}