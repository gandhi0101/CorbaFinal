package sUserTraking.sop_corba;

/**
* sUserTraking/sop_corba/GestionPacientesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpacientes.idl
   10H24' COT
*/

public final class GestionPacientesHolder implements org.omg.CORBA.portable.Streamable
{
  public sUserTraking.sop_corba.GestionPacientes value = null;

  public GestionPacientesHolder ()
  {
  }

  public GestionPacientesHolder (sUserTraking.sop_corba.GestionPacientes initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sUserTraking.sop_corba.GestionPacientesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sUserTraking.sop_corba.GestionPacientesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sUserTraking.sop_corba.GestionPacientesHelper.type ();
  }

}
