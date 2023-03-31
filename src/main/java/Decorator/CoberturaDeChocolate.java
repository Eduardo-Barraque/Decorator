package Decorator;

public class CoberturaDeChocolate extends BoloDecorator {
    public CoberturaDeChocolate(Bolo boloDecorado) {
        super(boloDecorado);
    }

    public String getDescricao() {
        return super.getDescricao() + ", com cobertura de chocolate";
    }

    public double getCusto() {
        return super.getCusto() + 5.0;
    }
}
