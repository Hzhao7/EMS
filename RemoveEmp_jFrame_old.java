
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P0068839
 */
public class RemoveEmp_jFrame_old extends javax.swing.JFrame {
    
    
    private MyHashTable mainHT;  // This contains the ref value for theHT of MainJFrame.
    private DefaultTableModel model;

    /**
     * Creates new form AddNewEmployeeJFrame
     */
    public RemoveEmp_jFrame_old() {
        initComponents();
        jLabel2.setVisible(false);
        
        pack();
        
    }
    
    
    public void setMainHT(MyHashTable theRefVal) {
        mainHT = theRefVal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4exitAddNewEmployee(evt);
            }
        });

        jLabel1.setText("Employee Number");
        jLabel1.setToolTipText("Enter a six digit employee number (e.g. 123456)");

        jTextField1.setToolTipText("Enter a six digit employee number (e.g. 123456)");
        jTextField1.setMinimumSize(new java.awt.Dimension(60, 20));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*Invalid Employee Number (Enter an employee in the system)");

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Display Info");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateColumnsFromModel(false);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(jButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton4exitAddNewEmployee(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4exitAddNewEmployee
        // TODO add your handling code here:
        this.dispose(); // Make this window disappear
    }//GEN-LAST:event_jButton4exitAddNewEmployee

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               // TODO add your handling code here:
        int empNum = Integer.parseInt(jTextField1.getText());
        int numberSize = jTextField1.getText().length();
        if ((mainHT.getEmployee(empNum)) == null || (numberSize != 6)){
            jLabel2.setVisible(true);
            return;
        }
        jLabel2.setVisible(false);
        mainHT.removeEmployee(empNum);
        
        jLabel3.setText("Removed employee:  " + jTextField1.getText());
        jLabel3.setVisible(true);
        jTextField1.setText("");  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int numInHT = mainHT.getNumInHashTable();

        // Set up the colum headers and also state how many rows of data to display
        model = new DefaultTableModel(new Object[]{"Status",
            "Emp Num",
            "First Name",
            "Last Name",
            "Gender",
            "Work Location",
            "Decution Rate",
            "Gross Annual Income",
            "Net Annual Income",
            "Hourly Wage",
            "Hour Per Week",
            "Weeks Per Year"},
                numInHT);
        jTable1.setModel(model);
        jTable1.setAutoCreateColumnsFromModel(true);

        int empCounter = -1; // Row position in table for the employee

        jLabel1.setText("Currently this many employees in the table:  " + Integer.toString(numInHT));
        System.out.println("");
        System.out.println("Number of employees in the HT is " + numInHT);

        if (numInHT > 0) {
            System.out.println("Here are the employees:");
            for (int i = 0; i < mainHT.buckets.length; i++) {
                for (int j = 0; j < mainHT.buckets[i].size(); j++) {

                    EmployeeInfo theEmp = mainHT.buckets[i].get(j);

                    empCounter++;

                    System.out.println("  Employee number " + Integer.toString(theEmp.getEmpNum()));
                    System.out.println("  First name, last name : " + theEmp.getFirstName() + " " + theEmp.getLastName());

                    if (theEmp instanceof FTE) {
                        FTE theFTE = (FTE) theEmp;
                        System.out.println("    That employee has gross yearly salary $" + Double.toString(theFTE.getYearlySalary()));
                        System.out.println("    That employee has net yearly income $" + Double.toString(theFTE.calcNetAnnualIncome()));

                        model.setValueAt("Full Time", empCounter, 0);
                        model.setValueAt(theEmp.getEmpNum(), empCounter, 1);
                        model.setValueAt(theEmp.getFirstName(), empCounter, 2);
                        model.setValueAt(theEmp.getLastName(), empCounter, 3);
                        model.setValueAt(theEmp.getGender(), empCounter, 4);
                        model.setValueAt(theEmp.getWorkLoc(), empCounter, 5);
                        model.setValueAt(theEmp.getDeduct(), empCounter, 6);
                        model.setValueAt(theFTE.getYearlySalary(), empCounter, 7);
                        model.setValueAt(theFTE.calcNetAnnualIncome(), empCounter, 8);
                        model.setValueAt("N/A", empCounter, 9);
                        model.setValueAt("N/A", empCounter, 10);
                        model.setValueAt("N/A", empCounter, 11);

                    }

                    if (theEmp instanceof PTE) {
                        PTE thePTE = (PTE) theEmp;
                        System.out.println("    That employee has hourly wage $" + Double.toString(thePTE.hourlyWage));
                        System.out.println("    That employee has hours per week " + Double.toString(thePTE.hoursPerWeek));
                        System.out.println("    That employee has weeks per year " + Double.toString(thePTE.weeksPerYear));

                        model.setValueAt("Part Time", empCounter, 0);
                        model.setValueAt(theEmp.getEmpNum(), empCounter, 1);
                        model.setValueAt(theEmp.getFirstName(), empCounter, 2);
                        model.setValueAt(theEmp.getLastName(), empCounter, 3);
                        model.setValueAt(theEmp.getGender(), empCounter, 4);
                        model.setValueAt(theEmp.getWorkLoc(), empCounter, 5);
                        model.setValueAt(theEmp.getDeduct(), empCounter, 6);
                        model.setValueAt(thePTE.getYearlySalary(), empCounter, 7);
                        model.setValueAt(thePTE.calcNetAnnualIncome(), empCounter, 8);
                        model.setValueAt(thePTE.getHourlyWage(), empCounter, 9);
                        model.setValueAt(thePTE.getHoursPerWeek(), empCounter, 10);
                        model.setValueAt(thePTE.getWeeksPerYear(), empCounter, 11);

                    }
                }

            }
        } else {
            System.out.println("Nothing in the HT!  Too bad so sad :-(");
        }

        System.out.println("\nTABLE ROW COUNT " + jTable1.getRowCount());
        System.out.println("\nTABLE COLUMN COUNT " + jTable1.getColumnCount());
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(AddNewEmployee_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewEmployee_jFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}