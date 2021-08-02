/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiftComponent;
import OpenCOM.*;
import java.util.*;

//interface
import UpComponent.IUp;
import DownComponent.IDown;

/**
 *
 * @author denuha
 */
public class Lift extends  OpenCOMComponent implements  IUnknown, ILift, IConnections, ILifeCycle, IMetaInterface {
    
    public OCM_SingleReceptacle<IUp> m_PSR_IUp;
    public OCM_SingleReceptacle<IDown> m_PSR_IDown;

    
    public Lift(IUnknown binder){
        super(binder);
        
        m_PSR_IUp = new OCM_SingleReceptacle<IUp>(IUp.class);
        m_PSR_IDown = new OCM_SingleReceptacle<IDown>(IDown.class);

    }
    
    public int add(int a){
        
        return m_PSR_IUp.m_pIntf.add(a);
    }
    public int subtract(int a){
        return m_PSR_IDown.m_pIntf.subtract(a);
    }
    
    
    //IConnections
    public boolean connect(IUnknown pSinkIntf, String riid, long provConnID){
        if(riid.toString().equalsIgnoreCase("UpComponent.IUp")){
		return m_PSR_IUp.connectToRecp(pSinkIntf, riid, provConnID);
	}

	return false;
}
    
    
    public boolean disconnect(String riid, long connID) {
	if(riid.toString().equalsIgnoreCase("UpComponent.IUp")){
		return m_PSR_IUp.disconnectFromRecp(connID);
	}
	return false;

    }
}
