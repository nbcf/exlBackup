
package br.com.exl.infraWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
* @author NILDO BUENO CORREIA FILHO 
 * NB- DESENVOLVIMENTO DE SISTEMAS
 * EMAIL: nildojava@gmail.com    
 *        nildin82@hotmail.com
 * CEL: 8115-7490
 */
public class WConfINI_WFL {
    
    public static void SalvaConfIni_WORFLOW(String variavelWF){
        
  
        
  File dirWF   =   new File ("C:\\Windows\\2.nbx");
  FileOutputStream fluxInURL      =       null;
  ObjectOutputStream fluxOutURL   =       null;
  
                 Object c1 = (Object)variavelWF;
               
                          try
                                {

                              fluxInURL = new FileOutputStream(dirWF);
                             
                              fluxOutURL = new ObjectOutputStream(fluxInURL);
                          
                              fluxOutURL.writeObject(c1);
                         
                              fluxOutURL.close();
                 
                                }catch(Exception e){
                                
                 JOptionPane.showMessageDialog(null, "ESTA INFORMAÇÃO NÃO PODE SER SALVA"+"\n"+"INFORME AO SUPORTE!", "AVISO DO SISTEMA",JOptionPane.ERROR_MESSAGE); 
    
                                }

    
    }
}
