package src;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        try {
            Scanner terminal = new Scanner(System.in);

            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException ex) {
            System.out.println("Parâmetro dois deve ser maior que o parâmetro um");
            throw new ParametrosInvalidosException();
        }
    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            System.out.println("Parâmetro um é maior que o parâmetro dois");
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        int contador = 1;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + contador);
            contador++;
        }
    }
}
