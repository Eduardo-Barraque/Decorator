package Decorator;

public class Frutas extends BoloDecorator {
    public Frutas(Bolo boloDecorado) {
        super(boloDecorado);
    }

    public String getDescricao() {
        return super.getDescricao() + ", com frutas";
    }

    public double getCusto() {
        return super.getCusto() + 3.0;
    }
}
