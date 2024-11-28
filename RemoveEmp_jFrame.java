
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author henry
 */
    public class RemoveEmp_jFrame extends javax.swing.JFrame {
    private MyHashTable mainHT;
    /**
     * Creates new form RemoveEmp
     */
    public RemoveEmp_jFrame() {
        initComponents();
        jLabel2.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Employee Number:");

        jTextField1.setToolTipText("Enter a six digit employee number (e.g. 123456)");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*Invalid please select an employee that exists");

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

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("jLabel4");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*There are no employees in the database please add employees");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(60, 60, 60)
                                .addComponent(jButton2)
                                .addGap(61, 61, 61)
                                .addComponent(jButton3)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int empNum = Integer.parseInt(jTextField1.getText());
        int numberSize = jTextField1.getText().length();
        if ((mainHT.getEmployee(empNum)) == null || (numberSize != 6)){
            jLabel2.setVisible(true);
            if (mainHT.getNumInHashTable() == 0){
               jLabel5.setVisible(true);
        }
            jTextArea1.setText("");
            return;
        }
        jLabel2.setVisible(false);
        jLabel5.setVisible(false);
        
        
        
        jLabel4.setText("Removed employee:  " + jTextField1.getText() + " " + mainHT.getEmployee(empNum).firstName+" "+mainHT.getEmployee(empNum).lastName);
        jLabel4.setVisible(true);
        jTextField1.setText("");
        jTextArea1.setText("");
        mainHT.removeEmployee(empNum);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int empNum = Integer.parseInt(jTextField1.getText());
        int numberSize = jTextField1.getText().length();
        if ((mainHT.getEmployee(empNum)) == null || (numberSize != 6)){
            jLabel2.setVisible(true);
            jTextArea1.setText("");
            if (mainHT.getNumInHashTable() == 0){
               jLabel5.setVisible(true);
        }
            return;
        }
        
        if (mainHT.getEmployee(empNum) instanceof FTE){
        double net_income = ((FTE)mainHT.getEmployee(empNum)).calcNetAnnualIncome();
        jTextArea1.setText("Status: Full Time Employee" + "\n" 
                +  "Employee Number: " + jTextField1.getText() + "\n" 
                + "First Name: " + mainHT.getEmployee(empNum).firstName + "\n" 
                + "Last Name: " + mainHT.getEmployee(empNum).lastName + "\n" 
                + "Gender: " + mainHT.getEmployee(empNum).gender + "\n" 
                + "Work Location: " + mainHT.getEmployee(empNum).workLoc + "\n" 
                + "Deduction Rate: " + mainHT.getEmployee(empNum).deductRate + "\n" 
                + "Gross Annual Salary: " + ((FTE)mainHT.getEmployee(empNum)).yearlySalary + "\n" 
                + "Net Annual Income: " + net_income);
        }
        if (mainHT.getEmployee(empNum) instanceof PTE){
        double gross_income = ((PTE)mainHT.getEmployee(empNum)).getYearlySalary();
        double net_income = ((PTE)mainHT.getEmployee(empNum)).calcNetAnnualIncome();
        jTextArea1.setText("Status: Part Time Employee" + "\n" 
                +  "Employee Number: " + jTextField1.getText() + "\n" 
                + "First Name: " + mainHT.getEmployee(empNum).firstName + "\n" 
                + "Last Name: " + mainHT.getEmployee(empNum).lastName+ "\n" 
                + "Gender: " + mainHT.getEmployee(empNum).gender + "\n" 
                + "Work Location: " + mainHT.getEmployee(empNum).workLoc + "\n" 
                + "Deduction Rate: " + mainHT.getEmployee(empNum).deductRate + "\n" 
                + "Gross Annual Salary: " + gross_income + "\n" 
                + "Net Annual Income: " + net_income + "\n" 
                + "Hourly Wage: " + ((PTE)mainHT.getEmployee(empNum)).hourlyWage + "\n" 
                + "Hours Per Week: " + ((PTE)mainHT.getEmployee(empNum)).hoursPerWeek + "\n" 
                + "Weeks Per Year: " + ((PTE)mainHT.getEmployee(empNum)).weeksPerYear);
        }
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
            java.util.logging.Logger.getLogger(RemoveEmp_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveEmp_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveEmp_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveEmp_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveEmp_jFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
