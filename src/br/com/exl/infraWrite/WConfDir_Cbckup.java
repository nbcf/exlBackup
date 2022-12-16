/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exl.infraWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
* @author NILDO BUENO CORREIA FILHO 
 * NB- DESENVOLVIMENTO DE SISTEMAS
 * EMAIL: nildojava@gmail.com    
 *        nildin82@hotmail.com
 * CEL: 8115-7490
 */
public class WConfDir_Cbckup {
    
    public static void SalvarBackupEm(String SalvarEm){
    
     File dirAnalise = new File("C:\\DABDIR.nbx");
            FileOutputStream fluxInDirAnalise = null;
            ObjectOutputStream fluxOutDirAnalise = null;
            Object c1 = (Object)SalvarEm;
            try {
                fluxInDirAnalise = new FileOutputStream(dirAnalise);
                fluxOutDirAnalise = new ObjectOutputStream(fluxInDirAnalise);
                fluxOutDirAnalise.writeObject(c1);
                fluxOutDirAnalise.close();
            }catch(Exception e){}
    
    }
    
}
