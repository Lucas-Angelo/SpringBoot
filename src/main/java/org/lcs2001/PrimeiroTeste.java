package org.lcs2001;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test
    public void estruturaDeUmTeste() {
        // cenário
        int numero1=10, numero2=5;

        // execução
        int resultado = numero1 + numero2;

        // verificações
        Assert.assertEquals(15, resultado);


    }
}
