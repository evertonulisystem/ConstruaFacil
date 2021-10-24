package unitTests;

import devcalc.Calc;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import static org.testng.Assert.assertEquals;


public class TestCalc {
    @Test(priority = 4)
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

    @Test(priority = 2)

    public void testarSubtrairDoisNumeros(){
        int num1 = 80;
        int num2 = 20;
        int resultadoEsperado =60;
        int resultadoAtual=Calc.subtrairDoisNumeros(num1, num2);
        assertEquals(resultadoEsperado,resultadoAtual);
    }

    @Test (priority = 1)
    public void testarMultiplicarDoisNumeros(){
        int num1=50;
        int num2 =5;
        int resultadoEsperado=250;
        int resultadoAtual=Calc.multiplicarDoisNumeros(num1, num2);
        assertEquals(resultadoEsperado,resultadoAtual);
    }

    @Test(priority = 3)
    public void testarDividirDoisNumeros(){
        int num1 = 50;
        int num2= 500;
        int resultadoEsperado=1;
        int resultadoAtual = Calc.dividirDoisNumeros(num1,num2);
        assertEquals(resultadoEsperado,resultadoAtual);
    }

}
