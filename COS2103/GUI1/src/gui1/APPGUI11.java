/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui1;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.net.URL;

/**
 *
 * @author MILLIONx
 */
public class APPGUI11 extends javax.swing.JFrame {

    String name[] = new String[100];
    String surname[] = new String[100];
    int age[] = new int[100];
    int salary[] = new int[100];
    final int UB = 100;
    int LB = 0;
    int N = UB;
    int cur = 0;
    int positionX = 0, positionY = 0;
    int id[] = new int[100];
    int currentID;

    public APPGUI11() {
        initComponents();
        this.jPanel9.setBackground(whiteColor);
        this.jLabel8.setForeground(selectColor);
        setmyData();
        jTextField1.setText(name[cur]);
        jTextField2.setText(surname[cur]);
        jTextField3.setText(String.valueOf(age[cur]));
        jTextField4.setText(String.valueOf(salary[cur]));
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
//        jTable1.getTableHeader().setOpaque(false);
//        jTable1.setBackground(new Color(32, 33, 34));
//        jTable1.setBackground(new Color(32, 33, 34));
        jTable1.getTableHeader().setFont(new Font("PK Uttaradit Medium", Font.PLAIN, 14));
//        jTable1.getTableHeader().setForeground(new Color(32, 33, 34));
        jTable2.getTableHeader().setFont(new Font("PK Uttaradit Medium", Font.PLAIN, 14));
        jTable3.getTableHeader().setFont(new Font("PK Uttaradit Medium", Font.PLAIN, 14));
        this.showtable();
        this.showtable3();
        this.showtable2();

        jTable1.setShowGrid(true);
        jTable1.setGridColor(new Color(211, 211, 211));

    }
    Color selectColor = new Color(115, 10, 10);
    Color whiteColor = new Color(211, 211, 211);

    public void setmyData() {
        name[0] = "สมชาย";
        name[1] = "ไชยกร";
        name[2] = "สมใจ";
        name[3] = "กำแหง";
        name[4] = "ราชัน";
        name[5] = "สมศรี";
        name[6] = "สมศักดิ์";
        name[7] = "ฉลอง";
        name[8] = "สมหญิง";
        name[9] = "รักวิจิตร";
        name[10] = "สมหวัง";
        name[11] = "วิสุทธิ์";
        name[12] = "เพชรวิจิตร";
        name[13] = "สมบัติ";
        name[14] = "สมบูรณ์";
        name[15] = "มีเกียรติ";
        name[16] = "ยุพิน";
        name[17] = "สมเพชร";
        name[18] = "ประเสริฐ";
        name[19] = "ปองพล";
        name[20] = "กำพล";
        name[21] = "สำโต๋ย";
        name[21] = "สมตุ๋ย";
        name[22] = "กำลัง";
        surname[0] = "รักชาต";
        surname[1] = "อรุณรุ่ง";
        surname[2] = "มณ๊วัลย์";
        surname[3] = "แก้วหาญ";
        surname[4] = "สุขสันต์";
        surname[5] = "สุขใจ";
        surname[6] = "สุขรักษ์";
        surname[7] = "บุญรอด";
        surname[8] = "สุขุมาล";
        surname[9] = "รุ่งเรือง";
        surname[10] = "วิชัย";
        surname[11] = "สวรรค์";
        surname[12] = "บุญเติม";
        surname[13] = "นิยม";
        surname[14] = "สมัคคี";
        surname[15] = "ทวีกาญจน์";
        surname[16] = "เพชรสุพรรณ";
        surname[17] = "ผดุงพงศ์";
        surname[18] = "ทวีวัฒน์";
        surname[19] = "รักษ์พงศ์";
        surname[20] = "ยอดเยี่ยม";
        surname[21] = "สมเต้";
        surname[22] = "ลุยสวน";
        surname[23] = "วงชา";
        age[0] = 25;
        age[1] = 27;
        age[2] = 33;
        age[3] = 55;
        age[4] = 66;
        age[5] = 24;
        age[6] = 43;
        age[7] = 31;
        age[8] = 56;
        age[9] = 34;
        age[10] = 23;
        age[11] = 45;
        age[12] = 32;
        age[13] = 54;
        age[14] = 22;
        age[15] = 44;
        age[16] = 21;
        age[17] = 46;
        age[18] = 35;
        age[19] = 53;
        age[20] = 36;
        age[21] = 12;
        age[22] = 70;
        age[23] = 21;
        salary[0] = 30000;
        salary[1] = 37000;
        salary[2] = 80000;
        salary[3] = 44000;
        salary[4] = 27000;
        salary[5] = 35000;
        salary[6] = 50000;
        salary[7] = 60000;
        salary[8] = 70000;
        salary[9] = 45000;
        salary[10] = 55000;
        salary[11] = 65000;
        salary[12] = 78000;
        salary[13] = 84000;
        salary[14] = 96000;
        salary[15] = 15000;
        salary[16] = 115000;
        salary[17] = 125000;
        salary[18] = 37000;
        salary[19] = 45000;
        salary[20] = 155000;
        salary[21] = 15000;
        salary[22] = 95000;
        salary[23] = 13000;

        N = 23;
        currentID = 230000;
        for (int i = 0; i < N; i++) {
            id[i] = ++currentID;
        }
    }

    public void ForTraversing() {
        for (int K = LB; K <= (UB - 1); K++) {            //Step 2 
            System.out.println(name[K]); //Apply PROCESS to LA[K] 
        }
    }

    public void WhileTraversing() {
        int K = LB;
        while (K <= (UB - 1)) {            //Step 2 
            System.out.print(name[K] + ","); //Apply PROCESS to LA[K] 
            K++;
        }
    }

    public int findEmpIndexByID(int delID) {
        int K = -1;
        for (int i = 0; i < N; i++) {
            if (id[i] == delID) {
                K = i;
            }
        }
        if (K == -1) {
            return -1;
        }
        return K;
    }

    public void delete(int K) { //(int LA[], int N, int K, int ITEM ){  //Inserting Operation
//       jTextField12.setText(String.valueOf(id[K]));
//       jTextField13.setText(name[K]);
//       jTextField14.setText(surname[K]);
//       jTextField15.setText(String.valueOf(age[K]));
//       jTextField16.setText(String.valueOf(salary[K]));
        for (int J = K; J < N - 1; J++) {
            id[J] = id[J + 1];
            name[J] = name[J + 1];
            surname[J] = surname[J + 1];
            age[J] = age[J + 1];
            salary[J] = salary[J + 1];

        }//end of Step 2 loop       
        N--;
    }  //Exit

//    public boolean delete(int K) {
//        if (K > UB) {
//            return false;
//        }
//        if (K > N) {
//            return false;
//        }
//        for (int J = K; J < N - 1; J++) {
//            id[J] = id[J + 1];
//            name[J] = name[J + 1];
//            surname[J] = surname[J + 1];
//            age[J] = age[J + 1];
//            salary[J] = salary[J + 1];
//        }//end of Step 2 loop       
//        N--;
//        return true;
//    }
////    public void TraversingToN() {
//        int K = LB;
//        jTextArea1.setText(jTextArea1.getText() + "\n" + "        ชื่อ            สกุล            อายุ            เงินเดือน\n");
//        jTextArea1.setText(jTextArea1.getText() + "\n" + "===========================================\n");
//        while (K <= N - 1) {            //Step 2 
//            jTextArea1.setText(jTextArea1.getText() + "\n    " + name[K] + "            "
//                    + surname[K] + "            " + age[K] + "            " + salary[K] + "  \n");
//            System.out.print(name[K] + ","); //Apply PROCESS to LA[K] 
//            K++;
//        }
//        jTextArea1.setText(jTextArea1.getText() + "===========================================\n");
//    }
    public void Sortsalary() {
        for (int K = 0; K < N - 1; K++) {
            int PTR = 0;
            while (PTR < ((N - 1) - K)) {
                if (salary[PTR] > salary[PTR + 1]) {
                    int temp = id[PTR];
                    String temp1 = name[PTR];  //Interchange 
                    String temp2 = surname[PTR];  //Interchange 
                    int temp3 = age[PTR];  //Interchange 
                    int temp4 = salary[PTR];  //Interchange
                    id[PTR] = id[PTR + 1];
                    id[PTR + 1] = temp;
                    name[PTR] = name[PTR + 1];
                    name[PTR + 1] = temp1;
                    surname[PTR] = surname[PTR + 1];
                    surname[PTR + 1] = temp2;
                    age[PTR] = age[PTR + 1];
                    age[PTR + 1] = temp3;
                    salary[PTR] = salary[PTR + 1];
                    salary[PTR + 1] = temp4;
                }
                PTR++;
            }//end while loop
        }//end for loop         
    }

    public void Sortage() {
        for (int K = 0; K < N - 1; K++) {
            int PTR = 0;
            while (PTR < ((N - 1) - K)) {
                if (age[PTR] > age[PTR + 1]) {
                    int temp = id[PTR];
                    String temp1 = name[PTR];  //Interchange 
                    String temp2 = surname[PTR];  //Interchange 
                    int temp3 = age[PTR];  //Interchange 
                    int temp4 = salary[PTR];  //Interchange
                    id[PTR] = id[PTR + 1];
                    id[PTR + 1] = temp;
                    name[PTR] = name[PTR + 1];
                    name[PTR + 1] = temp1;
                    surname[PTR] = surname[PTR + 1];
                    surname[PTR + 1] = temp2;
                    age[PTR] = age[PTR + 1];
                    age[PTR + 1] = temp3;
                    salary[PTR] = salary[PTR + 1];
                    salary[PTR + 1] = temp4;
                }
                PTR++;
            }//end while loop
        }//end for loop         
    }

    public void Sortid() {
        for (int K = 0; K < N - 1; K++) {
            int PTR = 0;
            while (PTR < ((N - 1) - K)) {
                if (id[PTR] > id[PTR + 1]) {
                    int temp = id[PTR];
                    String temp1 = name[PTR];  //Interchange 
                    String temp2 = surname[PTR];  //Interchange 
                    int temp3 = age[PTR];  //Interchange 
                    int temp4 = salary[PTR];  //Interchange
                    id[PTR] = id[PTR + 1];
                    id[PTR + 1] = temp;
                    name[PTR] = name[PTR + 1];
                    name[PTR + 1] = temp1;
                    surname[PTR] = surname[PTR + 1];
                    surname[PTR + 1] = temp2;
                    age[PTR] = age[PTR + 1];
                    age[PTR + 1] = temp3;
                    salary[PTR] = salary[PTR + 1];
                    salary[PTR + 1] = temp4;
                }
                PTR++;
            }//end while loop
        }//end for loop         
    }

//    public void Insert(int K, String new_name, String new_surname, int new_age, int new_salary) { //(int LA[], int N, int K, int ITEM ){  //Inserting Operation
//        int J = N;
//        while (J >= K) {
//            name[J + 1] = name[J];
//            surname[J + 1] = surname[J];
//            age[J + 1] = age[J];
//            salary[J + 1] = salary[J];
//            J--;
//        }//end of Step 2 loop
//        id[K] = ++currentID;
//        name[K] = new_name;
//        surname[K] = new_surname;
//        age[K] = new_age;
//        salary[K] = new_salary;
//        N++;
//    }  //Exit
    public void Insert(String new_name, String new_surname, int new_age, int new_salary) {
        id[N] = ++currentID;
        name[N] = new_name;
        surname[N] = new_surname;
        age[N] = new_age;
        salary[N] = new_salary;
        N++;
        System.out.println(currentID);
    }

    public int[] searchEmpSW(String fname) {
        int emps[] = new int[10];
        int size = 0;

        // set to -1
        for (int j = 0; j < 10; j++) {
            emps[j] = -1;
        }

        int i = 0;
        while (i <= (N - 1)) {
            if (name[i].startsWith(fname) && size < 10) {
                emps[size++] = i;
            }
            i++;
        }
        return emps;
    }

    public void displayEmp(boolean sort) {
        if (sort) {
            this.Sortsalary();
        }
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        model.setRowCount(0);
        for (int i = 0; i < N; i++) {
            model.addRow(new Object[]{id[i], name[i], surname[i], age[i], String.format("%,d", salary[i])});
        }
    }

    public void showtable() {
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        model.setRowCount(0);
        for (int i = 0; i < N; i++) {
            model.addRow(new Object[]{id[i], name[i], surname[i], age[i], salary[i]});

        }
    }

    public void showtable2() {
        DefaultTableModel model = (DefaultTableModel) this.jTable2.getModel();
        model.setRowCount(0);
        for (int i = 0; i < N; i++) {
            model.addRow(new Object[]{id[i], name[i], surname[i], age[i], salary[i]});

        }
    }

    public void showtable3() {
        DefaultTableModel model = (DefaultTableModel) this.jTable3.getModel();
        model.setRowCount(0);
        for (int i = 0; i < N; i++) {
            model.addRow(new Object[]{id[i], name[i], surname[i], age[i], salary[i]});
        }
    }

//    public void Java_Table_Style() {
//        jTable1.setShowGrid(true);
//        jTable1.setGridColor(new Color(211, 211, 211));
//        jTable1.setBackground(Color.BLACK);
//        jTable1.setSelectionBackground(Color.BLACK);
//        
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel14 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        canvas1 = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField5.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jTextField5.setText("jTextField1");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(43, 44, 46));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 10, 10), 2));

        jPanel2.setBackground(new java.awt.Color(43, 44, 46));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(221, 221, 221));
        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 10, 10), 2, true));

        jPanel4.setBackground(new java.awt.Color(221, 221, 221));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(30, 10, 1, 1), "แสดงข้อมูลทั้งหมด", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("PK Uttaradit Medium", 0, 14), new java.awt.Color(43, 44, 46))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(43, 44, 46));
        jLabel1.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 44, 46));
        jLabel1.setText("เงินเดือน");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, 30));

        jLabel3.setBackground(new java.awt.Color(43, 44, 46));
        jLabel3.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 44, 46));
        jLabel3.setText("ชื่อ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 30, 30));

        jLabel4.setBackground(new java.awt.Color(43, 44, 46));
        jLabel4.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 44, 46));
        jLabel4.setText("สกุล");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 50, 30));

        jLabel5.setBackground(new java.awt.Color(43, 44, 46));
        jLabel5.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(43, 44, 46));
        jLabel5.setText("อายุ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, 30));

        jTextField1.setBackground(new java.awt.Color(43, 44, 46));
        jTextField1.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(221, 221, 220));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 140, 30));

        jTextField2.setBackground(new java.awt.Color(43, 44, 46));
        jTextField2.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(221, 221, 220));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 140, 30));

        jTextField3.setBackground(new java.awt.Color(43, 44, 46));
        jTextField3.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(221, 221, 220));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 140, 30));

        jTextField4.setBackground(new java.awt.Color(43, 44, 46));
        jTextField4.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(221, 221, 220));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 140, 30));

        jPanel8.setBackground(new java.awt.Color(43, 44, 46));

        jButton3.setBackground(new java.awt.Color(43, 44, 46));
        jButton3.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(221, 221, 220));
        jButton3.setText("ย้อนกลับ");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 90, 40));

        jPanel13.setBackground(new java.awt.Color(43, 44, 46));

        jButton2.setBackground(new java.awt.Color(43, 44, 46));
        jButton2.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(221, 221, 220));
        jButton2.setText("ถัดไป");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 90, 40));

        jPanel15.setBackground(new java.awt.Color(43, 44, 46));

        jButton4.setBackground(new java.awt.Color(43, 44, 46));
        jButton4.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(221, 221, 220));
        jButton4.setText("เช็คล่าสุด");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 90, 40));

        jTable2.setBackground(new java.awt.Color(43, 44, 46));
        jTable2.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 15)); // NOI18N
        jTable2.setForeground(new java.awt.Color(221, 221, 220));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "ชื่อ", "นามสกุล", "อายุ", "เงินเดือน"
            }
        ));
        jTable2.setSelectionBackground(new java.awt.Color(43, 44, 46));
        jTable2.setSelectionForeground(new java.awt.Color(221, 221, 220));
        jScrollPane3.setViewportView(jTable2);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 400, 400));

        jTabbedPane1.addTab("tab1", jPanel4);

        jPanel5.setBackground(new java.awt.Color(221, 221, 221));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(30, 10, 1, 1), "เพิ่มข้อมูล", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("PK Uttaradit Medium", 0, 14), new java.awt.Color(43, 44, 46))); // NOI18N

        jLabel7.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(43, 44, 46));
        jLabel7.setText("ชื่อ");

        jLabel12.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(43, 44, 46));
        jLabel12.setText("นามสกุล");

        jLabel14.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(43, 44, 46));
        jLabel14.setText("อายุ");

        jLabel18.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(43, 44, 46));
        jLabel18.setText("เงินเดือน");

        jTextField8.setBackground(new java.awt.Color(43, 44, 46));
        jTextField8.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(221, 221, 220));
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        jTextField9.setBackground(new java.awt.Color(43, 44, 46));
        jTextField9.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(221, 221, 220));
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jTextField10.setBackground(new java.awt.Color(43, 44, 46));
        jTextField10.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(221, 221, 220));
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });

        jTextField11.setBackground(new java.awt.Color(43, 44, 46));
        jTextField11.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(221, 221, 220));
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(43, 44, 46));

        jButton6.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(221, 221, 220));
        jButton6.setText("เพิ่ม");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(43, 44, 46));
        jLabel19.setText("ข้อมูลที่จะเพิ่ม");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField9)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel19)
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        jTabbedPane1.addTab("tab2", jPanel5);

        jPanel6.setBackground(new java.awt.Color(221, 221, 221));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(30, 10, 1, 1), "ลบข้อมูล", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("PK Uttaradit Medium", 0, 14), new java.awt.Color(43, 44, 46))); // NOI18N

        jLabel20.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(43, 44, 46));
        jLabel20.setText("รายการที่จะลบ");

        jLabel21.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(43, 44, 46));
        jLabel21.setText("ชื่อ");

        jLabel22.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(43, 44, 46));
        jLabel22.setText("นามสกุล");

        jLabel23.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(43, 44, 46));
        jLabel23.setText("อายุ");

        jLabel24.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(43, 44, 46));
        jLabel24.setText("เงินเดือน");

        jTable3.setBackground(new java.awt.Color(43, 44, 46));
        jTable3.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 14)); // NOI18N
        jTable3.setForeground(new java.awt.Color(211, 211, 210));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ลำดับ", "ชื่อ", "นามสกุล", "อายุ", "เงินเดือน"
            }
        ));
        jTable3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable3);

        jTextField12.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 14)); // NOI18N

        jTextField13.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 14)); // NOI18N

        jTextField14.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 14)); // NOI18N

        jTextField15.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 14)); // NOI18N

        jTextField16.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 14)); // NOI18N

        jPanel21.setBackground(new java.awt.Color(43, 44, 46));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(221, 221, 220));
        jButton7.setText("ลบ");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, -1));

        jPanel22.setBackground(new java.awt.Color(43, 44, 46));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(221, 221, 220));
        jButton9.setText("อัพเดต");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -3, 90, 40));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))))
                .addGap(47, 47, 47))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab3", jPanel6);

        jPanel7.setBackground(new java.awt.Color(221, 221, 220));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(30, 10, 1, 1), "ค้นหาข้อมูล", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("PK Uttaradit Medium", 0, 14), new java.awt.Color(43, 44, 46))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField6.setBackground(new java.awt.Color(43, 44, 46));
        jTextField6.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(135, 135, 135));
        jTextField6.setText("พิมพ์ชื่อที่ต้องการค้นหา");
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 0, 0), 2));
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel7.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 29, 260, 40));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(43, 44, 46));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 10, 10), 2));
        jTable1.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(221, 221, 220));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ชื่อ", "ชื่อ", "นามสกุล", "อายุ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setFocusCycleRoot(true);
        jTable1.setGridColor(new java.awt.Color(43, 44, 46));
        jTable1.setInheritsPopupMenu(true);
        jTable1.setSelectionBackground(new java.awt.Color(43, 44, 46));
        jTable1.setShowGrid(false);
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }
        jTable1.getAccessibleContext().setAccessibleName("");

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 650, 320));

        jPanel20.setBackground(new java.awt.Color(221, 221, 220));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 44, 46)), "จัดเรียง", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("PK Uttaradit Medium", 0, 14), new java.awt.Color(43, 44, 46))); // NOI18N
        jPanel20.setForeground(new java.awt.Color(43, 44, 46));

        jPanel19.setBackground(new java.awt.Color(43, 44, 46));

        jButton11.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(221, 221, 220));
        jButton11.setText("ID");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton11MouseExited(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel16.setBackground(new java.awt.Color(43, 44, 46));

        jButton5.setBackground(new java.awt.Color(43, 44, 46));
        jButton5.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(221, 221, 220));
        jButton5.setText("เงินเดือน");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel18.setBackground(new java.awt.Color(43, 44, 46));

        jButton10.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(221, 221, 220));
        jButton10.setText("อายุ");
        jButton10.setToolTipText("");
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton10MouseExited(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jTabbedPane1.addTab("tab4", jPanel7);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -37, 720, 490));

        jPanel3.setBackground(new java.awt.Color(32, 33, 34));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 10, 10)));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(93, 12, 12));
        jButton1.setFont(new java.awt.Font("PK Uttaradit Medium", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(221, 221, 220));
        jButton1.setText("X");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(221, 221, 221));
        jLabel2.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(221, 221, 220));
        jLabel2.setText("ME.");

        jButton8.setBackground(new java.awt.Color(43, 44, 46));
        jButton8.setFont(new java.awt.Font("PK Uttaradit Medium", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(221, 221, 220));
        jButton8.setText("-");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(221, 221, 221));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 10, 10), 3));
        jPanel9.setToolTipText("");
        jPanel9.setAlignmentX(5.0F);
        jPanel9.setAlignmentY(5.0F);
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel9MouseReleased(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(221, 221, 221));
        jLabel8.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(43, 44, 46));
        jLabel8.setText("แสดงข้อมูล");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui1/profile.png"))); // NOI18N
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(profile, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(41, 41, 41))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(221, 221, 221));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 10, 10), 3));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel10MouseReleased(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(221, 221, 221));
        jLabel9.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(43, 44, 46));
        jLabel9.setText("เพิ่มข้อมูล");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui1/insert.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(27, 27, 27))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(221, 221, 221));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 10, 10), 3));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(221, 221, 221));
        jLabel10.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(43, 44, 46));
        jLabel10.setText("ลบข้อมูล");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui1/del.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(19, 19, 19))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(14, 14, 14))
        );

        jLabel13.setBackground(new java.awt.Color(248, 246, 246));
        jLabel13.setFont(new java.awt.Font("PK Uttaradit Medium", 1, 76)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(115, 10, 10));
        jLabel13.setText("E.");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(221, 221, 221));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 10, 10), 3));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(221, 221, 221));
        jLabel11.setFont(new java.awt.Font("PK Uttaradit Medium", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(43, 44, 46));
        jLabel11.setText("ค้นหาข้อมูล");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui1/serach.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(19, 19, 19))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel25.setBackground(new java.awt.Color(248, 246, 246));
        jLabel25.setFont(new java.awt.Font("PK Uttaradit Medium", 1, 76)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(248, 246, 246));
        jLabel25.setText("M");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui1/ezgif.com-resize (3).gif"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);

        this.jPanel9.setBackground(selectColor);
        this.jPanel10.setBackground(whiteColor);
        this.jPanel11.setBackground(whiteColor);
        this.jPanel12.setBackground(whiteColor);
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
        this.jPanel9.setBackground(selectColor);
        this.jPanel10.setBackground(whiteColor);
        this.jPanel11.setBackground(whiteColor);
        this.jPanel12.setBackground(whiteColor);

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);

        this.jPanel9.setBackground(whiteColor);
        this.jPanel10.setBackground(selectColor);
        this.jPanel11.setBackground(whiteColor);
        this.jPanel12.setBackground(whiteColor);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);

        this.jPanel9.setBackground(whiteColor);
        this.jPanel10.setBackground(selectColor);
        this.jPanel11.setBackground(whiteColor);
        this.jPanel12.setBackground(whiteColor);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);

        this.jPanel9.setBackground(whiteColor);
        this.jPanel10.setBackground(whiteColor);
        this.jPanel11.setBackground(selectColor);
        this.jPanel12.setBackground(whiteColor);
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
        this.jPanel9.setBackground(whiteColor);
        this.jPanel10.setBackground(whiteColor);
        this.jPanel11.setBackground(selectColor);
        this.jPanel12.setBackground(whiteColor);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        jLabel8.setForeground(new Color(180, 18, 18));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here: 
        jLabel8.setForeground(new Color(43, 44, 46));

        if (this.jPanel9.getBackground() == selectColor) {
            return;
        }
        this.jPanel9.setBackground(whiteColor);

    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
        jLabel9.setForeground(new Color(180, 18, 18));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
        jLabel9.setForeground(new Color(43, 44, 46));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
        jLabel10.setForeground(new Color(180, 18, 18));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
        jLabel10.setForeground(new Color(43, 44, 46));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
        jLabel13.setForeground(new Color(255, 8, 0));
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
        jLabel13.setForeground(new Color(115, 10, 10));
    }//GEN-LAST:event_jLabel13MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setForeground(new Color(255, 8, 0));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setForeground(new Color(211, 211, 211));
    }//GEN-LAST:event_jButton1MouseExited


    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered


    }//GEN-LAST:event_profileMouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited

        if (this.jPanel9.getBackground() == selectColor) {
            return;
        }
        this.jPanel9.setBackground(whiteColor);

    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseReleased

    }//GEN-LAST:event_jPanel9MouseReleased

    private void jPanel10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseReleased

    }//GEN-LAST:event_jPanel10MouseReleased

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MousePressed

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
//        if (this.jPanel9.getBackground() == selectColor) {
//            return;
//        }
//        this.jPanel9.setBackground(new Color(115, 10, 10));
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
        this.jPanel9.setBackground(whiteColor);
        this.jPanel10.setBackground(whiteColor);
        this.jPanel11.setBackground(whiteColor);
        this.jPanel12.setBackground(selectColor);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
        jLabel11.setForeground(new Color(180, 18, 18));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
        jLabel11.setForeground(new Color(43, 44, 46));

    }//GEN-LAST:event_jLabel11MouseExited

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
        this.jPanel9.setBackground(whiteColor);
        this.jPanel10.setBackground(whiteColor);
        this.jPanel11.setBackground(whiteColor);
        this.jPanel12.setBackground(selectColor);


    }//GEN-LAST:event_jPanel12MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (cur > 0) {
            cur--;
            jTextField3.setText(name[cur]);
            jTextField4.setText(surname[cur]);
            jTextField2.setText(String.valueOf(age[cur]));
            jTextField1.setText(String.valueOf(salary[cur]));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (cur < N - 1) {
            cur++;
            jTextField3.setText(name[cur]);
            jTextField4.setText(surname[cur]);
            jTextField1.setText(String.valueOf(age[cur]));
            jTextField2.setText(String.valueOf(salary[cur]));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setForeground(new Color(180, 18, 18));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setForeground(new Color(211, 211, 210));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setForeground(new Color(180, 18, 18));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setForeground(new Color(211, 211, 210));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
//        this.jTextArea1.setText("");
//        TraversingToN();
        showtable2();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jButton4.setForeground(new Color(180, 18, 18));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        jButton4.setForeground(new Color(211, 211, 210));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        jButton5.setForeground(new Color(180, 18, 18));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        jButton5.setForeground(new Color(211, 211, 210));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//        this.jTextArea1.setText("");
        Sortsalary();
//        int K = LB;
//        jTextArea1.setText(jTextArea1.getText() + "\n" + "        ชื่อ            สกุล            อายุ            เงินเดือน\n");
//        jTextArea1.setText(jTextArea1.getText() + "\n" + "===========================================\n");
//        while (K <= N - 1) {            //Step 2 
//            jTextArea1.setText(jTextArea1.getText() + "\n    " + name[K] + "            "
//                    + surname[K] + "            " + age[K] + "            " + salary[K] + "  \n");
//            System.out.print(name[K] + ","); //Apply PROCESS to LA[K] 
//            K++;
//        }
//        jTextArea1.setText(jTextArea1.getText() + "===========================================\n");
        showtable();


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        // TODO add your handling code here:
        if (jTextField6.getText().equals("พิมพ์ชื่อที่ต้องการค้นหา")) {
            jTextField6.setText("");
            jTextField6.setForeground(new Color(221, 221, 220));
        }

    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        // TODO add your handling code here:
        if (jTextField6.getText().equals("")) {
            jTextField6.setText("พิมพ์ชื่อที่ต้องการค้นหา");
            jTextField6.setForeground(new Color(221, 221, 220));
        }

    }//GEN-LAST:event_jTextField6FocusLost

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
        int targets[];
        char c = evt.getKeyChar();

        String fname = this.jTextField6.getText();
        String find = fname; // ตัวแปรไว้ค้นหา
        if (c != '\b') { // เช็คว่า เรากด backspace รึป่าว
            find = fname + c;  // บวกตัวพิมพ์ ล่าสุดเข้าไป
        }
        if (find.isEmpty()) { // เมื่อลบค้นหาจนสุด 
            this.displayEmp(true); // แสดงหมดเลย
            return;
        }
        targets = this.searchEmpSW(find); // นำชื่อไปค้นหา อันนี้หาแบบ หลายตัว indexs
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        model.setRowCount(0); // ลบ row ออกให้หมด
        for (int i = 0; i < targets.length; i++) {
            int target = targets[i];
            if (target == -1) {
                continue; // ข้าม index ที่ไม่เจอ 
            }
            model.addRow(new Object[]{name[target], surname[target], age[target], String.format("%,d", salary[target])});
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen() - positionX, evt.getYOnScreen() - positionY);

    }//GEN-LAST:event_jPanel3MouseDragged

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.setState(APPGUI11.ICONIFIED);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        // TODO add your handling code here:
        jButton8.setForeground(new Color(180, 18, 18));
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        // TODO add your handling code here:
        jButton8.setForeground(new Color(211, 211, 210));
    }//GEN-LAST:event_jButton8MouseExited

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:

        DefaultTableModel Model = (DefaultTableModel) jTable3.getModel();

        if (Model != null) {
            int id = (int) Model.getValueAt(jTable3.getSelectedRow(), 0);
            String name = Model.getValueAt(jTable3.getSelectedRow(), 1).toString();
            String surname = Model.getValueAt(jTable3.getSelectedRow(), 2).toString();
            int age = (int) Model.getValueAt(jTable3.getSelectedRow(), 3);
            int salary = (int) Model.getValueAt(jTable3.getSelectedRow(), 4);

            jTextField12.setText(String.valueOf(id));
            jTextField13.setText(name);
            jTextField14.setText(surname);
            jTextField15.setText(String.valueOf(age));
            jTextField16.setText(String.valueOf(salary));
        }


    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
//        DefaultTableModel tblModel = (DefaultTableModel) jTable3.getModel();
//        if(jTable3.getSelectedRowCount() == 1){
//            String name = jTextField13.getText();
//            String surname = jTextField14.getText();
//            int age = jTextField15.setText(String.valueOf(age));
//            int salary = jTextField16.setText(String.valueOf(salary));
//            
//            tblModel.setValueAt(name , jTable3.getSelectedRow(),0);
//            tblModel.setValueAt(surname , jTable3.getSelectedRow(),1);
//            tblModel.setValueAt(age , jTable3.getSelectedRow(),2);
//            tblModel.setValueAt(salary , jTable3.getSelectedRow(),3);
        showtable3();

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        DefaultTableModel tblModel = (DefaultTableModel) jTable3.getModel();

//         delete(Integer.parseInt(jTextField12.getText()));
        if (jTable3.getSelectedRowCount() == 1) {
            int select = JOptionPane.showConfirmDialog(null, "<html><b style=\" font-size:12px; font-family:PK Uttaradit Medium;\">ต้องการจะแทรกข้อมูลนี้ใช้หรือไหม่  </b> </html> ", "การยืนยัน", JOptionPane.YES_NO_OPTION);

            if (select == 0) {
                delete(jTable3.getSelectedRow());
                tblModel.removeRow(jTable3.getSelectedRow());
                JOptionPane.showMessageDialog(null, "<html><b style=\" font-size:12px; font-family:PK Uttaradit Medium;\">ลบสำเร็จ: </b> </html> ");
            }
            if (select == 1) {
            }
            JOptionPane.showMessageDialog(null, "<html><b style=\" font-size:12px; font-family:PK Uttaradit Medium;\">ยกเลิกการลบเรียบร้อย </b> </h tml> ");
        }
//        findEmpIndexByID(jTable3.getSelectedRow());
        if (jTextField12.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "<html><b style=\" font-size:12px; font-family:PK Uttaradit Medium;\">กรุณาเลือกช่องที่จะลบ: </b> </html> ");
        }

//        String IDStr = this.jTextField12.getText();
//        if (IDStr.isEmpty()) {
////            this.emptyFieldAlert("ไอดี");
//            return;
//        }
//        int delID = Integer.parseInt(IDStr); // ไอดีที่จะลบ
//        int K = this.findEmpIndexByID(delID); // นำไปค้นหาตำแหน่ง
//
//        if (K == -1) {
////            this.onError("ไม่พบพนักงงานน ID: " + IDStr);
//            return;
//        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3AncestorAdded

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        this.Sortage();
        showtable();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        this.Sortid();
        showtable();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseEntered
        // TODO add your handling code here:
        jButton10.setForeground(new Color(180, 18, 18));
    }//GEN-LAST:event_jButton10MouseEntered

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
        // TODO add your handling code here:
        jButton10.setForeground(new Color(211, 211, 210));
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseEntered
        // TODO add your handling code here:
        jButton11.setForeground(new Color(180, 18, 18));
    }//GEN-LAST:event_jButton11MouseEntered

    private void jButton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseExited
        // TODO add your handling code here:\
        jButton11.setForeground(new Color(211, 211, 210));
    }//GEN-LAST:event_jButton11MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        try {

            Desktop.getDesktop().browse(new URL("https://github.com/Erorr99").toURI());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
        // TODO add your handling code here:
        jLabel25.setForeground(new Color(180, 18, 18));
    }//GEN-LAST:event_jLabel25MouseEntered

    private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited
        // TODO add your handling code here:
        jLabel25.setForeground(new Color(211, 211, 210));
    }//GEN-LAST:event_jLabel25MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (jTextField8.getText().isEmpty() || jTextField9.getText().isEmpty() || jTextField10.getText().isEmpty() || jTextField11.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "<html><b style=\"font-size:12px; font-family:PK Uttaradit Medium;\">กรุณากรอกข้อมูลให้ครบทุกช่อง</b></html>");
            return;
        }
        Insert(
                jTextField8.getText(),
                jTextField9.getText(),
                Integer.parseInt(jTextField10.getText()),
                Integer.parseInt(jTextField11.getText()));
        JOptionPane.showMessageDialog(null, "<html><b style=\" font-size:12px; font-family:PK Uttaradit Medium;\">เพิ่มข้อมูลสำเร็จ: </b> </html> ");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
        jButton6.setForeground(new Color(211, 211, 210));
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
        jButton6.setForeground(new Color(180, 18, 18));
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        // TODO add your handling code here:
         jButton9.setForeground(new Color(180, 18, 18));
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        // TODO add your handling code here:
        jButton9.setForeground(new Color(211, 211, 210)); 
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:s
        jButton7.setForeground(new Color(180, 18, 18));
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        // TODO add your handling code here:
         jButton7.setForeground(new Color(211, 211, 210));
    }//GEN-LAST:event_jButton7MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        try{
                            Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=dQw4w9WgXcQ").toURI());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        // TODO add your handling code here:
                if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
        // TODO add your handling code here:
                if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        // TODO add your handling code here:
                if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        // TODO add your handling code here:
                if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8KeyTyped

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
            java.util.logging.Logger.getLogger(APPGUI11.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APPGUI11.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APPGUI11.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APPGUI11.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APPGUI11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel profile;
    // End of variables declaration//GEN-END:variables
}
