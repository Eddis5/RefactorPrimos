package com.company;

import static org.junit.jupiter.api.Assertions.*;

class PrimosTest {

    int [] testPrimos={2,3,5,7};
    @org.junit.jupiter.api.Test
    void generarPrimos() {
       int [] primos=Primos.generarPrimos(10);
       for (int i=0;i<primos.length;i++){
           assertEquals(testPrimos[i],primos[i]);
       }

    }

    @org.junit.jupiter.api.Test
    void cuentaPrimos() {
        int dim
        int cuenta =cuentaPrimos();
        assertEquals(4,cuenta);
    }

    @org.junit.jupiter.api.Test
    void rellenarVectorPrimos() {
    }

    @org.junit.jupiter.api.Test
    void criba() {
    }

    @org.junit.jupiter.api.Test
    void inicializarArray() {
    }
}