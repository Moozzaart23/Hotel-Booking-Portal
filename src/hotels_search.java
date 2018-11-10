import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class hotels_search extends javax.swing.JFrame {

    String city=new String();
    Connection connect=null;
    Date d11,d22;
    int nrooms,index,waiting_flag;
    String rname;
    String runame;
    boolean w1,w2,w3;
    public hotels_search(String uname,String xname,int ind,Date d1,Date d2,int rooms,boolean waiting1,boolean waiting2,boolean waiting3,int wf) {
       rname=xname;
       runame=uname;
        d11=d1;
       d22=d2;
       index=ind;
       waiting_flag=wf;
       nrooms=rooms;
       w1=waiting1;
       w2=waiting2;
       w3=waiting3;
        switch(ind){
            case 0:
                city="Delhi";
                break;
            case 1:
                city="Banglore";
                break;
            case 2:
                city="Kolkata";
                break;
            case 3:
                city="Hyderabad";
                break;
            case 4:
                city="Mumbai";
                break;
       }
       
        initComponents();
        connect=hotel.dbconnect();
        this.setLocationRelativeTo(null);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(30);
        name_options.setText(xname+", here are your options:");
 try{
        //String sql = "select hotelname,Address,Price,Ratings,numofratings,Amenities, from hotel";
        String query ="select * from hotel where CITY = ? ";
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setString(1,city);
        ResultSet rs=pst.executeQuery();
        int count=0, days=d2.getDate()-d1.getDate();
        while(rs.next()){
            count++;
            String hotelname = rs.getString("hotelname");
            String Price = rs.getString("Price");
            String Ratings = rs.getString("Ratings");
            if(count==1){
            name1.setText(hotelname);
            image1.setIcon(new ImageIcon("I:\\Java\\OOP_Project\\Images\\Hotels\\"+hotelname+".jpg"));
            price1.setText("Price for "+rooms+ " rooms per night - Rs."+String.valueOf(Integer.parseInt(Price)*rooms));
            price1tot.setText("Total Price for " +String.valueOf(days)+ " nights - Rs. " +String.valueOf(rooms*days*Integer.parseInt(Price)));
            }
            if(count==2){
            name2.setText(hotelname);
            image2.setIcon(new ImageIcon("I:\\Java\\OOP_Project\\Images\\Hotels\\"+hotelname+".jpg"));
            price2.setText("Price for "+rooms+ " rooms per night - Rs."+String.valueOf(Integer.parseInt(Price)*rooms));
            price2tot.setText("Total Price for " +String.valueOf(days)+ " nights - Rs. " +String.valueOf(rooms*days*Integer.parseInt(Price)));
            }
            if(count==3){
            name3.setText(hotelname);
            image3.setIcon(new ImageIcon("I:\\Java\\OOP_Project\\Images\\Hotels\\"+hotelname+".jpg"));
            price3.setText("Price for "+rooms+ " rooms per night - Rs."+String.valueOf(Integer.parseInt(Price)*rooms));
            price3tot.setText("Total Price for " +String.valueOf(days)+ " nights - Rs. " +String.valueOf(rooms*days*Integer.parseInt(Price)));
            }
}
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);

    } 
    if(!waiting1){
        button1.setEnabled(false);
        button1.setText("Not Available");
    }
    if(!waiting2){
        button2.setEnabled(false);
        button2.setText("Not Available");
    }   
    if(!waiting3){
        button3.setEnabled(false);
        button3.setText("Not Available");
    }   
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        name_options = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        name2 = new javax.swing.JLabel();
        price2 = new javax.swing.JLabel();
        price2tot = new javax.swing.JLabel();
        button2 = new javax.swing.JButton();
        image2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        name1 = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        price1tot = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();
        image1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        name3 = new javax.swing.JLabel();
        price3 = new javax.swing.JLabel();
        price3tot = new javax.swing.JLabel();
        button3 = new javax.swing.JButton();
        image3 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        heading1 = new javax.swing.JLabel();
        heading2 = new javax.swing.JLabel();
        heading3 = new javax.swing.JLabel();
        heading4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 153));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_options.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name_options.setForeground(new java.awt.Color(240, 240, 240));
        name_options.setText("X, here are your options:");
        getContentPane().add(name_options, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 57, -1, -1));

        jPanel2.setBackground(new java.awt.Color(151, 213, 255));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        name2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name2.setText("Hotel YXZ");

        price2.setText("Price per night - Rs. ");

        price2tot.setText("Total Price for X nights - Rs. ");

        button2.setText("View Details");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name2)
                    .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(price2)
                            .addGap(9, 9, 9)))
                    .addComponent(price2tot))
                .addGap(37, 37, 37))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name2)
                    .addComponent(price2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(price2tot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button2))
                    .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        name1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name1.setText("Hotel XYZ");

        price1.setText("Price per night - Rs. ");

        price1tot.setText("Total Price for X nights - Rs. ");

        button1.setText("View Details");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name1)
                    .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(button1)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(price1tot)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(price1)
                        .addContainerGap())))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1)
                    .addComponent(price1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(price1tot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button1)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addComponent(image1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        name3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name3.setText("Hotel ZXY");

        price3.setText("Price per night - Rs. ");

        price3tot.setText("Total Price for X nights - Rs. ");

        button3.setText("View Details");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name3)
                    .addComponent(image3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(button3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                            .addComponent(price3)
                            .addGap(11, 11, 11)))
                    .addComponent(price3tot))
                .addGap(39, 39, 39))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name3)
                    .addComponent(price3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(price3tot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button3))
                    .addComponent(image3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 77, 485, 301));

        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 382, 90, 26));

        heading1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        heading1.setForeground(new java.awt.Color(255, 255, 255));
        heading1.setText("BOOK MY HOTEL 2.0");
        heading1.setToolTipText("");
        getContentPane().add(heading1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 11, -1, 28));

        heading2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        heading2.setForeground(new java.awt.Color(255, 255, 255));
        heading2.setText("BOOK MY HOTEL 2.0");
        heading2.setToolTipText("");
        getContentPane().add(heading2, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 11, -1, 28));

        heading3.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        heading3.setForeground(new java.awt.Color(255, 255, 255));
        heading3.setText("BOOK MY HOTEL 2.0");
        heading3.setToolTipText("");
        getContentPane().add(heading3, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 11, -1, 28));

        heading4.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        heading4.setForeground(new java.awt.Color(255, 255, 255));
        heading4.setText("BOOK MY HOTEL 2.0");
        heading4.setToolTipText("");
        getContentPane().add(heading4, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 11, -1, 28));

        jLabel1.setIcon(new javax.swing.ImageIcon("I:\\Java\\OOP_Project\\Images\\signup1 - Copy.jpeg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        this.setVisible(false);
        new Hotel1(runame,rname,name2.getText(),index,d11,d22,nrooms,w1,w2,w3,waiting_flag).setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        this.setVisible(false);
        new Hotel1(runame,rname,name1.getText(),index,d11,d22,nrooms,w1,w2,w3,waiting_flag).setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        this.setVisible(false);
        new Hotel1(runame,rname,name3.getText(),index,d11,d22,nrooms,w1,w2,w3,waiting_flag).setVisible(true);
    }//GEN-LAST:event_button3ActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        
            this.setVisible(false);
        //    Thread.sleep(700);
            new login(rname,waiting_flag,rname).setVisible(true);
        
    }//GEN-LAST:event_back_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(hotels_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hotels_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hotels_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hotels_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hotels_search().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JLabel heading1;
    private javax.swing.JLabel heading2;
    private javax.swing.JLabel heading3;
    private javax.swing.JLabel heading4;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name_options;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price1tot;
    private javax.swing.JLabel price2;
    private javax.swing.JLabel price2tot;
    private javax.swing.JLabel price3;
    private javax.swing.JLabel price3tot;
    // End of variables declaration//GEN-END:variables
}
