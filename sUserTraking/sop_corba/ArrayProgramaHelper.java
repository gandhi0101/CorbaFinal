package sUserTraking.sop_corba;


/**
* sUserTraking/sop_corba/ArrayProgramaHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpacientes.idl
* domingo 6 de marzo de 2022 13H51' COT
*/

abstract public class ArrayProgramaHelper
{
  private static String  _id = "IDL:sop_corba/ArrayPrograma:1.0";

  public static void insert (org.omg.CORBA.Any a, sUserTraking.sop_corba.ProgramaDTO[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static sUserTraking.sop_corba.ProgramaDTO[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = sUserTraking.sop_corba.ProgramaDTOHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (sUserTraking.sop_corba.ArrayProgramaHelper.id (), "ArrayPrograma", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static sUserTraking.sop_corba.ProgramaDTO[] read (org.omg.CORBA.portable.InputStream istream)
  {
    sUserTraking.sop_corba.ProgramaDTO value[] = null;
    int _len0 = istream.read_long ();
    value = new sUserTraking.sop_corba.ProgramaDTO[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = sUserTraking.sop_corba.ProgramaDTOHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, sUserTraking.sop_corba.ProgramaDTO[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      sUserTraking.sop_corba.ProgramaDTOHelper.write (ostream, value[_i0]);
  }

}
