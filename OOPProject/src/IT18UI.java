
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class IT18UI extends javax.swing.JFrame {

    /**
     * Creates new form IT18UI
     */
    public IT18UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("No.");

        jLabel2.setText("ID");

        jLabel3.setText("FirstName and LastName");

        jLabel4.setText("Nickname");

        jLabel5.setText("Facebook");

        jLabel6.setText("IG");

        jLabel7.setText("IDLine");

        jLabel8.setText("Contact");

        jLabel9.setText("No.");

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel10.setText("-");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("SEARCH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("REARCH");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("แสดงข้อมูลTI18ภาคปกทุกคน");

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField11CaretUpdate(evt);
            }
        });
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton2))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jTextField7)
                            .addComponent(jTextField6)
                            .addComponent(jTextField5)
                            .addComponent(jTextField4)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)
                            .addComponent(jTextField3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(201, 201, 201)
                        .addComponent(jButton3)))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5))
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 237, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
Connection conn = null;
try {
    String url = "jdbc:sqlite:oat.db"; //เปลี่ยนชื่อฐานข้อมูลเป็น oopproject.db
    conn = DriverManager.getConnection(url);
    JOptionPane.showMessageDialog(null, "Connection Success");

    //รับ input user
    int no = Integer.parseInt(jTextField1.getText());
    int id = Integer.parseInt(jTextField2.getText());
    String firstNameandLastName = jTextField3.getText();
    String nickname = jTextField4.getText();
    String facebook = jTextField5.getText();
    String ig = jTextField6.getText();
    String idline = jTextField7.getText();
    String Contact = jTextField8.getText(); // แก้ชื่อตัวแปรจาก jTextField7 เป็น jTextField8

    IT18 i = new IT18(no, id, firstNameandLastName, nickname, facebook, ig, idline, Contact); // แก้จาก r เป็น It18s

    try {
        //สร้าง sql
        String sql = "INSERT INTO "
                + " IT18 "
                + " VALUES (?, ?, ?, ?, ?, ?, ?,?) "; // เพิ่ม ? ใน VALUES เพื่อให้ตรงกับจำนวน column
        //สร้างตัวส่ง sql
        PreparedStatement stmt = conn.prepareStatement(sql);
        //เติมค่า ? ใน sql
        stmt.setInt(1, i.getNo()); // เปลี่ยนจาก r.getId() เป็น It18s.getNo()
        stmt.setInt(2, i.getID()); // เปลี่ยนจาก r.getName() เป็น It18s.getID()
        stmt.setString(3, i.getFirstNameandLastName()); // เปลี่ยนจาก r.getCityname() เป็น It18s.getFirstNameandLastName()
        stmt.setString(4, i.getNickname()); 
        stmt.setString(5, i.getFacebook()); 
        stmt.setString(6, i.getIG());
        stmt.setString(7, i.getIDLine());
        stmt.setString(8, i.getContact());

        stmt.executeUpdate(); //ส่ง SQL ไปยังฐานข้อมูล
        JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลสำเร็จ");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
    } finally {
        try {
            if (conn != null) {
                conn.close(); // ตรวจสอบและปิดการเชื่อมต่อกับฐานข้อมูล
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
}



    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Connection conn = null;
try {
    String url = "jdbc:sqlite:oat.db"; // เปลี่ยนชื่อฐานข้อมูลเป็น oat.db
    conn = DriverManager.getConnection(url);
    JOptionPane.showMessageDialog(null, "Connection Success");

    // รับ input user
    int no = Integer.parseInt(jTextField1.getText());
    int id = Integer.parseInt(jTextField2.getText());
    String firstNameandLastName = jTextField3.getText();
    String nickname = jTextField4.getText();
    String facebook = jTextField5.getText();
    String ig = jTextField6.getText();
    String idline = jTextField7.getText();
    String contact = jTextField8.getText(); // แก้ชื่อตัวแปรจาก jTextField7 เป็น jTextField8

    IT18 i = new IT18(no, id, firstNameandLastName, nickname, facebook, ig, idline, contact); // แก้จาก r เป็น i
    try {
        // นิยาม SQL UPDATE ที่ถูกต้อง
        String sql = "UPDATE IT18 "
                   + "SET ID = ?, "
                   + "    FirstNameandLastName = ?, "
                   + "    nickname = ?, "
                   + "    Facebook = ?, "
                   + "    IG = ?, "
                   + "    IDLine = ?, "
                   + "    Contact = ? "
                   + "WHERE no = ? ";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, i.getID());
        stmt.setString(2, i.getFirstNameandLastName());
        stmt.setString(3, i.getNickname());
        stmt.setString(4, i.getFacebook());
        stmt.setString(5, i.getIG());
        stmt.setString(6, i.getIDLine());
        stmt.setString(7, i.getContact());
        stmt.setInt(8, i.getNo());

        stmt.executeUpdate(); // ส่ง SQL ไปยังฐานข้อมูล
        JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลสำเร็จ");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
             // TODO add your handling code here:
         Connection conn = null;
        try {
            String url = "jdbc:sqlite:oat.db"; //กำหนด url ของฐานข้อมูล
            conn = DriverManager.getConnection(url);
            JOptionPane.showMessageDialog(null, "Connection Sucess");
            
            int no =  Integer.parseInt(jTextField1.getText());
            
            String sql = "DELETE FROM IT18 WHERE no = ?"; //นิยาม SQL
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, no);
            
            stmt.execute();//ส่ง SQL
            JOptionPane.showMessageDialog(null, "DELETE Sucess");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
//กำหนดให้ table ui มีคอลัมตามโจทย์
//เซตค่า TableModel:
String col[] = {"No", "ID", "FirstName and LastName", "Nickname", "Facebook", "IG", "IDLine", "Contact"};
//กำหนดวิธีแสดงผลแต่ละคอลัมในตาราง
Class[] column_types = {Integer.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class};
DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
    @Override
    public Class<?> getColumnClass(int column) {
        try {
            return column_types[column];
        } catch (Exception e) {
            e.printStackTrace();
            return Object.class;
        }
    }
};

//ลิ้ง tableModel กับ jTable1
jTable1.setModel(tableModel);
jTable1.setRowHeight(80);
jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);

//ติดต่อฐานข้อมูล
Connection conn = null;
try {
    String url = "jdbc:sqlite:oat.db"; //กำหนด url ของฐานข้อมูล
    conn = DriverManager.getConnection(url);
    JOptionPane.showMessageDialog(null, "Connection Success");
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
}

try {
    //รับ input จาก user สร้างคิวรีและส่งไปที่ฐานข้อมูล
    int minNo = Integer.parseInt(jTextField9.getText());
    int maxNo = Integer.parseInt(jTextField10.getText());

    String sql = "SELECT * FROM IT18 WHERE no BETWEEN ? AND ?";
    PreparedStatement stmt = conn.prepareStatement(sql);
    stmt.setInt(1, minNo);
    stmt.setInt(2, maxNo);

    ResultSet rs = stmt.executeQuery();
    //วนลูป ResultSet สร้างแถวแล้วเติม tableModel
    while (rs.next()) {
        //อ่านข้อมูลแถวปัจจุบัน
        int c1 = rs.getInt("no");
        int c2 = rs.getInt("ID");
        String c3 = rs.getString("FirstNameandLastName");
        String c4 = rs.getString("nickname");
        String c5 = rs.getString("Facebook");
        String c6 = rs.getString("IG");
        String c7 = rs.getString("IDLine");
        String c8 = rs.getString("Contact");

        //สร้างอ็อบเจกต์ IT18 จากข้อมูลที่ได้
        IT18 i = new IT18(c1, c2, c3, c4, c5, c6, c7, c8);

        //สร้าง row
        Object[] row = {c1, c2, c3, c4, c5, c6, c7, c8};
        //เพิ่มเข้าไปใน TableModel
        tableModel.addRow(row);
    }

    JOptionPane.showMessageDialog(null, "Select Success");
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
}

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jLabel10.setText("");
        jLabel10.setIcon(null);
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField11CaretUpdate
//กำหนดให้ table ui มีคอลัมตามโจทย์
//เซตค่า TableModel:
String col[] = {"No", "ID", "FirstName and LastName", "Nickname", "Facebook", "IG", "IDLine", "Contact"};
//กำหนดวิธีแสดงผลแต่ละคอลัมในตาราง
Class[] column_types = {Integer.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class};
DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
    @Override
    public Class<?> getColumnClass(int column) {
        try {
            return column_types[column];
        } catch (Exception e) {
            e.printStackTrace();
            return Object.class;
        }
    }
};

//ลิ้ง tableModel กับ jTable1
jTable1.setModel(tableModel);
jTable1.setRowHeight(80);
jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);

//ติดต่อฐานข้อมูล 
Connection conn = null;
try {
    String url = "jdbc:sqlite:oat.db"; //กำหนด url ของฐานข้อมูล
    conn = DriverManager.getConnection(url);
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
}

try {
    //รับ input จาก user สร้างคิวรี และส่งไปที่ฐานข้อมูล 
    String search_string = jTextField11.getText();

    String sql = "SELECT * FROM IT18 "
            + " WHERE  no LIKE ? "
            + "    OR  ID LIKE ? "
            + "    OR  FirstNameandLastName LIKE ? "
            + "    OR  nickname LIKE ? "
            + "    OR  Facebook LIKE ? "
            + "    OR  IG LIKE ? "      
            + "    OR  IDLine LIKE ? "    
            + "    OR  Contact LIKE ? ";
    PreparedStatement stmt = conn.prepareStatement(sql);
    // ใช้เครื่องหมาย % ใน SQL เพื่อให้ค้นหาข้อมูลที่มีคำที่ตรงกันบางส่วน
    for (int i = 1; i <= 8; i++) {
        stmt.setString(i, "%" + search_string + "%");
    }

    ResultSet rs = stmt.executeQuery();
    // ลบข้อมูลที่มีอยู่ในตารางก่อนที่จะเพิ่มข้อมูลใหม่
    tableModel.setRowCount(0);
    // วนลูป ResultSet สร้างแถวแล้วเติม tableModel
    while (rs.next()) {
        // อ่านข้อมูลแถวปัจจุบัน
        int c1 = rs.getInt("no");
        int c2 = rs.getInt("ID");
        String c3 = rs.getString("FirstNameandLastName");
        String c4 = rs.getString("nickname");
        String c5 = rs.getString("Facebook");
        String c6 = rs.getString("IG");
        String c7 = rs.getString("IDLine");
        String c8 = rs.getString("Contact");

        // สร้างอ็อบเจกต์ IT18 จากข้อมูลที่ได้
        IT18 i = new IT18(c1, c2, c3, c4, c5, c6, c7, c8);

        // สร้างแถว
        Object[] row = {c1, c2, c3, c4, c5, c6, c7, c8};
        // เพิ่มแถวเข้าไปใน TableModel
        tableModel.addRow(row);
    }

    // JOptionPane.showMessageDialog(null,"Select Sucess");
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
}

    }//GEN-LAST:event_jTextField11CaretUpdate

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

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
            java.util.logging.Logger.getLogger(IT18UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IT18UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IT18UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IT18UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IT18UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
