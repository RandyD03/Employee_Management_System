/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author P0068839
 */
public class MainJFrame extends javax.swing.JFrame {

    // ATTRIBUTES
    private MyHashTable theHT;
    
    // CONSTRUCTORS
    /**
     * Creates new form MainJFrame
     */ 
    public MainJFrame() {
        initComponents();
        theHT = new MyHashTable(10); 
        
         try {//Loads archived hashtable data
            loadFromFile("D:\\Dump\\CompSci\\HTarchive.txt");
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // METHODS   
    public MyHashTable getTheHT() {//Provides refval of hashtable to other jframes
        return theHT;
    }
    
    public void loadFromFile(String location) throws IOException {//Loads archived data from designated text file

        FTE theFTE;
        PTE thePTE;
        String line;
        theHT = new MyHashTable(10);
        
        try {
            //Loads employee and reads info to add to hashtable
            BufferedReader archive = new BufferedReader(new FileReader(location));
            while(true){
                
                line = archive.readLine();
                String info[] = line.split("\\^");
                
                if ("FTE".equals(info[0])) {//adds a FTE
                    theFTE = new FTE(Integer.parseInt(info[1]), info[2], info[3], Integer.parseInt(info[4]), Integer.parseInt(info[5]), Double.parseDouble(info[6]), Double.parseDouble(info[7]));
                    theHT.addToTable(theFTE);
                    System.out.println("Loaded archived data:");
                    
                    for (int i = 0; i <= 6; i++) {//displays data to console
                        System.out.println(info[i]);
                    }
                }

                if ("PTE".equals(info[0])) {//add a PTE
                    thePTE = new PTE(Integer.parseInt(info[1]), info[2], info[3], Integer.parseInt(info[4]), Integer.parseInt(info[5]), Double.parseDouble(info[6]), Double.parseDouble(info[7]), Double.parseDouble(info[8]), Double.parseDouble(info[9]));
                    theHT.addToTable(thePTE);
                    System.out.println("Loaded archived data:");
                    
                    for (int i = 0; i <= 9; i++) {//displays data to console
                        System.out.println(info[i]);
                    }
                }
                
                if("#".equals(info[0])){
                   System.out.println("all data loaded");
                   break; 
                   
                }
            }
            line = archive.readLine();
        } catch (FileNotFoundException e) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Could not import any existing data");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveFile = new javax.swing.JButton();
        loadFile = new javax.swing.JButton();
        editEmp = new javax.swing.JButton();
        removeEmp = new javax.swing.JButton();
        addEmp = new javax.swing.JButton();
        displayEmp = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        saveFile.setText("Save DataBase");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });

        loadFile.setText("Load DatabBase");
        loadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileActionPerformed(evt);
            }
        });

        editEmp.setText("Edit Employee");
        editEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmpActionPerformed(evt);
            }
        });

        removeEmp.setText("Remove Employee");
        removeEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEmpActionPerformed(evt);
            }
        });

        addEmp.setText("Add Employee");
        addEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpActionPerformed(evt);
            }
        });

        displayEmp.setText("Display Employees");
        displayEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayEmpActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        titleLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        titleLabel.setText("EMPLOYEE MANAGEMENT SYSTEM");
        titleLabel.setIconTextGap(6);

        authorLabel.setText("by: Randy Ding");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(displayEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removeEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveFile))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(editEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loadFile))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addEmp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authorLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loadFile)
                            .addComponent(editEmp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveFile)
                            .addComponent(removeEmp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addEmp))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayEmp)
                    .addComponent(exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpActionPerformed
        // TODO add your handling code here:
        //Opens AddEmployee Jframe
        AddEmployee addEmp = new AddEmployee();
        addEmp.setVisible(true);
        addEmp.setMainHT(getTheHT());
    }//GEN-LAST:event_addEmpActionPerformed

    private void displayEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayEmpActionPerformed
        // TODO add your handling code here:
        //Opens DisplayEmp Jfram
        DisplayEmployee theSeparateJFrame = new DisplayEmployee();
        theSeparateJFrame.setVisible(true);
        theSeparateJFrame.setMainHT(getTheHT()); 
    }//GEN-LAST:event_displayEmpActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        //Closes entire application
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        // TODO add your handling code here:
        //Saves current hashtable to text file
        theHT.saveToFile("D:\\Dump\\CompSci\\HTarchive.txt");
    }//GEN-LAST:event_saveFileActionPerformed

    private void loadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileActionPerformed
        // TODO add your handling code here:
        //Loads current hashtable to text file
        try {
            loadFromFile("D:\\Dump\\CompSci\\HTarchive.txt");
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadFileActionPerformed

    private void removeEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEmpActionPerformed
        // TODO add your handling code here:
        //Opens remove employee Jframe
        RemoveEmployee removeEmp = new RemoveEmployee();
        removeEmp.setVisible(true);
        removeEmp.setMainHT(getTheHT());
    }//GEN-LAST:event_removeEmpActionPerformed

    private void editEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmpActionPerformed
        // TODO add your handling code here:
        //Opens edit employee Jframe
        EditEmployee editEmp = new EditEmployee();
        editEmp.setVisible(true);
        editEmp.setMainHT(getTheHT());  // Have theSeparateJFrame mainHT point to the real HT.
    }//GEN-LAST:event_editEmpActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmp;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JButton displayEmp;
    private javax.swing.JButton editEmp;
    private javax.swing.JButton exit;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loadFile;
    private javax.swing.JButton removeEmp;
    private javax.swing.JButton saveFile;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
