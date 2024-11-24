package sUserTraking.sop_corba;


/**
* sUserTraking/sop_corba/GestionPacientesIntPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpacientes.idl
* domingo 6 de marzo de 2022 13H51' COT
*/

public abstract class GestionPacientesIntPOA extends org.omg.PortableServer.Servant
 implements sUserTraking.sop_corba.GestionPacientesIntOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("registrarValoracion", new java.lang.Integer (0));
    _methods.put ("consultarValoracion", new java.lang.Integer (1));
    _methods.put ("registrarProgramaFisico", new java.lang.Integer (2));
    _methods.put ("consultarProgramaFisico", new java.lang.Integer (3));
    _methods.put ("registrarAsistencia", new java.lang.Integer (4));
    _methods.put ("consultarAsistencia", new java.lang.Integer (5));
    _methods.put ("contarFaltas", new java.lang.Integer (6));
    _methods.put ("enviarNotificacion", new java.lang.Integer (7));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // sop_corba/GestionPacientesInt/registrarValoracion
       {
         sUserTraking.sop_corba.ValoracionDTO objValoracion = sUserTraking.sop_corba.ValoracionDTOHelper.read (in);
         org.omg.CORBA.BooleanHolder res = new org.omg.CORBA.BooleanHolder ();
         this.registrarValoracion (objValoracion, res);
         out = $rh.createReply();
         out.write_boolean (res.value);
         break;
       }

       case 1:  // sop_corba/GestionPacientesInt/consultarValoracion
       {
         int id = in.read_long ();
         sUserTraking.sop_corba.ValoracionDTOHolder objValoracion = new sUserTraking.sop_corba.ValoracionDTOHolder ();
         boolean $result = false;
         $result = this.consultarValoracion (id, objValoracion);
         out = $rh.createReply();
         out.write_boolean ($result);
         sUserTraking.sop_corba.ValoracionDTOHelper.write (out, objValoracion.value);
         break;
       }

       case 2:  // sop_corba/GestionPacientesInt/registrarProgramaFisico
       {
         sUserTraking.sop_corba.ProgramaFisicoDTO objProgramaFisico = sUserTraking.sop_corba.ProgramaFisicoDTOHelper.read (in);
         org.omg.CORBA.BooleanHolder res = new org.omg.CORBA.BooleanHolder ();
         this.registrarProgramaFisico (objProgramaFisico, res);
         out = $rh.createReply();
         out.write_boolean (res.value);
         break;
       }

       case 3:  // sop_corba/GestionPacientesInt/consultarProgramaFisico
       {
         int id = in.read_long ();
         sUserTraking.sop_corba.ProgramaFisicoDTOHolder objProgramaFisico = new sUserTraking.sop_corba.ProgramaFisicoDTOHolder ();
         boolean $result = false;
         $result = this.consultarProgramaFisico (id, objProgramaFisico);
         out = $rh.createReply();
         out.write_boolean ($result);
         sUserTraking.sop_corba.ProgramaFisicoDTOHelper.write (out, objProgramaFisico.value);
         break;
       }

       case 4:  // sop_corba/GestionPacientesInt/registrarAsistencia
       {
         sUserTraking.sop_corba.AsistenciaDTO objAsistencia = sUserTraking.sop_corba.AsistenciaDTOHelper.read (in);
         org.omg.CORBA.BooleanHolder res = new org.omg.CORBA.BooleanHolder ();
         this.registrarAsistencia (objAsistencia, res);
         out = $rh.createReply();
         out.write_boolean (res.value);
         break;
       }

       case 5:  // sop_corba/GestionPacientesInt/consultarAsistencia
       {
         int id = in.read_long ();
         sUserTraking.sop_corba.ArrayAsistenciaHolder lstAsistencia = new sUserTraking.sop_corba.ArrayAsistenciaHolder ();
         boolean $result = false;
         $result = this.consultarAsistencia (id, lstAsistencia);
         out = $rh.createReply();
         out.write_boolean ($result);
         sUserTraking.sop_corba.ArrayAsistenciaHelper.write (out, lstAsistencia.value);
         break;
       }

       case 6:  // sop_corba/GestionPacientesInt/contarFaltas
       {
         int id = in.read_long ();
         org.omg.CORBA.IntHolder numFaltas = new org.omg.CORBA.IntHolder ();
         this.contarFaltas (id, numFaltas);
         out = $rh.createReply();
         out.write_long (numFaltas.value);
         break;
       }

       case 7:  // sop_corba/GestionPacientesInt/enviarNotificacion
       {
         sUserTraking.sop_corba.notificacionDTO objNotificacion = sUserTraking.sop_corba.notificacionDTOHelper.read (in);
         this.enviarNotificacion (objNotificacion);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/GestionPacientesInt:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public GestionPacientesInt _this() 
  {
    return GestionPacientesIntHelper.narrow(
    super._this_object());
  }

  public GestionPacientesInt _this(org.omg.CORBA.ORB orb) 
  {
    return GestionPacientesIntHelper.narrow(
    super._this_object(orb));
  }


} // class GestionPacientesIntPOA
