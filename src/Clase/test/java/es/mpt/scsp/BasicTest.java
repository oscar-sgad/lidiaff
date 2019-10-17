package test.java.es.mpt.scsp;

import static org.junit.Assert.*;
import main.java.es.mpt.scsp.Historico;

import org.junit.Test;

public class BasicTest {

    @Test
    public void testBien() {
        Historico hist = new Historico(1,1,"prueba", 1, 1,1,"test",2);
		assert (hist.isEstadoString()=="CORRECTO");
    }
 @Test
    public void testMal() {
        Historico hist = new Historico(1,1,"prueba", 1, 1,1,"test",2);
		assert (hist.isEstadoString()=="asadasdasd");
    }
}
