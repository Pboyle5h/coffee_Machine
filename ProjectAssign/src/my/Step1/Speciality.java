/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Speciality.java
 *
 * Created on Oct 14, 2012, 4:03:12 PM
 */

package my.Step1;
//Imports JOption Pane\\
import javax.swing.JOptionPane;

/**
 *
 * @author conor
 */
public class Speciality extends javax.swing.JFrame {
    //Creates flag for openings and closing frame\\
    public static boolean specialFlag=false;

    //Creates flag for prices of each item picked\\
    public static boolean priceChocFlag=false ;
    public static boolean priceMintChocFlag=false ;
    public static boolean priceChickenFlag=false ;
    public static boolean priceVegetableFlag=false ;

    //Creates flag of current stock\\
    public static int HotChoc = 4 ;
    public static int MintChoc = 4 ;
    public static int ChickenSoup = 4 ;
    public static int VegSoup = 4 ;

    /** Creates new form Speciality */

    public Speciality() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonChoc = new javax.swing.JButton();
        jButtonMintChoc = new javax.swing.JButton();
        jButtonChicken = new javax.swing.JButton();
        jButtonVegSoup = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(587, 455));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Speciallity Drinks");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 50, 160, 17);

        jButtonChoc.setFont(new java.awt.Font("Trajan Pro", 0, 18));
        jButtonChoc.setText("HOT CHOCOLATE");
        jButtonChoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChocActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonChoc);
        jButtonChoc.setBounds(240, 80, 280, 27);

        jButtonMintChoc.setFont(new java.awt.Font("Trajan Pro", 0, 18));
        jButtonMintChoc.setText("MINT HOT CHOCOLATE");
        jButtonMintChoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMintChocActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMintChoc);
        jButtonMintChoc.setBounds(240, 120, 280, 27);

        jButtonChicken.setFont(new java.awt.Font("Trajan Pro", 0, 18));
        jButtonChicken.setText("CHICKEN SOUP");
        jButtonChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChickenActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonChicken);
        jButtonChicken.setBounds(240, 160, 280, 27);

        jButtonVegSoup.setFont(new java.awt.Font("Trajan Pro", 0, 18));
        jButtonVegSoup.setText("VEGATABLE SOUP ");
        jButtonVegSoup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVegSoupActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVegSoup);
        jButtonVegSoup.setBounds(240, 200, 280, 27);

        jButtonBack.setFont(new java.awt.Font("Trajan Pro", 0, 18));
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack);
        jButtonBack.setBounds(450, 390, 90, 27);

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 0, 14));
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("€3.00");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 80, 35, 30);

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 0, 14));
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("€3.50");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 120, 35, 30);

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 0, 14));
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("€4.00");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(520, 200, 35, 30);

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 0, 14));
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("€4.00");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(520, 160, 35, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Step2.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -10, 570, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChocActionPerformed
         //Checks if there is enough stock if not sets to red and shows JOptionPane//
        if(HotChoc<=0){ 
        jButtonChoc.setForeground(new java.awt.Color(255, 0, 0));
                JOptionPane.showMessageDialog(null, "Out Of Stock");
        }
        // If there is enough Stock this takes you to the next page\\
            else{
                Size Siz=new Size ();
                Siz.setVisible (true) ;
                setVisible (false) ;
                dispose ();
            }
        //Declare which button has been pressed using flags\\
         priceChocFlag=true ;
         priceMintChocFlag=false ;
         priceChickenFlag=false ;
         priceVegetableFlag=false ;

      
    }//GEN-LAST:event_jButtonChocActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Declare which page has been opened using flags\\
        specialFlag=true;
        my.Step1.Teas.teaFlag=false;
        my.Step1.Brewed.brewedFlag=false;
    }//GEN-LAST:event_formWindowActivated

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
         // Takes you back to start frame//
         Step1 Step=new Step1 ();
         Step.setVisible (true) ;
         setVisible (false) ;
         dispose ();

    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonMintChocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMintChocActionPerformed
         //Checks if there is enough stock if not sets to red and shows JOptionPane//
        if(MintChoc<=0){ 
        jButtonMintChoc.setForeground(new java.awt.Color(255, 0, 0));
                JOptionPane.showMessageDialog(null, "Out Of Stock");
        }
        // If there is enough Stock this takes you to the next page\\
            else{
                Size Siz=new Size ();
                Siz.setVisible (true) ;
                setVisible (false) ;
                dispose ();
            }
        //Declare which button has been pressed using flags\\
         priceChocFlag=false ;
         priceMintChocFlag=true ;
         priceChickenFlag=false ;
         priceVegetableFlag=false ;

        
    }//GEN-LAST:event_jButtonMintChocActionPerformed

    private void jButtonChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChickenActionPerformed
         //Checks if there is enough stock if not sets to red and shows JOptionPane//
        if(ChickenSoup<=0){ 
        jButtonChicken.setForeground(new java.awt.Color(255, 0, 0));
                JOptionPane.showMessageDialog(null, "Out Of Stock");
        }
        // If there is enough Stock this takes you to the next page\\
            else{
                Size Siz=new Size ();
                Siz.setVisible (true) ;
                setVisible (false) ;
                dispose ();
            }
        //Declare which button has been pressed using flags\\
         priceChocFlag=false ;
         priceMintChocFlag=false ;
         priceChickenFlag=true ;
         priceVegetableFlag=false ;

       
    }//GEN-LAST:event_jButtonChickenActionPerformed

    private void jButtonVegSoupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVegSoupActionPerformed
         //Checks if there is enough stock if not sets to red and shows JOptionPane//
        if(VegSoup<=0){ 
        jButtonVegSoup.setForeground(new java.awt.Color(255, 0, 0));
                JOptionPane.showMessageDialog(null, "Out Of Stock");
        }
        // If there is enough Stock this takes you to the next page\\
            else{
                Size Siz=new Size ();
                Siz.setVisible (true) ;
                setVisible (false) ;
                dispose ();
            }
        //Declare which button has been pressed using flags\\
         priceChocFlag=false ;
         priceMintChocFlag=false ;
         priceChickenFlag=false ;
         priceVegetableFlag=true ;

        
    }//GEN-LAST:event_jButtonVegSoupActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Speciality().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonChicken;
    private javax.swing.JButton jButtonChoc;
    private javax.swing.JButton jButtonMintChoc;
    private javax.swing.JButton jButtonVegSoup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

}
