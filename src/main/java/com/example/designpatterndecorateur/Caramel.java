package com.example.designpatterndecorateur;

public class Chocolat extends Decorateur{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au chocolat";
    }

    @Override
    public double cout() {
        return 1.3+ boisson.cout();
    }
}
