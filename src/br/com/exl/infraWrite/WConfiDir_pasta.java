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

public class WConfiDir_pasta {
    
    
    public static void PastaBackup(String pastaBackup){
    
   
            File dirAnalise = new File("C:\\Windows\\DAB.nbx");
            FileOutputStream fluxInDirAnalise = null;
            ObjectOutputStream fluxOutDirAnalise = null;
            Object c1 = (Object)pastaBackup;
            try {
                fluxInDirAnalise = new FileOutputStream(dirAnalise);
                fluxOutDirAnalise = new ObjectOutputStream(fluxInDirAnalise);
                fluxOutDirAnalise.writeObject(c1);
                fluxOutDirAnalise.close();
//                Jtable3();
            }catch(Exception e){
         
            }
    
    }
    
}
