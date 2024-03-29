package stackwork;

import java.awt.Color;
import javax.swing.JOptionPane;

public class StackGUI extends javax.swing.JFrame {

    Stack s1;
    Stack s2;
    Stack s3;
    int max = -1;

    public StackGUI() {
        initComponents();
    }

    public void createStack(int size) {
        s1 = new Stack(size);
        s2 = new Stack(size);
        s3 = new Stack(size);
    }

    public void S1ToS2() {
        if (!s1.isEmpty()) {
            int pop = s1.pop();
            System.out.println("pop: " + pop + " S1 to S2");
            s2.push(pop);
        }
    }

    public void S2ToS3() {
        if (!s2.isEmpty()) {
            int pop = s2.pop();
            System.out.println("pop: " + pop + " S2 to S3");
            s3.push(pop);
        }
    }

    public void S3ToS2() {
        if (!s3.isEmpty()) {
            int pop = s3.pop();
            System.out.println("pop: " + pop + " S3 to S2");
            s2.push(pop);
        }
    }

    public void S2ToS1() {
        if (!s2.isEmpty()) {
            int pop = s2.pop();
            System.out.println("pop: " + pop + " S1 to S2");
            s1.push(pop);
        }
    }

    public void displayAll() {
        this.s1Display();
        this.s2Display();
        this.s3Display();
    }

    public void clear() {
        this.s1.clear();
        this.s2.clear();
        this.s3.clear();
    }

    public void s1Display() {
        this.S1Area.setText("");
        for (int i = 0; i <= s1.top; i++) {
            this.S1Area.setText(this.S1Area.getText() + s1.stack[i] + "\n");
        }
    }

    public void s2Display() {
        this.S2Area.setText("");
        for (int i = 0; i <= s2.top; i++) {
            this.S2Area.setText(this.S2Area.getText() + s2.stack[i] + "\n");
        }
    }

    public void s3Display() {
        this.S3Area.setText("");
        for (int i = 0; i <= s3.top; i++) {
            this.S3Area.setText(this.S3Area.getText() + s3.stack[i] + "\n");
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

        mainPanel = new javax.swing.JPanel();
        TabbedPane = new javax.swing.JTabbedPane();
        createPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        stackPanel = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        S2Area = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        S1Area = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        S3Area = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(78, 89, 58));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Holiday Dream Demo", 0, 24)); // NOI18N
        jLabel1.setText("Create Stack");

        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Size of stack");
        jTextField1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jTextField1AncestorRemoved(evt);
            }
        });
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createPanelLayout = new javax.swing.GroupLayout(createPanel);
        createPanel.setLayout(createPanelLayout);
        createPanelLayout.setHorizontalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        createPanelLayout.setVerticalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(128, 128, 128))
        );

        TabbedPane.addTab("tab2", createPanel);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jButton2.setText("Push");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Input number");

        S2Area.setEditable(false);
        S2Area.setColumns(10);
        S2Area.setRows(5);
        S2Area.setWrapStyleWord(true);
        S2Area.setFocusable(false);
        jScrollPane1.setViewportView(S2Area);

        S1Area.setEditable(false);
        S1Area.setColumns(10);
        S1Area.setRows(5);
        S1Area.setWrapStyleWord(true);
        S1Area.setFocusable(false);
        jScrollPane2.setViewportView(S1Area);

        S3Area.setEditable(false);
        S3Area.setColumns(10);
        S3Area.setRows(5);
        S3Area.setWrapStyleWord(true);
        S3Area.setFocusable(false);
        jScrollPane3.setViewportView(S3Area);

        jButton4.setText("<");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("<");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(">");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("<");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText(">");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stackPanelLayout = new javax.swing.GroupLayout(stackPanel);
        stackPanel.setLayout(stackPanelLayout);
        stackPanelLayout.setHorizontalGroup(
            stackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stackPanelLayout.createSequentialGroup()
                .addGroup(stackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stackPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton4))
                    .addGroup(stackPanelLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(stackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6))
                        .addGap(6, 6, 6)
                        .addGroup(stackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(stackPanelLayout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)))
                        .addGap(6, 6, 6)
                        .addGroup(stackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5)))
                    .addGroup(stackPanelLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jButton2)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        stackPanelLayout.setVerticalGroup(
            stackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stackPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton4)
                .addGap(23, 23, 23)
                .addGroup(stackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(stackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(stackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(stackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        TabbedPane.addTab("tab1", stackPanel);

        mainPanel.add(TabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -37, 600, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sizeStr = this.jTextField1.getText();
        if (sizeStr.isEmpty() || sizeStr.startsWith("Size")) {
            JOptionPane.showMessageDialog(null, "You have not entered a Stack size.");
            return;
        }
        int size = Integer.parseInt(sizeStr);
        this.createStack(size);
        JOptionPane.showMessageDialog(null, "Created Stack size: " + size);
        this.S1Area.setText("");
        this.S2Area.setText("");
        this.S3Area.setText("");
        this.TabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String numberStr = this.jTextField2.getText();
        if (s1.isFull()) {
            JOptionPane.showMessageDialog(null, "Stack overflow! ");
            return;
        }
        if (numberStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "You haven't entered a number yet.");
            return;
        }
        int number = Integer.parseInt(numberStr);
        this.jTextField2.setText("");
        if (number > max && max != -1) {
            JOptionPane.showMessageDialog(null, "Cannot push numbers greater than: " + max);
            return;
        }
        max = number;
        s1.push(number);
        this.jTextField2.setText("");
        this.s1Display();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextField1AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1AncestorRemoved

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if (this.jTextField1.getText().equals("Size of stack")) {
            this.jTextField1.setText("");
            this.jTextField1.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if (this.jTextField1.getText().equals("")) {
            this.jTextField1.setText("Size of stack");
            this.jTextField1.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!this.s1.isEmpty() || !this.s2.isEmpty() || !this.s3.isEmpty()) {
            int confirm = JOptionPane.showConfirmDialog(null, "Want to go back?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (confirm != 0) {
                return;
            }
        }
        this.jTextField1.setText("Size of stack");
        this.jTextField1.setForeground(new Color(153, 153, 153));
        this.TabbedPane.setSelectedIndex(0);
        max = -1;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.S2ToS3();
        this.displayAll();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.S1ToS2();
        this.displayAll();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.S3ToS2();
        this.displayAll();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.S2ToS1();
        this.displayAll();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(StackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StackGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea S1Area;
    private javax.swing.JTextArea S2Area;
    private javax.swing.JTextArea S3Area;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JPanel createPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel stackPanel;
    // End of variables declaration//GEN-END:variables
}
