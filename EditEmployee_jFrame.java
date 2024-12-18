/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P0068839
 */
public class EditEmployee_jFrame extends javax.swing.JFrame {
    
    
    private MyHashTable mainHT;  // This contains the ref value for theHT of MainJFrame.
    private NewChanges changes;

    int empNum;
    /**
     * Creates new form AddNewEmployeeJFrame
     */
    public EditEmployee_jFrame() {
        initComponents();
             
        jLabel4.setVisible(false); // Hide the Added new employee message
        invalidNum.setVisible(false); // Hide the Invalid new employee message
        mustBePTEorFTE.setVisible(false); // Hide the define employee error message
        invalidDeduct.setVisible(false);
        errorLabel.setVisible(false);
        jInternalFrame1.setVisible(false);  // Hide the FTE internal jFrame
        jInternalFrame2.setVisible(false);  // Hide the PTE internal jFrame
        pack();
        
    }
    
    
    public void setMainHT(MyHashTable theRefVal) {
        mainHT = theRefVal;
    }
    public void setSaved(NewChanges theRefVal) {
        changes = theRefVal;
    }
    public void setEmpNum(int empNum){
        this.empNum = empNum;
        System.out.println(empNum);
        if (mainHT.getEmployee(empNum) instanceof FTE){
        double net_income = ((FTE)mainHT.getEmployee(empNum)).calcNetAnnualIncome();
        String formattedEmpNum = String.format("%06d", empNum);
        jTextArea1.setText("Status: Full Time Employee" + "\n" 
                +  "Employee Number: " + formattedEmpNum + "\n" 
                + "First Name: " + mainHT.getEmployee(empNum).firstName + "\n" 
                + "Last Name: " + mainHT.getEmployee(empNum).lastName + "\n" 
                + "Gender: " + mainHT.getEmployee(empNum).getGender() + "\n" 
                + "Work Location: " + mainHT.getEmployee(empNum).getWorkLoc() + "\n" 
                + "Deduction Rate: " + mainHT.getEmployee(empNum).deductRate + "\n" 
                + "Gross Annual Salary: " + ((FTE)mainHT.getEmployee(empNum)).yearlySalary + "\n" 
                + "Net Annual Income: " + net_income);
        }
        if (mainHT.getEmployee(empNum) instanceof PTE){
        double gross_income = ((PTE)mainHT.getEmployee(empNum)).getYearlySalary();
        double net_income = ((PTE)mainHT.getEmployee(empNum)).calcNetAnnualIncome();
        String formattedEmpNum = String.format("%06d", empNum);
        jTextArea1.setText("Status: Part Time Employee" + "\n" 
                + "Employee Number: " + formattedEmpNum + "\n" 
                + "First Name: " + mainHT.getEmployee(empNum).firstName + "\n" 
                + "Last Name: " + mainHT.getEmployee(empNum).lastName+ "\n" 
                + "Gender: " + mainHT.getEmployee(empNum).getGender() + "\n" 
                + "Work Location: " + mainHT.getEmployee(empNum).getWorkLoc() + "\n" 
                + "Deduction Rate: " + mainHT.getEmployee(empNum).deductRate + "\n" 
                + "Gross Annual Salary: " + gross_income + "\n" 
                + "Net Annual Income: " + net_income + "\n" 
                + "Hourly Wage: " + ((PTE)mainHT.getEmployee(empNum)).hourlyWage + "\n" 
                + "Hours Per Week: " + ((PTE)mainHT.getEmployee(empNum)).hoursPerWeek + "\n" 
                + "Weeks Per Year: " + ((PTE)mainHT.getEmployee(empNum)).weeksPerYear);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        invalidNum = new javax.swing.JLabel();
        mustBePTEorFTE = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        invalidDeduct = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("New Employee Number");
        jLabel1.setToolTipText("Enter a six digit employee number (e.g. 123456)");

        jLabel2.setText("New First Name");

        jLabel3.setText("New Last Name");

        jTextField1.setToolTipText("Enter a six digit employee number (e.g. 123456)");
        jTextField1.setMinimumSize(new java.awt.Dimension(60, 20));

        jTextField2.setToolTipText("");
        jTextField2.setMinimumSize(new java.awt.Dimension(60, 20));

        jTextField3.setMinimumSize(new java.awt.Dimension(60, 20));

        jButton1.setBackground(new java.awt.Color(86, 196, 79));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTheNewEmployee(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(235, 43, 40));
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitAddNewEmployee(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Full time");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickedFTERadioButton(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Part time");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickedPTERadioButton(evt);
            }
        });

        jInternalFrame1.setVisible(true);

        jLabel5.setText("New Salary");

        jTextField4.setToolTipText("Gross Annual Salary");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 147, Short.MAX_VALUE))
        );

        jInternalFrame2.setVisible(true);

        jLabel6.setText("New Hourly wage");

        jLabel7.setText("New Hours per week");

        jLabel8.setText("New Weeks per year");

        jTextField7.setToolTipText("");

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jLabel9.setText("New Deduction Rate (%)");

        jTextField8.setToolTipText("range between 0 and 100");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        invalidNum.setForeground(new java.awt.Color(255, 0, 0));
        invalidNum.setText("*Invalid Employee Number (Enter a unique 6 digit number not already assigned to an employee)");

        mustBePTEorFTE.setForeground(new java.awt.Color(255, 0, 0));
        mustBePTEorFTE.setText("*The employee must be defined as either a full-time or part-time employee");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 Male", "1 Female", "2 Other" }));

        jLabel12.setText("New Gender");

        jLabel13.setText("New Work Location");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 Mississauga", "1 Toronto", "2 Silicon Valley", "3 Texas", "4 Other" }));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Old Employee Information");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("");
        jScrollPane1.setViewportView(jTextArea1);

        invalidDeduct.setForeground(new java.awt.Color(255, 0, 0));
        invalidDeduct.setText("*Invalid deduction rate, valid range is between 0 and 100");

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setText("*An error has occured, please hover over the tooltips to ensure your inputs are correct");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Edit Employee");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(invalidNum, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(144, 144, 144)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(51, 51, 51))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(invalidDeduct)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton1)
                                        .addComponent(jRadioButton2)
                                        .addComponent(mustBePTEorFTE, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel16)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(invalidNum)
                        .addComponent(jLabel14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(invalidDeduct))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mustBePTEorFTE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errorLabel)
                        .addGap(41, 41, 41)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(jButton2))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void addTheNewEmployee(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTheNewEmployee
        // TODO add your handling code here:
        try{
        errorLabel.setVisible(false);
        int theEmpNum = Integer.parseInt(jTextField1.getText());
        int numberSize = jTextField1.getText().length();
        if (((mainHT.getEmployee(theEmpNum)!= null)&&(mainHT.getEmployee(theEmpNum).empNum != empNum))||(numberSize != 6)){
            invalidNum.setVisible(true);
            return;
        }
        invalidNum.setVisible(false);
        // SHOULD CHECK whether this emp number already exists for an employee
        // in the hash table, and if it does, give the user an error message
        // of some sort and do NOT add the new employee to the hash table.
        
        //double theEmpNum = double.parseDouble(jTextField1.getText());
        
        String theFirstName = jTextField2.getText();
        String theLastName = jTextField3.getText();
        double dDeductionRate  = Double.parseDouble(jTextField8.getText())/100;
        int gender = jComboBox1.getSelectedIndex();
        int workLoc = jComboBox2.getSelectedIndex();
        
        if (0 > dDeductionRate || dDeductionRate*100 > 100){
            invalidDeduct.setVisible(true);
            

            return;
        }
        invalidDeduct.setVisible(false);
        
        if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false){ // makes it so they have to define the type of empployee they are before adding them to the hashtable.
            mustBePTEorFTE.setVisible(true);
            return;
        }
        mustBePTEorFTE.setVisible(false);
        
        // FULL TIME EMPLOYEE
        if (jRadioButton1.isSelected()) {          
            String strSalary = jTextField4.getText();
            double dSalary = Double.parseDouble(strSalary);
        
            FTE theFTE = new FTE(theEmpNum, theFirstName, theLastName,
                        gender, workLoc, dDeductionRate, dSalary);
            //System.out.println("Salary of the FTE is " + dSalary);
        
            mainHT.addEmployee(theFTE);
        }
        
        // PART TIME EMPLOYEE
        if (jRadioButton2.isSelected()) {
            // Get the hourly wage, hours per wee, weeks per year
            String hourlyWage = jTextField5.getText();
            double dHourlyWage = Double.parseDouble(hourlyWage);
            String hoursPerWeek = jTextField6.getText();
            double dHoursPerWeek = Double.parseDouble(hoursPerWeek);
            String weeksPerYear = jTextField7.getText();
            double dWeekPerYear = Double.parseDouble(weeksPerYear);
            // Instantiate an PTE with the info for that employee
            PTE thePTE = new PTE(theEmpNum, theFirstName, theLastName,
                        gender, workLoc, dDeductionRate, dHourlyWage, dHoursPerWeek, dWeekPerYear);
                  
            // Add that employee to the hash table
            mainHT.addEmployee(thePTE);
        }
        mainHT.removeEmployee(empNum);
        jLabel4.setText("Edited: " + empNum);
        empNum = theEmpNum;
        jLabel4.setVisible(true);
        changes.saved = false;
        this.dispose();
        }
        catch (Exception e) {
            errorLabel.setVisible(true);
            invalidDeduct.setVisible(false);
            invalidNum.setVisible(false);
            mustBePTEorFTE.setVisible(false);
            e.getStackTrace();
        }  


    }//GEN-LAST:event_addTheNewEmployee

    
    private void exitAddNewEmployee(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitAddNewEmployee
        // TODO add your handling code here:     
        this.dispose(); // Make this window disappear
    }//GEN-LAST:event_exitAddNewEmployee

    private void clickedFTERadioButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickedFTERadioButton
        // TODO add your handling code here:
        jInternalFrame2.setVisible(false);  // PTE stuff
        jInternalFrame1.setVisible(true);   // FTE stuff
    }//GEN-LAST:event_clickedFTERadioButton

    private void clickedPTERadioButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickedPTERadioButton
        // TODO add your handling code here:
        jInternalFrame1.setVisible(false);  // FTE stuff
        jInternalFrame2.setVisible(true);   // PTE stuff
    }//GEN-LAST:event_clickedPTERadioButton

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    
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
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel invalidDeduct;
    private javax.swing.JLabel invalidNum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel mustBePTEorFTE;
    // End of variables declaration//GEN-END:variables
}
