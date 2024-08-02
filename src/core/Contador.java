package core;

import exceptions.InvalidParametersException;

public class Contador {

    public static void contar(int numero1, int numero2) {

        try {
            if (numero1 > numero2) {
                throw new InvalidParametersException("O primeiro nuumero deve ser menor que o segundo.");
            }

            int iteracao = 1;

            for (int i = numero1; i <= numero2; i++) {
                System.out.println("Imprimindo o numero " + i + " na iteracao " + iteracao);
                iteracao++;
            }
        } catch (InvalidParametersException e) {
            System.out.println(e.getMessage());
        }
    }
}
