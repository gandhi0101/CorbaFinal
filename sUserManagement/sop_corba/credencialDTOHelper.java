package sUserManagement.sop_corba;


/**
* sUserManagement/sop_corba/credencialDTOHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gusuarios.idl
* domingo 6 de marzo de 2022 13H51' COT
*/

abstract public class credencialDTOHelper
{
  private static String  _id = "IDL:sop_corba/credencialDTO:1.0";

  public static void insert (org.omg.CORBA.Any a, sUserManagement.sop_corba.credencialDTO that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static sUserManagement.sop_corba.credencialDTO extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "usuario",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "clave",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[2] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (sUserManagement.sop_corba.credencialDTOHelper.id (), "credencialDTO", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static sUserManagement.sop_corba.credencialDTO read (org.omg.CORBA.portable.InputStream istream)
  {
    sUserManagement.sop_corba.credencialDTO value = new sUserManagement.sop_corba.credencialDTO ();
    value.usuario = istream.read_string ();
    value.clave = istream.read_string ();
    value.id = istream.read_long ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, sUserManagement.sop_corba.credencialDTO value)
  {
    ostream.write_string (value.usuario);
    ostream.write_string (value.clave);
    ostream.write_long (value.id);
  }

}
