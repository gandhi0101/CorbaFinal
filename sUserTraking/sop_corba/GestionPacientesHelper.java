package sUserTraking.sop_corba;


/**
* sUserTraking/sop_corba/GestionPacientesHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpacientes.idl
   10H24' COT
*/

abstract public class GestionPacientesHelper
{
  private static String  _id = "IDL:sop_corba/GestionPacientes:1.0";

  public static void insert (org.omg.CORBA.Any a, sUserTraking.sop_corba.GestionPacientes that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static sUserTraking.sop_corba.GestionPacientes extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (sUserTraking.sop_corba.GestionPacientesHelper.id (), "GestionPacientes");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static sUserTraking.sop_corba.GestionPacientes read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_GestionPacientesStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, sUserTraking.sop_corba.GestionPacientes value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static sUserTraking.sop_corba.GestionPacientes narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof sUserTraking.sop_corba.GestionPacientes)
      return (sUserTraking.sop_corba.GestionPacientes)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      sUserTraking.sop_corba._GestionPacientesStub stub = new sUserTraking.sop_corba._GestionPacientesStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static sUserTraking.sop_corba.GestionPacientes unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof sUserTraking.sop_corba.GestionPacientes)
      return (sUserTraking.sop_corba.GestionPacientes)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      sUserTraking.sop_corba._GestionPacientesStub stub = new sUserTraking.sop_corba._GestionPacientesStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
