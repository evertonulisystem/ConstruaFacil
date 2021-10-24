package unitTests;

import devcalc.Calc;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestCalc {
    @Test
    public void testarSomarDoisNumeros() {
       //Prepara
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado =12;

        //Executar
        int resultadoAtual = Calc.somarDoisNumeros(num1, num2);

        //Validar
        assertEquals(resultadoEsperado,resultadoAtual);

    }
}
