import java.util.Date;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookings = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        location = new javax.swing.JLabel();
        check_in = new javax.swing.JLabel();
        check_out = new javax.swing.JLabel();
        rooms = new javax.swing.JLabel();
        guests = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        location_dropdown = new javax.swing.JComboBox<>();
        txt_check_in = new com.toedter.calendar.JDateChooser();
        txt_check_out = new com.toedter.calendar.JDateChooser();
        txt_rooms = new javax.swing.JTextField();
        txt_guests = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        hi_name = new javax.swing.JLabel();
        logout_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 420));
        setResizable(false);

        bookings.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        location.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        location.setText("Location");

        check_in.setText("Check In");

        check_out.setText("Check Out");

        rooms.setText("No. of Rooms");

        guests.setText("No. of Guest(s)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("(Max 3 per room)");

        location_dropdown.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        location_dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Bangalore", "Kolkata", "Hyderabad", "Chennai" }));
        location_dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                location_dropdownActionPerformed(evt);
            }
        });

        txt_rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_roomsActionPerformed(evt);
            }
        });

        search_button.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(rooms)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(check_in)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_check_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(54, 54, 54)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(check_out)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_check_out, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(guests)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_guests, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(location_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(search_button)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(location_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(check_out))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(check_in, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_check_in, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(txt_check_out, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rooms)
                    .addComponent(guests)
                    .addComponent(txt_rooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_guests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(search_button)
                .addContainerGap())
        );

        bookings.addTab("New Booking", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        bookings.addTab("Manage bookings", jPanel2);

        heading.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        heading.setText("ONLINE HOTEL BOOKING PORTAL");

        hi_name.setText("Hi, X");

        logout_button.setText("Log Out");
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookings, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hi_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                                .addComponent(logout_button)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hi_name)
                    .addComponent(logout_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookings, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void location_dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_location_dropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_location_dropdownActionPerformed

    private void txt_roomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_roomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_roomsActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        this.setVisible(false);
        new login_page().setVisible(true);
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        boolean dob_flag=true,room=true;
        if(true){
        Date d1 = new Date();
        Date d2 = txt_check_in.getDate();
        Date d3 = txt_check_out.getDate();
        try {
            if(d2.before(d1)&&d3.before(d1)){
                dob_flag=false;
                JOptionPane.showMessageDialog(null, "Please see that your Check-in and Check-out Dates are ahead of today");
            }
            if(!d2.before(d1)&&d3.before(d1)){
                dob_flag=false;
                JOptionPane.showMessageDialog(null, "Please see that your Check-out Date is ahead of today");
            }
            if(d2.before(d1)&&!d3.before(d1)){
                dob_flag=false;
                JOptionPane.showMessageDialog(null, "Please see that your Check-in Date is ahead of today");
            }
            if(d3.before(d2)){
                dob_flag=false;
                JOptionPane.showMessageDialog(null, "Select valid Check-out Date. You cannot Check-out before Check-in.");
            }
        }
        catch(Exception e){
            dob_flag=false;
        JOptionPane.showMessageDialog(null, "Enter Valid Dates");
        }
        }try{
        if("".equals(txt_rooms.getText())|| "".equals(txt_guests.getText())&&dob_flag){
            room=false;
            if("".equals(txt_rooms.getText())&&!"".equals(txt_guests.getText()))
            JOptionPane.showMessageDialog(null, "Enter Valid No. of Rooms");
        if(!"".equals(txt_rooms.getText())&&"".equals(txt_guests.getText()))
            JOptionPane.showMessageDialog(null, "Enter Valid No. of Guests");
        if("".equals(txt_rooms.getText())&&"".equals(txt_guests.getText()))
            JOptionPane.showMessageDialog(null, "Enter Valid No. of Rooms and No. of Guests");
        }
            else{
        
        if(Integer.valueOf(txt_guests.getText())>3*(Integer.valueOf(txt_rooms.getText()))){
            room=false;
            JOptionPane.showMessageDialog(null, "We allow maximum of 3 people per room");
                    }
                }
        }
        catch(Exception e){
            try {
            if("".equals(txt_rooms.getText()));
            try{
                if("".equals(txt_guests.getText()));
            }
            catch(Exception g){
                JOptionPane.showMessageDialog(null, "Enter Valid No. of Guests");
            }
                }
            catch(Exception f){
              JOptionPane.showMessageDialog(null, "Enter Valid No. of Rooms");  
            }
            
        }
        
        
        if(dob_flag&&room){
        this.setVisible(false);
        new hotels_search().setVisible(true);
        }
    }//GEN-LAST:event_search_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane bookings;
    private javax.swing.JLabel check_in;
    private javax.swing.JLabel check_out;
    private javax.swing.JLabel guests;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel hi_name;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel location;
    private javax.swing.JComboBox<String> location_dropdown;
    private javax.swing.JButton logout_button;
    private javax.swing.JLabel rooms;
    private javax.swing.JButton search_button;
    private com.toedter.calendar.JDateChooser txt_check_in;
    private com.toedter.calendar.JDateChooser txt_check_out;
    private javax.swing.JTextField txt_guests;
    private javax.swing.JTextField txt_rooms;
    // End of variables declaration//GEN-END:variables
}
