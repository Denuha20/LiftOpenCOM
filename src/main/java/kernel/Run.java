/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kernel;
import OpenCOM.*;
import java.io.*;
import java.util.*;
import UpComponent.*;

import LiftComponent.ILift;
import OpenCOM.*;
import UpComponent.*;
import DownComponent.*;

/**
 *
 * @author denuha
 */
public class Run {
    public static ILift pILi = null;
        public static void main(String[] args) {
            OpenCOM runtime = new OpenCOM();
            IOpenCOM pIOCM = (IOpenCOM) runtime.QueryInterface("OpenCOM.IOpenCOM");
            
            ICFMetaInterface pCF = (ICFMetaInterface) pCFIUnk.QueryInterface("OpenCOM.ICFMetaInterface");

            
            
            // Create the Up component
            IUnknown pUpIUnk = (IUnknown) pIOCM.createInstance ("UpComponent.Up", "Up");
            ILifeCycle pILife =  (ILifeCycle) pUpIUnk.QueryInterface("OpenCOM.ILifeCycle");
            pILife.startup(pIOCM);
            IUnknown pLiftIUnk = pCF.create_component("LiftComponent.Lift", "Lift");

        
            long ConnID1 = pIOCM.connect(pLiftIUnk, pUpIUnk, "UpComponent.IUp");

            
           
            
            
        }
}
