package zadanie5;
/**
 * Napisz program proszacy o podanie 2 wektorow. Koniec wektora oznacza sie za pomoca wcisniecia klawisza 
 * enter. Jezeli podany ciag nie jest liczba, jest ignorowany. Nastepnie nalezy sprobowac dodac wektory, 
 * jezeli sa rownej dlugosci. Jezeli nie sa, rzucany jest wlasny wyjatek WektoryRoznejDlugosciException, 
 * za pomoca ktorego mozna podac a nastepnie odczytac dlugosci tych wektorow. Jezeli sa rownej dlugosci, 
 * wynik dodawania zapisywany jest do pliku. Jezeli nie sa rownej dlugosci, uzytkownik jest proszony o 
 * ponowne wprowadzenie tych wektorow.
 */
 import java.util.Scanner;
 import java.util.ArrayList;

public class Zadanie5 {
    public static ArrayList<Integer> podawanieWektorow(String number){ // Lepiej umieścić w klasie Wektor
        ArrayList<Integer> wektorek;
	while(true){
	    try{
                Scanner odczyt = new Scanner(System.in);;
		System.out.println("Podaj " + number + " wektor ");
		wektorek = Wektor.read(odczyt);
		break;
            } catch(java.lang.NumberFormatException wyj_1){
                System.out.println("Musisz podac poprawny wektor, np.: \"1 2 3 4 5\"");
	    }
	}
        return wektorek;
    }
    public static void main(String[] args) throws Exception{
        while(true){
            try{
                ArrayList<Integer> w1;
                ArrayList<Integer> w2;
                
                w1 = podawanieWektorow("pierwszy");
                w2 = podawanieWektorow("drugi");
                
                if(w1.size() == w2.size()){
                    w1 = Wektor.addition(w1,w2); //troche przesadzam z oszczednoscia, mozna wynik zapisywac na nowej arraylist
                    Input.save_nio(w1,"wynik_dodawania.txt");
                    System.out.println("Wektory są tej samej długości");
                    System.out.println("Suma wektorow:" + w1);
                    break;
                }
                else throw new WektoryRoznejDlugosciException("Wektory sa roznej dlugosci!!! ",w1.size(), w2.size());
            } catch (WektoryRoznejDlugosciException e) { 
                //e.printStackTrace(System.out);
                System.out.println(e.getMessage());
                System.out.println("Długość wektora pierwszego: " + e.getFirst());
                System.out.println("Długość wektora drugiego: " + e.getSecond());
                System.out.println("OD POCZATKU");
            }
            
        }
    }
}