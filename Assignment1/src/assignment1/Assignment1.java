package assignment1;
import java.util.*;
import java.io.*;
/**
 * CS5720 Assignment 1
 * Assignment1.java
 * Purpose: Student Record Management System
 * 
 * @author Chris Thomas
 */
public class Assignment1 extends javax.swing.JFrame {
    /** Creates new form Assignment1 */
    private ArrayList < Student > list;
    public Assignment1() {
        list = new ArrayList< Student >();
        initComponents();
    }
    public void addStudent( Student s ) {
        list.add(s);
    }
    public void removeStudent( String id ) {
        list.remove(id);
    }
    public void searchStudent( String id, Collection<Student> coll, Comparator<Student> search )
    {
        for (Student s : coll) {
            if (search.equals(s))
                list.add(s);
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddRecordJButton = new javax.swing.JButton();
        RemoveRecordjButton = new javax.swing.JButton();
        SearchRecordJButton = new javax.swing.JButton();
        DisplayListJButton = new javax.swing.JButton();
        SortListJButton = new javax.swing.JButton();
        FirstNameJLabel = new javax.swing.JLabel();
        LastNameJLabel = new javax.swing.JLabel();
        StudentIDjLabel = new javax.swing.JLabel();
        BirthdayJLabel = new javax.swing.JLabel();
        FirstNameJTextField = new javax.swing.JTextField();
        LastNameJTextField = new javax.swing.JTextField();
        StudentIDJTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        DisplayJTextArea = new javax.swing.JTextArea();
        MonthJTextField = new javax.swing.JTextField();
        DayJTextField = new javax.swing.JTextField();
        YearJTextField = new javax.swing.JTextField();
        MonthJLabel = new javax.swing.JLabel();
        DayJLabel = new javax.swing.JLabel();
        YearJLabel = new javax.swing.JLabel();
        ResetJButton = new javax.swing.JButton();
        SearchJTextField = new javax.swing.JTextField();
        RemoveAndSearchJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddRecordJButton.setText("Add Record");
        AddRecordJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRecordJButtonActionPerformed(evt);
            }
        });

        RemoveRecordjButton.setText("Remove Record");
        RemoveRecordjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveRecordjButtonActionPerformed(evt);
            }
        });

        SearchRecordJButton.setText("Search Record");
        SearchRecordJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchRecordJButtonActionPerformed(evt);
            }
        });

        DisplayListJButton.setText("Display List");
        DisplayListJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayListJButtonActionPerformed(evt);
            }
        });

        SortListJButton.setText("Sort List");
        SortListJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortListJButtonActionPerformed(evt);
            }
        });

        FirstNameJLabel.setText("First Name:");

        LastNameJLabel.setText("Last Name:");

        StudentIDjLabel.setText("Student ID:");

        BirthdayJLabel.setText("Birthday:");

        FirstNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameJTextFieldActionPerformed(evt);
            }
        });

        LastNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameJTextFieldActionPerformed(evt);
            }
        });

        StudentIDJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentIDJTextFieldActionPerformed(evt);
            }
        });

        DisplayJTextArea.setColumns(20);
        DisplayJTextArea.setRows(5);
        jScrollPane2.setViewportView(DisplayJTextArea);

        MonthJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthJTextFieldActionPerformed(evt);
            }
        });

        DayJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayJTextFieldActionPerformed(evt);
            }
        });

        YearJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearJTextFieldActionPerformed(evt);
            }
        });

        MonthJLabel.setText("MM");

        DayJLabel.setText("DD");

        YearJLabel.setText("YY");

        ResetJButton.setText("Reset All");
        ResetJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetJButtonActionPerformed(evt);
            }
        });

        RemoveAndSearchJLabel.setText("Please enter Student ID below:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addComponent(RemoveAndSearchJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FirstNameJLabel)
                                    .addComponent(StudentIDjLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FirstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StudentIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LastNameJLabel)
                                    .addComponent(BirthdayJLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MonthJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(MonthJLabel)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DayJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(DayJLabel)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(YearJLabel))
                                            .addComponent(YearJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(AddRecordJButton)
                                .addGap(18, 18, 18)
                                .addComponent(ResetJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DisplayListJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SortListJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(RemoveRecordjButton)
                                .addGap(45, 45, 45)
                                .addComponent(SearchRecordJButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirstNameJLabel)
                            .addComponent(FirstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastNameJLabel)
                            .addComponent(LastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(YearJLabel)
                                    .addComponent(DayJLabel)
                                    .addComponent(MonthJLabel)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(StudentIDjLabel)
                                .addComponent(StudentIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BirthdayJLabel)
                                .addComponent(MonthJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DayJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(YearJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DisplayListJButton)
                            .addComponent(SortListJButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddRecordJButton)
                        .addComponent(ResetJButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RemoveAndSearchJLabel)
                .addGap(3, 3, 3)
                .addComponent(SearchJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoveRecordjButton)
                    .addComponent(SearchRecordJButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void AddRecordJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRecordJButtonActionPerformed
// TODO add your handling code here:
    String firstName = FirstNameJTextField.getText();
    String lastName = LastNameJTextField.getText();
    String id = StudentIDJTextField.getText();
    Calendar birthDay = Calendar.getInstance();
    try {
        int month = Integer.parseInt(MonthJTextField.getText());
        int day = Integer.parseInt(DayJTextField.getText());
        int year = Integer.parseInt(YearJTextField.getText());
        birthDay.set( month, day, year );
        Student s = new Student( firstName, lastName, id, birthDay );
        addStudent( s );
        DisplayJTextArea.setText(s.toString() + " has been added.");
        Calendar.set(Calendar.YEAR, year);
        Calendar.set(Calendar.MONTH, month-1);
        Calendar.set(Calendar.DAY_OF_MONTH, day);
    } catch(Exception e)
    {
        System.out.println(e);
    }
}//GEN-LAST:event_AddRecordJButtonActionPerformed

private void RemoveRecordjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveRecordjButtonActionPerformed
// TODO add your handling code here:
    String id = StudentIDJTextField.getText();
    removeStudent( id );
    try {
        DisplayJTextArea.setText(id.toString() + " has been removed.");
    } catch(Exception e) {
        System.out.println(e);
    }
}//GEN-LAST:event_RemoveRecordjButtonActionPerformed

private void LastNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameJTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_LastNameJTextFieldActionPerformed

private void FirstNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameJTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_FirstNameJTextFieldActionPerformed

private void MonthJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthJTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_MonthJTextFieldActionPerformed

private void DayJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayJTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_DayJTextFieldActionPerformed

private void YearJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearJTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_YearJTextFieldActionPerformed

private void StudentIDJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentIDJTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_StudentIDJTextFieldActionPerformed

private void SearchRecordJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchRecordJButtonActionPerformed
// TODO add your handling code here:
    String id = SearchJTextField.getText();
    searchStudent( id );
    try {
        DisplayJTextArea.setText(id.toString() + " has been found.");
    } catch(Exception e) {
        System.out.println(e);
    }
}//GEN-LAST:event_SearchRecordJButtonActionPerformed

private void DisplayListJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayListJButtonActionPerformed
// TODO add your handling code here:
    DisplayJTextArea.setText(list.toString());
}//GEN-LAST:event_DisplayListJButtonActionPerformed

private void SortListJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortListJButtonActionPerformed
// TODO add your handling code here:
    String firstName = FirstNameJTextField.getText();
    String lastName = LastNameJTextField.getText();
    String id = StudentIDJTextField.getText();
    Calendar birthDay = Calendar.getInstance();
    Comparator< Student > sort = new StudentComparator();
    Collections.sort( list, new StudentComparator() );
    DisplayJTextArea.setText(id.toString());
}//GEN-LAST:event_SortListJButtonActionPerformed

private void ResetJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetJButtonActionPerformed
// TODO add your handling code here:
    FirstNameJTextField.setText("");
    LastNameJTextField.setText("");
    StudentIDJTextField.setText("");
    MonthJTextField.setText("");
    DayJTextField.setText("");
    YearJTextField.setText("");
}//GEN-LAST:event_ResetJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Assignment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Assignment1().setVisible(true);
            }
        });
       // Comparator<Student> sort = new StudentComparator();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRecordJButton;
    private javax.swing.JLabel BirthdayJLabel;
    private javax.swing.JLabel DayJLabel;
    private javax.swing.JTextField DayJTextField;
    private javax.swing.JTextArea DisplayJTextArea;
    private javax.swing.JButton DisplayListJButton;
    private javax.swing.JLabel FirstNameJLabel;
    private javax.swing.JTextField FirstNameJTextField;
    private javax.swing.JLabel LastNameJLabel;
    private javax.swing.JTextField LastNameJTextField;
    private javax.swing.JLabel MonthJLabel;
    private javax.swing.JTextField MonthJTextField;
    private javax.swing.JLabel RemoveAndSearchJLabel;
    private javax.swing.JButton RemoveRecordjButton;
    private javax.swing.JButton ResetJButton;
    private javax.swing.JTextField SearchJTextField;
    private javax.swing.JButton SearchRecordJButton;
    private javax.swing.JButton SortListJButton;
    private javax.swing.JTextField StudentIDJTextField;
    private javax.swing.JLabel StudentIDjLabel;
    private javax.swing.JLabel YearJLabel;
    private javax.swing.JTextField YearJTextField;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void searchStudent(String id) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}