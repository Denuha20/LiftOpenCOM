/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DownComponent;

import OpenCOM.*;

/**
 *
 * @author denuha
 */
public class Down extends OpenCOMComponent implements IUnknown, IDown, IMetaInterface, ILifeCycle {
    
    /** Creates a new instance of Subtract */
    public Down(IUnknown pRuntime) {
        super(pRuntime);
    }

    public int subtract(int a) {
        return a-1;
    }
     
    // ILifeCycle Interface
    public boolean startup(Object pIOCM) {
        return true;
    }
    
    public boolean shutdown() {
        return true;
    }
}
