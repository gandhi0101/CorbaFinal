package sUserManagement.sop_corba;


/**
* sUserManagement/sop_corba/FapCllbckIntPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gusuarios.idl
*     13H51' COT
*/

public class FapCllbckIntPOATie extends FapCllbckIntPOA
{

  // Constructors

  public FapCllbckIntPOATie ( sUserManagement.sop_corba.FapCllbckIntOperations delegate ) {
      this._impl = delegate;
  }
  public FapCllbckIntPOATie ( sUserManagement.sop_corba.FapCllbckIntOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public sUserManagement.sop_corba.FapCllbckIntOperations _delegate() {
      return this._impl;
  }
  public void _delegate (sUserManagement.sop_corba.FapCllbckIntOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public void informarIngreso (String nombreCompleto, int id)
  {
    _impl.informarIngreso(nombreCompleto, id);
  } // informarIngreso

  private sUserManagement.sop_corba.FapCllbckIntOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class FapCllbckIntPOATie
