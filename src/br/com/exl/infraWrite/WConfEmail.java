
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
public class WConfEmail {

    public static void SalvaConfEmailByNILDO(String servidorSMTP, String portaSMTP,
            String emailOrigem, String emailDestino, String nomeRemetente, 
            String nomeDestinatario, String loginEmail, String senhaEmail, String assuntoEmail,  String corpoMenssagem ){
        
    int opcao;
                   Object[] botoes = {" SIM "," NÃO "};
                
                   opcao = JOptionPane.showOptionDialog(null, "O Programa será fechado, para aplicar novas configurações", "AVISO DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                   if (opcao ==  JOptionPane.YES_OPTION) {
      
        File servSmtp = new File  ("C:\\Windows\\LerservSmtp.nbx");
        File portaSmtp = new File ("C:\\Windows\\LerportaSmtp.nbx");
        File deEmail = new File   ("C:\\Windows\\LerdeEmail.nbx");
        File paraEmail = new File ("C:\\Windows\\LerparaEmail.nbx");
        File nomeDe = new File    ("C:\\Windows\\LernomeDe.nbx");
        File nomePara = new File  ("C:\\Windows\\LernomePara.nbx");
        File login = new File     ("C:\\Windows\\Lerlogin.nbx");
        File senha = new File     ("C:\\Windows\\Lersenha.nbx");
        File assunto = new File   ("C:\\Windows\\Lerassunto.nbx");
        File Menssagem = new File ("C:\\Windows\\LerMenssagem.nbx");

//
//        File LerservSmtp  = new File  ("C:\\Arquivos de programas\\Net Backup\\ENG\\03\\LerservSmtp.nbx");
//        File LerportaSmtp = new File  ("C:\\Arquivos de programas\\Net Backup\\ENG\\03\\LerportaSmtp.nbx");
//        File LerdeEmail   = new File  ("C:\\Arquivos de programas\\Net Backup\\ENG\\03\\LerdeEmail.nbx");
//        File LerparaEmail = new File  ("C:\\Arquivos de programas\\Net Backup\\ENG\\03\\LerparaEmail.nbx");
//        File LernomeDe    = new File  ("C:\\Arquivos de programas\\Net Backup\\ENG\\03\\LernomeDe.nbx");
//        File LernomePara  = new File  ("C:\\Arquivos de programas\\Net Backup\\ENG\\03\\LernomePara.nbx");
//        File Lerlogin     = new File  ("C:\\Arquivos de programas\\Net Backup\\ENG\\03\\Lerlogin.nbx");
//        File Lersenha     = new File  ("C:\\Arquivos de programas\\Net Backup\\ENG\\03\\Lersenha.nbx");
//        File Lerassunto   = new File  ("C:\\Arquivos de programas\\Net Backup\\ENG\\03\\Lerassunto.nbx");
//        File LerMenssagem = new File  ("C:\\Arquivos de programas\\Net Backup\\ENG\\03\\LerMenssagem.nbx");

                
                          FileOutputStream fluxInservSmtp = null;
                          FileOutputStream fluxInportaSmtp = null;
                          FileOutputStream fluxIndeEmail = null;
                          FileOutputStream fluxInparaEmail = null;
                          FileOutputStream fluxInnomeDe = null;
                          FileOutputStream fluxInnomePara = null;
                          FileOutputStream fluxInlogin = null;
                          FileOutputStream fluxInsenha = null;
                          FileOutputStream fluxInassunto = null;
                          FileOutputStream fluxInMenssagem = null;

                          ObjectOutputStream fluxOutservSmtp = null;
                          ObjectOutputStream fluxOutportaSmtp = null;
                          ObjectOutputStream fluxOutdeEmail = null;
                          ObjectOutputStream fluxOutparaEmail = null;
                          ObjectOutputStream fluxOutnomeDe = null;
                          ObjectOutputStream fluxOutnomePara = null;
                          ObjectOutputStream fluxOutlogin = null;
                          ObjectOutputStream fluxOutsenha = null;
                          ObjectOutputStream fluxOutassunto = null;
                          ObjectOutputStream fluxOutMenssagem = null;

                          Object c1 = (Object)servidorSMTP;
                          Object c2 = (Object)portaSMTP;
                          Object c3 = (Object)emailOrigem;
                          Object c4 = (Object)emailDestino;
                          Object c5 = (Object)nomeRemetente;
                          Object c6 = (Object)nomeDestinatario;
                          Object c7 = (Object)loginEmail;
                          Object c8 = (Object)senhaEmail;
                          Object c9 = (Object)assuntoEmail;
                          Object c10 = (Object)corpoMenssagem;

                          try
                                {
                              
                           fluxInservSmtp = new FileOutputStream(servSmtp);
                           fluxInportaSmtp = new FileOutputStream(portaSmtp);
                           fluxIndeEmail = new FileOutputStream(deEmail);
                           fluxInparaEmail = new FileOutputStream(paraEmail);
                           fluxInnomeDe = new FileOutputStream(nomeDe);
                           fluxInnomePara = new FileOutputStream(nomePara);
                           fluxInlogin = new FileOutputStream(login);
                           fluxInsenha = new FileOutputStream(senha);
                           fluxInassunto = new FileOutputStream(assunto);
                           fluxInMenssagem = new FileOutputStream(Menssagem);

                           fluxOutservSmtp = new ObjectOutputStream( fluxInservSmtp );
                           fluxOutportaSmtp = new ObjectOutputStream( fluxInportaSmtp );
                           fluxOutdeEmail = new ObjectOutputStream( fluxIndeEmail );
                           fluxOutparaEmail = new ObjectOutputStream( fluxInparaEmail );
                           fluxOutnomeDe = new ObjectOutputStream( fluxInnomeDe );
                           fluxOutnomePara = new ObjectOutputStream(fluxInnomePara  );
                           fluxOutlogin = new ObjectOutputStream(fluxInlogin  );
                           fluxOutsenha = new ObjectOutputStream(fluxInsenha  );
                           fluxOutassunto = new ObjectOutputStream(fluxInassunto  );
                           fluxOutMenssagem = new ObjectOutputStream( fluxInMenssagem );

                           fluxOutservSmtp.writeObject(c1 );
                           fluxOutportaSmtp.writeObject(c2 );
                           fluxOutdeEmail.writeObject(c3);
                           fluxOutparaEmail.writeObject(c4);
                           fluxOutnomeDe.writeObject(c5);
                           fluxOutnomePara.writeObject(c6);
                           fluxOutlogin.writeObject(c7 );
                           fluxOutsenha.writeObject(c8);
                           fluxOutassunto.writeObject(c9);
                           fluxOutMenssagem.writeObject(c10 );

                           fluxOutservSmtp.close();
                           fluxOutportaSmtp.close();
                           fluxOutdeEmail.close();
                           fluxOutparaEmail.close();
                           fluxOutnomeDe.close();
                           fluxOutnomePara.close();
                           fluxOutlogin.close();
                           fluxOutsenha.close();
                           fluxOutassunto.close();
                           fluxOutMenssagem.close();

                                }catch(Exception e){  }
                     
        System.exit(0);

            }}


    }
        
