package sUserManagement.sop_corba;

/**
* sUserManagement/sop_corba/credencialDTOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gusuarios.idl
* domingo 6 de marzo de 2022 13H51' COT
*/

public final class credencialDTOHolder implements org.omg.CORBA.portable.Streamable
{
  public sUserManagement.sop_corba.credencialDTO value = null;

  public credencialDTOHolder ()
  {
  }

  public credencialDTOHolder (sUserManagement.sop_corba.credencialDTO initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sUserManagement.sop_corba.credencialDTOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sUserManagement.sop_corba.credencialDTOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sUserManagement.sop_corba.credencialDTOHelper.type ();
  }

}