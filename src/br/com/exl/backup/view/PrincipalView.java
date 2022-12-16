
 /**
 *
 * @author NILDO BUENO CORREIA FILHO  -
 * AXL- DESENVOLVIMENTO DE SISTEMAS
 * MSN: nil_bueno@hotmail.com
 * Created on 14/07/2011, 11:26:43
 */

package br.com.exl.backup.view;

import br.com.exl.infraWrite.*;
import br.com.exl.util.*;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.mail.EmailException;



public class PrincipalView extends javax.swing.JFrame {
data mostra_data;
data2 mostra_data2;
private SystemTray systemTray;
TrayIcon trayIcon ;
//static final int TAM_BUFFER = 1024;
//static final int COPIA_TAM_BUFFER = 1024;
   String seta_look;
   Vector vetor = new Vector();
   Vector ext3 = new Vector();
    String entrada = null;
    String strVFtp = null ;

    public PrincipalView() {
         initComponents();
    ler_ConfEstilo();
    seta_look = propertiesHalt.getText();
    lookandfeel();
    propertiesHalt.setVisible(false);
         lerConfIni();
        mostra_data = new data();
        mostra_data2 = new data2();
        mostra_data.le_data();
        mostra_data.le_hora();
        mostra_data2.le_hora();
        jLabel3.setText(mostra_data.dia_semana + ", " + mostra_data.dia + " de " + mostra_data.mes + " de " + mostra_data.ano);
        jLabel3.setVisible(true);
        timer1.start();
      
        ler_Dir(); ler_DirCb(); ler_ConfW();confFTP();ler_fTime();;
        jButton1.setEnabled(false);
        ocultarUtil();
//        Jtable3();
        timer3.start();
//        jLabel17.setVisible(false);
//        jLabel16.setVisible(false);
       jLabel4.setVisible(true);
        setSize(780, 408);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("NET BACKUP");
        jLabel17.setText(tf_diretorio_alvo.getText());
        
//        jLabel7.setVisible(false);
//        jLabel5.setVisible(false);
//        jTextField7.setVisible(false);
        systemTray = SystemTray.getSystemTray();
        trayIcon = new TrayIcon(new ImageIcon("C:\\Arquivos de programas\\Net Backup\\advanced.png").getImage(),"CLIQUE NO ICONE PARA RESTAURAR A APLICAÇÃO"+"\n"+"NET BACKUP",null);
        trayIcon.setImageAutoSize(true);
        trayIcon.displayMessage("1", "2", TrayIcon.MessageType.INFO);

        try{ systemTray.add(trayIcon);
        }catch (Exception e) {

        e.printStackTrace();
        }
        trayIcon.addActionListener(new ActionListener(){

        public void actionPerformed(ActionEvent evt){

        mostraJanela();

        }//end actionPerformed

        });//end addActionListener

        }
        private void mostraJanela()
        {  if(this.isVisible()){

        this.setVisible(false);

        }else{

        this.setVisible(true);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        timer3 = new org.netbeans.examples.lib.timerbean.Timer();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tf_destino_backup = new javax.swing.JTextField();
        bt_dir_alvo = new javax.swing.JButton();
        tf_diretorio_alvo = new javax.swing.JTextField();
        bt_dir_destino = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        tf_dir_copia = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bt_novoHorario = new javax.swing.JButton();
        bt_add_time = new javax.swing.JButton();
        bt_delHorario = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jc_h = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jc_m = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jc_s = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_horarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jf_porta_ftp = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        server_ftp = new javax.swing.JTextField();
        user_ftp = new javax.swing.JTextField();
        jtpass_ftp = new javax.swing.JPasswordField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_assunto = new javax.swing.JTextField();
        tf_nome_re = new javax.swing.JTextField();
        pw_senha = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        tf_de = new javax.swing.JTextField();
        tf_nome_dest = new javax.swing.JTextField();
        tf_para = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_server_smtp = new javax.swing.JTextField();
        tf_login = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tf_porta_smtp = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        relogio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        propertiesHalt = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        timer3.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer3OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Diretórios"));

        tf_destino_backup.setEditable(false);

        bt_dir_alvo.setText("DIRETORIO ALVO");
        bt_dir_alvo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dir_alvoActionPerformed(evt);
            }
        });

        tf_diretorio_alvo.setEditable(false);

        bt_dir_destino.setText("DIRETORIO DESTINO");
        bt_dir_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dir_destinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_destino_backup)
                    .addComponent(tf_diretorio_alvo, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_dir_alvo, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(bt_dir_destino, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_diretorio_alvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_dir_alvo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_destino_backup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_dir_destino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jCheckBox1.setText("REALIZAR CÓPIA DE SEGURANÇA");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        tf_dir_copia.setEditable(false);
        tf_dir_copia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dir_copiaActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/exl/backup/x22/pendrive.png"))); // NOI18N
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("ATIVAR RECURSO DE WORKFLOW");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("EMVIAR BACKUP PARA FTP");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox3))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(tf_dir_copia, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_dir_copia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/exl/backup/x22/dukeWaveRed.gif"))); // NOI18N
        jLabel20.setText("VERSÃO DE TESTES");
        jLabel20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel20)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PRINCIPAL", jPanel3);

        bt_novoHorario.setText("Novo Horario");
        bt_novoHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoHorarioActionPerformed(evt);
            }
        });

        bt_add_time.setText("Add Horario");
        bt_add_time.setEnabled(false);
        bt_add_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_add_timeActionPerformed(evt);
            }
        });

        bt_delHorario.setText("Excluir Horario");
        bt_delHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_delHorarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("Hora");

        jc_h.setFont(new java.awt.Font("Tahoma", 1, 36));
        jc_h.setMaximumRowCount(4);
        jc_h.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jc_h.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setText("Minutos");

        jc_m.setFont(new java.awt.Font("Tahoma", 1, 36));
        jc_m.setMaximumRowCount(4);
        jc_m.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jc_m.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setText("Segundos");

        jc_s.setFont(new java.awt.Font("Tahoma", 1, 36));
        jc_s.setMaximumRowCount(4);
        jc_s.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jc_s.setEnabled(false);

        jt_horarios.setFont(new java.awt.Font("Tahoma", 1, 36));
        jt_horarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HORÁRIOS DE BACKUP", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_horarios.setToolTipText("Selecione Multiplas Linhas, Para Multipla Exclusão");
        jt_horarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jt_horarios.setGridColor(new java.awt.Color(255, 255, 255));
        jt_horarios.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jt_horarios.setRowHeight(32);
        jScrollPane3.setViewportView(jt_horarios);
        jt_horarios.getColumnModel().getColumn(0).setResizable(false);
        jt_horarios.getColumnModel().getColumn(0).setPreferredWidth(2300);
        jt_horarios.getColumnModel().getColumn(1).setResizable(false);
        jt_horarios.getColumnModel().getColumn(1).setPreferredWidth(0);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jc_h, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jc_m, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jc_s, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bt_delHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(bt_add_time, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                    .addComponent(bt_novoHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jc_h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jc_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jc_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(bt_novoHorario)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_delHorario)
                            .addComponent(bt_add_time))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("AGENDAR BACKUP", jPanel4);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 10));
        jTextField1.setText("jTextField1");
        jTextField1.setEnabled(false);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 10));
        jTextField4.setEnabled(false);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 10));
        jTextField5.setEnabled(false);

        jLabel5.setText("jLabel5");

        jLabel17.setText("jLabel17");

        jLabel7.setText("jLabel7");

        jLabel16.setText("Arquivos Encontrados em");

        jLabel4.setText("00");

        jTextField7.setText("jTextField7");

        jLabel11.setText("jLabel11");

        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jf_porta_ftp.setEditable(false);

        jLabel21.setText("ENDEREÇO SERVIDOR FTP");

        jLabel22.setText("PORTA FTP");

        server_ftp.setEditable(false);

        user_ftp.setEditable(false);

        jtpass_ftp.setEditable(false);

        jLabel23.setText("USUÁRIO ");

        jLabel24.setText("SENHA");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel21))
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(server_ftp)
                    .addComponent(user_ftp, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addGap(10, 10, 10)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jf_porta_ftp)
                    .addComponent(jtpass_ftp, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(server_ftp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jf_porta_ftp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_ftp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtpass_ftp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Configurações"));

        jLabel2.setText("Email Origem");

        jLabel10.setText("Assunto");

        jLabel1.setText("Servidor SMTP");

        tf_assunto.setEditable(false);
        tf_assunto.setEnabled(false);

        tf_nome_re.setEditable(false);
        tf_nome_re.setEnabled(false);

        pw_senha.setEditable(false);
        pw_senha.setEnabled(false);

        jLabel12.setText("Email Destino");

        tf_de.setEditable(false);
        tf_de.setEnabled(false);

        tf_nome_dest.setEditable(false);
        tf_nome_dest.setEnabled(false);

        tf_para.setEditable(false);
        tf_para.setEnabled(false);

        jLabel13.setText("Origem de");

        jLabel14.setText("Destino");

        tf_server_smtp.setEditable(false);
        tf_server_smtp.setEnabled(false);

        tf_login.setEditable(false);
        tf_login.setEnabled(false);

        jLabel15.setText("Login");

        jLabel18.setText("Senha");

        jLabel19.setText("Porta Smtp");

        tf_porta_smtp.setEditable(false);
        tf_porta_smtp.setEnabled(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel15)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tf_assunto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_server_smtp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(tf_de, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(tf_login)
                            .addComponent(tf_para, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_nome_dest)
                                    .addComponent(tf_nome_re)
                                    .addComponent(pw_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(tf_porta_smtp)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_server_smtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel19)
                    .addComponent(tf_porta_smtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pw_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_de, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(tf_nome_re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_para, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(tf_nome_dest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_assunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Menssagem"));

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        relogio.setFont(new java.awt.Font("Tahoma", 1, 11));
        relogio.setText("17:53:40");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("Quarta-Feira, 20 de Julho de 2011");

        propertiesHalt.setText("jTextField2");

        jMenu1.setText("MENU");

        jMenuItem1.setText("WORKFLOW");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("FTP");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem8.setText("ESTILOS VISUAIS");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);
        jMenu1.add(jSeparator1);

        jMenuItem6.setText("SAIR");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("SOBRE");

        jMenuItem5.setText("SOBRE O SISTEMA");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("BACKUP");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(231, 231, 231)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(propertiesHalt, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(relogio))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(relogio)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(propertiesHalt, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel17)
                            .addComponent(jLabel7)
                            .addComponent(jLabel16))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-780)/2, (screenSize.height-408)/2, 780, 408);
    }// </editor-fold>//GEN-END:initComponents

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
mostra_data.le_hora();
relogio.setText(mostra_data.hora);
mostra_data2.le_hora();
jLabel7.setText(mostra_data2.hora);
            Date dataTempo = new Date();
            String dia = ""+dataTempo.getDate();
            String mes = ""+String.valueOf(dataTempo.getMonth()+1);
            String ano = ""+(1900 + dataTempo.getYear());
            if (Integer.parseInt(mes)<=9)
            mes = "0"+mes;
jLabel5.setText(dia+"_"+mes+"_"+ano+"__"+mostra_data2.hora);

    }//GEN-LAST:event_timer1OnTime

    private void timer3OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer3OnTime
        testatime();
}//GEN-LAST:event_timer3OnTime

    private void bt_add_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_add_timeActionPerformed

                   int opcaoadd;
                            Object[] botoes = {" SIM "," NÃO "};
                            opcaoadd = JOptionPane.showOptionDialog(null, "CONFIRMA ESTE HORÁRIO PARA BACKUP?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                            if (opcaoadd ==  JOptionPane.YES_OPTION)
                            {
                            add_time();
                       
                            }
                            else if(opcaoadd == JOptionPane.NO_OPTION)
                            {
                             bt_delHorario.setEnabled(true);
                             bt_add_time.setEnabled(false);
                             bt_novoHorario.setEnabled(true);
                            }
}//GEN-LAST:event_bt_add_timeActionPerformed

    private void bt_novoHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoHorarioActionPerformed
        jc_h.setEnabled(true);
        jc_m.setEnabled(true);
        jc_s.setEnabled(true);
        bt_add_time.setEnabled(true);
        bt_novoHorario.setEnabled(false);
        jButton1.setEnabled(true);
        bt_delHorario.setEnabled(false);
}//GEN-LAST:event_bt_novoHorarioActionPerformed

    private void bt_dir_destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dir_destinoActionPerformed
        JFileChooser local = new JFileChooser();
        local.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int res = local.showSaveDialog(null);
        if(res == JFileChooser.DIRECTORIES_ONLY){}
        File diretorio_destino = local.getSelectedFile();
        tf_destino_backup.setText(String.valueOf(diretorio_destino));
        String filtro = (String.valueOf(diretorio_destino));
        int tmt = filtro.length();
        String filtrado = filtro.substring((tmt-1), tmt);
        if(filtrado.equals("\\")) {
            tf_destino_backup.setText(filtro);
            if(  tf_destino_backup.getText().equals("null\\")) {
                tf_destino_backup.setText(""); }
            WConfDir_Dest.SalvaDestino(tf_destino_backup.getText());
        } else if(filtrado != "\\") {
            tf_destino_backup.setText(filtro+"\\");
            if(  tf_destino_backup.getText().equals("null\\")) {
                tf_destino_backup.setText(""); }
             WConfDir_Dest.SalvaDestino(tf_destino_backup.getText());
        }
}//GEN-LAST:event_bt_dir_destinoActionPerformed

    private void bt_dir_alvoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dir_alvoActionPerformed
        JFileChooser local = new JFileChooser();
        local.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int res = local.showSaveDialog(null);
        if(res == JFileChooser.FILES_AND_DIRECTORIES) {
        }
        File diretorio = local.getSelectedFile();
        // tf_diretorio_alvo.setText(String.valueOf(diretorio));
        if(String.valueOf(diretorio).equals("null")) {
            tf_diretorio_alvo.setText("");
        }else if(String.valueOf(diretorio).equals("null\\")){

            tf_diretorio_alvo.setText("");
        } 
  
        else if (String.valueOf(diretorio) != "null" || String.valueOf(diretorio) != "null\\" ) {
//         else if (String.valueOf(diretorio).equals("C:\\Users"+"\\"+System.getProperty("user.name")+"\\Documents"+"\\NetBeansProjects") || String.valueOf(diretorio) != " " || String.valueOf(diretorio) != "null\\" ||String.valueOf(diretorio) != "null" || String.valueOf(diretorio) != "null\\" || String.valueOf(diretorio) != "C:\\" || String.valueOf(diretorio) != "D:\\" || String.valueOf(diretorio) != "E:\\" || String.valueOf(diretorio) != "F:\\" || String.valueOf(diretorio) !="G:\\" || String.valueOf(diretorio) != "H:\\" || String.valueOf(diretorio) != "I:\\" || String.valueOf(diretorio) != "J:\\" || String.valueOf(diretorio) != "K:\\" || String.valueOf(diretorio) != "L:\\" || String.valueOf(diretorio) != "M:\\" || String.valueOf(diretorio) !="N:\\" || String.valueOf(diretorio) != "O:\\" || String.valueOf(diretorio) != "P:\\" || String.valueOf(diretorio) != "Q:\\" || String.valueOf(diretorio) != "R:\\" )
//         {
        
            tf_diretorio_alvo.setText(String.valueOf(diretorio));
            WConfiDir_pasta.PastaBackup(tf_diretorio_alvo.getText());
      }
}//GEN-LAST:event_bt_dir_alvoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
System.exit(0);       
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
      if (tf_diretorio_alvo.getText().isEmpty() || tf_destino_backup.getText().isEmpty())
      {
            JOptionPane.showMessageDialog(null, "NÃO HÁ DIRETÓRIOS ESPECIFICADOS", "AVISO DO SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        }
      else{
          mkDir();
          CopiaArq();
          clearUtil();
      }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void bt_delHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_delHorarioActionPerformed

        int opcao;
                   Object[] botoes = {" SIM "," NÃO "};
                   opcao = JOptionPane.showOptionDialog(null, "CONFIRMA EXCLUSÃO DESTE(S) HORÁRIO(S)?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                   if (opcao ==  JOptionPane.YES_OPTION) {

        jt_horarios.getColumnModel().getColumn(0).setPreferredWidth(230);
        jt_horarios.getColumnModel().getColumn(1).setPreferredWidth(0);
        DefaultTableModel modeloRH = (DefaultTableModel)jt_horarios.getModel();

        int rha[] = jt_horarios.getSelectedRows();
        int jColunnTable = 1;

          for(int t =0; t < rha.length;t++)
          {

            int k = rha[t]-t;
              
              Object obl = jt_horarios.getValueAt(k, jColunnTable);
              String dirTime = String.valueOf(obl);
              modeloRH.removeRow(k);
              System.out.println(dirTime);
          try
            {
            File rem = new File (dirTime);
            if(rem.exists())
            {


              rem.delete();
           
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
                 
     }
  }
    }//GEN-LAST:event_bt_delHorarioActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed

        if(jCheckBox2.isSelected()){
            String b1 = "01";
             WConfINI_WFL.SalvaConfIni_WORFLOW(b1);
             lerConfIni();
        }
        
        else if(!jCheckBox2.isSelected()){
           String b2 = "00";
          WConfINI_WFL.SalvaConfIni_WORFLOW(b2);
          lerConfIni();
        
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
new Sobreview().show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
  String[] str = {
      "FECHAR APLICAÇÃO","MINIMIZAR NO SYSTRAY" };
    int result = JOptionPane.showOptionDialog(this, " OQUE DESEJA FAZER?", "PERGUNTA DO SISTEMA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null,str, str[1]);
    if(result == 0)
        {
        this.dispose(); 
    
        System.exit(0); 
        }
    else{this.setVisible(false); 
   }
    }//GEN-LAST:event_formWindowClosing

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        JFileChooser local = new JFileChooser();
        local.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int res = local.showSaveDialog(null);
        if(res == JFileChooser.DIRECTORIES_ONLY) {

        }
        File diretorio = local.getSelectedFile();
        // tf_diretorio_alvo.setText(String.valueOf(diretorio));
        if(String.valueOf(diretorio).equals("null")) {
            tf_dir_copia.setText("");
            ler_DirCb();
        }else if(String.valueOf(diretorio).equals("null\\")){

            tf_dir_copia.setText("");
            ler_DirCb();
        } else if (String.valueOf(diretorio) != "null" || String.valueOf(diretorio) != "null\\" ) {
            tf_dir_copia.setText(String.valueOf(diretorio));
         WConfDir_Cbckup.SalvarBackupEm(tf_dir_copia.getText());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     new ConfEmail().show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
new ConfFtpview().show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void tf_dir_copiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dir_copiaActionPerformed

    }//GEN-LAST:event_tf_dir_copiaActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed

           if (server_ftp.getText().isEmpty() & jf_porta_ftp.getText().equalsIgnoreCase("")) {       
               JOptionPane.showMessageDialog(null, "O SISTEMA NÃO ENCONTROU DEFINIÇÕES DE FTP");      
               jCheckBox3.setSelected(false);      
              } else if (server_ftp.getText() != null) {        
         
              }
             if(jCheckBox3.isSelected()){
            String c1 = "01";
             WConfINI_Ftp.SalvarConfFtp(c1);
             lerConfIni();
        }
        
        else if(!jCheckBox3.isSelected()){
           String c2 = "00";
          WConfINI_Ftp.SalvarConfFtp(c2);
          lerConfIni();
        
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){

        jButton3.setEnabled(true);
        
        }   
        else if(!jCheckBox1.isSelected())
        {

        jButton3.setEnabled(false);
        }
        if(jCheckBox1.isSelected()){
            String a1 = "01";
             WConfINI_CPBCKP.SalvaConfIni_cpb(a1); 
             lerConfIni();
        }
        
        else if(!jCheckBox1.isSelected()){
           String a2 = "00";
          WConfINI_CPBCKP.SalvaConfIni_cpb(a2);
          lerConfIni();
        
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
//String senhaAcesso = JOptionPane.showInputDialog("INSIRA A CHAVE DE ACESSO");
//String variRec = propertiesHalt.getText();
//if(senhaAcesso.equals(variRec)){

new ConfiEstilo().show();
//
//}
//else if(!senhaAcesso.equals(variRec)){
//JOptionPane.showMessageDialog(null, "CHAVE INCORRETA, CONTATE-ME PARA ESTA FUNCIONALIDADE","AVISO DO SISTEMA", JOptionPane.WARNING_MESSAGE);
//}
}//GEN-LAST:event_jMenuItem8ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
jButton1.setEnabled(false);
    jc_h.setEnabled(false);
        jc_m.setEnabled(false);
        jc_s.setEnabled(false);
        bt_add_time.setEnabled(false);
        bt_novoHorario.setEnabled(true);
        bt_delHorario.setEnabled(true);
}//GEN-LAST:event_jButton1ActionPerformed
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add_time;
    private javax.swing.JButton bt_delHorario;
    private javax.swing.JButton bt_dir_alvo;
    private javax.swing.JButton bt_dir_destino;
    private javax.swing.JButton bt_novoHorario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JComboBox jc_h;
    private javax.swing.JComboBox jc_m;
    private javax.swing.JComboBox jc_s;
    private javax.swing.JFormattedTextField jf_porta_ftp;
    private javax.swing.JTable jt_horarios;
    private javax.swing.JPasswordField jtpass_ftp;
    private javax.swing.JTextField propertiesHalt;
    private javax.swing.JPasswordField pw_senha;
    private javax.swing.JLabel relogio;
    private javax.swing.JTextField server_ftp;
    private javax.swing.JTextField tf_assunto;
    private javax.swing.JTextField tf_de;
    private javax.swing.JTextField tf_destino_backup;
    private javax.swing.JTextField tf_dir_copia;
    private javax.swing.JTextField tf_diretorio_alvo;
    private javax.swing.JTextField tf_login;
    private javax.swing.JTextField tf_nome_dest;
    private javax.swing.JTextField tf_nome_re;
    private javax.swing.JTextField tf_para;
    private javax.swing.JTextField tf_porta_smtp;
    private javax.swing.JTextField tf_server_smtp;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    private org.netbeans.examples.lib.timerbean.Timer timer3;
    private javax.swing.JTextField user_ftp;
    // End of variables declaration//GEN-END:variables

    public void mkDir(){
            
    String arqTemp =tf_destino_backup.getText()+"backup_"+System.getProperty("user.name")+"_"+jLabel5.getText();
    jTextField4.setText("backup_"+System.getProperty("user.name")+"_"+ jLabel5.getText());
    jTextField5.setText(jLabel5.getText());
    jTextField1.setText(arqTemp);
        try{        
        CriaPastaUtilitario.criaPastabyNildo(arqTemp);
        }catch(Exception e ){
        JOptionPane.showMessageDialog(null, "MÉTODO NÃO PODE SER EXECUTADO!"+"\n"+"INFORME AO SUPORTE.","AVISO DO SISTEMA", JOptionPane.ERROR_MESSAGE);
        
        }
    }
      public void CopiaArq()
     { 
         String orF = tf_diretorio_alvo.getText() ;
         String desF =tf_destino_backup.getText() +"backup_"+System.getProperty("user.name")+"_"+jLabel5.getText() ;
         String c = jTextField1.getText()+"\\";
        
         FilterCopiador.CopiaArquivosbyNildo(orF, desF);
         Zipa();
            

        
 }

      public void Zipa() {
        
String c = jTextField1.getText()+"\\";
File a1 = new File (c); 
String d = tf_destino_backup.getText()+"\\"+jTextField4.getText()+".zip";
File a2 = new File (d); 
        
        try{
            
            ZipUtilitario.CompactaArquivosByNildo(a1, a2); 
             deletaPastaTemp();
                   System.gc(); 
                 
                       if (jCheckBox1.isSelected())
                       {
                        copiaBckp(); 
                        jTextField7.setText(""); 
                       }
                       if(jCheckBox2.isSelected())
                       {enviaral();}
                          if(jCheckBox3.isSelected())
                          {
                              myFtp();
                          }
                          deletaPastaTemp();
                          System.gc();
                          
                      }catch(Exception e){
                      JOptionPane.showMessageDialog(null,"Não Foi Possivel Compactar Diretórios.\nInforme o Erro ao Suporte.\n" +e, "AVISO DO SISTEMA",JOptionPane.ERROR_MESSAGE );
                      }
            

        
      }

      public void copiaBckp(){

      String bckpLocal = tf_destino_backup.getText()+"\\"+jTextField4.getText()+".zip";
      String bckpStorage = tf_dir_copia.getText()+"\\"+"COPIA_SEGURANCA_"+jTextField4.getText()+".zip";
      CopiaBackupRealizado.OpcaoCpBckup(bckpLocal, bckpStorage);

   }

    public void deletaPastaTemp(){
        
        String pasta_temporaria = jTextField1.getText()+"\\";
        try{
        
        DeletaDiretoriosUtilitario.ExcluirDiretoriobyNildo(pasta_temporaria);
        }catch(Exception e){}
    }    
              public void ler_DirCb()
         {

             File LerDirAnalise = new File ("C:\\Windows\\DABDIR.nbx");
            
                 FileInputStream fluxoArquivo = null;
                 ObjectInputStream entradaObjeto = null;
                 DataInputStream ob_Pri = null;
                
                    try
                    {
                        fluxoArquivo        = new FileInputStream     (LerDirAnalise);
                        entradaObjeto       = new ObjectInputStream   (fluxoArquivo);
                        ob_Pri              = new DataInputStream     (fluxoArquivo);
            
                       String textDir  = (String) entradaObjeto.readObject();
                       tf_dir_copia.setText(textDir);
                  
                        entradaObjeto.close();
                        ob_Pri.close();
                     
                    }catch(Exception e){
                      //  JOptionPane.showMessageDialog(null, "O SISTEMA NAO ENCONTROU O ARQUIVO PARA OBTER A INFORMAÇÃO"+"\n"+"DO DIRETÓRIO DE CÓPIA DO BACKUP","AVISO DO SISTEMA", JOptionPane.WARNING_MESSAGE);
               }
         }
                
         public void ler_Dir()
         {

             File LerDirAnalise = new File ("C:\\Windows\\DAB.nbx");
             File LerDirAnalise1 = new File ("C:\\Windows\\DDB.nbx");

                 FileInputStream fluxoArquivo = null;
                 ObjectInputStream entradaObjeto = null;
                 DataInputStream ob_Pri = null;
                 FileInputStream fluxoArquivo1 = null;
                 ObjectInputStream entradaObjeto1 = null;
                 DataInputStream ob_Pri1 = null;
                    try
                    {
                        fluxoArquivo        = new FileInputStream     (LerDirAnalise);
                        entradaObjeto       = new ObjectInputStream   (fluxoArquivo);
                        ob_Pri              = new DataInputStream     (fluxoArquivo);
                        fluxoArquivo1       = new FileInputStream     (LerDirAnalise1);
                        entradaObjeto1      = new ObjectInputStream   (fluxoArquivo1);
                        ob_Pri1             = new DataInputStream     (fluxoArquivo1);

                        String textDir  = (String) entradaObjeto.readObject();
                        String textDir1 = (String) entradaObjeto1.readObject();

                        tf_diretorio_alvo.setText(textDir);
                        tf_destino_backup.setText(textDir1);
                        entradaObjeto.close();
                        ob_Pri.close();
                        entradaObjeto1.close();
                        ob_Pri1.close();
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "SISTEMA NAO ENCONTROU CONFIGURAÇOES DE LOCALIZAÇÃO DOS DIRETORIOS NECESSÁRIOS PARA BACKUP"+"\n"+"CONFIGURE OS PATH ALVO DO BACKUP E O DE DESTINO","AVISO DO SISTEMA", JOptionPane.WARNING_MESSAGE);
               }
         }
         public void ler_fTime(){

          jt_horarios.getColumnModel().getColumn(0).setPreferredWidth(230);
          jt_horarios.getColumnModel().getColumn(1).setPreferredWidth(0);

          DefaultTableModel modeloT = (DefaultTableModel)jt_horarios.getModel();

          String fTime = "C:\\";
             try
              {
                    File fileTime = new File (fTime);
                    String fileTimes[]  = fileTime.list();

                       for(String t : fileTimes)
                       {
                            File o = new File (t);
                            int  numeroLinhas = modeloT.getRowCount();
                            relogio.setText(String.valueOf(numeroLinhas+1));
                            String filtro = o.getName();
                            int tmt = filtro.length();
                            String filtrado = filtro.substring((tmt-4), tmt);
                            String filnome = filtro.substring(0, (tmt-5));

                              if (filtrado.equalsIgnoreCase("time"))
                               {

                                   String replacementChar = filnome.replaceAll("_", ":");
                                   modeloT.addRow(new Object[]{(replacementChar),fTime+o.getName()});
                                   vetor.add(replacementChar);

                               }else{
                           }
                    }
               }
             catch(Exception e){
                   JOptionPane.showMessageDialog(null, "NÃO FOI POSSIVEL CARREGAR HORÁRIOS DE BACKUP"+"\n"+"INFORME AO SUPORTE"+e);

               }
        }




  public void testatime()
  {
             if(vetor.contains(relogio.getText()))
             {
                if (tf_diretorio_alvo.getText().isEmpty() || tf_destino_backup.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "O AGENDAMENTO DE BACKUP NÃO FUNCIONARÁ, SE NÃO HOUVER DIRETORIOS DE BACKUP ESPECIFICADOS", "AVISO DO SISTEMA", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    mkDir();
                    CopiaArq();
                    jTextField1.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
                 }
         }
    }

  public void hbckup(){
        if (tf_diretorio_alvo.getText().isEmpty() || tf_destino_backup.getText().isEmpty())
           {
                JOptionPane.showMessageDialog(null, "Não há Diretorios Especificados", "AVISO DO SISTEMA", JOptionPane.INFORMATION_MESSAGE);
              }else
              { 
            mkDir();
            CopiaArq();
             jTextField1.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
              }
  }

  public void ocultarUtil(){

  jTextField1.setVisible(false);
  jTextField4.setVisible(false);
  jTextField5.setVisible(false);

  }
  public void clearUtil(){

            jTextField1.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
  }

  public void add_time(){

        jt_horarios.getColumnModel().getColumn(0).setPreferredWidth(230);
        jt_horarios.getColumnModel().getColumn(1).setPreferredWidth(0);
        DefaultTableModel modeloT = (DefaultTableModel)jt_horarios.getModel();

        String horas = jc_h.getSelectedItem().toString();
        String minutos = jc_m.getSelectedItem().toString();
        String milseg = jc_s.getSelectedItem().toString();
        String  novoTime =  horas+":"+minutos+":"+milseg;     //jFormattedTextField1.getText();//JOptionPane.showInputDialog(null, "Informe novo horario");

        String  nt = novoTime.replaceAll(":", "_");
        File dirAnalise = new File("C:\\"+nt+".time");
        FileOutputStream fluxInDirAnalise = null;
        ObjectOutputStream fluxOutDirAnalise = null;
        Object c1 = (Object)novoTime;
        try {
            fluxInDirAnalise = new FileOutputStream(dirAnalise);
            fluxOutDirAnalise = new ObjectOutputStream(fluxInDirAnalise);
            fluxOutDirAnalise.writeObject(c1);
            fluxOutDirAnalise.close();

        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "NÃO ESTA SENDO POSSIVEL AGENDAR HORARIOS PARA BACKUP, CONTATE SUPORTE !", "AVISO DO SISTEMA", JOptionPane.ERROR_MESSAGE);
        }
        jt_horarios.selectAll();
        int idx[] = jt_horarios.getSelectedRows();

        for(int i = 0; i<idx.length; i++) {
            modeloT.removeRow(idx[i]-i);}

        ler_fTime();
        jc_h.setSelectedItem("00");
        jc_m.setSelectedItem("00");
        jc_s.setSelectedItem("00");
        jc_h.setEnabled(false);
        jc_m.setEnabled(false);
        jc_s.setEnabled(false);
        bt_add_time.setEnabled(false);
        bt_novoHorario.setEnabled(true);
        bt_delHorario.setEnabled(true);
  }

public void confFTP(){

 File LerDirAnalise = new File ("C:\\Arquivos de Programas\\Net Backup\\ENG\\04\\conur.nbx");
 File LerDirAnalise1 = new File ("C:\\Arquivos de Programas\\Net Backup\\ENG\\04\\conusr.nbx");
 File LerDirAnalise2 = new File ("C:\\Arquivos de Programas\\Net Backup\\ENG\\04\\conass.nbx");
 File LerDirAnalise3 = new File ("C:\\Arquivos de Programas\\Net Backup\\ENG\\04\\condor.nbx");

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
                        fluxoArquivo        = new FileInputStream     (LerDirAnalise);
                        entradaObjeto       = new ObjectInputStream   (fluxoArquivo);
                        ob_Pri              = new DataInputStream     (fluxoArquivo);

                        fluxoArquivo1       = new FileInputStream     (LerDirAnalise1);
                        entradaObjeto1      = new ObjectInputStream   (fluxoArquivo1);
                        ob_Pri1             = new DataInputStream     (fluxoArquivo1);

                        fluxoArquivo2        = new FileInputStream     (LerDirAnalise2);
                        entradaObjeto2       = new ObjectInputStream   (fluxoArquivo2);
                        ob_Pri2              = new DataInputStream     (fluxoArquivo2);

                        fluxoArquivo3       = new FileInputStream     (LerDirAnalise3);
                        entradaObjeto3      = new ObjectInputStream   (fluxoArquivo3);
                        ob_Pri3             = new DataInputStream     (fluxoArquivo3);

                        String textDir  = (String) entradaObjeto.readObject();
                        String textDir1 = (String) entradaObjeto1.readObject();
                        String textDir2  = (String) entradaObjeto2.readObject();
                        String textDir3 = (String) entradaObjeto3.readObject();

                        server_ftp.setText(textDir);
                        user_ftp.setText(textDir1);
                        jtpass_ftp.setText(textDir2);
                        jf_porta_ftp.setText(textDir3);

                        entradaObjeto.close();
                        ob_Pri.close();

                        entradaObjeto1.close();
                        ob_Pri1.close();

                         entradaObjeto2.close();
                        ob_Pri2.close();

                        entradaObjeto3.close();
                        ob_Pri3.close();
                    }catch(Exception e)
                    {
                        int opcao;
                   Object[] botoes = {" SIM "," NÃO "};
                   opcao = JOptionPane.showOptionDialog(null,"NÃO FORÃO ENCONTRADOS ARQUIVOS DE CONFIGURAÇÃO DO RECURSO FTP"+"\n"+"DESEJA CONFIGURAR AGORA?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                   if (opcao ==  JOptionPane.YES_OPTION) {
                   jCheckBox3.setEnabled(false);
                   new ConfFtpview().show();
                   
        
                   }if(opcao == JOptionPane.NO_OPTION){
                   
                   JOptionPane.showMessageDialog(null, "NÃO SERÁ POSSIVEL UTILIZAR O RECURSO DE FTP");
                   jCheckBox3.setEnabled(false);
                   
                   }                      
          }
}

     public  void myFtp(){
         
         String servidor = server_ftp.getText();
         String usuario  = user_ftp.getText();
         String senha    =  jtpass_ftp.getText();
         int porta       = (Integer)Integer.parseInt(jf_porta_ftp.getText());
         String localArquivo = tf_destino_backup.getText()+jTextField4.getText()+".zip";
         FtpUtilitario.FtpbyNildo(servidor, usuario, senha, porta, localArquivo);
 
         
  }
      
          public void ler_ConfW(){

        File LerservSmtp  = new File  ("C:\\Windows\\LerservSmtp.nbx");
        File LerportaSmtp = new File  ("C:\\Windows\\LerportaSmtp.nbx");
        File LerdeEmail   = new File  ("C:\\Windows\\LerdeEmail.nbx");
        File LerparaEmail = new File  ("C:\\Windows\\LerparaEmail.nbx");
        File LernomeDe    = new File  ("C:\\Windows\\LernomeDe.nbx");
        File LernomePara  = new File  ("C:\\Windows\\LernomePara.nbx");
        File Lerlogin     = new File  ("C:\\Windows\\Lerlogin.nbx");
        File Lersenha     = new File  ("CC:\\Windows\\Lersenha.nbx");
        File Lerassunto   = new File  ("C:\\Windows\\Lerassunto.nbx");
        File LerMenssagem = new File  ("C:\\Windows\\LerMenssagem.nbx");

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

         FileInputStream fluxoArquivo4 = null;
         ObjectInputStream entradaObjeto4 = null;
         DataInputStream ob_Pri4 = null;

         FileInputStream fluxoArquivo5 = null;
         ObjectInputStream entradaObjeto5 = null;
         DataInputStream ob_Pri5 = null;

         FileInputStream fluxoArquivo6 = null;
         ObjectInputStream entradaObjeto6 = null;
         DataInputStream ob_Pri6 = null;

         FileInputStream fluxoArquivo7 = null;
         ObjectInputStream entradaObjeto7 = null;
         DataInputStream ob_Pri7 = null;

         FileInputStream fluxoArquivo8 = null;
         ObjectInputStream entradaObjeto8 = null;
         DataInputStream ob_Pri8 = null;

         FileInputStream fluxoArquivo9 = null;
         ObjectInputStream entradaObjeto9 = null;
         DataInputStream ob_Pri9 = null;

        try{
        fluxoArquivo = new FileInputStream(LerservSmtp);
        entradaObjeto = new ObjectInputStream(fluxoArquivo);
        ob_Pri = new DataInputStream( fluxoArquivo);

        fluxoArquivo1 = new FileInputStream(LerportaSmtp);
        entradaObjeto1 = new ObjectInputStream(fluxoArquivo1);
        ob_Pri1 = new DataInputStream( fluxoArquivo1);

        fluxoArquivo2 = new FileInputStream(LerdeEmail);
        entradaObjeto2 = new ObjectInputStream(fluxoArquivo2);
        ob_Pri2 = new DataInputStream( fluxoArquivo2);

        fluxoArquivo3 = new FileInputStream(LerparaEmail);
        entradaObjeto3 = new ObjectInputStream(fluxoArquivo3);
        ob_Pri3 = new DataInputStream( fluxoArquivo3);

        fluxoArquivo4 = new FileInputStream(LernomeDe);
        entradaObjeto4 = new ObjectInputStream(fluxoArquivo4);
        ob_Pri4 = new DataInputStream( fluxoArquivo4);

        fluxoArquivo5 = new FileInputStream(LernomePara);
        entradaObjeto5 = new ObjectInputStream(fluxoArquivo5);
        ob_Pri5 = new DataInputStream( fluxoArquivo5);

        fluxoArquivo6 = new FileInputStream(Lerlogin);
        entradaObjeto6 = new ObjectInputStream(fluxoArquivo6);
        ob_Pri6 = new DataInputStream( fluxoArquivo6);

        fluxoArquivo7 = new FileInputStream(Lersenha);
        entradaObjeto7 = new ObjectInputStream(fluxoArquivo7);
        ob_Pri7 = new DataInputStream( fluxoArquivo7);

        fluxoArquivo8 = new FileInputStream(Lerassunto);
        entradaObjeto8 = new ObjectInputStream(fluxoArquivo8);
        ob_Pri8 = new DataInputStream( fluxoArquivo8);

        fluxoArquivo9 = new FileInputStream(LerMenssagem);
        entradaObjeto9 = new ObjectInputStream(fluxoArquivo9);
        ob_Pri9 = new DataInputStream( fluxoArquivo9);

        String textDir = (String) entradaObjeto.readObject();
        String textDir1 = (String) entradaObjeto1.readObject();
        String textDir2 = (String) entradaObjeto2.readObject();
        String textDir3 = (String) entradaObjeto3.readObject();
        String textDir4 = (String) entradaObjeto4.readObject();
        String textDir5 = (String) entradaObjeto5.readObject();
        String textDir6 = (String) entradaObjeto6.readObject();
        String textDir7 = (String) entradaObjeto7.readObject();
        String textDir8 = (String) entradaObjeto8.readObject();
        String textDir9 = (String) entradaObjeto9.readObject();
        
        tf_server_smtp.setText(textDir);
        tf_porta_smtp.setText(textDir1);
        tf_de.setText(textDir2);
        tf_para.setText(textDir3);
        tf_nome_re.setText(textDir4);
        tf_nome_dest.setText(textDir5);
        tf_login.setText(textDir6);
        pw_senha.setText(textDir7);
        tf_assunto.setText(textDir8);
        jTextArea1.setText(textDir9);

        entradaObjeto.close();
        ob_Pri.close();

        entradaObjeto1.close();
        ob_Pri1.close();

        entradaObjeto2.close();
        ob_Pri2.close();

        entradaObjeto3.close();
        ob_Pri3.close();

        entradaObjeto4.close();
        ob_Pri4.close();

        entradaObjeto5.close();
        ob_Pri5.close();

        entradaObjeto6.close();
        ob_Pri6.close();

        entradaObjeto7.close();
        ob_Pri7.close();

        entradaObjeto8.close();
        ob_Pri8.close();
        
        entradaObjeto9.close();
        ob_Pri9.close();

        }catch(Exception e){ 
       
        int opcao;
                   Object[] botoes = {" SIM "," NÃO "};
                   opcao = JOptionPane.showOptionDialog(null,"NÃO FORÃO ENCONTRADOS ARQUIVOS DE CONFIGURAÇÃO DO RECURSO WORKFLOW"+"\n"+"DESEJA CONFIGURALO AGORA ?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                   if (opcao ==  JOptionPane.YES_OPTION) {
                   jCheckBox2.setEnabled(false);
                   new ConfEmail().show();
                   
        
                   }if(opcao == JOptionPane.NO_OPTION){
                   
                   JOptionPane.showMessageDialog(null, "NÃO SERÁ POSSIVEL UTILIZAR O RECURSO DE WORKFLOW");
                   jCheckBox2.setEnabled(false);
                   
                   }
                   
                   
                   
        }
      }

   public void enviaral() throws EmailException {
       
       String srSmtp = tf_server_smtp.getText(); String lg = tf_login.getText(); 
       String sh = pw_senha.getText(); int prt = Integer.parseInt(tf_porta_smtp.getText());
       String rm = tf_de.getText(); String nomeRm = tf_nome_re.getText();
       String dest = tf_para.getText(); String nomeDest = tf_nome_dest.getText();
       String ass = tf_assunto.getText(); 
       String mens = null;
       if (jCheckBox1.isSelected() & jCheckBox2.isSelected() & jCheckBox3.isSelected())
          {mens = jTextArea1.getText()+""+tf_destino_backup.getText() +jTextField4.getText()+".zip"+"\n"+"COPIA DE SEGURANCA SALVA EM :"+" "+tf_dir_copia.getText()+"\n"+"COPIA SALVA NO FTP :"+" "+server_ftp.getText();}
       else if (!jCheckBox1.isSelected() & jCheckBox2.isSelected() & jCheckBox3.isSelected())
          {mens = jTextArea1.getText()+""+tf_destino_backup.getText() +jTextField4.getText()+".zip"+"\n"+"COPIA SALVA NO FTP :"+" "+server_ftp.getText();}
       else if (!jCheckBox1.isSelected() & jCheckBox2.isSelected() & !jCheckBox3.isSelected())
          {mens = jTextArea1.getText()+""+tf_destino_backup.getText() +jTextField4.getText()+".zip";}
       else if (jCheckBox1.isSelected() & jCheckBox2.isSelected() & !jCheckBox3.isSelected())
          {mens = jTextArea1.getText()+""+tf_destino_backup.getText() +jTextField4.getText()+".zip"+"\n"+"COPIA DE SEGURANÇA SALVA EM :"+" "+tf_dir_copia.getText();}       
       else if (!jCheckBox1.isSelected() & jCheckBox2.isSelected() & !jCheckBox3.isSelected())   
          {mens = jTextArea1.getText()+""+tf_destino_backup.getText() +jTextField4.getText()+".zip";}            
       WorkFlowUtilitario.EnviaEmailbyNildo(srSmtp, lg, sh, prt, dest, nomeDest, rm, nomeRm, ass, mens);
   
//   ta_logs.append("ENVIANDO EMAIL ALERTA..."+"\n");
//   ta_logs.append("AUTENTICANDO..."+" "); 
   } 
   
    public void lerConfIni(){
    
  File IniCopiaBackup       =   new File ("C:\\Windows\\1.nbx");
  File IniWorkFlow         =   new File ("C:\\Windows\\2.nbx");
  File IniFtp        =   new File ("C:\\Windows\\3.nbx");
// // File lporta        =   new File ("C:\\Arquivos de Programas\\Axl_Backup\\setF\\condor.nbx");

  
    
 FileInputStream fluxoArquivo = null;
 ObjectInputStream entradaObjeto = null;
 DataInputStream ob_Pri = null;

 FileInputStream fluxoArquivo1 = null;
 ObjectInputStream entradaObjeto1 = null;
 DataInputStream ob_Pri1 = null;

 FileInputStream fluxoArquivo2 = null;
 ObjectInputStream entradaObjeto2 = null;
 DataInputStream ob_Pri2 = null;



    try
    {
  fluxoArquivo = new FileInputStream(IniCopiaBackup);
  entradaObjeto = new ObjectInputStream(fluxoArquivo);
  ob_Pri = new DataInputStream( fluxoArquivo);

  fluxoArquivo1 = new FileInputStream(IniWorkFlow);
  entradaObjeto1 = new ObjectInputStream(fluxoArquivo1);
  ob_Pri1 = new DataInputStream( fluxoArquivo1);

  fluxoArquivo2 = new FileInputStream(IniFtp);
  entradaObjeto2 = new ObjectInputStream(fluxoArquivo2);
  ob_Pri2 = new DataInputStream( fluxoArquivo2);

  


    String textDir = (String) entradaObjeto.readObject();
    String textDir1 = (String) entradaObjeto1.readObject();
    String textDir2 = (String) entradaObjeto2.readObject();
 //   String textDir3 = (String) entradaObjeto3.readObject();
    
System.out.println(textDir);

if(textDir.equals("01")){
jCheckBox1.setSelected(true);
}
else if(textDir.equals("00")){
jCheckBox1.setSelected(false);
}    
if(textDir1.equals("01")){
jCheckBox2.setSelected(true);
}
else if(textDir1.equals("00")){
jCheckBox2.setSelected(false);
}  
if(textDir2.equals("01")){
jCheckBox3.setSelected(true);
}
else if(textDir2.equals("00")){
jCheckBox3.setSelected(false);
}  
      

    entradaObjeto.close();
    ob_Pri.close();
    entradaObjeto1.close();
    ob_Pri1.close();
    entradaObjeto2.close();
    ob_Pri2.close();
   
    }catch(Exception e){
    }
  }
     public void lookandfeel()
    {
        try{
    UIManager.setLookAndFeel(seta_look);
    SwingUtilities.updateComponentTreeUI(this);
            }catch (Exception erro){JOptionPane.showMessageDialog(null,erro);
            }
    }
        public void ler_ConfEstilo(){
        File confEst = new File ("C:\\Windows\\SE0200ES.nbx");
    FileInputStream fluxoArquivo = null;
    ObjectInputStream entradaObjeto = null;
    DataInputStream ob_Pri = null;

    try{
        fluxoArquivo = new FileInputStream(confEst);
        entradaObjeto = new ObjectInputStream(fluxoArquivo);
        ob_Pri = new DataInputStream( fluxoArquivo);
    String textChar = (String) entradaObjeto.readObject();
    propertiesHalt.setText(textChar);
    entradaObjeto.close();
    ob_Pri.close();
    }
    catch(Exception e)
    {
    }
    }
}