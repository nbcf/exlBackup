/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exl.infraRead;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.JTextField;

/**
 *
 * @author Camila
 */
public class RConfFtp {
    
   private static JTextField ur;
   private static JTextField pt;
  private  static JTextField sh;
   private static JTextField  usr;
    public static String lur = ur.getText();
    
      public void lerRConfFtp(){
   
  File lurlFtp       =   new File ("C:\\Arquivos de Programas\\NETB\\ENG\\04\\conur.nbx");
  File luser         =   new File ("C:\\Arquivos de Programas\\NETB\\ENG\\04\\conusr.nbx");
  File lsenha        =   new File ("C:\\Arquivos de Programas\\NETB\\ENG\\04\\conass.nbx");
  File lporta        =   new File ("C:\\Arquivos de Programas\\NETB\\ENG\\04\\condor.nbx");

  
    
 FileInputStream fluxoArquivo = null;
 ObjectInputStream entradaObjeto = null;
 DataInputStream ob_Pri = null;

 FileInputStream fluxoArquivo1 = null;
 ObjectInputStream entradaObjeto1 = null;
 DataInputStream ob_Pri1 = null;

 FileInputStream fluxoArquivo2 = null;
 ObjectInputStream entradaObjeto2 = null;
 DataInputStream ob_Pri2 = null;

 FileInputStream fluxoArquivo3 = null;
 ObjectInputStream entradaObjeto3 = null;
 DataInputStream ob_Pri3 = null;

    try
    {
  fluxoArquivo = new FileInputStream(lurlFtp);
  entradaObjeto = new ObjectInputStream(fluxoArquivo);
  ob_Pri = new DataInputStream( fluxoArquivo);

  fluxoArquivo1 = new FileInputStream(luser);
  entradaObjeto1 = new ObjectInputStream(fluxoArquivo1);
  ob_Pri1 = new DataInputStream( fluxoArquivo1);

  fluxoArquivo2 = new FileInputStream(lsenha);
  entradaObjeto2 = new ObjectInputStream(fluxoArquivo2);
  ob_Pri2 = new DataInputStream( fluxoArquivo2);

  fluxoArquivo3 = new FileInputStream(lporta);
  entradaObjeto3 = new ObjectInputStream(fluxoArquivo3);
  ob_Pri3 = new DataInputStream( fluxoArquivo3);


    String textDir = (String) entradaObjeto.readObject();
    String textDir1 = (String) entradaObjeto1.readObject();
    String textDir2 = (String) entradaObjeto2.readObject();
    String textDir3 = (String) entradaObjeto3.readObject();


        ur.setText(textDir);
        System.out.println(ur.getText());
//        usr = textDir1;
//        sh = textDir2;
//         pt = textDir3;

    entradaObjeto.close();
    ob_Pri.close();
    entradaObjeto1.close();
    ob_Pri1.close();
    entradaObjeto2.close();
    ob_Pri2.close();
    entradaObjeto3.close();
    ob_Pri3.close();
   
    
     

    }catch(Exception e){
    }
    
      }
      
    
   
     
}
