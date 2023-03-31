package Decorator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BoloTest {

    @Test
    public void deveRetornarBoloSimples() {
        Bolo bolo = new BoloSimples();
        assertEquals("Bolo simples", bolo.getDescricao());
        assertEquals(10.0, bolo.getCusto(), 0.01);
    }

    @Test
    public void deveRetornarBoloCoberturaDeChocolate() {
        Bolo bolo = new CoberturaDeChocolate(new BoloSimples());
        assertEquals("Bolo simples, com cobertura de chocolate", bolo.getDescricao());
        assertEquals(15.0, bolo.getCusto(), 0.01);
    }

    @Test
    public void deveRetornarBoloFrutas() {
        Bolo bolo = new Frutas(new BoloSimples());
        assertEquals("Bolo simples, com frutas", bolo.getDescricao());
        assertEquals(13.0, bolo.getCusto(), 0.01);
    }

    @Test
    public void deveRetornarBoloCoberturaDeChocolateEFrutas() {
        Bolo bolo = new CoberturaDeChocolate(new Frutas(new BoloSimples()));
        assertEquals("Bolo simples, com frutas, com cobertura de chocolate", bolo.getDescricao());
        assertEquals(18.0, bolo.getCusto(), 0.01);
    }
}
