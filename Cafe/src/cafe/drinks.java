/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe;
import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 *
 * @author Anuj
 */
public class drinks extends javax.swing.JFrame {

    /**
     * Creates new form drinks
     */
    public drinks() {
        initComponents();
    }
    public void init(){
        
    }
    public void reset(){
        jSpinner13.setValue(0);
        jSpinner14.setValue(0);
        jSpinner15.setValue(0);
        jSpinner18.setValue(0);
        jSpinner17.setValue(0);
        jSpinner16.setValue(0);
       
       
        
    }
    public void zero(){
        if(Integer.parseInt(jSpinner13.getValue().toString())==0){
            JOptionPane.showMessageDialog(null,"Please Increase The Item Quantity");
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSpinner13 = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        jSpinner16 = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jSpinner14 = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        jSpinner17 = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        jSpinner15 = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        jSpinner18 = new javax.swing.JSpinner();
        btnCheckout3 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        btnReset1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("Palace Script MT", 1, 36)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 60));

        jLabel2.setFont(new java.awt.Font("Palace Script MT", 0, 150)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("La Ratatouille");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 620, 130));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anuj\\Downloads\\DigitalImagingProduct.jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, 240, 240));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anuj\\Downloads\\TastyBananaChocolateSmoothie.jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 240, 240));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anuj\\Downloads\\CoffeeAestheticIdeastoCreatethePerfectMorningVibeatHomeStartyourdaywithacozycoffee.jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anuj\\Downloads\\MasalaChai_HowtomakeChaiMasalaforMasalaTea.jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 240, 240));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anuj\\Downloads\\Mandarin.jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anuj\\Downloads\\CocaCola.jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 240, 240));

        jLabel8.setFont(new java.awt.Font("STKaiti", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Smoothie");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 150, 30));

        jLabel9.setFont(new java.awt.Font("STKaiti", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Masala Tea");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 180, 30));

        jLabel11.setFont(new java.awt.Font("STKaiti", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Coffee");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 150, 110, 30));

        jLabel12.setFont(new java.awt.Font("STKaiti", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Coke");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 90, 50));

        jLabel13.setFont(new java.awt.Font("STKaiti", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Juice");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 90, 40));

        jLabel14.setFont(new java.awt.Font("STKaiti", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sprite");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 440, 100, 50));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 180, 110, 10));

        jPanel3.add(jPanel13);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 120, 10));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 170, 10));
        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 170, 10));
        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 150, 10));

        jPanel14.add(jPanel15);

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 490, 120, 10));

        jPanel16.add(jPanel17);

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 120, 10));

        jLabel16.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Price : Rs 20");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, -1, -1));

        jLabel15.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Price : Rs 60");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        jLabel18.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Price : Rs 40");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 190, -1, -1));

        jLabel17.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Price : Rs 45");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, -1));

        jLabel19.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Price : Rs 45");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 500, -1, -1));

        jLabel20.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Price : Rs 50");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, -1, -1));

        jLabel21.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Quantity : ");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        getContentPane().add(jSpinner13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 50, 30));

        jLabel23.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Quantity :");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, -1, -1));

        jSpinner16.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        getContentPane().add(jSpinner16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 50, 30));

        jLabel22.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Quantity :");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        getContentPane().add(jSpinner14, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 50, 30));

        jLabel24.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Quantity :");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, -1, -1));

        jSpinner17.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        getContentPane().add(jSpinner17, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 50, 30));

        jLabel25.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Quantity :");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 240, 110, -1));

        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        getContentPane().add(jSpinner15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 240, 50, 30));

        jLabel26.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Quantity :");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 550, -1, -1));

        jSpinner18.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        getContentPane().add(jSpinner18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 550, 50, 30));

        btnCheckout3.setFont(new java.awt.Font("Palace Script MT", 1, 36)); // NOI18N
        btnCheckout3.setText("Checkout");
        btnCheckout3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckout3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCheckout3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 130, 60));

        jLabel32.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Purchase :");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jLabel28.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Purchase :");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, -1, -1));

        jLabel27.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Purchase :");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, -1, -1));

        jLabel30.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Purchase :");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, -1, -1));

        jLabel31.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Purchase :");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 600, -1, -1));

        jLabel29.setFont(new java.awt.Font("STKaiti", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Purchase :");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 310, -1, -1));

        jCheckBox16.setMaximumSize(new java.awt.Dimension(40, 40));
        getContentPane().add(jCheckBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 20, 20));

        jCheckBox14.setMaximumSize(new java.awt.Dimension(40, 40));
        getContentPane().add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 20, 20));

        jCheckBox15.setMaximumSize(new java.awt.Dimension(40, 40));
        getContentPane().add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 320, 20, 20));

        jCheckBox17.setMaximumSize(new java.awt.Dimension(40, 40));
        getContentPane().add(jCheckBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 20, 20));

        jCheckBox18.setMaximumSize(new java.awt.Dimension(40, 40));
        getContentPane().add(jCheckBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 610, 20, 20));

        jCheckBox13.setMaximumSize(new java.awt.Dimension(40, 40));
        getContentPane().add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 20, 20));

        btnReset1.setFont(new java.awt.Font("Palace Script MT", 1, 36)); // NOI18N
        btnReset1.setText("Reset");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 130, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anuj\\Downloads\\cafe them,e.gif")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCheckout3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckout3ActionPerformed
  new bill(0,0,0,0,0,0,0).setVisible(true);
    }//GEN-LAST:event_btnCheckout3ActionPerformed

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
          reset();
    }//GEN-LAST:event_btnReset1ActionPerformed

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
            java.util.logging.Logger.getLogger(drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new drinks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckout3;
    private javax.swing.JButton btnReset1;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    // End of variables declaration//GEN-END:variables
}
