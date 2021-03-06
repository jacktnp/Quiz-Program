package Final;


import java.awt.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





/**
 *
 * @author ink25
 */
//import ;
public class QuizTeacher extends javax.swing.JFrame implements Runnable {
    private User test;
    private Server server;
    private ServerView serverGUI;
    private Thread serverThread;


    MySql sql = new MySql();
    static ArrayList<Clienthanler> list = new ArrayList<>();


    public QuizTeacher(User user) {
        this.test = user;
        initComponents();

    }

    public User getTest() {
        return test;
    }

    public void setTest(User test) {
        this.test = test;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Editor = new javax.swing.JButton();
        t = new javax.swing.JLabel();
        CreateRoom = new javax.swing.JButton();
        Join = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(20, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255,255));

        Editor.setBackground(new java.awt.Color(55, 127, 234));
        Editor.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        Editor.setForeground(Color.white);
        Editor.setText("QuizEditor");
        Editor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditorActionPerformed(evt);
            }
        });

        t.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        t.setForeground(new java.awt.Color(0, 0,0));
        t.setText("ID: "+ test.getId()+"  Name: "+test.getFname()+"  Score: "+ test.getScore());

        CreateRoom.setBackground(new java.awt.Color(55, 127, 234));
        CreateRoom.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        CreateRoom.setForeground(new java.awt.Color(255, 255, 255));
        CreateRoom.setText("CreateRoom");
        CreateRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateRoomActionPerformed(evt);
            }
        });

        Join.setBackground(new java.awt.Color(55, 127, 234));
        Join.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        Join.setForeground(new java.awt.Color(255, 255, 255));
        Join.setText("Join");
        Join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(55, 127, 234));
        jButton2.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Editor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(t, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addComponent(CreateRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Join, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(t)
                                .addGap(18, 18, 18)
                                .addComponent(Editor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CreateRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Join, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditorActionPerformed
        QuizGui e = new QuizGui();

    }//GEN-LAST:event_EditorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CreateRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateRoomActionPerformed
        server = new Server();
        serverGUI = new ServerView(server);


        serverGUI.init();
        server.setList(serverGUI.getList());
        CreateRoom.setEnabled(false);


    }//GEN-LAST:event_CreateRoomActionPerformed

    private void JoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinActionPerformed
        Student st = new Student(test);

        st.login.setVisible(true);
    }//GEN-LAST:event_JoinActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton CreateRoom;
    private javax.swing.JButton Editor;
    private javax.swing.JButton Join;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel t;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {


    }
}
