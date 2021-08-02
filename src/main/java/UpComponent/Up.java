/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpComponent;
import OpenCOM.*;

/**
 *
 * @author denuha
 */
public class Up extends OpenCOMComponent implements IUp, IUnknown, IMetaInterface, ILifeCycle{
    
    public Up(IUnknown pRuntime){
        super(pRuntime);
    }
    
    public int add(int a){
        //b = 1;
        return a + 1;
    }
    
    //iLifecycle
    public boolean shutdown(){
        System.out.println("Stopping component");
        return true;
    }
    public boolean startup(){
        System.out.println("Starting component");
        return true;
    }
}
