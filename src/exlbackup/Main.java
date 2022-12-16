/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exlbackup;

import br.com.exl.backup.view.PrincipalView;

/**
* @author NILDO BUENO CORREIA FILHO 
 * NB- DESENVOLVIMENTO DE SISTEMAS
 * EMAIL: nildojava@gmail.com    
 *        nildin82@hotmail.com
 * CEL: 8115-7490
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new PrincipalView().setVisible(true);
            
            }
        });
            
    }

}
