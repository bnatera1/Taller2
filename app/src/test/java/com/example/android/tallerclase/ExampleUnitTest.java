package com.example.android.tallerclase;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    // Hombre zapatilla
    @Test
    public void HZN(){
        double ve = 120000;
        double vr = Metodos.breiner(0,0,0,1);

        assertEquals(ve,vr,0);

    }
    @Test
    public void HZA(){
        double ve = 140000;
        double vr = Metodos.breiner(0,0,1,1);

        assertEquals(ve,vr,0);

    }
    @Test
    public void HZP(){
        double ve = 130000;
        double vr = Metodos.breiner(0,0,2,1);

        assertEquals(ve,vr,0);

    }


    // Hombre Clasico
    @Test
    public void HCN(){
        double ve = 50000;
        double vr = Metodos.breiner(0,1,0,1);

        assertEquals(ve,vr,0);

    }
    @Test
    public void HCA(){
        double ve = 80000;
        double vr = Metodos.breiner(0,1,1,1);

        assertEquals(ve,vr,0);

    }
    @Test
    public void HCP(){
        double ve = 100000;
        double vr = Metodos.breiner(0,1,2,1);

        assertEquals(ve,vr,0);

    }

    // Mujer zapatilla
    @Test
    public void MZN(){
        double ve = 100000;
        double vr = Metodos.breiner(1,0,0,1);

        assertEquals(ve,vr,0);

    }
    @Test
    public void MZA(){
        double ve = 130000;
        double vr = Metodos.breiner(1,0,1,1);

        assertEquals(ve,vr,0);

    }
    @Test
    public void MZP(){
        double ve = 110000;
        double vr = Metodos.breiner(1,0,2,1);

        assertEquals(ve,vr,0);

    }


    //Clasico
    @Test
    public void MCN(){
        double ve = 60000;
        double vr = Metodos.breiner(1,1,0,1);

        assertEquals(ve,vr,0);

    }
    @Test
    public void MCA(){
        double ve = 70000;
        double vr = Metodos.breiner(1,1,1,1);

        assertEquals(ve,vr,0);

    }
    @Test
    public void MCP(){
        double ve = 120000;
        double vr = Metodos.breiner(1,1,2,1);

        assertEquals(ve,vr,0);

    }
}