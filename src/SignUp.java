import java.awt.Color;
import javax.swing.*;
import java.util.regex.Pattern;
import java.util.*;

public class SignUp extends javax.swing.JFrame {

    
    public SignUp() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_name = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        heading = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_address = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        user_id = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        txt_user_id = new javax.swing.JTextField();
        proceed = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        txt_dob = new com.toedter.calendar.JDateChooser();
        txt_password = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_name.setForeground(new java.awt.Color(204, 204, 204));
        txt_name.setText("Enter Name");
        txt_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nameFocusLost(evt);
            }
        });

        name.setText("Name:");

        dob.setText("Date of Birth");

        heading.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        heading.setText("ONLINE HOTEL BOOKING PORTAL");

        address.setText("Residential Address");

        email.setText("Email-ID");

        txt_address.setForeground(new java.awt.Color(204, 204, 204));
        txt_address.setText("Enter Address");
        txt_address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_addressFocusLost(evt);
            }
        });

        txt_email.setForeground(new java.awt.Color(204, 204, 204));
        txt_email.setText("Enter E-mail ID");
        txt_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_emailFocusLost(evt);
            }
        });

        user_id.setText("User ID");

        password.setText("Password");

        txt_user_id.setForeground(new java.awt.Color(204, 204, 204));
        txt_user_id.setText("Enter User ID");
        txt_user_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_user_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_user_idFocusLost(evt);
            }
        });

        proceed.setText("PROCEED");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });

        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        txt_dob.setDateFormatString("dd-MM-yyyy");

        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(dob)
                            .addComponent(address)
                            .addComponent(email))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(txt_address))
                            .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_id)
                            .addComponent(password))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_user_id, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txt_password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1)))
                .addGap(0, 69, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(proceed)
                        .addGap(73, 73, 73)
                        .addComponent(cancel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dob)
                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_id)
                    .addComponent(txt_user_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proceed)
                    .addComponent(cancel))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        boolean name_flag=true,dob_flag=true,add=true;
        if("Enter Name".equals(txt_name.getText())){
            name_flag=false;
        JOptionPane.showMessageDialog(null, "Enter Valid Name");
        }
        
        if(true&&name_flag){
        Date d1 = new Date();
        Date d2 = txt_dob.getDate();
        try {if(d1.before(d2)){
            dob_flag=false;
        JOptionPane.showMessageDialog(null, "Enter Valid DOB. You are too young!");
        }}
        catch(Exception e){
            dob_flag=false;
        JOptionPane.showMessageDialog(null, "Enter Valid DOB.");
        }
        }
        if("Enter Address".equals(txt_address.getText())&&!"Enter Name".equals(txt_name.getText())&&name_flag&&dob_flag){
        add=false;
            JOptionPane.showMessageDialog(null, "Enter Valid Address");
        }
        else if("Enter Email ID".equals(txt_email.getText())&&!"Enter Name".equals(txt_name.getText())&&name_flag&&dob_flag){
            add=false;
            JOptionPane.showMessageDialog(null, "Enter a Valid Email-ID");
        }
        else if(!"Enter Email ID".equals(txt_email.getText())&&!"Enter Name".equals(txt_name.getText())&&name_flag&&dob_flag){
            boolean b1=verify_email(txt_email.getText());
            if(!b1){
                add=false;
                JOptionPane.showMessageDialog(null, "Enter a Valid Email-ID");
            }
        }
        
        if("Enter User ID".equals(txt_user_id.getText())&&!"Enter Name".equals(txt_name.getText()) &&!"Enter Address".equals(txt_address.getText())&&add){
        JOptionPane.showMessageDialog(null, "Enter Valid User ID");
        }
        else if(txt_password.getPassword().length==0&&!"Enter Name".equals(txt_name.getText()) &&!"Enter Address".equals(txt_address.getText())&&add){
        JOptionPane.showMessageDialog(null, "Enter Valid Password");
        }
        else if(!"Enter Name".equals(txt_name.getText()) &&!"Enter Address".equals(txt_address.getText())&&dob_flag&&name_flag&&add){
        
        this.setVisible(false);
        new Main().setVisible(true);
        JOptionPane.showMessageDialog(null, "Signup Successful");
        }
    }//GEN-LAST:event_proceedActionPerformed

    private void txt_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nameFocusGained
         if(txt_name.getText().equals("Enter Name")){
        txt_name.setText(null);
        txt_name.setForeground(Color.BLACK);
    }
    }//GEN-LAST:event_txt_nameFocusGained

    private void txt_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nameFocusLost
        if(txt_name.getText().equals("")){
            txt_name.setForeground(new Color(204,204,204));
        txt_name.setText("Enter Name");
        
    }
    }//GEN-LAST:event_txt_nameFocusLost

    private void txt_addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_addressFocusGained
        if(txt_address.getText().equals("Enter Address")){
        txt_address.setText(null);
        txt_address.setForeground(Color.BLACK);
    }
        
    }//GEN-LAST:event_txt_addressFocusGained

    private void txt_addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_addressFocusLost
        if(txt_address.getText().equals("")){
            txt_address.setForeground(new Color(204,204,204));
        txt_address.setText("Enter Address");
        
    }
    }//GEN-LAST:event_txt_addressFocusLost

    private void txt_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusGained
        if(txt_email.getText().equals("Enter E-mail ID")){
        txt_email.setText(null);
        txt_email.setForeground(Color.BLACK);
    }
    }//GEN-LAST:event_txt_emailFocusGained

    private void txt_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusLost
        if(txt_email.getText().equals("")){
            txt_email.setForeground(new Color(204,204,204));
        txt_email.setText("Enter E-mail ID");
        }
        if(!txt_email.getText().equals("Enter E-mail ID")){
            verify_email(txt_email.getText());
         }
    }//GEN-LAST:event_txt_emailFocusLost

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.setVisible(false);
        new Main().setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void txt_user_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_user_idFocusGained
        if(txt_user_id.getText().equals("Enter User ID")){
        txt_user_id.setText(null);
        txt_user_id.setForeground(Color.BLACK);
    }
    }//GEN-LAST:event_txt_user_idFocusGained

    private void txt_user_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_user_idFocusLost
        if(txt_user_id.getText().equals("")){
            txt_user_id.setForeground(new Color(204,204,204));
        txt_user_id.setText("Enter User ID");
    }//GEN-LAST:event_txt_user_idFocusLost
    }
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            txt_password.setEchoChar((char)0);
        }else
            txt_password.setEchoChar('*');
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    

      public boolean verify_email(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches();
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel email;
    private javax.swing.JLabel heading;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel password;
    private javax.swing.JButton proceed;
    private javax.swing.JTextField txt_address;
    private com.toedter.calendar.JDateChooser txt_dob;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user_id;
    private javax.swing.JLabel user_id;
    // End of variables declaration//GEN-END:variables
}