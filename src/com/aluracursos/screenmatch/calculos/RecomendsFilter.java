package com.aluracursos.screenmatch.calculos;

public class RecomendsFilter {
    void Filter(Clasification clasificacion){
        if (clasificacion.getClasification() >= 4){
            System.out.println("Muy bien evaluado en el momento");
        } else if (clasificacion.getClasification() == 2) {
            System.out.println("Popular en el momento");
        }else {
            System.out.println("Colocalo en lista para verlo");
        }
    }
}
