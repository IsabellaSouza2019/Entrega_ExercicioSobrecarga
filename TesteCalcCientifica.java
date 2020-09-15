public class TesteCalcCientifica {
    public static void main(String[] args) {
        Byte a = 8;
        Byte b = 5;

        CalculadoraCientifica calculadora = new CalculadoraCientifica();

        System.out.println("Calculadora Científica: Radiciação e Potenciação");

        // Raiz de um inteiro
        System.out.println("Raiz de 111: " + calculadora.raiz(111));
      
        // Raiz de um double
        System.out.println("Raiz de 98.5: " + calculadora.raiz(98.5));

        // Raiz de uma String
        System.out.println("Raiz de 64: " + calculadora.raiz("64"));

        // Um byte elevado a um byte
        System.out.println("Potência de 8 elevado a 5: " + calculadora.potencia(a,b));

        // Uma String elevada a uma String
        System.out.println("Potência de 9 elevado a 12: " + calculadora.potencia("9", "12"));

        // Um inteiro elevado a um inteiro
        System.out.println("Potência de 13 elevado a 5: " + calculadora.potencia(13, 5));
    }
}
