package sUserTraking.sop_corba;


/**
* sUserTraking/sop_corba/ValoracionDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpacientes.idl
*     13H51' COT
*/

public final class ValoracionDTO implements org.omg.CORBA.portable.IDLEntity
{
  public int idPaciente = (int)0;
  public String fechaValoracion = null;
  public int fecCardiacaReposo = (int)0;
  public int fecCardiacaActiva = (int)0;
  public int estatura = (int)0;
  public int brazo = (int)0;
  public int pierna = (int)0;
  public int pecho = (int)0;
  public int cintura = (int)0;
  public String estado = null;

  public ValoracionDTO ()
  { 
  } // ctor

  public ValoracionDTO (int _idPaciente, String _fechaValoracion, int _fecCardiacaReposo, int _fecCardiacaActiva, int _estatura, int _brazo, int _pierna, int _pecho, int _cintura, String _estado)
  {
    idPaciente = _idPaciente;
    fechaValoracion = _fechaValoracion;
    fecCardiacaReposo = _fecCardiacaReposo;
    fecCardiacaActiva = _fecCardiacaActiva;
    estatura = _estatura;
    brazo = _brazo;
    pierna = _pierna;
    pecho = _pecho;
    cintura = _cintura;
    estado = _estado;
  } // ctor

} // class ValoracionDTO
