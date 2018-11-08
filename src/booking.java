import com.test.reportGenertors.Report;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class booking extends javax.swing.JFrame {
   Date d11,d22;
   int index,nrooms;
   String hotelname=new String();
   String rname;
   int totprice;
   Connection connect=null;
   Connection connect1=null;
   Connection connect2=null;
   String email;
   String runame;
   String address;
   String city;
   String book_ref;
   int finaltotprice,waiting_flag;
   boolean w1,w2,w3;
   List<String> disccode = Arrays.asList("ZASXD", "DKEEI", "PQOWW","QUWYD","CNDHE","INDUI","UJHSDC","IUSHDA","UJHSGDS","UYETRG");
    public booking(String uname,String xname,String namehotel,int ind,Date d1,Date d2,int rooms,int xprice,boolean waiting1,boolean waiting2,boolean waiting3,int wf) {
        d11=d1;
        d22=d2;
        runame=uname;
        totprice=xprice;
        waiting_flag=wf;
        rname=xname;
        hotelname=namehotel;
        nrooms=rooms;
        index=ind;
        w1=waiting1;
       w2=waiting2;
       w3=waiting3;
        initComponents();
        connect=dbm.dbconnect();
        connect1=bookdb.dbconnect();
        connect2=hotel.dbconnect();
        bitsian.setToolTipText("10% Off on Total Price");
        this.setLocationRelativeTo(null);
        price.setText("Total price is Rs. "+ xprice);
        String query ="select email from guests where USERNAME = ? ";
        String query1 ="select Address,CITY from hotel where hotelname = ? ";
        PreparedStatement pst;
        PreparedStatement pst1;
        try {
            pst = connect.prepareStatement(query);
            pst.setString(1,uname);
            pst1 = connect2.prepareStatement(query1);
            pst1.setString(1,hotelname);
        ResultSet rs=pst.executeQuery();
        ResultSet rs1=pst1.executeQuery();
        email=rs.getString("email");
        address=rs1.getString("Address");
        city=rs1.getString("CITY");
        } catch (SQLException ex) {
            Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
        price = new javax.swing.JLabel();

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

        price.setText("Total price is Rs. ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aadhar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discounts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bitsian, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_aadhar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(enter_details))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(enter_details)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aadhar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_aadhar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discounts, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bitsian))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(price)
                .addGap(18, 18, 18)
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
        new Hotel1(runame,rname,hotelname,index,d11,d22,nrooms,w1,w2,w3,waiting_flag).setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        String din=String.valueOf(d11.getDate())+"/"+String.valueOf(d11.getMonth()+1)+"/"+String.valueOf(1900+d11.getYear());
        String dout=String.valueOf(d22.getDate())+"/"+String.valueOf(d22.getMonth()+1)+"/"+String.valueOf(1900+d22.getYear());
          
        try{
        if(Double.parseDouble(txt_aadhar.getText())<=999999999999999L||Double.parseDouble(txt_aadhar.getText())>=10000000000000000L){
            if(aadhar.getSelectedItem().equals("Aadhar Number"))
                JOptionPane.showMessageDialog(null,"Enter a Valid Aadhar Number");
            else
                JOptionPane.showMessageDialog(null,"Enter a Valid PAN Number");
        }
        else{
            try{
          String query1="insert into booking values(?,?,?,?,?,?,?,?,?)";
          PreparedStatement ps=connect1.prepareStatement(query1);
          ps.setString(1, runame);
          ps.setString(2, hotelname);
          SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
          ps.setString(3,din);
          ps.setString(4, dout);
          ps.setInt(5, nrooms);
          ps.setString(6, txt_aadhar.getText());
          book_ref=String.valueOf(new Date().getTime());
          ps.setString(7, book_ref);
          ps.setInt(8, Integer.parseInt(price.getText()));
          if(waiting_flag==0)
            ps.setString(9, "Confirm");
          if(waiting_flag==1)
            ps.setString(9, "Waiting");
          ps.execute();
         }catch (java.sql.SQLException e){
          //JOptionPane.showMessageDialog(null, "");
      }
      catch(Exception e){
           JOptionPane.showMessageDialog(null ,e);
      }
       
            this.setVisible(false);
            if(bitsian.isSelected())
                JOptionPane.showMessageDialog(null, "A Discount Code has been sent to your email. Kindly provide it during Check-In to avail discount.");
            if (waiting_flag==0)
                new confirm(runame,rname,book_ref).setVisible(true);
            else{
                
            if(JOptionPane.showConfirmDialog(null,"You booking confirmation is subject to cancellation by a user. So kindly keep backup options ready. Do you want to proceed joining waiting list?", null, JOptionPane.YES_NO_OPTION)==0){
                JOptionPane.showMessageDialog(null, "You have successfully joined the waiting list. Kindly check MANAGE BOOKINGS section for status.");
                new login(runame).setVisible(true);
            }else{
            new Hotel1(runame,rname,hotelname,index,d11,d22,nrooms,w1,w2,w3,waiting_flag).setVisible(true);
            }
            
            
            }
            
            
            Report obj=new Report();
            
            String body="<html><body><h2>Your Booking at HOTEL "+hotelname+" is Confirmed!</h2><h3>Booking Reference : "+book_ref+"</h3><h3>Check-In : "+din+"</h3><h3>Check-Out : "+dout+"</h3><h3>Address : "+address+", "+city+"</h3>";
            if(bitsian.isSelected()){
            body+="<h3>Verification Code is "+disccode.get(new Random().nextInt(disccode.size()))+". Provide this code during check-in to avail discount.</h3></body></html>";
            }else{
            body+="</body></html>";
            }
            if(waiting_flag==0){
            //obj.sendMail(email,body);
            }
            /*
                Add booking to hotel waiting
            
            */
            
            
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
            if(!email.contains(".bits-pilani.ac.in")){
                JOptionPane.showMessageDialog(null, "Please login from your bitsmail account");
                bitsian.setSelected(false);
        }
        else{
                price.setText("Total price is Rs. "+Math.round(0.9*totprice));
        }
        }else{
        price.setText("Total price is Rs. "+ totprice);
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
    private javax.swing.JLabel price;
    private javax.swing.JTextField txt_aadhar;
    // End of variables declaration//GEN-END:variables
}
