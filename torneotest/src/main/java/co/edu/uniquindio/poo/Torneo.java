package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public record Torneo(String nomtorneo, LocalDate fechaInicio, LocalDate fechaIniIns, LocalDate fechaCierIns,byte numpart, byte limEdad, float valor  ) {
   
  public Torneo{
    assert nomtorneo != null;
    assert fechaInicio != null;
    assert fechaIniIns != null;
    assert fechaCierIns != null;
   
  }



}

