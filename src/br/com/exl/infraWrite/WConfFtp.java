
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
public class WConfFtp {
    
    public static void SalvaConfFtp (String url, String usrFtp, String senhaFtp, String portaFtp){
    
        int opcao;
                   Object[] botoes = {" SIM "," NÃO "};
                   opcao = JOptionPane.showOptionDialog(null, "APÓS CONFIRMAR ESTAS CONFIGURAÇÕES O PROGRAMA SERÁ FECHADO, PARA APLICAR AS MESMAS", "AVISO DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,null,botoes,botoes[0]);
                   if (opcao ==  JOptionPane.YES_OPTION) {
    
  File urlFtp       =   new File ("C:\\Arquivos de Programas\\Net Backup\\ENG\\04\\conur.nbx");
  File user         =   new File ("C:\\Arquivos de Programas\\Net Backup\\ENG\\04\\conusr.nbx");
  File senha        =   new File ("C:\\Arquivos de Programas\\Net Backup\\ENG\\04\\conass.nbx");
  File porta        =   new File ("C:\\Arquivos de Programas\\Net Backup\\ENG\\04\\condor.nbx");

  FileOutputStream fluxInURL      =       null;
  FileOutputStream fluxInUSR      =       null;
  FileOutputStream fluxInPAS      =       null;
  FileOutputStream fluxInDOR      =       null;

  ObjectOutputStream fluxOutURL   =       null;
  ObjectOutputStream fluxOutUSR   =       null;
  ObjectOutputStream fluxOutPAS   =       null;
  ObjectOutputStream fluxOutDOR   =       null;


                 Object c1 = (Object)url;
                 Object c2 = (Object)usrFtp;
                 Object c3 = (Object)senhaFtp;
                 Object c4 = (Object)portaFtp;
                 
                          try
                                {

                              fluxInURL = new FileOutputStream(urlFtp);
                              fluxInUSR = new FileOutputStream(user);
                              fluxInPAS = new FileOutputStream(senha);
                              fluxInDOR = new FileOutputStream(porta);

                              fluxOutURL = new ObjectOutputStream(fluxInURL);
                              fluxOutUSR = new ObjectOutputStream(fluxInUSR);
                              fluxOutPAS = new ObjectOutputStream(fluxInPAS);
                              fluxOutDOR = new ObjectOutputStream(fluxInDOR);

                              fluxOutURL.writeObject(c1);
                              fluxOutUSR.writeObject(c2);
                              fluxOutPAS.writeObject(c3);
                              fluxOutDOR.writeObject(c4);

                              fluxOutURL.close();
                              fluxOutUSR.close();
                              fluxOutPAS.close();
                              fluxOutDOR.close();


                                }catch(Exception e){ }
                   System.exit(0);

                 JOptionPane.showMessageDialog(null, "CONFIGURAÇÕES FORAM SALVAS COM SUCESSO!", "AVISO DO SISTEMA",JOptionPane.INFORMATION_MESSAGE);           //   dispose();
                  System.exit(0);
                   }else if(opcao == JOptionPane.NO_OPTION){
           
                   }
    
    }
    
}
