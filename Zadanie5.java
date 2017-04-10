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
    public static void main(String[] args) throws Exception{
        while(true){
            try{
                ArrayList<Integer> w1;
                ArrayList<Integer> w2;
                Scanner odczyt1,odczyt2;

                while(true){
                    try{
                        System.out.println("Podaj pierwszy wektor ");
                        odczyt1 = new Scanner(System.in);
                        w1 = Wektor.read(odczyt1);
                        break;
                    } catch(java.lang.NumberFormatException wyj_1){
                        //wyj_1.printStackTrace();
                    }
                } //to trzeba poprawić...

                while(true){
                    try{
                        System.out.println("Podaj drugi wektor ");
                        odczyt2  = new Scanner(System.in);
                        w2 = Wektor.read(odczyt2);
                        break;
                    } catch(java.lang.NumberFormatException wyj_2){
                        //wyj_2.printStackTrace();
                    }
                } // to trzeba poprawić...

                if(w1.size() == w2.size()){
                    w1 = Wektor.addition(w1,w2); //troche przesadzam z oszczednoscia, mozna wynik zapisywac na nowej arraylist
                    Wektor.save_nio(w1,"wynik_dodawania.txt");
                    System.out.println("Wektory są tej samej długości");
                    System.out.println(w1);
                    break;
                }
                else throw new WektoryRoznejDlugosciException();
            } catch (WektoryRoznejDlugosciException e) { 
                e.printStackTrace(System.out);
                System.out.println("Wektory są różnej długości");
                /*System.out.println("Długość wektora pierwszego: " + w1.size());
                System.out.println("Długość wektora drugiego: " + w2.size());*/
            }
        }
    }
}