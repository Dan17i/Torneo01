/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test ");

        LOG.info("Inicializando el objeto ");
        
        Torneo torneo= new Torneo("Copa mundo",LocalDate.of(2006, 3, 17),LocalDate.of(2006, 1, 27), LocalDate.of(2006, 2, 15), (byte)17, (byte)18,(float)30000);

        LOG.info("comprobando elementos ");
        

        assertEquals("Copa mundo", torneo.nomtorneo());
        assertEquals(LocalDate.of(2006, 3, 17),torneo.fechaInicio());
        assertEquals(LocalDate.of(2006, 1, 27), torneo.fechaIniIns());
        assertEquals( LocalDate.of(2006, 2, 15), torneo.fechaCierIns());
        assertEquals((byte)17, torneo.numpart());
        assertEquals((byte)18, torneo.limEdad());

        LOG.info("Finalizando test exitoso");
    }
}
