package zadanie5;
/*przeciązyc operator== :-)
Wyjdzie super rzecz*/
public class Wektor {
    private int x;
    private int y;
    public Wektor(){
        x = 0;
        y = 0;
    }
    public Wektor(int a, int b){
        x = a;
        y = b;
    }
    public Wektor(Wektor w){
        x = w.x;
        y = w.y;
    }
    public double dlugosc(){
        double d;
        d = Math.sqrt(x*x + y*y);
        return d;
    }
}