package zadanie5;
/**
 *Napisz program proszacy o podanie 2 wektorow. Koniec wektora oznacza sie za pomoca wcisniecia klawisza 
 * enter. Jezeli podany ciag nie jest liczba, jest ignorowany. Nastepnie nalezy sprobowac dodac wektory, 
 * jezeli sa rownej dlugosci. Jezeli nie, sa, rzucany jest wlasny wyjatek WektoryRoznejDlugosciException, 
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
	public static void zapis_nio(double wynik, String name) throws IOException{ // zrobić tak by nie nadpisywał
		FileChannel fc = new FileOutputStream(name).getChannel();
		String buff;
		buff = String.valueOf(wynik);
		fc.write(ByteBuffer.wrap(buff.getBytes()));
	}
	public static void main(String[] args) throws Exception {
		try{
			int w1,w2;
			System.out.println("Podaj pierwszy wektor ");
			Scanner odczyt1  = new Scanner(System.in);
			w1 = odczyt1.nextInt();
			w2 = odczyt1.nextInt();
			Wektor vectorFirst = new Wektor(w1,w2);
			System.out.println("Podaj drugi wektor ");
			Scanner odczyt2  = new Scanner(System.in);
			w1 = odczyt1.nextInt();
			w2 = odczyt1.nextInt();
			Wektor vectorSecond = new Wektor(w1,w2);
			System.out.println("Długość wektora jest równa "+ vectorFirst.dlugosc());
			System.out.println("Długość wektora jest równa "+ vectorSecond.dlugosc());
			if(vectorFirst.dlugosc() == vectorSecond.dlugosc()){
				double result = vectorFirst.dlugosc()+vectorSecond.dlugosc();
				zapis_nio(result,"wyniki.txt");
			}
			else throw new WektoryRoznejDlugosciException();
		} catch (WektoryRoznejDlugosciException e) {
			//e.printStackTrace();
		} catch (java.util.InputMismatchException e) {
			System.out.println("Wspolrzedne wektora muszą być oddzielone spacjami!");
		}
	}
}