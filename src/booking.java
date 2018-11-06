import java.util.Date;
import javax.swing.JOptionPane;

public class booking extends javax.swing.JFrame {
    Date d11,d22;
   int index,nrooms;
   String hotelname=new String();
    public booking(String namehotel,int ind,Date d1,Date d2,int rooms) {
        d11=d1;
        d22=d2;
        hotelname=namehotel;
        nrooms=rooms;
        index=ind;
        initComponents();
        bitsian.setToolTipText("10% Off on Total Price");
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        heading = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        enter_details = new javax.swing.JLabel();
        aadhar = new javax.swing.JComboBox<>();
        txt_aadhar = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        discounts = new javax.swing.JLabel();
        bitsian = new javax.swing.JCheckBox();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        heading.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        heading.setText("ONLINE HOTEL BOOKING PORTAL");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        enter_details.setText("Enter PAN card or Aadhar Card Number for booking");

        aadhar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aadhar Number", "PAN Number" }));
        aadhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadharActionPerformed(evt);
            }
        });

        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        discounts.setText("Discounts :");

        bitsian.setText("Bitsian Discount");
        bitsian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitsianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(enter_details))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(aadhar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txt_aadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(discounts, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(bitsian)))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(enter_details)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aadhar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_aadhar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discounts, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bitsian))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm)
                    .addComponent(cancel))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aadharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadharActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.setVisible(false);
        new Hotel1(hotelname,index,d11,d22,nrooms).setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        try{
        if(Double.parseDouble(txt_aadhar.getText())<=999999999999999L||Double.parseDouble(txt_aadhar.getText())>=10000000000000000L){
            if(aadhar.getSelectedItem().equals("Aadhar Number"))
                JOptionPane.showMessageDialog(null,"Enter a Valid Aadhar Number");
            else
                JOptionPane.showMessageDialog(null,"Enter a Valid PAN Number");
        }
        else{
            this.setVisible(false);
            new confirm().setVisible(true);
            }
        }
        catch(Exception e){
        if(aadhar.getSelectedItem().equals("Aadhar Number"))
                JOptionPane.showMessageDialog(null,"Enter a Valid Aadhar Number");
            else
                JOptionPane.showMessageDialog(null,"Enter a Valid PAN Number");
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void bitsianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitsianActionPerformed
        if(bitsian.isSelected()){
            // get email from database
            String email="anish@gmail.com";
            if(!email.contains(".bits-pilani.ac.in")){
                JOptionPane.showMessageDialog(null, "Please login from your bitsmail account");
                bitsian.setSelected(false);
        }
        else{
        JOptionPane.showMessageDialog(null, "A Verification Code has been sent to your email. Kindly provide it during Check-In to avail discount.");
        }
        }
    }//GEN-LAST:event_bitsianActionPerformed

    public void book() {
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
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aadhar;
    private javax.swing.JCheckBox bitsian;
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel discounts;
    private javax.swing.JLabel enter_details;
    private javax.swing.JLabel heading;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField txt_aadhar;
    // End of variables declaration//GEN-END:variables
}
