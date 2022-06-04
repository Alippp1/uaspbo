/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;
import object.*;
import insert_form.*;
import javax.swing.JFrame;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import login.KoneksiDB;
/**
 *
 * @author Virtual S4
 */
public class CRUD_Table extends javax.swing.JFrame {

    /**
     * Creates new form crud_tabel
     */
    private String tipe;
    private Connection conn;
    
    
    private void initDatabase(){
        try{
        conn = (Connection)KoneksiDB.configDB();
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    
    public CRUD_Table() {
        initComponents();
        initDatabase();
        this.setLocationRelativeTo(null);
        tipe = "Mobil";
        lbl_judul.setText("Tabel "+tipe);
        
        
        fillTable(tipe);
        
    }
    
    public CRUD_Table(String tipe) {
        initComponents();
        initDatabase();
        this.setLocationRelativeTo(null);
        
        lbl_judul.setText("Tabel "+tipe);
        this.tipe = tipe;
        
        fillTable(tipe);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_judul = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_crud = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_judul.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_judul.setText("Tabel Mobil");
        jPanel2.add(lbl_judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        tbl_crud.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_crud);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 780, 340));

        btn_add.setBackground(new java.awt.Color(153, 255, 153));
        btn_add.setText("Add");
        btn_add.setBorderPainted(false);
        btn_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel2.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 80, -1));

        btn_edit.setBackground(new java.awt.Color(255, 255, 255));
        btn_edit.setForeground(new java.awt.Color(102, 102, 255));
        btn_edit.setText("Edit");
        btn_edit.setBorderPainted(false);
        btn_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel2.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 80, -1));

        btn_delete.setBackground(new java.awt.Color(255, 102, 102));
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Remove");
        btn_delete.setBorderPainted(false);
        btn_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 930, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        
        if(tipe.equals("Mobil")){
            Form_Mobil formbaru = new Form_Mobil();
            formbaru.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            formbaru.setLocationRelativeTo(null);
            formbaru.setVisible(true);
            
        }else if(tipe.equals("Supir")){
            Form_Supir formbaru = new Form_Supir();
            formbaru.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            formbaru.setLocationRelativeTo(null);
            formbaru.setVisible(true);
            
        }else if(tipe.equals("Penyewa")){
            Form_Penyewa formbaru = new Form_Penyewa();
            formbaru.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            formbaru.setLocationRelativeTo(null);
            formbaru.setVisible(true);
            
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        
        int row = tbl_crud.getSelectedRow();
        String id = tbl_crud.getValueAt(row, 1).toString();
        id = id.substring(6);
        
        if(tipe.equals("Mobil")){
            Form_Mobil formbaru = new Form_Mobil(id);
            formbaru.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            formbaru.setLocationRelativeTo(null);
            formbaru.setVisible(true);
            
        }else if(tipe.equals("Supir")){
            Form_Supir formbaru = new Form_Supir();
            formbaru.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            formbaru.setLocationRelativeTo(null);
            formbaru.setVisible(true);
            
        }else if(tipe.equals("Penyewa")){
            Form_Penyewa formbaru = new Form_Penyewa();
            formbaru.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            formbaru.setLocationRelativeTo(null);
            formbaru.setVisible(true);
            
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void fillTable(String tipe){
        
        if(tipe.equals("Mobil")){
            
            DefaultTableModel dtm = new DefaultTableModel();
            tbl_crud.setModel(dtm);
            
            dtm.addColumn("No. ");
            dtm.addColumn("ID Mobil");
            dtm.addColumn("Nopol");
            dtm.addColumn("Model");
            dtm.addColumn("Jumlah Penumpang");
            dtm.addColumn("Bahan Bakar");
            dtm.addColumn("Transmisi");
            dtm.addColumn("Harga Sewa");
            dtm.addColumn("Status");
            
            tbl_crud.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbl_crud.getColumnModel().getColumn(1).setPreferredWidth(30);
            tbl_crud.getColumnModel().getColumn(2).setPreferredWidth(30);
            
            ArrayList<Mobil> list = new ArrayList();
            list = getAllMobil();
            
            for(int i = 0;i<list.size();i++){
                Mobil mobil = list.get(i);
                dtm.addRow(new Object[]{i+1,"MBL 00"+mobil.getId_mobil(),mobil.getNopol(),mobil.getModel(),mobil.getJml_penumpang(),mobil.getBBM(),mobil.getTransmisi(),mobil.getHarga_sewa(),mobil.getStatus()});
            }
            list.clear();
            
        }else if(tipe.equals("Supir")){
            
        }else if(tipe.equals("Penyewa")){
            
        }
        
    }
    
    private ArrayList<Mobil> getAllMobil(){
        ArrayList<Mobil> list_mobil = new ArrayList();
        try{
            Statement state = conn.createStatement();
            String query = "Select * from mobil";
            ResultSet rs = state.executeQuery(query);
            
            while(rs.next()){
                Mobil mobilbaru = new Mobil();
                
                mobilbaru.setId_mobil(rs.getInt("id_mobil"));
                mobilbaru.setNopol(rs.getString("nopol"));
                mobilbaru.setModel(rs.getString("model"));
                mobilbaru.setJml_penumpang(rs.getInt("jml_penumpang"));
                mobilbaru.setBBM(rs.getString("BBM"));
                mobilbaru.setHarga_sewa(rs.getInt("harga_sewa"));
                mobilbaru.setStatus(rs.getString("status"));
                mobilbaru.setTransmisi(rs.getString("transmisi"));
                
                list_mobil.add(mobilbaru);
            
            }
            state.close();
            rs.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
        
        
        return list_mobil;
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRUD_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_judul;
    private javax.swing.JTable tbl_crud;
    // End of variables declaration//GEN-END:variables
}
