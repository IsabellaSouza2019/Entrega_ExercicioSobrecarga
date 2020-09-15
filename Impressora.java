public class Impressora{

    public void exibir (float a ){
        System.out.println("Os valor digitado é do tipo float");
        System.out.println(a);

    }

    public void exibir(float a, float b) {
        System.out.println("Os valores digitados são do tipo float");
        System.out.println(a);
        System.out.println(b);
        
    }

    public void exibir(float a, String b){
        System.out.println("Os valores digitados são do tipo float e String: ");
		System.out.println(a);
        System.out.println(b);
        
    }

    public void exibir(String a, float b){
        System.out.println("Os valores digitados são do tipo String e float: ");
        System.out.println(a);
        System.out.println(b);        
    }

    public void exibir(String a, String b, String c){
        System.out.println("Os valores digitados são do tipo String: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }

    public void exibir (int a, int b, String c){
        System.out.println("Os valores digitados são do tipo int e String: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}