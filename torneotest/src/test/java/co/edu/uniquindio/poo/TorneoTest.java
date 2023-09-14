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
        
        Representante representante= new Representante("Jose","Silva", "JoseSl@gamil.com", "12345678");
        Equipo equipo = new Equipo("Real", representante );
        Torneo torneo= new Torneo("Copa mundo",LocalDate.of(2006, 3, 17),LocalDate.of(2006, 1, 27), LocalDate.of(2006, 2, 15), (byte)17, (byte)18,(float)30000,TipoTorneo.LOCAL, equipo);
        LOG.info("comprobando elementos ");
        

        assertEquals("Copa mundo", torneo.getNomtorneo());
        assertEquals(LocalDate.of(2006, 3, 17),torneo.getFechaInicio());
        assertEquals(LocalDate.of(2006, 1, 27), torneo.getFechaIniIns());
        assertEquals( LocalDate.of(2006, 2, 15), torneo.getFechaCierIns());
        assertEquals((byte)17, torneo.getNumpart());
        assertEquals((byte)18, torneo.getLimEdad());
        assertEquals((float)30000,torneo.getValor());
        assertEquals(TipoTorneo.LOCAL, torneo.getTipoTorneo());

        LOG.info("Finalizando test exitoso");
    }
         // datos completos, Copa mundo |2023-10-01|, |2023-8-1|,|2023-9-15|,24,0,0.
    @Test 
    public void datosevaluados(){

         LOG.info("Iniciado test ");

        LOG.info("Inicializando el objeto ");

        Representante representante = new Representante("Jose", "Silva", "JoseSl@gamil.com", "12345678");
        Equipo equipo = new Equipo("real", representante);
        Torneo torneo1= new Torneo("Copa mundo",LocalDate.of(2023, 10, 1),LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 15), (byte)24, (byte)0,(float)0, TipoTorneo.LOCAL,equipo);

        assertEquals("Copa mundo", torneo1.getNomtorneo());
        assertEquals(LocalDate.of(2023, 10, 1),torneo1.getFechaInicio());
        assertEquals(LocalDate.of(2023, 8, 1), torneo1.getFechaIniIns());
        assertEquals( LocalDate.of(2023, 9, 15), torneo1.getFechaCierIns());
        assertEquals((byte)24, torneo1.getNumpart());
        assertEquals((byte)0, torneo1.getLimEdad());
        assertEquals((float)0, torneo1.getValor());
        assertEquals(TipoTorneo.LOCAL, torneo1.getTipoTorneo());

        LOG.info("datos completos");
    }

     // con datos null |null|,|null|,|null|,24,0,0.
    /**
     * 
     */
    @Test 
    public void datosnualos(){

         LOG.info("Iniciado test dato nulos ");
   
         assertThrows(Throwable.class, () -> new Torneo(null, null, null, null ,(byte)24, (byte)0,(byte) 0, null, null) );// por que no me corre

        LOG.info("finalizando test de datos nulos");
    }
    // dato paricipantes negativos
      @Test 
      public void datosNegativos(){
         LOG.info("Iniciado test dato participantes negativos ");

        assertThrows(Throwable.class,() -> new Torneo("Copa mundo",LocalDate.of(2023, 10, 1),LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 15), (byte)-24, (byte)0, (float)0,TipoTorneo.LOCAL, null));

         LOG.info("finalizando test datos participantes negativos ");
      }
    // limite edad negativo
     @Test 
      public void datoLimitenegativo(){
         LOG.info("Iniciado test dato participantes negativos ");

        assertThrows(Throwable.class,() -> new Torneo("Copa mundo",LocalDate.of(2023, 10, 1),LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 15), (byte)24, (byte)-1, (float)0,TipoTorneo.LOCAL, null) );

         LOG.info("finalizando test datos participantes negativos ");
      }
       // limite inscripcion negativo
     @Test 
      public void inscripcionnegativa(){
         LOG.info("Iniciado test dato inscripcion negativos ");

        assertThrows(Throwable.class,() -> new Torneo("Copa mundo",LocalDate.of(2023, 10, 1),LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 15), (byte)24, (byte)1, (float)-1, TipoTorneo.LOCAL, null) );

         LOG.info("finalizando test datos inscripcion negativos ");
      }
      // Fecha de incripciones tardias
     @Test 
      public void inscripcionTardia(){
         LOG.info("Iniciado test inscripcion tardia ");

        assertThrows(Throwable.class,() -> new Torneo("Copa mundo",LocalDate.of(2023, 10, 1),LocalDate.of(2023, 11, 1), LocalDate.of(2023, 11, 15), (byte)24, (byte)1, (float)-1, TipoTorneo.LOCAL, null) );

         LOG.info("finalizando test inscripcion tardias ");
      }
       // Fecha de fecha cierre tardias
     @Test 
      public void fechaCierrecTardia(){
         LOG.info("Iniciado test echaCierrecTardia tardia ");

        assertThrows(Throwable.class,() -> new Torneo("Copa mundo",LocalDate.of(2023, 10, 1),LocalDate.of(2023, 11, 15), LocalDate.of(2023, 11, 1), (byte)24, (byte)1, (float)-1, TipoTorneo.LOCAL, null) );

         LOG.info("finalizando test echaCierrecTardia tardias ");
      }
}
