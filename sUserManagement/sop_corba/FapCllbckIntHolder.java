package sUserManagement.sop_corba;

/**
* sUserManagement/sop_corba/FapCllbckIntHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gusuarios.idl
*     13H51' COT
*/

public final class FapCllbckIntHolder implements org.omg.CORBA.portable.Streamable
{
  public sUserManagement.sop_corba.FapCllbckInt value = null;

  public FapCllbckIntHolder ()
  {
  }

  public FapCllbckIntHolder (sUserManagement.sop_corba.FapCllbckInt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sUserManagement.sop_corba.FapCllbckIntHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sUserManagement.sop_corba.FapCllbckIntHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sUserManagement.sop_corba.FapCllbckIntHelper.type ();
  }

}
