import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class login extends javax.swing.JFrame {
    int waiting_flag=0;
    String rname;
    String runame;
    int nrooms,index;
    int bookingprice;
    Connection connect =null;
    Connection connect1 =null;
    Connection connect2=null;
    public login(String uname,int x){
        initComponents();
        waiting_flag=x;
        runame=uname;
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(search_button);
        connect=dbm.dbconnect();
        connect1=bookdb.dbconnect();
        connect2=hotel.dbconnect();
        String query2="select NAME from guests where USERNAME=?";
        try {
            PreparedStatement ps1 = connect.prepareStatement(query2);
            ps1.setString(1, uname);
            ResultSet rs1=ps1.executeQuery();
            rname=rs1.getString("name");
            hi_name.setText("Hi, "+rname);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }     
    updateTable();
        
    
    }
    public login(String uname) {
        initComponents();
        runame=uname;
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(search_button);
        connect=dbm.dbconnect();
        connect1=bookdb.dbconnect();
        connect2=hotel.dbconnect();
        String query2="select NAME from guests where USERNAME=?";
        try {
            PreparedStatement ps1 = connect.prepareStatement(query2);
            ps1.setString(1, uname);
            ResultSet rs1=ps1.executeQuery();
            rname=rs1.getString("name");
            hi_name.setText("Hi, "+rname);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }     
    updateTable();
        
    }
    public void updateTable(){
    String sql="select Booking_Reference,hotelname,datein,dateout,rooms,Status from booking where username=?";
        try {
            PreparedStatement smt=connect1.prepareStatement(sql);
            smt.setString(1, runame);
            ResultSet rs=smt.executeQuery();
            
            booking_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
             JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    public login(String runame,String rname,int x) {
        initComponents();
        this.setLocationRelativeTo(null);
        hi_name.setText("Hi, "+rname);
        connect1=bookdb.dbconnect();
        updateTable();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        booking_table = new javax.swing.JTable();
        cancel_button = new javax.swing.JButton();
        modify_button = new javax.swing.JButton();
        heading = new javax.swing.JLabel();
        hi_name = new javax.swing.JLabel();
        logout_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        location_dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Bangalore", "Kolkata", "Hyderabad", "Mumbai" }));
        location_dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                location_dropdownActionPerformed(evt);
            }
        });

        txt_check_in.setDateFormatString("dd-MM-yyyy");

        txt_check_out.setDateFormatString("dd-MM-yyyy");

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
                        .addContainerGap()
                        .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(location_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(rooms)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_rooms))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(check_in)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_check_in, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(check_out)
                                .addGap(18, 18, 18)
                                .addComponent(txt_check_out, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(guests)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_guests, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(search_button)
                .addGap(195, 195, 195))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(search_button)
                .addContainerGap())
        );

        bookings.addTab("New Booking", jPanel1);

        booking_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(booking_table);

        jScrollPane2.setViewportView(jScrollPane1);

        cancel_button.setText("Cancel Booking");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        modify_button.setText("Modify Booking");
        modify_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modify_button, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_button)
                    .addComponent(modify_button))
                .addGap(0, 13, Short.MAX_VALUE))
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
                            .addComponent(bookings)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hi_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(bookings, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        boolean dob_flag=true,room=true,waiting1=true,waiting2=true,waiting3=true;
        try{
        //String sql = "select hotelname,Address,Price,Ratings,numofratings,Amenities, from hotel";
        String query ="select * from hotel where CITY = ?";
        String query1="select rooms,datein,dateout from booking where hotelname = ? and Status=?";
        PreparedStatement pst = connect2.prepareStatement(query);
        PreparedStatement pst1 = connect1.prepareStatement(query1);
        
        String city = null;
        switch(location_dropdown.getSelectedIndex()){case 0:
                city ="Delhi";
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
                break;}
        pst.setString(1,city);
        
        ResultSet rs=pst.executeQuery();
        int count=0;
        String hotelname=null;
        
        int roomsbooked;
        long interval = 24*1000 * 60 * 60; // 1 hour in millis
        long endTime =txt_check_out.getDate().getTime() ; // create your endtime here, possibly using Calendar or Date
        long curTime = txt_check_in.getDate().getTime();
        String name1=null,name2=null,name3=null;
        for(int i=0;i<3;i++,rs.next()){
            count++;
            hotelname = rs.getString("hotelname");
        if(count==1)
            name1=hotelname;
        if(count==2)
            name2=hotelname;
        if(count==3)
            name3=hotelname;
        }
    
        while (curTime <= endTime) {
            Date d1=new Date(curTime);
            roomsbooked=0;
            pst1.setString(1, name1);
            pst1.setString(2, "Confirm");
            ResultSet rs1=pst1.executeQuery();
            while(rs1.next()){
               String check_indate=rs.getString("datein");  
               Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(check_indate);
               String check_outdate=rs.getString("dateout");  
               Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(check_outdate);
             if(d1.before(date2)||d1.after(date1)){
                 roomsbooked+=rs.getInt("rooms");
             }
            }
            if(roomsbooked+Integer.parseInt(txt_rooms.getText())>10){
            waiting1=false;
            break;
            }
            curTime += interval;
        }
        while (curTime <= endTime) {
            Date d1=new Date(curTime);
            roomsbooked=0;
            pst1.setString(1, name1);
            ResultSet rs1=pst1.executeQuery();
            while(rs1.next()){
               String check_indate=rs.getString("datein");  
               Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(check_indate);
               String check_outdate=rs.getString("dateout");  
               Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(check_outdate);
             if(d1.before(date2)||d1.after(date1)){
                 roomsbooked+=rs.getInt("rooms");
             }
            }
            if(roomsbooked+Integer.parseInt(txt_rooms.getText())>10){
            waiting2=false;
            break;
            }
            curTime += interval;
        }
        while (curTime <= endTime) {
            Date d1=new Date(curTime);
            roomsbooked=0;
            pst1.setString(1, name1);
            ResultSet rs1=pst1.executeQuery();
            while(rs1.next()){
               String check_indate=rs.getString("datein");  
               Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(check_indate);
               String check_outdate=rs.getString("dateout");  
               Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(check_outdate);
             if(d1.before(date2)||d1.after(date1)){
                 roomsbooked+=rs.getInt("rooms");
             }
            }
            if(roomsbooked+Integer.parseInt(txt_rooms.getText())>10){
            waiting3=false;
            break;
            }
            curTime += interval;
        }
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        
    } 
        if(waiting_flag==1){
            waiting1=true;
            waiting2=true;
            waiting3=true;
        }

        if(waiting1||waiting2||waiting3)
        {
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
        new hotels_search(runame,rname,location_dropdown.getSelectedIndex(),txt_check_in.getDate(),txt_check_out.getDate(),Integer.parseInt(txt_rooms.getText()),waiting1,waiting2,waiting3,waiting_flag).setVisible(true);
        }
        }
        
        
        else{
            this.setVisible(false);
        new waiting(runame,txt_rooms.getText()).setVisible(true);
        }
    }//GEN-LAST:event_search_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        int column = 1;
        int row =booking_table.getSelectedRow();
        int column1 = 1;
        boolean check=true;
        String value = booking_table.getModel().getValueAt(row, column).toString();
        String hotel_name_del = booking_table.getModel().getValueAt(row, column1).toString();
        /*
          *Replace hotelname with booking reference      
        */
        String sql="select datein,Price from booking where hotelname = ?";
        PreparedStatement ps;
        try {
            ps = connect1.prepareStatement(sql);
            ps.setString(1, value);
            ResultSet rs=ps.executeQuery();
            String checkin=rs.getString("datein");
            bookingprice=rs.getInt("Price");
            Date d1=new Date();
            String todaycheck=String.valueOf(d1.getDate()+2)+"/"+String.valueOf(d1.getMonth())+"/"+String.valueOf(1900+d1.getYear());
        if(checkin.equals(todaycheck)){
        check=false;
        }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(!check){
        JOptionPane.showMessageDialog(null, "Since less than 3 days are remaining before your specified check in date, you are liable to pay Rs."+String.valueOf(Math.round(bookingprice/2)));
        }
        else{
        /*
          *Replace hotelname with booking reference      
        */
        String sql1 = "delete from booking where hotelname = ?";
 
        try {
            PreparedStatement pstmt = connect1.prepareStatement(sql1); 
            pstmt.setString(1, value);
            if(JOptionPane.showConfirmDialog(null, "Are you sure?",null, JOptionPane.YES_NO_OPTION)==0){
                pstmt.executeUpdate();
                updateTable();
            }
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
          
        }
        
        
        
        
        
        boolean wait=true;
        try{
        //String sql = "select hotelname,Address,Price,Ratings,numofratings,Amenities, from hotel";
        String query1="select rooms,datein,dateout,Booking_Reference from booking where hotelname = ? and Status=?";
        String query2="select rooms,datein,dateout from booking where hotelname = ? and Status=?";
        PreparedStatement pst1 = connect1.prepareStatement(query1);
        pst1.setString(1, hotel_name_del);
        pst1.setString(2, "Waiting");
        PreparedStatement pst2 = connect1.prepareStatement(query2);
        pst1.setString(1, hotel_name_del);
        pst1.setString(2, "Confirm");
        pst2.setString(1, hotel_name_del);
        ResultSet rs1=pst1.executeQuery();
        int count=0;
        String book_ref=null;
        
        while(rs1.next()){
        int roomsbooked;
        long interval = 24*1000 * 60 * 60; // 1 hour in millis
        String check_indate1=rs1.getString("datein");  
            Date date11=new SimpleDateFormat("dd/MM/yyyy").parse(check_indate1);
        String check_indate2=rs1.getString("dateout");  
            Date date22=new SimpleDateFormat("dd/MM/yyyy").parse(check_indate2);
        book_ref=rs1.getString("Booking_Reference");
        
        long endTime =date11.getTime() ; // create your endtime here, possibly using Calendar or Date
        long curTime = date22.getTime();
        
         
        while (curTime <= endTime) {
            ResultSet rs2=pst2.executeQuery();
            Date d1=new Date(curTime);
            roomsbooked=0;
            
            
            while(rs2.next()){
               String check_indate=rs2.getString("datein");  
               Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(check_indate);
               String check_outdate=rs2.getString("dateout");  
               Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(check_outdate);
             if(d1.before(date2)||d1.after(date1)){
                 roomsbooked+=rs2.getInt("rooms");
             }
            }
            
            if(roomsbooked+Integer.parseInt(txt_rooms.getText())>10){
                wait=false;
                break;
            }
            curTime += interval;
        }
        if(wait){
        String update = "UPDATE booking SET Status = ? WHERE Booking_Reference = ?";
                PreparedStatement st1=connect1.prepareStatement(update);
                st1.setString(1, "Confirm");
                st1.setString(2, book_ref);
                st1.executeUpdate();
        }
        
        
        }
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        
    }   
        
        
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void modify_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify_buttonActionPerformed
        int column = 1;
        int row =booking_table.getSelectedRow();
        boolean check=true;
        String value = booking_table.getModel().getValueAt(row, column).toString();
        /*
          *Replace hotelname with booking reference      
        */
        String sql="select datein from booking where hotelname = ?";
        PreparedStatement ps;
        try {
            ps = connect1.prepareStatement(sql);
            ps.setString(1, value);
            ResultSet rs=ps.executeQuery();
            String checkin=rs.getString("datein");
            Date d1=new Date();
            String todaycheck=String.valueOf(d1.getDate()+2)+"/"+String.valueOf(d1.getMonth())+"/"+String.valueOf(1900+d1.getYear());
        if(checkin.equals(todaycheck)){
        check=false;
        }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(!check){
        JOptionPane.showMessageDialog(null, "Sorry! We allow modification only up to 3 days before the specified check in date.");
        }
        else{
        this.setVisible(false);
        new modification(runame,value).setVisible(true);
        }
    }//GEN-LAST:event_modify_buttonActionPerformed

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
    private javax.swing.JTable booking_table;
    private javax.swing.JTabbedPane bookings;
    private javax.swing.JButton cancel_button;
    private javax.swing.JLabel check_in;
    private javax.swing.JLabel check_out;
    private javax.swing.JLabel guests;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel hi_name;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel location;
    private javax.swing.JComboBox<String> location_dropdown;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton modify_button;
    private javax.swing.JLabel rooms;
    private javax.swing.JButton search_button;
    private com.toedter.calendar.JDateChooser txt_check_in;
    private com.toedter.calendar.JDateChooser txt_check_out;
    private javax.swing.JTextField txt_guests;
    private javax.swing.JTextField txt_rooms;
    // End of variables declaration//GEN-END:variables
}