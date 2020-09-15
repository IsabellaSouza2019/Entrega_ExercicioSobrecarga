import java.util.Scanner;

public class TesteImpressora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Impressora imp = new Impressora();

        System.out.println("Tipos de valores:\n 1 - Float\n 2 - Dois floats\n 3 - Float e String\n 4 - String e Float\n 5 - Três Strings\n 6 - Dois ints e uma String");
        int opcao = ler.nextInt(); 
        
        switch (opcao){
            case 1 : 
                System.out.println("Digite um número: ");
                int n = ler.nextInt();
                imp.exibir(n);
                break;
            
            case 2:
                System.out.println("Digite o primeiro operando: ");
                int op1 = ler.nextInt();
            
                System.out.println("Digite o segundo operando: ");
                int op2 = ler.nextInt();
        
                imp.exibir(op1, op2);
                break;
            
            case 3:
                System.out.println("Digite o primeiro operando: ");
                int n1 = ler.nextInt();
            
                System.out.println("Digite o segundo operando: ");
                String s1 = ler.next();
        
                imp.exibir(n1, s1);
                break;
            
            case 4:
                System.out.println("Digite o primeiro operando: ");
                String s2 = ler.next();
            
                System.out.println("Digite o segundo operando: ");
                int n2 = ler.nextInt();
        
                imp.exibir(s2, n2);
                break;

            case 5:
                System.out.println("Digite o primeiro operando: ");
                String st1 = ler.next();

                System.out.println("Digite o segundo operando: ");
                String st2 = ler.next();

                System.out.println("Digite o terceiro operando: ");
                String st3 = ler.next();

                imp.exibir(st1, st2, st3);
                break;

            case 6:
                System.out.println("Digite o primeiro operando: ");
                int i1 = ler.nextInt();

                System.out.println("Digite o segundo operando: ");
                int i2 = ler.nextInt();

                System.out.println("Digite o terceiro operando: ");
                String str = ler.next();

                imp.exibir(i1, i2, str);
                break; 
            
            default:// Quando não entrar em nenhum dos casos acima, exibe a opção inválida
                System.out.println("Opção inválida.");
                ler.close();
                return;
        }
        ler.close();

    }
}
