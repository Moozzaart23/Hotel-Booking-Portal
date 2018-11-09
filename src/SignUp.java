import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.util.regex.Pattern;
import java.util.*;

public class SignUp extends javax.swing.JFrame {
    
     Connection connect =null;
    public SignUp() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(proceed);
        connect=dbm.dbconnect();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_name = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
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
        heading1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(610, 380));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_name.setForeground(new java.awt.Color(204, 204, 204));
        txt_name.setText("Enter Name");
        txt_name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nameFocusLost(evt);
            }
        });
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 70, 127, 25));

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 72, 50, -1));

        dob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dob.setForeground(new java.awt.Color(255, 255, 255));
        dob.setText("Date of Birth");
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setText("Residential Address");
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 158, -1, -1));

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email-ID");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 201, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 235, 381, -1));

        txt_address.setForeground(new java.awt.Color(204, 204, 204));
        txt_address.setText("Enter Address");
        txt_address.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_addressFocusLost(evt);
            }
        });
        getContentPane().add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 156, 130, 25));

        txt_email.setForeground(new java.awt.Color(204, 204, 204));
        txt_email.setText("Enter E-mail ID");
        txt_email.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_emailFocusLost(evt);
            }
        });
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 199, 130, 25));

        user_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user_id.setForeground(new java.awt.Color(255, 255, 255));
        user_id.setText("User ID");
        getContentPane().add(user_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 245, -1, -1));

        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 288, -1, -1));

        txt_user_id.setForeground(new java.awt.Color(204, 204, 204));
        txt_user_id.setText("Enter User ID");
        txt_user_id.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_user_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_user_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_user_idFocusLost(evt);
            }
        });
        getContentPane().add(txt_user_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 243, 130, 25));

        proceed.setBackground(new java.awt.Color(255, 153, 102));
        proceed.setText("PROCEED");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });
        getContentPane().add(proceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 109, 31));

        cancel.setBackground(new java.awt.Color(255, 153, 102));
        cancel.setText("CANCEL");
        cancel.setPreferredSize(new java.awt.Dimension(74, 23));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 109, 31));

        txt_dob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_dob.setDateFormatString("dd-MM-yyyy");
        getContentPane().add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 113, 153, 25));

        txt_password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 286, 130, 25));

        jCheckBox1.setText("Show Password");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 287, -1, -1));

        heading1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        heading1.setForeground(new java.awt.Color(255, 255, 255));
        heading1.setText("BOOK MY HOTEL 2.0");
        heading1.setToolTipText("");
        getContentPane().add(heading1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 11, -1, 28));

        jLabel1.setIcon(new javax.swing.ImageIcon("I:\\Java\\OOP_Project\\Images\\sign2.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 520, 380));

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
        String name = txt_name.getText();
        
      String date = String.valueOf(txt_dob.getDate().getDate())+"/"+String.valueOf(txt_dob.getDate().getMonth())+"/"+String.valueOf(1900+txt_dob.getDate().getYear());
      String address = txt_address.getText();
      String email = txt_email.getText();
      String username = txt_user_id.getText();
      String password = String.valueOf(txt_password.getPassword());

      try{
          String query="insert into guests values(?,?,?,?,?,?)";
          PreparedStatement ps=null;
          ps=connect.prepareStatement(query);
          ps.setString(1, name);
          ps.setString(2, date);
          ps.setString(3, address);
          ps.setString(4, email);
          ps.setString(5, username);
          ps.setString(6, password);
          ps.execute();
          this.setVisible(false);
        new login_page().setVisible(true);
        JOptionPane.showMessageDialog(null, "Signup Successful");
      }catch (java.sql.SQLException e){
          JOptionPane.showMessageDialog(null, "Username Already Taken");
      }
      catch(Exception e){
           JOptionPane.showMessageDialog(null ,e);
      }
       
        
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
        new login_page().setVisible(true);
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
    private javax.swing.JLabel heading1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
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