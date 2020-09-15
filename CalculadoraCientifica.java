import java.lang.Math;

public class CalculadoraCientifica {
    public double raiz(int a){
        return Math.sqrt(a);
    }

    public double raiz (double a){
        return Math.sqrt(a);
    }

    public double raiz ( String a) {
        double n1 = Double.parseDouble(a);
        return Math.sqrt(n1);
    }

    public double potencia (Byte a , Byte b){
        return Math.pow(a, b);
         
    }

    public double potencia (String s1 , String s2){
        double n1 = Double.parseDouble(s1);
        double n2 = Double.parseDouble(s2);

        return Math.pow(n1, n2);
         
    }

    public double potencia (int a , double b){
        return Math.pow(a, b);
         
    }
}
