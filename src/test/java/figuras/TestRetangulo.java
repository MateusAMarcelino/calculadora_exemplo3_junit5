package figuras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author 1072321293
 */

public class TestRetangulo {
    
@Test
public void testgetArea(){
double altura = 3;
double base = 2;
//Retorno esperado para a altura e base especificada
double retornoEsperado = 6;
//Instancia um objeto da classe Triangulo
Retangulo retangulo = new Retangulo(base,altura);
//Chama a operacao getArea()
double retornoFeito = retangulo.getArea();
//Premissa verifica se os valores são iguais
assertEquals(retornoEsperado,retornoFeito,0);
}
}
