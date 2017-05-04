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
    public static void podawanieWektorow(ArrayList<Integer> wektorek){ // Lepiej umieścić w klasie Wektor
	Scanner odczyt;
	while(true){
	    try{
		System.out.println("Podaj pierwszy wektor ");
		odczyt = new Scanner(System.in);
		wektorek = Wektor.read(odczyt);
		break;
	    } catch(java.lang.NumberFormatException wyj_1){
		//wyj_1.printStackTrace();
	    }
	}
    }
    final iloscWektorow = 2;
    public static void main(String[] args) throws Exception{
        while(true){
            try{
                ArrayList<Integer> w1;
		
		
                podawanieWektorow(w1);
                podawanieWektorow(w2);
		
		//ew w pętli:
		
		for(int i = 0; i < iloscWektorow; i++){
		    while(true){
			try{
			    System.out.println("Podaj pierwszy wektor ");
			    odczyt = new Scanner(System.in);
			    wektorek = Wektor.read(odczyt);
			    break;
			} catch(java.lang.NumberFormatException wyj_1){
			    //wyj_1.printStackTrace();
			}
		    }
		    
		}
		
                if(w1.size() == w2.size()){
                    w1 = Wektor.addition(w1,w2); //troche przesadzam z oszczednoscia, mozna wynik zapisywac na nowej arraylist
                    Input.save_nio(w1,"wynik_dodawania.txt");
                    System.out.println("Wektory są tej samej długości");
                    System.out.println(w1);
                    break;
                }
                else throw new WektoryRoznejDlugosciException("Wektory są różnej długości", w1.size(), w2.size());
            } catch (WektoryRoznejDlugosciException e) { 
                // e.printStackTrace(System.out);
                System.err.println("WektoryRoznejDlugosciException was caught: " + e.getMessage());
                System.out.println("Długość wektora pierwszego: " + e.getFirst());
                System.out.println("Długość wektora drugiego: " + e.getSecond());
            }
        }
    }
}