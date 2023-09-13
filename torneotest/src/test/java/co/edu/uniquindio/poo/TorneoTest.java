/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TorneoTest {
    private static final Logger LOG = Logger.getLogger(TorneoTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
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
        assertEquals((float)30000,torneo.valor());

        LOG.info("Finalizando test exitoso");
    }
         // datos completos, Copa mundo |2023-10-01|, |2023-8-1|,|2023-9-15|,24,0,0.
    @Test 
    public void datosevaluados(){

         LOG.info("Iniciado test ");

        LOG.info("Inicializando el objeto ");

        Torneo torneo1= new Torneo("Copa mundo",LocalDate.of(2023, 10, 1),LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 15), (byte)24, (byte)0,(float)0);

        assertEquals("Copa mundo", torneo1.nomtorneo());
        assertEquals(LocalDate.of(2023, 10, 1),torneo1.fechaInicio());
        assertEquals(LocalDate.of(2023, 8, 1), torneo1.fechaIniIns());
        assertEquals(  LocalDate.of(2023, 9, 15), torneo1.fechaCierIns());
        assertEquals((byte)24, torneo1.numpart());
        assertEquals((byte)0, torneo1.limEdad());
        assertEquals((float)0, torneo1.valor());

        LOG.info("datos completos");
    }

     // con datos null |null|,|null|,|null|,24,0,0.
    /**
     * 
     */
    @Test 
    public void datosnualos(){

         LOG.info("Iniciado test dato nulos ");
   
         assertThrows(Throwable.class, () -> new Torneo(null, null, null, null ,(byte)24, (byte)0,(byte) 0) );// por que no me corre

        LOG.info("finalizando test de datos nulos");
    }
    // dato paricipantes negativos
      @Test 
      public void datosNegativos(){
         LOG.info("Iniciado test dato participantes negativos ");

        assertThrows(Throwable.class,() -> new Torneo("Copa mundo",LocalDate.of(2023, 10, 1),LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 15), (byte)-24, (byte)0, (float)0) );

         LOG.info("finalizando test datos participantes negativos ");
      }
    // limite edad negativo
     @Test 
      public void datoLimitenegativo(){
         LOG.info("Iniciado test dato participantes negativos ");

        assertThrows(Throwable.class,() -> new Torneo("Copa mundo",LocalDate.of(2023, 10, 1),LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 15), (byte)24, (byte)-1, (float)0) );

         LOG.info("finalizando test datos participantes negativos ");
      }
       // limite inscripcion negativo
     @Test 
      public void inscripcionnegativa(){
         LOG.info("Iniciado test dato inscripcion negativos ");

        assertThrows(Throwable.class,() -> new Torneo("Copa mundo",LocalDate.of(2023, 10, 1),LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 15), (byte)24, (byte)1, (float)-1) );

         LOG.info("finalizando test datos inscripcion negativos ");
      }
      // Fecha de incripciones tardias
     @Test 
      public void inscripcionTardia(){
         LOG.info("Iniciado test inscripcion tardia ");

        assertThrows(Throwable.class,() -> new Torneo("Copa mundo",LocalDate.of(2023, 10, 1),LocalDate.of(2023, 11, 1), LocalDate.of(2023, 11, 15), (byte)24, (byte)1, (float)-1) );

         LOG.info("finalizando test inscripcion tardias ");
      }
       // Fecha de fecha cierre tardias
     @Test 
      public void fechaCierrecTardia(){
         LOG.info("Iniciado test echaCierrecTardia tardia ");

        assertThrows(Throwable.class,() -> new Torneo("Copa mundo",LocalDate.of(2023, 10, 1),LocalDate.of(2023, 11, 15), LocalDate.of(2023, 11, 1), (byte)24, (byte)1, (float)-1) );

         LOG.info("finalizando test echaCierrecTardia tardias ");
      }
}
