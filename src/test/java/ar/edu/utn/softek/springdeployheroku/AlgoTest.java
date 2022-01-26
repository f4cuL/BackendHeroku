package ar.edu.utn.softek.springdeployheroku;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlgoTest {

    @Test
    public  void unTestOK(){
        assertEquals(1,1);
    }
    @Test
    public  void unTestQueFalla(){
        assertEquals(1,2);
    }
}
