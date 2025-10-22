package com.jaimes.back_obra.operaciones.utilidad;

public enum Transform {
    METROS_TO_MILIMETROS(1000), MILIMETROS_TO_METROS(METROS_TO_MILIMETROS.valor),
    METROS2_TO_MILIMETROS2(1000000), MILIMETROS2_TO_METROS2(METROS2_TO_MILIMETROS2.valor),
    METROS3_TO_MILIMETROS3(1000000000), MILIMETROS3_TO_METROS3(METROS3_TO_MILIMETROS3.valor);

    private int valor;

    Transform(int valor){
        this.valor = valor;
    }

    public double convertir(double numero){
        switch (this){
            case METROS_TO_MILIMETROS -> {
                return numero * METROS_TO_MILIMETROS.valor;
            }
            case MILIMETROS_TO_METROS -> {
                return numero / MILIMETROS_TO_METROS.valor;
            }
            case METROS2_TO_MILIMETROS2 -> {
                return numero * METROS2_TO_MILIMETROS2.valor;
            }
            case MILIMETROS2_TO_METROS2 -> {
                return numero / MILIMETROS2_TO_METROS2.valor;
            }
            case METROS3_TO_MILIMETROS3 -> {
                return numero * METROS3_TO_MILIMETROS3.valor;
            }
            case MILIMETROS3_TO_METROS3 -> {
                return  numero / MILIMETROS3_TO_METROS3.valor;
            }
            default -> throw new RuntimeException("Constante no encontrada");
        }
    }
}
