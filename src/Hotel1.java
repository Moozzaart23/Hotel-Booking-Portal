
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Hotel1 extends javax.swing.JFrame {

   static Connection connect = null;
   Date d11,d22;
   int index,nrooms;
   String hotelname1;
   String rname;
   int totprice,waiting_flag;
   String runame;
   boolean w1,w2,w3;
    public Hotel1(String uname,String xname,String namehotel,int ind,Date d1,Date d2,int rooms,boolean waiting1,boolean waiting2,boolean waiting3,int wf) {
        d11=d1;
        d22=d2;
        runame=uname;
        rname=xname;
        waiting_flag=wf;
        hotelname1=namehotel;
        nrooms=rooms;
        index=ind;
        w1=waiting1;
       w2=waiting2;
       w3=waiting3;
       int days=d2.getDate()-d1.getDate();
        initComponents();
        try{
       image.setIcon(new ImageIcon("I:\\Java\\OOP_Project\\Images\\Hotels\\"+namehotel+".jpg"));
       }
       catch(Exception q){
           System.out.println(namehotel);
           System.out.println(q.getMessage());
       }
        connect = hotel.dbconnect();
        this.setLocationRelativeTo(null);
        try{
        //String sql = "select hotelname,Address,Price,Ratings,numofratings,Amenities, from hotel";
        String query ="select * from hotel where hotelname = ? ";
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setString(1,namehotel);
        ResultSet rs=pst.executeQuery();
        while(rs.next()){
              String hotelname = rs.getString("hotelname");
              String Address = rs.getString("Address");
              String Price = rs.getString("Price");
              String Ratings = rs.getString("Ratings");
              String numofratings = rs.getString("numofratings");
              String Amenities = rs.getString("Amenities");
              hotelnamelabel.setText("Hotel "+hotelname);
              pricelabel.setText("Rs. "+String.valueOf(Integer.parseInt(Price)*rooms)+" - Price for "+rooms+" rooms per night");
              pricetot.setText("Rs. "+String.valueOf(rooms*days*Integer.parseInt(Price))+" - Total Price for " +String.valueOf(days)+ " nights");
              totprice=rooms*days*Integer.parseInt(Price);
              numofrev.setText("No. of people rated: "+numofratings);
              addresslabel.setText(Address);
              ratingslabel.setText(Ratings+"/5");
              amenities.setText(Amenities);
}
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);

    } }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hotelnamelabel = new javax.swing.JLabel();
        addresslabel = new javax.swing.JLabel();
        pricelabel = new javax.swing.JLabel();
        pricetot = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numofrev = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        ratingslabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        amenities = new javax.swing.JTextArea();
        image = new javax.swing.JLabel();
        heading1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(570, 465));
        setMinimumSize(new java.awt.Dimension(570, 465));
        setPreferredSize(new java.awt.Dimension(570, 465));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(151, 213, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        hotelnamelabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        hotelnamelabel.setText("HOTEL XYZ");

        addresslabel.setText("GB Road, New Delhi");

        pricelabel.setText("Rs.       - Price per night");

        pricetot.setText("Rs.       - Price for y night");

        jLabel6.setText("Ratings    ");

        numofrev.setText("Reviewed by ");

        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Amenities Offered");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        ratingslabel.setText("jLabel1");

        amenities.setEditable(false);
        amenities.setColumns(20);
        amenities.setRows(5);
        jScrollPane1.setViewportView(amenities);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hotelnamelabel)
                            .addComponent(addresslabel)
                            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numofrev)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ratingslabel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pricetot)
                            .addComponent(pricelabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(hotelnamelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addresslabel)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pricelabel)
                        .addGap(41, 41, 41)
                        .addComponent(pricetot))
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ratingslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numofrev)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 55, 554, 393);

        heading1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        heading1.setForeground(new java.awt.Color(255, 255, 255));
        heading1.setText("BOOK MY HOTEL 2.0");
        heading1.setToolTipText("");
        getContentPane().add(heading1);
        heading1.setBounds(130, 10, 320, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon("I:\\Java\\OOP_Project\\Images\\Login_page\\2.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 570, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new booking(runame,rname,hotelname1,index,d11,d22,nrooms,totprice,w1,w2,w3,waiting_flag).setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        new hotels_search(runame,rname,index,d11,d22,nrooms,w1,w2,w3,waiting_flag).setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addresslabel;
    private javax.swing.JTextArea amenities;
    private javax.swing.JButton back;
    private javax.swing.JLabel heading1;
    private javax.swing.JLabel hotelnamelabel;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel numofrev;
    private javax.swing.JLabel pricelabel;
    private javax.swing.JLabel pricetot;
    private javax.swing.JLabel ratingslabel;
    // End of variables declaration//GEN-END:variables
}
