package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**creando un torneo 
 * @author Daniel Jurado UQ
 * 2023-9-13
 * Licencia aNU GNL V3
 */

public class Torneo {
   // atributos tipo clae y registro
  private String nomtorneo;
  private LocalDate fechaInicio; 
  private LocalDate fechaIniIns; 
  private LocalDate fechaCierIns;
  private final byte numpart;
  private final byte limEdad;
  private final float valor ; 
  TipoTorneo tipoTorneo ;
  Equipo equipo;

  // constructor de clase
  public Torneo(String nomtorneo, LocalDate fechaInicio, LocalDate fechaIniIns, LocalDate fechaCierIns, byte numpart,
  byte limEdad, float valor, TipoTorneo tipoTorneo,Equipo equipo) {
    this.nomtorneo = nomtorneo;
    this.fechaInicio = fechaInicio;
    this.fechaIniIns = fechaIniIns;
    this.fechaCierIns = fechaCierIns;
    this.numpart = numpart;
    this.limEdad = limEdad;
    this.valor = valor;
    this.tipoTorneo = tipoTorneo;
    this.equipo = equipo;
    
    // asserts para excepciones 
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
  // metodos de acceso
  public String getNomtorneo() {
    return nomtorneo;
  }
  public void setNomtorneo(String nomtorneo) {
    this.nomtorneo = nomtorneo;
  }
  public LocalDate getFechaInicio() {
    return fechaInicio;
  }
  public void setFechaInicio(LocalDate fechaInicio) {
    this.fechaInicio = fechaInicio;
  }
  public LocalDate getFechaIniIns() {
    return fechaIniIns;
  }
  public void setFechaIniIns(LocalDate fechaIniIns) {
    this.fechaIniIns = fechaIniIns;
  }
  public LocalDate getFechaCierIns() {
    return fechaCierIns;
  }
  public void setFechaCierIns(LocalDate fechaCierIns) {
    this.fechaCierIns = fechaCierIns;
  }
  public byte getNumpart() {
    return numpart;
  }
  public byte getLimEdad() {
    return limEdad;
  }
  public float getValor() {
    return valor;
  }
  public TipoTorneo getTipoTorneo() {
    return tipoTorneo;
  }
  public void setTipoTorneo(TipoTorneo tipoTorneo) {
    this.tipoTorneo = tipoTorneo;
  }
  

   
  



}

