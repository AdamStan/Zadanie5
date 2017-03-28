package zadanie5;
/**
 * Napisz program proszacy o podanie 2 wektorow. Koniec wektora oznacza sie za pomoca wcisniecia klawisza 
 * enter. Jezeli podany ciag nie jest liczba, jest ignorowany. Nastepnie nalezy sprobowac dodac wektory, 
 * jezeli sa rownej dlugosci. Jezeli nie sa, rzucany jest wlasny wyjatek WektoryRoznejDlugosciException, 
 * za pomoca ktorego mozna podac a nastepnie odczytac dlugosci tych wektorow. Jezeli sa rownej dlugosci, 
 * wynik dodawania zapisywany jest do pliku. Jezeli nie sa rownej dlugosci, uzytkownik jest proszony o 
 * ponowne wprowadzenie tych wektorow.
 */
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.nio.ByteBuffer;
 import java.nio.channels.FileChannel;
 import java.util.Scanner;

public class FifthTask {
	public static void main(String[] args) throws Exception {
// 		try{
			Integer[] w1;
			Integer[] w2;
			Scanner odczyt1,odczyt2;
			
			w1 = new Integer[1];
			
			do{
			  System.out.println("Podaj pierwszy wektor ");
			  odczyt1 = new Scanner(System.in);
			}while(odczyt1.hasNextInt() == false);
			
			Wektor.odczyt(odczyt1);
			
			do{
			  System.out.println("Podaj drugi wektor ");
			  odczyt2  = new Scanner(System.in);
			}while(odczyt2.hasNextInt() == false);
			
			Wektor.odczyt(odczyt2);
			
			if(){
				double result = vectorFirst.dlugosc()+vectorSecond.dlugosc();
				zapis_nio(result,"wynik_dodawania.txt");
				System.out.println("Wektory są tej samej długości");
			}
			else throw new WektoryRoznejDlugosciException();
		} catch (WektoryRoznejDlugosciException e) {
			//e.printStackTrace();
		}*/
	}
	public static void zapis_nio(double wynik, String name) throws IOException{ // zrobić tak by nie nadpisywał
		FileChannel fc = new FileOutputStream(name).getChannel();
		String buff;
		buff = String.valueOf(wynik);
		fc.write(ByteBuffer.wrap(buff.getBytes()));
	}
}