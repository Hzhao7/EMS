
import javax.swing.table.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P0068839
 */
public class DisplayAllEmps_jFrame extends javax.swing.JFrame {


    // ATTRIBUTES
    private MyHashTable mainHT;  // This contains the ref value for theHT of MainJFrame.
    private NewChanges changes;


    private DefaultTableModel model;


    // CONSTRUCTORS
    /**
     * Creates new form SeparateJFrame
     */
    public DisplayAllEmps_jFrame() {
        initComponents();
        /*
        model.addColumn("Status");
        model.addColumn("Employee Number");
        model.addColumn("First Name");
        model.addColumn("Last Name");
        */
        //System.out.println("\n\nmodel row count is " + model.getRowCount());

    }


    // METHODS


    public void setMainHT(MyHashTable refvalForHT) {
        mainHT = refvalForHT;
    }
    
    public void setSaved(NewChanges theRefVal) {
        changes = theRefVal;
    }
    public void displayAll(){
        int numInHT = mainHT.getNumInHashTable();

        // Set up the colum headers and also state how many rows of data to display
        model = new DefaultTableModel(new Object[] {"Status",
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
                    
                    String formattedEmpNum = String.format("%06d", theEmp.getEmpNum());
                    if (theEmp instanceof FTE) {
                        FTE theFTE = (FTE) theEmp;
                        System.out.println("    That employee has gross yearly salary $" + Double.toString(theFTE.getYearlySalary()));
                        System.out.println("    That employee has net yearly income $" + Double.toString(theFTE.calcNetAnnualIncome()));
                        
                        model.setValueAt("Full Time", empCounter, 0);
                        model.setValueAt(formattedEmpNum, empCounter, 1);
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
                        model.setValueAt(formattedEmpNum, empCounter, 1);
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
        }

        else {
            System.out.println("Nothing in the HT!  Too bad so sad :-(");
        }

        System.out.println("\nTABLE ROW COUNT " + jTable1.getRowCount());
        System.out.println("\nTABLE COLUMN COUNT " + jTable1.getColumnCount());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        EditEmployee = new javax.swing.JButton();
        Remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Update/Reload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton4.setBackground(new java.awt.Color(235, 43, 40));
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4exitAddNewEmployee(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Display of All Current Employees");

        EditEmployee.setBackground(new java.awt.Color(86, 196, 79));
        EditEmployee.setText("Edit selected employee");
        EditEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEmployeeActionPerformed(evt);
            }
        });

        Remove.setBackground(new java.awt.Color(204, 63, 63));
        Remove.setText("Remove Employee");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(EditEmployee)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Remove)
                                    .addGap(503, 503, 503)
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(jLabel2)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(EditEmployee)
                    .addComponent(Remove))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int numInHT = mainHT.getNumInHashTable();

        // Set up the colum headers and also state how many rows of data to display
        model = new DefaultTableModel(new Object[] {"Status",
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
                    String formattedEmpNum = String.format("%06d", theEmp.getEmpNum());
                    if (theEmp instanceof FTE) {
                        FTE theFTE = (FTE) theEmp;
                        System.out.println("    That employee has gross yearly salary $" + Double.toString(theFTE.getYearlySalary()));
                        System.out.println("    That employee has net yearly income $" + Double.toString(theFTE.calcNetAnnualIncome()));
                        
                        model.setValueAt("Full Time", empCounter, 0);
                        model.setValueAt(formattedEmpNum, empCounter, 1);
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
                        model.setValueAt(formattedEmpNum, empCounter, 1);
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
        }

        else {
            System.out.println("Nothing in the HT!  Too bad so sad :-(");
        }

        System.out.println("\nTABLE ROW COUNT " + jTable1.getRowCount());
        System.out.println("\nTABLE COLUMN COUNT " + jTable1.getColumnCount());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4exitAddNewEmployee(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4exitAddNewEmployee
        // TODO add your handling code here:
        this.dispose(); // Make this window disappear
    }//GEN-LAST:event_jButton4exitAddNewEmployee

    private void EditEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEmployeeActionPerformed
        // TODO add your handling code here:
        int selected = 0;
        int empNum = 0;
        if (jTable1.getSelectedRow() != -1){
            selected = jTable1.getSelectedRow();
            empNum = Integer.parseInt(jTable1.getValueAt(selected, 1).toString());
            EditEmployee_jFrame theEditEmployeeJFrame = new EditEmployee_jFrame();
            theEditEmployeeJFrame.setVisible(true);
            theEditEmployeeJFrame.setMainHT(mainHT);
            theEditEmployeeJFrame.setSaved(changes);
            theEditEmployeeJFrame.setEmpNum(empNum);   
        }
    }//GEN-LAST:event_EditEmployeeActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        // TODO add your handling code here:
        int selected = 0;
        int empNum = 0;
        if (jTable1.getSelectedRow() != -1){
            selected = jTable1.getSelectedRow();
            empNum = Integer.parseInt(jTable1.getValueAt(selected, 1).toString());
            mainHT.removeEmployee(empNum);
            displayAll();
        }
    }//GEN-LAST:event_RemoveActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayAllEmps_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayAllEmps_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayAllEmps_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayAllEmps_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayAllEmps_jFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditEmployee;
    private javax.swing.JButton Remove;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
