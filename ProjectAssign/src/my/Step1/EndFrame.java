/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EndFrame.java
 *
 * Created on 06-Dec-2012, 14:27:25
 */

package my.Step1;
//Imports Action Listner for the time\\
import java.awt.event.ActionListener;
//Imports Action Event for Timer\\
import java.awt.event.ActionEvent;
//Imports Decimal format to show change in the right format\\
import java.text.DecimalFormat;
//Imports the whole library\\
import javax.swing.*;

/**
 *
 * @author conor
 */
public class EndFrame extends javax.swing.JFrame {



    /** Creates new form EndFrame */
    public EndFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    //Creates a timer to set it back to the start frame\\
    Timer timer = new Timer(5000, new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Step1 Step=new Step1 ();
            Step.setVisible (true) ;
            setVisible (false) ;
            dispose ();
            timer.stop();
            }
            });

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelChange = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(587, 455));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabelChange.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jLabelChange);
        jLabelChange.setBounds(390, 160, 90, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Thanks.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 567, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //sets jLabelChange to the amount of change there is\\
        DecimalFormat df = new DecimalFormat("0.00");
        jLabelChange.setText(new DecimalFormat("€#0.00").format(+my.Step1.Pay.Amount));
        timer.start();//goes back to start frame when time runs out//
        my.Step1.Pay.Amount=0.0 ; //sets Amount back to zero\\
    }//GEN-LAST:event_formWindowActivated

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EndFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelChange;
    // End of variables declaration//GEN-END:variables

}
