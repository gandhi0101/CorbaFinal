package sUserTraking.sop_corba;


/**
* sUserTraking/sop_corba/ProgramaDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpacientes.idl
*     13H51' COT
*/

public final class ProgramaDTO implements org.omg.CORBA.portable.IDLEntity
{
  public int dia = (int)0;
  public sUserTraking.sop_corba.EjercicioDTO listaEjercicios[] = null;

  public ProgramaDTO ()
  {
  } // ctor

  public ProgramaDTO (int _dia, sUserTraking.sop_corba.EjercicioDTO[] _listaEjercicios)
  {
    dia = _dia;
    listaEjercicios = _listaEjercicios;
  } // ctor

} // class ProgramaDTO
