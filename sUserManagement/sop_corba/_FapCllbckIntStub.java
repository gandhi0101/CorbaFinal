package sUserManagement.sop_corba;


/**
* sUserManagement/sop_corba/_FapCllbckIntStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gusuarios.idl
* domingo 6 de marzo de 2022 13H51' COT
*/

public class _FapCllbckIntStub extends org.omg.CORBA.portable.ObjectImpl implements sUserManagement.sop_corba.FapCllbckInt
{

  public void informarIngreso (String nombreCompleto, int id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("informarIngreso", true);
                $out.write_string (nombreCompleto);
                $out.write_long (id);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                informarIngreso (nombreCompleto, id        );
            } finally {
                _releaseReply ($in);
            }
  } // informarIngreso

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/FapCllbckInt:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _FapCllbckIntStub
