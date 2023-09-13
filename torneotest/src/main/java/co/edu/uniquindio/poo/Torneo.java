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
    assert numpart >= 0;
    assert limEdad >= 0;
    assert valor >= 0;
    assert fechaIniIns.isAfter(fechaInicio);
    assert fechaCierIns.isAfter(fechaIniIns);
  }



}

