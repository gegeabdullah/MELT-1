/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author ryzal_000
 */
public class EditQuestion extends javax.swing.JFrame {

    public String questionID;
    
    public String question = "";
    public ButtonGroup choices;
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public int answerID1 = 0;
    public int answerID2 = 0;
    public int answerID3 = 0;
    public int answerID4 = 0;
    
     
    private AddQuestion AddQuestionPanel;
    
    /**
     * Creates new form startupPanel
     */
    public EditQuestion() {
        initComponents();
        
        choices = new ButtonGroup();
        choices.add(choice1);
        choices.add(choice2);
        choices.add(choice3);
        choices.add(choice4);
       
        
       //System.out.println("Queston is: "+question);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton4 = new javax.swing.JRadioButton();
        startupPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        questionField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        answer1 = new javax.swing.JTextField();
        answer2 = new javax.swing.JTextField();
        answer3 = new javax.swing.JTextField();
        answer4 = new javax.swing.JTextField();
        choice1 = new javax.swing.JRadioButton();
        choice3 = new javax.swing.JRadioButton();
        choice2 = new javax.swing.JRadioButton();
        choice4 = new javax.swing.JRadioButton();
        updateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startupPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit Question"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Question :");

        questionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Answer   :");

        answer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer1ActionPerformed(evt);
            }
        });

        answer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2ActionPerformed(evt);
            }
        });

        answer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer3ActionPerformed(evt);
            }
        });

        answer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer4ActionPerformed(evt);
            }
        });

        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout startupPanelLayout = new javax.swing.GroupLayout(startupPanel);
        startupPanel.setLayout(startupPanelLayout);
        startupPanelLayout.setHorizontalGroup(
            startupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(startupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(startupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(updateBtn)
                        .addGroup(startupPanelLayout.createSequentialGroup()
                            .addGroup(startupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(startupPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startupPanelLayout.createSequentialGroup()
                                    .addGroup(startupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(choice3)
                                        .addComponent(choice1)
                                        .addComponent(choice2)
                                        .addComponent(choice4))
                                    .addGap(34, 34, 34)))
                            .addGroup(startupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(questionField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(answer4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(answer3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        startupPanelLayout.setVerticalGroup(
            startupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startupPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(startupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(questionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(startupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(answer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice1))
                .addGap(25, 25, 25)
                .addGroup(startupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice2))
                .addGap(25, 25, 25)
                .addGroup(startupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(answer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice3))
                .addGap(26, 26, 26)
                .addGroup(startupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(updateBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void questionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionFieldActionPerformed

    private void answer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer1ActionPerformed

    private void answer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer2ActionPerformed

    private void answer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer3ActionPerformed

    private void answer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer4ActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        //System.out.println("Queston is: "+questionField.getText());
        
        this.question = questionField.getText();
 
        //System.out.println("Queston is: "+question);
        
        try  {
            
            connectDb();
             
             //String sql = "SELECT * FROM questions WHERE id='"+rowID+"' ";
             
            int errors = 0;
            
             String sql = "UPDATE question SET Question_Text='"+this.question+"' WHERE Question_id='"+questionID+"'";
             int rows = st.executeUpdate(sql);
             if(rows == 0) {
                errors++;
             }
             
             String sql1 = "";
             String sql2 = "";
             String sql3 = "";
             String sql4 = "";
             
            String sqlreset = "UPDATE mcqoption SET isAnswerOrNot='0' WHERE MCQOption_ID in ('"+answerID1+"', '"+answerID2+"','"+answerID3+"', '"+answerID4+"')";
            st.executeUpdate(sqlreset); 
             
            if(choice1.isSelected()) { 
            
              sql1 = "UPDATE mcqoption SET Content='"+answer1.getText()+"', isAnswerOrNot='1' WHERE MCQOption_ID='"+answerID1+"' ";
              sql2 = "UPDATE mcqoption SET Content='"+answer2.getText()+"' WHERE MCQOption_ID='"+answerID2+"' ";
              sql3 = "UPDATE mcqoption SET Content='"+answer3.getText()+"' WHERE MCQOption_ID='"+answerID3+"' ";
              sql4 = "UPDATE mcqoption SET Content='"+answer4.getText()+"' WHERE MCQOption_ID='"+answerID4+"' ";
                   
            } else if (choice2.isSelected()) { 
            
              sql1 = "UPDATE mcqoption SET Content='"+answer1.getText()+"' WHERE MCQOption_ID='"+answerID1+"' ";
              sql2 = "UPDATE mcqoption SET Content='"+answer2.getText()+"', isAnswerOrNot='1' WHERE MCQOption_ID='"+answerID2+"' ";
              sql3 = "UPDATE mcqoption SET Content='"+answer3.getText()+"' WHERE MCQOption_ID='"+answerID3+"' ";
              sql4 = "UPDATE mcqoption SET Content='"+answer4.getText()+"' WHERE MCQOption_ID='"+answerID4+"' ";
                
            } else if (choice3.isSelected()) { 
                
              sql1 = "UPDATE mcqoption SET Content='"+answer1.getText()+"' WHERE MCQOption_ID='"+answerID1+"' ";
              sql2 = "UPDATE mcqoption SET Content='"+answer2.getText()+"' WHERE MCQOption_ID='"+answerID2+"' ";
              sql3 = "UPDATE mcqoption SET Content='"+answer3.getText()+"', isAnswerOrNot='1' WHERE MCQOption_ID='"+answerID3+"' ";
              sql4 = "UPDATE mcqoption SET Content='"+answer4.getText()+"' WHERE MCQOption_ID='"+answerID4+"' ";
                
            } else {
            
              sql1 = "UPDATE mcqoption SET Content='"+answer1.getText()+"' WHERE MCQOption_ID='"+answerID1+"' ";
              sql2 = "UPDATE mcqoption SET Content='"+answer2.getText()+"' WHERE MCQOption_ID='"+answerID2+"' ";
              sql3 = "UPDATE mcqoption SET Content='"+answer3.getText()+"' WHERE MCQOption_ID='"+answerID3+"' ";
              sql4 = "UPDATE mcqoption SET Content='"+answer4.getText()+"', isAnswerOrNot='1' WHERE MCQOption_ID='"+answerID4+"' ";  
                
            } 
             
             /////////////// UPDATE the answers to DB  //////////////// 
             rows = st.executeUpdate(sql1);
             if(rows == 0) {
                errors++;
             }
            
             rows = st.executeUpdate(sql2);
             if(rows == 0) {
                errors++;
             }
             
             rows =  st.executeUpdate(sql3);
             if(rows == 0) {
                errors++;
             }
            
             rows =  st.executeUpdate(sql4);
             if(rows == 0) {
                errors++;
             }
             
             //AddQuestionPanel = new AddQuestion();
              //  AddQuestionPanel.refresh();
      
            if (errors == 0) {
               JOptionPane.showMessageDialog(null, "Question was successfully updated!");
               
            } else {
                JOptionPane.showMessageDialog(null, "ERROR in updating question!!", "error", JOptionPane.ERROR_MESSAGE);
            }
             
            

        }  catch (Exception exc) {
            exc.printStackTrace();
        }
        
        
    }//GEN-LAST:event_updateBtnActionPerformed

    
      public void connectDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/meltsystem","root","");
            st = con.createStatement();
            
        } catch(Exception ex) {
            System.out.println("Erro: "+ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField answer1;
    public javax.swing.JTextField answer2;
    public javax.swing.JTextField answer3;
    public javax.swing.JTextField answer4;
    public javax.swing.JRadioButton choice1;
    public javax.swing.JRadioButton choice2;
    public javax.swing.JRadioButton choice3;
    public javax.swing.JRadioButton choice4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton4;
    public javax.swing.JTextField questionField;
    private javax.swing.JPanel startupPanel;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
