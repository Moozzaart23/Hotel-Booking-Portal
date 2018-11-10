import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class modification extends javax.swing.JFrame {

    Connection connect1 =null;
    Connection connect2 =null;
    String runame;
    int userrooms;
    Date checkinbooked,checkoutbooked;
    String booking;
    public modification(String uname,String book_ref,int rooms,String hotelname, String datein, String dateout) throws SQLException {
        initComponents();
        runame=uname;
        booking=book_ref;
        String checkinbook=datein;
        String checkoutbook=dateout;
        this.setLocationRelativeTo(null);
        connect1=bookdb.dbconnect();
        connect2=bookdb.dbconnect();
        userrooms=rooms;
        hotelname_label.setText(hotelname);
        try {
            checkinbooked=new SimpleDateFormat("dd/MM/yyyy").parse(checkinbook);
            checkoutbooked=new SimpleDateFormat("dd/MM/yyyy").parse(checkoutbook);
        } catch (ParseException ex) {
            Logger.getLogger(modification.class.getName()).log(Level.SEVERE, null, ex);
        } 
        checkin.setText("Existing Check-In : "+checkinbook);
        checkout.setText("Existing Check-In : "+checkoutbook);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hotelname_label = new javax.swing.JLabel();
        checkin = new javax.swing.JLabel();
        checkout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        check_in = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        proceed = new javax.swing.JButton();
        back = new javax.swing.JButton();
        heading1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(151, 213, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Modify Booking");

        hotelname_label.setText("jLabel2");

        checkin.setText("Existing Check-In : ");

        checkout.setText("Existing Check-Out : ");

        jLabel2.setText("Select your new Check-In and Check-out Dates. Note that the ");

        jLabel3.setText("interval of stay is same as existing one.");

        check_in.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        check_in.setDateFormatString("dd-MM-yyyy");

        jLabel4.setText("New Check-In Date");

        jLabel6.setText("Note: You new Check-Out Date will be automatically selected based on your existing");

        jLabel7.setText("booking.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(checkin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkout)))
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(check_in, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel7)))
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(hotelname_label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkin)
                            .addComponent(checkout))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hotelname_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(check_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, 480, -1));

        proceed.setText("Proceed");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });
        getContentPane().add(proceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 334, 95, 25));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 334, 95, 25));

        heading1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        heading1.setForeground(new java.awt.Color(255, 255, 255));
        heading1.setText("BOOK MY HOTEL 2.0");
        heading1.setToolTipText("");
        getContentPane().add(heading1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 11, -1, 28));

        jLabel5.setIcon(new javax.swing.ImageIcon("I:\\Java\\OOP_Project\\Images\\signup1 - Copy - Copy.jpeg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        new login(runame).setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        boolean dob_flag=true;
        int bookedrooms=0;
        Date d2,d3;
        if(true){
        Date d1 = new Date();
        d2 = check_in.getDate();
        d3 = new Date(d2.getTime()+checkoutbooked.getTime()-checkinbooked.getTime());
            
        try {
            if(d2.before(d1)){
                dob_flag=false;
                JOptionPane.showMessageDialog(null, "Please see that your Check-in Date is ahead of today");
            }
        }
        catch(Exception e){
            dob_flag=false;
        JOptionPane.showMessageDialog(null, "Enter a Valid Date");
        }
        }
        
        
        if(dob_flag){
            
            String query1="select rooms,datein,dateout,Booking_Reference from booking where hotelname = ? and Status=?";
            String hotelname=hotelname_label.getText();
            PreparedStatement pst1=null;
            ResultSet rs1=null;
            boolean wait=true;
            try {try {
                Thread.sleep(700);
                } catch (InterruptedException ex) {
                    Logger.getLogger(modification.class.getName()).log(Level.SEVERE, null, ex);
                }
                pst1 = connect1.prepareStatement(query1);
                pst1.setString(1,hotelname);
                pst1.setString(2, "Confirm");
                
            } catch (SQLException ex) {
                System.out.println("Here");
                //Logger.getLogger(modification.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            }
            int roomsbooked;
            long interval = 24*1000 * 60 * 60; // 1 hour in millis
            long endTime =d3.getTime() ; // create your endtime here, possibly using Calendar or Date
            long curTime = d2.getTime();
    
            while (curTime <= endTime) {
                Date d1=new Date(curTime);
                roomsbooked=0;
            
                try {
                    rs1=pst1.executeQuery();
                    while(rs1.next()){
                        String check_indate=rs1.getString("datein");
                        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(check_indate);
                        //System.out.println("date1: "+date1);
                        String check_outdate=rs1.getString("dateout");
                        Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(check_outdate);
                        //System.out.println("date2: "+date2);
    if(((d1.before(date2)&&d1.after(date1))||((d1.getDate()==date2.getDate())&&(d1.getMonth()==date2.getMonth())&&(d1.getYear()==date2.getYear()))||((d1.getDate()==date1.getDate())&&(d1.getMonth()==date1.getMonth())&&(d1.getYear()==date1.getYear())))&&!booking.equals(rs1.getString("Booking_Reference"))){
                            //System.out.println("Entered");
        roomsbooked+=rs1.getInt("rooms");
    }
                    }//System.out.println(hotelname+" : "+d1+" : "+roomsbooked);
                
                }catch (Exception ex) {
                    Logger.getLogger(modification.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(roomsbooked+userrooms>10){
                    wait=false;
                    break;
                }
                curTime += interval;
            }
            try {
                pst1.close();
                rs1.close();
                connect1.close();
            } catch (SQLException ex) {
                Logger.getLogger(modification.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //System.out.println(wait);
            
            if(!wait){
                JOptionPane.showMessageDialog(null, "Currently "+String.valueOf(userrooms)+" rooms are not available for your selected Check-In Date. Try with another Check-In Date.");   
            }else{
                JOptionPane.showMessageDialog(null, "Modification Successful");
                
                String update = "UPDATE booking SET datein = ? , dateout = ? WHERE Booking_Reference = ? ";
                
                PreparedStatement st1=null;
                try {
                    st1 = connect2.prepareStatement(update);
                    st1.setString(1,String.valueOf(d2.getDate())+"/"+String.valueOf(d2.getMonth()+1)+"/"+String.valueOf(1900+d2.getYear()));
                    st1.setString(2,String.valueOf(d3.getDate())+"/"+String.valueOf(d3.getMonth()+1)+"/"+String.valueOf(1900+d3.getYear()));
                    st1.setString(3,booking);
                    
                    
                    st1.executeUpdate();
                    this.setVisible(false);
                    new login(runame,0).setVisible(true);
                    
                    
                } catch (SQLException ex) {
                    //Logger.getLogger(modification.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex.getMessage());
                } 
                
            }
            
        }  
    }//GEN-LAST:event_proceedActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;}}} catch (Exception ex) {}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private com.toedter.calendar.JDateChooser check_in;
    private javax.swing.JLabel checkin;
    private javax.swing.JLabel checkout;
    private javax.swing.JLabel heading1;
    private javax.swing.JLabel hotelname_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton proceed;
    // End of variables declaration//GEN-END:variables
}
