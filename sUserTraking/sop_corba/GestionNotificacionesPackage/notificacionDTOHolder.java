package sUserTraking.sop_corba.GestionNotificacionesPackage;

/**
* sUserTraking/sop_corba/GestionNotificacionesPackage/notificacionDTOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpacientes.idl
* s�bado 5 de marzo de 2022 12H04' COT
*/

public final class notificacionDTOHolder implements org.omg.CORBA.portable.Streamable
{
  public sUserTraking.sop_corba.GestionNotificacionesPackage.notificacionDTO value = null;

  public notificacionDTOHolder ()
  {
  }

  public notificacionDTOHolder (sUserTraking.sop_corba.GestionNotificacionesPackage.notificacionDTO initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sUserTraking.sop_corba.GestionNotificacionesPackage.notificacionDTOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sUserTraking.sop_corba.GestionNotificacionesPackage.notificacionDTOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sUserTraking.sop_corba.GestionNotificacionesPackage.notificacionDTOHelper.type ();
  }

}