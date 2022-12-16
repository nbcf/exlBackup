/**
 *
 * @author NILDO BUENO CORREIA FILHO  -
 * AXL - DESENVOLVIMENTO DE SISTEMAS
 * MSN: nil_bueno@hotmail.com
 * CACHOEIRO DE ITAPEMIRIN , 25 DE JUNHO DE 2011, 12:55:11
 */

package br.com.exl.backup.view;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class ConfiEstilo extends javax.swing.JFrame {

 String seta_look;


 
    public ConfiEstilo() {
        initComponents();
        setSize(425, 268);// []
        setResizable(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
    //    System.setProperty( "Quaqua.tabLayoutPolicy","wrap" );
        ler_ConfEstilo();
        seta_look = jTextField2.getText();
  
lookandfeel();

if(seta_look.equals("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"))
   {jc_select.setSelectedItem("NEW WINDOWS");}

else if (seta_look.equals("com.birosoft.liquid.LiquidLookAndFeel"))
   {jc_select.setSelectedItem("JAVA LIQUID");}

else if (seta_look.equals("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel"))
   {jc_select.setSelectedItem("WINDOWS MS");}

else if(seta_look.equals("ch.randelshofer.quaqua.QuaquaLookAndFeel"))
   {jc_select.setSelectedItem("PIRATE MAC");}

    else if(seta_look.equals ("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel"))
    {jc_select.setSelectedItem("ALUMINIUM");}
    
     else if(seta_look.equals("com.jtattoo.plaf.aero.AeroLookAndFeel"))
        {jc_select.setSelectedItem("AERO");}
      
        else if(seta_look.equals("com.jtattoo.plaf.acryl.AcrylLookAndFeel"))
        {jc_select.setSelectedItem("ACRYL");} 
 
       else  if(seta_look.equals("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel"))
       {jc_select.setSelectedItem("BERNSTEIN");}
       
       else  if(seta_look.equals("com.jtattoo.plaf.fast.FastLookAndFeel"))
       {jc_select.setSelectedItem("FAST LOOK");}
       
         else  if(seta_look.equals("HIFI"))
       {jc_select.setSelectedItem("com.jtattoo.plaf.hifi.HiFiLookAndFeel");}
       
        else  if(seta_look.equals("com.jtattoo.plaf.noire.NoireLookAndFeel"))
       {jc_select.setSelectedItem("NOIRE");}
         
        else  if(seta_look.equals("com.jtattoo.plaf.graphite.GraphiteLookAndFeel"))
       {jc_select.setSelectedItem("GRAFITE");}

       else  if(seta_look.equals("com.jtattoo.plaf.mcwin.McWinLookAndFeel"))
       {jc_select.setSelectedItem("McWin");}

      else  if(seta_look.equals("com.jtattoo.plaf.luna.LunaLookAndFeel"))
       {jc_select.setSelectedItem("LA LUNA");}
 
      else  if(seta_look.equals("com.jtattoo.plaf.smart.SmartLookAndFeel"))
       {jc_select.setSelectedItem("SMART");}
      
      else  if(seta_look.equals("com.jtattoo.plaf.mint.MintLookAndFeel"))
       {jc_select.setSelectedItem("MINT");}

    }
        
       
        
        
       
      
     
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jc_select = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("ESTILO SELECIONADO"));

        jc_select.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jc_select.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACRYL", "AERO", "ALUMINIUM", "BERNSTEIN", "FAST LOOK", "GRAFITE", "HIFI", "JAVA LIQUID", "LA LUNA", "MINT", "MacWin", "NEW WINDOWS", "NOIRE", "SMART" }));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/exl/backup/x22/agt_add-to-desktop.png"))); // NOI18N
        jButton2.setText("Selecionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jc_select, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 3));
        jTextField1.setEnabled(false);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 3));
        jTextField2.setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 36)); // NOI18N
        jLabel2.setText("ESTILOS VISUAIS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/exl/backup/x22/agt_stop.png"))); // NOI18N
        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/exl/backup/x22/button_ok.png"))); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(341, 341, 341))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-425)/2, (screenSize.height-268)/2, 425, 268);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
SelecionaEstilo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if (jTextField1.getText().isEmpty())
     {JOptionPane.showMessageDialog(null, "CLIQUEM EM "+"SELECIONAR"+" PARA ESCOLHER UM ESTILO VISUAL","ALERTA DO SISTEMA",JOptionPane.WARNING_MESSAGE);}

     else if(jTextField1.getText().equals(seta_look)){int opcao;Object[] botoes = {" Sim "," Não "};
    opcao = JOptionPane.showOptionDialog(null, "CONFIRMA A ESCOLHA DESTE ESTILO VISUAL?"+"\n"+"O PROGRAMA SERÁ FECHADO PARA QUE AS NOVAS DEFINIÇOES SEJAM APLICADAS", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                   if (opcao ==  JOptionPane.YES_OPTION) {
                       SelecionaEstilo();
                       File dirAnalise = new File ("C:\\Windows\\SE0200ES.nbx");
                       FileOutputStream fluxInDirAnalise = null;
                       ObjectOutputStream fluxOutDirAnalise = null;
                       Object c1 = (Object)jTextField1.getText();
                          try
                            {
                              fluxInDirAnalise = new FileOutputStream(dirAnalise);
                              fluxOutDirAnalise = new ObjectOutputStream(fluxInDirAnalise);
                              fluxOutDirAnalise.writeObject(c1);
                              fluxOutDirAnalise.close();
                            }catch(Exception e){}
                            System.exit(0);
                   }
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiEstilo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox jc_select;
    // End of variables declaration//GEN-END:variables

    public void lookandfeel()
           {
                try
                    {
                    UIManager.setLookAndFeel(seta_look);
                    SwingUtilities.updateComponentTreeUI(this);
                    }
                    catch (Exception erro)
                    {
                    JOptionPane.showMessageDialog(null,erro);
                    }
            }
    public void ler_ConfEstilo(){

        File confEst = new File ("C:\\Windows\\SE0200ES.nbx");
        FileInputStream fluxoArquivo = null;
        ObjectInputStream entradaObjeto = null;
        DataInputStream ob_Pri = null;
        try
           {
            fluxoArquivo = new FileInputStream(confEst);
            entradaObjeto = new ObjectInputStream(fluxoArquivo);
            ob_Pri = new DataInputStream( fluxoArquivo);
            String textChar = (String) entradaObjeto.readObject();
            jTextField2.setText(textChar);
            entradaObjeto.close();
            ob_Pri.close();
            }catch(Exception e){}
      }
    public void SelecionaEstilo(){
        if(jc_select.getSelectedItem().equals("ALUMINIUM"))
        {seta_look = "com.jtattoo.plaf.aluminium.AluminiumLookAndFeel";lookandfeel();jTextField1.setText(seta_look);}
        else if (jc_select.getSelectedItem().equals("AERO"))
        {seta_look = "com.jtattoo.plaf.aero.AeroLookAndFeel";lookandfeel();jTextField1.setText(seta_look);}
        else if(jc_select.getSelectedItem().equals("ACRYL"))
        {seta_look = "com.jtattoo.plaf.acryl.AcrylLookAndFeel";lookandfeel();jTextField1.setText(seta_look);} 
        if(jc_select.getSelectedItem().equals("NEW WINDOWS"))
        {seta_look = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";lookandfeel();jTextField1.setText(seta_look);}
        else if (jc_select.getSelectedItem().equals("JAVA LIQUID"))
        {seta_look = "com.birosoft.liquid.LiquidLookAndFeel";lookandfeel();jTextField1.setText(seta_look);}
        else if(jc_select.getSelectedItem().equals("WINDOWS MS"))
        {seta_look = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";lookandfeel();jTextField1.setText(seta_look);}
        else if(jc_select.getSelectedItem().equals("BERNSTEIN"))
        {seta_look ="com.jtattoo.plaf.bernstein.BernsteinLookAndFeel";lookandfeel();jTextField1.setText(seta_look);}
        else if(jc_select.getSelectedItem().equals("FAST LOOK"))
        {seta_look = "com.jtattoo.plaf.fast.FastLookAndFeel";lookandfeel();jTextField1.setText(seta_look);}
        else if(jc_select.getSelectedItem().equals("GRAFITE"))
        {seta_look = "com.jtattoo.plaf.graphite.GraphiteLookAndFeel";lookandfeel();jTextField1.setText(seta_look);}
        else if(jc_select.getSelectedItem().equals("HIFI"))
        {seta_look = "com.jtattoo.plaf.hifi.HiFiLookAndFeel";lookandfeel();jTextField1.setText(seta_look);}
        else if(jc_select.getSelectedItem().equals("MacWin"))
        {seta_look = "com.jtattoo.plaf.mcwin.McWinLookAndFeel";lookandfeel();jTextField1.setText(seta_look);}
        else if(jc_select.getSelectedItem().equals("LA LUNA"))
        {seta_look = "com.jtattoo.plaf.luna.LunaLookAndFeel";lookandfeel();jTextField1.setText(seta_look);}
        else if(jc_select.getSelectedItem().equals("NOIRE"))
        {seta_look = "com.jtattoo.plaf.noire.NoireLookAndFeel";lookandfeel();jTextField1.setText(seta_look);}
        else if(jc_select.getSelectedItem().equals("SMART"))
        {seta_look = "com.jtattoo.plaf.smart.SmartLookAndFeel";lookandfeel();jTextField1.setText(seta_look);}
        else if(jc_select.getSelectedItem().equals("MINT"))
        {seta_look = "com.jtattoo.plaf.mint.MintLookAndFeel";lookandfeel();jTextField1.setText(seta_look);}
}
}