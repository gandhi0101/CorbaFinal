package sUserTraking.sop_corba;

/**
* sUserTraking/sop_corba/ProgramaFisicoDTOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpacientes.idl
* domingo 6 de marzo de 2022 13H51' COT
*/

public final class ProgramaFisicoDTOHolder implements org.omg.CORBA.portable.Streamable
{
  public sUserTraking.sop_corba.ProgramaFisicoDTO value = null;

  public ProgramaFisicoDTOHolder ()
  {
  }

  public ProgramaFisicoDTOHolder (sUserTraking.sop_corba.ProgramaFisicoDTO initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sUserTraking.sop_corba.ProgramaFisicoDTOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sUserTraking.sop_corba.ProgramaFisicoDTOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sUserTraking.sop_corba.ProgramaFisicoDTOHelper.type ();
  }

}