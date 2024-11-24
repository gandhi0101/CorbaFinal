package sUserManagement.sop_corba;


/**
* sUserManagement/sop_corba/GestionPersonalIntOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gusuarios.idl
* domingo 6 de marzo de 2022 13H51' COT
*/

public interface GestionPersonalIntOperations 
{
  void registrarPersonal (sUserManagement.sop_corba.personalDTO objPersonal, org.omg.CORBA.BooleanHolder res);
  boolean consultarPersonal (int id, sUserManagement.sop_corba.personalDTOHolder objPersonal);
  void registrarUsuario (sUserManagement.sop_corba.usuarioDTO objUsuario, org.omg.CORBA.BooleanHolder res);
  boolean consultarUsuario (int id, sUserManagement.sop_corba.usuarioDTOHolder objUsuario);
  boolean abrirSesion (sUserManagement.sop_corba.credencialDTO objCredencial);
  void registrarCallback (sUserManagement.sop_corba.AdmCllbckInt objCllbck);
  void registrarCallbackFap (sUserManagement.sop_corba.FapCllbckInt objCllbck);
} // interface GestionPersonalIntOperations