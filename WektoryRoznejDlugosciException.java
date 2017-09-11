package Zadanie5;
public class WektoryRoznejDlugosciException extends Exception{
    private int firstVectorSize;
    private int secondVectorSize;
    public WektoryRoznejDlugosciException(String message, int f, int s){
	super(message);
	firstVectorSize = f;
	secondVectorSize = s;
    }
    public int getFirst(){
	return firstVectorSize;
    }
    public int getSecond(){
	return secondVectorSize;
    }
}
