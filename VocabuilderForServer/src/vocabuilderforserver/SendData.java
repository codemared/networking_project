/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vocabuilderforserver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Md Saddam Hossain
 */
public class SendData extends javax.swing.JFrame {

    public static javax.swing.JPanel jPane21ForSendData;
    public static SendData sendData;
    public int cnt = 1, col = 0, row = 0, rowNum = 0, i = 2, examResult = 0, val = 0;
    public int[][] ans = new int[100][5];
    public int[][] check = new int[100][5];
    public String[][] arr = new String[100][10];
    public static FileWriter fileWriterOfVocabularyTest;
    public static PrintWriter printWriterOfVocabularyTest;
    public static FileReader fileReaderOfVocabularyTest;
    public static BufferedReader bufferedReaderOfVocabularyTest;

    /**
     * Creates new form SendData
     */
    public SendData() {
        initComponents();
        try {
            fileReaderOfVocabularyTest = new FileReader("Questions.csv");
            bufferedReaderOfVocabularyTest = new BufferedReader(fileReaderOfVocabularyTest);

            String line = null;
            String[] ar = new String[10];

            while ((line = bufferedReaderOfVocabularyTest.readLine()) != null) {
                rowNum++;
                ar = line.split(",");
                
                for (int i = 0; i < 6; i++) {

                    arr[rowNum][i] = ar[i];
                   // System.out.print(ar[i]);
                    ServerThread.dataOutToClient.writeUTF(ar[i]);

                }
                System.out.println();
            }
            SendData.bufferedReaderOfVocabularyTest.close();

        } catch (Exception e) {
            System.out.println("Exception in VocabularyTest!");
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

        jPanel1ForSendData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1ForSendQues = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 650));
        setResizable(false);

        jPanel1ForSendData.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1ForSendData.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1ForSendData.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanel1ForSendData.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 102));
        jLabel1.setText("Click the below button and send question to the client :) ");
        jPanel1ForSendData.add(jLabel1);
        jLabel1.setBounds(220, 120, 380, 20);

        jButton1ForSendQues.setBackground(new java.awt.Color(0, 0, 0));
        jButton1ForSendQues.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1ForSendQues.setForeground(new java.awt.Color(255, 255, 255));
        jButton1ForSendQues.setText("Question");
        jButton1ForSendQues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ForSendQuesActionPerformed(evt);
            }
        });
        jPanel1ForSendData.add(jButton1ForSendQues);
        jButton1ForSendQues.setBounds(300, 180, 110, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1ForSendData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 299, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1ForSendData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ForSendQuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ForSendQuesActionPerformed
        // TODO add your handling code here:
//        try {
//            int i = 0, j = 0;
//            String str = Integer.toString(rowNum);
//            ServerThread.dataOutToClient.writeUTF("asfasf");
//            for (i = 1; i <= rowNum; ++i) {
//                while (j < 6) {
//                    ServerThread.dataOutToClient.writeUTF(arr[i][j]);
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("Exception in sendData!!!");
//        }
    }//GEN-LAST:event_jButton1ForSendQuesActionPerformed

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
            java.util.logging.Logger.getLogger(SendData.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendData.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendData.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendData.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sendData = new SendData();
                sendData.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1ForSendQues;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jPanel1ForSendData;
    // End of variables declaration//GEN-END:variables
}
