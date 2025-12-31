import java.util.Scanner;


class Main{
    
    /*
        Você foi jantar com amigos em um restaurante. 
        A conta chegou e vocês precisam dividir o valor entre todos, 
        incluindo a gorjeta. Para não errar nas contas, 
        você decide criar um programa que faça isso automaticamente.
    */
    public static void main(String[] a){
         System.out.println("=== CALCULADORA DE GORJETA ===");

         // 1. Criar Scanner

         Scanner entrada = new Scanner(System.in);

        // 2. Pedir valor da conta
        System.out.println("Qual é valor de conta");
        double valorConta = entrada.nextDouble();
        //System.out.println("Valor de conta: " + valorConta);



        // 3. Pedir número de pessoas
        System.out.println("Digite numero de Pessoas: ");
        int numPessoas = entrada.nextInt();
        //System.out.println("Total de pessoas: " + numPessoas);

        // 4. Pedir % de gorjeta
        System.out.println("Qual seria porcentagem de girjeta? ");
        int gorjeta = entrada.nextInt();
        //System.out.println("Porcentagem de gorjeta: " + gorjeta);

        // 5. Calcular valor da gorjeta -> valorConta * (gorjeta / 100.0)

        double valorGoejeta = valorConta * (gorjeta / 100.0);
        //System.out.println("Valor da gorjeta é: " + valorGoejeta);


        // 6. Calcular total (conta + gorjeta)
        double total = valorConta + valorGoejeta;
        System.out.println("Total: " + total);
        //System.out.println("  ");

        // 7. Calcular quanto cada um paga
        double porPessoa = total / numPessoas;
        //System.out.println("Cada um Paga: " + porPessoa);

        // 8. Mostrar tudo formatado
        System.out.println("--- RESULTADO --- ");
        System.out.printf("Subtotal: € %.2f\n",  valorConta );
        System.out.printf("Gorjeta: € %.2f\n",  valorGoejeta );
        System.out.printf("Total: € %.2f\n", total );
        System.out.printf(" Cada pessoa paga: € %.2f\n", porPessoa );

        



        /*
        --- RESULTADO ---
    Subtotal: R$ 150.00
    Gorjeta (15%): R$ 22.50
    Total: R$ 172.50
    Cada pessoa paga: R$ 34.50
        */

        // 9. Fechar Scanner
        entrada.close();
    }
}