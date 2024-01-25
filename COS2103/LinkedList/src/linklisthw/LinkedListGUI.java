package linklisthw;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import java.awt.Desktop;
import java.net.URL;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author STACiA
 */
public class LinkedListGUI extends javax.swing.JFrame {

    // Node
    DNode START;
    DNode LAST;
    int currentID;

    // colors
    Color selectColor = new Color(63, 155, 253); // cyan
    Color whiteColor = Color.white;

    /**
     * Creates new form ArrayGUI
     */
    public LinkedListGUI() {
        initComponents();
        this.initData();
        this.homeLabel.setForeground(selectColor);
        this.setResizable(false);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        this.jTable1.setDefaultRenderer(String.class, centerRenderer);
        this.displayHomePage();
    }

    private void initData() {
        Product[] products = {
            new Product(1, "ทีวี ซัมซุง", 7000, 120),
            new Product(2, "ทีวี แอลจี", 5000, 100),
            new Product(3, "หม้อหุงข้าว", 1500, 50),
            new Product(4, "ตู้เย็น", 9000, 80),
            new Product(5, "เครื่องซักผ้า", 6000, 70),
            new Product(6, "เครื่องดูดฝุ่น", 3000, 60),
            new Product(7, "เครื่องปรับอากาศ", 8000, 110),
            new Product(8, "เครื่องทำน้ำอุ่น", 4000, 90),
            new Product(9, "เครื่องทำน้ำแข็ง", 2000, 40),
            new Product(10, "เครื่องทำน้ำแข็ง", 2000, 40),
            new Product(11, "เครื่องซักผ้า", 6000, 70),
            new Product(12, "โต๊ะทำงาน", 3000, 60),
            new Product(13, "เก้าอี้ทำงาน", 2000, 50),
            new Product(14, "โซฟา", 4000, 80),
            new Product(15, "โต๊ะอาหาร", 5000, 90)
        };
        this.currentID = products.length;
        for (int i = 0; i < products.length; i++) {
            this.INSERTLAST(new DNode(products[i]));
        }
    }

    public void INSTFIRST(DNode NEW) {
        if (START == null) { //first Node
            START = NEW;
            LAST = NEW;
        } else {
            START.BACK = NEW;
            NEW.FORW = START;
            START = NEW;
        }
    }

    public void INSERTLAST(DNode NEW) {
        if (START == null) { //first Node
            START = NEW;
            LAST = NEW;
        } else {
            DNode PTR = START;
            while (PTR.FORW != null) {
                PTR = PTR.FORW;
            }
            PTR.FORW = NEW;
            NEW.BACK = PTR;
        }
    }

    public boolean DELTWL(int ITEM) {
        DNode LOC = SEARCH(ITEM);
        if (LOC != null) {
            if (LOC.BACK.FORW == null && LOC.FORW != null) { //start node
                START = LOC.FORW;
                LOC.FORW.BACK = null;
                return true;
            } else if (LOC.FORW == null && LOC.BACK != null) { //last node
                LOC.BACK.FORW = null;
                LAST = LOC.BACK;
                return true;
            } else if (LOC.FORW == null && LOC.BACK == null) {  //only one node
                START = null;
                LAST = null;
                return true;
            } else { //normal node    
                LOC.BACK.FORW = LOC.FORW;
                LOC.FORW.BACK = LOC.BACK;
                return true;
            }
        } else {
            return false;
        }
    }

    public DNode SEARCH(int ITEM) {
        //Algorrithm 5.2 SEARCH        
        DNode LOC = null;
        DNode PTR = null;
        PTR = START;
        while (PTR != null) {
            if (ITEM == PTR.INFOR.id) {
                LOC = PTR;
                return LOC;
            } else {
                PTR = PTR.FORW;
            }
        }
        return LOC;
    }

    public void SortID() {
        if (START == null) {
            return;
        }
        DNode CUR = START;
        while (CUR != null) {
            DNode INDEX = CUR.FORW;
            while (INDEX != null) {
                if (CUR.INFOR.id > INDEX.INFOR.id) {
                    Product TEMP = CUR.INFOR;
                    CUR.INFOR = INDEX.INFOR;
                    INDEX.INFOR = TEMP;
                }
                INDEX = INDEX.FORW;
            }
            CUR = CUR.FORW;
        }
    }

    public void SortName() {
        if (START == null) {
            return;
        }
        DNode CUR = START;
        while (CUR != null) {
            DNode INDEX = CUR.FORW;
            while (INDEX != null) {
                if (CUR.INFOR.name.compareTo(INDEX.INFOR.name) > 0) {
                    Product TEMP = CUR.INFOR;
                    CUR.INFOR = INDEX.INFOR;
                    INDEX.INFOR = TEMP;
                }
                INDEX = INDEX.FORW;
            }
            CUR = CUR.FORW;
        }
    }

    public void SortPrice() {
        if (START == null) {
            return;
        }
        DNode CUR = START;
        while (CUR != null) {
            DNode INDEX = CUR.FORW;
            while (INDEX != null) {
                if (CUR.INFOR.price > INDEX.INFOR.price) {
                    Product TEMP = CUR.INFOR;
                    CUR.INFOR = INDEX.INFOR;
                    INDEX.INFOR = TEMP;
                }
                INDEX = INDEX.FORW;
            }
            CUR = CUR.FORW;
        }
    }

    public void SortQuantity() {
        if (START == null) {
            return;
        }
        DNode CUR = START;
        while (CUR != null) {
            DNode INDEX = CUR.FORW;
            while (INDEX != null) {
                if (CUR.INFOR.quantity > INDEX.INFOR.quantity) {
                    Product TEMP = CUR.INFOR;
                    CUR.INFOR = INDEX.INFOR;
                    INDEX.INFOR = TEMP;
                }
                INDEX = INDEX.FORW;
            }
            CUR = CUR.FORW;
        }
    }

    public void displayHomePage() {
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        model.setRowCount(0);
        DNode PTR = null;
        PTR = START;
        while (PTR != null) {
            Product prod = PTR.INFOR;
            model.addRow(new Object[]{prod.id, prod.name, prod.priceFmt(), prod.quatityFmt()}); // TODO number fmt
            PTR = PTR.FORW;
        }

    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private void onError(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    // nav
    public void goToHome() {
        this.Tab.setSelectedIndex(0);
        this.homeLabel.setForeground(selectColor);
        this.insertLabel.setForeground(whiteColor);
        this.displayHomePage();
    }

    public void goToInsert() {
        this.Tab.setSelectedIndex(1);

        if (this.insertLabel.getForeground() != selectColor) {
            this.insertNameField.setText("");
            this.insertPriceField.setText("");
            this.insertQuantityField.setText("");
        }

        this.homeLabel.setForeground(whiteColor);
        this.insertLabel.setForeground(selectColor);
    }

    public void goToSearch() {
        this.Tab.setSelectedIndex(4);

        this.homeLabel.setForeground(whiteColor);
        this.insertLabel.setForeground(whiteColor);
//        this.editLabel.setForeground(whiteColor);
    }

    // alert message
    public void emptyFieldAlert(String target) {
        JOptionPane.showMessageDialog(null, "คุณยังไม่ได้ป้อน: " + target);
    }

    // helpers
    public String numberFmt(int num) {
        return String.format("%,d", num);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        buttonGroup1 = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        SidePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        insertTab = new javax.swing.JPanel();
        insertLabel = new javax.swing.JLabel();
        homeTab = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        employeeLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BG = new javax.swing.JPanel();
        Tab = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        homeEmpTitle = new javax.swing.JLabel();
        searchEmpField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        insertPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        insertPriceField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        insertNameField = new javax.swing.JTextField();
        insertQuantityField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        insertEmpTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Manager");
        setBackground(new java.awt.Color(204, 204, 255));

        MainPanel.setBackground(new java.awt.Color(29, 41, 57));

        SidePanel.setBackground(new java.awt.Color(38, 53, 68));

        insertTab.setBackground(new java.awt.Color(29, 36, 49));
        insertTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertTabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertTabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertTabMouseExited(evt);
            }
        });

        insertLabel.setBackground(new java.awt.Color(255, 255, 255));
        insertLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        insertLabel.setForeground(new java.awt.Color(255, 255, 255));
        insertLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linklisthw/icon/insert.png"))); // NOI18N
        insertLabel.setText("เพิ่ม");
        insertLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout insertTabLayout = new javax.swing.GroupLayout(insertTab);
        insertTab.setLayout(insertTabLayout);
        insertTabLayout.setHorizontalGroup(
            insertTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertTabLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(insertLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        insertTabLayout.setVerticalGroup(
            insertTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertTabLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(insertLabel)
                .addGap(26, 26, 26))
        );

        homeTab.setBackground(new java.awt.Color(29, 36, 49));
        homeTab.setForeground(new java.awt.Color(255, 255, 255));
        homeTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeTabMouseClicked(evt);
            }
        });

        homeLabel.setBackground(new java.awt.Color(0, 0, 0));
        homeLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(63, 155, 253));
        homeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linklisthw/icon/home.png"))); // NOI18N
        homeLabel.setText("หน้าแรก");
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelMouseExited(evt);
            }
        });
        homeLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                homeLabelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout homeTabLayout = new javax.swing.GroupLayout(homeTab);
        homeTab.setLayout(homeTabLayout);
        homeTabLayout.setHorizontalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(homeLabel)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        homeTabLayout.setVerticalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeTabLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(homeLabel)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insertTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        employeeLabel.setBackground(new java.awt.Color(255, 255, 255));
        employeeLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        employeeLabel.setForeground(new java.awt.Color(255, 255, 255));
        employeeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linklisthw/icon/shop.png"))); // NOI18N
        employeeLabel.setText("จัดการสินค้า");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linklisthw/icon/github.png"))); // NOI18N
        jLabel6.setText("github.com/staciax");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);
        SidePanelLayout.setHorizontalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidePanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(employeeLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(employeeLabel)
                .addGap(114, 114, 114)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(34, 34, 34))
        );

        BG.setBackground(new java.awt.Color(204, 204, 255));
        BG.setForeground(new java.awt.Color(0, 0, 0));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homePanel.setBackground(new java.awt.Color(38, 53, 68));

        jTable1.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "ชื่อ", "ราคา", "จำนวน"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTable1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        homeEmpTitle.setBackground(new java.awt.Color(255, 255, 255));
        homeEmpTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        homeEmpTitle.setForeground(new java.awt.Color(255, 255, 255));
        homeEmpTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linklisthw/icon/product.png"))); // NOI18N
        homeEmpTitle.setText("สินค้า");

        searchEmpField.setForeground(new java.awt.Color(153, 153, 153));
        searchEmpField.setText("ค้นหา");
        searchEmpField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchEmpFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchEmpFieldFocusLost(evt);
            }
        });
        searchEmpField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchEmpFieldKeyTyped(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linklisthw/icon/search.png"))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ไอดี", "ชื่อ", "ราคา", "จำนวน" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("เรียงตาม");

        jButton1.setText("ลบ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(homeEmpTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchEmpField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(homePanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(searchEmpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homeEmpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Tab.addTab("tab1", homePanel);

        insertPanel.setBackground(new java.awt.Color(38, 53, 68));
        insertPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ชื่อ");
        insertPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        insertPriceField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                insertPriceFieldKeyTyped(evt);
            }
        });
        insertPanel.add(insertPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 200, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ราคา");
        insertPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        insertNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNameFieldActionPerformed(evt);
            }
        });
        insertNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                insertNameFieldKeyTyped(evt);
            }
        });
        insertPanel.add(insertNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 200, -1));

        insertQuantityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                insertQuantityFieldKeyTyped(evt);
            }
        });
        insertPanel.add(insertQuantityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 200, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("จำนวน");
        insertPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        insertButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        insertButton.setText("เพิ่ม");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });
        insertPanel.add(insertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        insertEmpTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        insertEmpTitle.setForeground(new java.awt.Color(255, 255, 255));
        insertEmpTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linklisthw/icon/product.png"))); // NOI18N
        insertEmpTitle.setText("เพิ่มสินค้า");
        insertPanel.add(insertEmpTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 32, -1, -1));

        Tab.addTab("tab2", insertPanel);

        BG.add(Tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 660, 570));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(SidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertTabMouseClicked
        this.goToInsert();
    }//GEN-LAST:event_insertTabMouseClicked

    private void insertLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertLabelMouseClicked
        this.goToInsert();
    }//GEN-LAST:event_insertLabelMouseClicked

    private void homeLabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_homeLabelKeyPressed
        // 
    }//GEN-LAST:event_homeLabelKeyPressed

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        this.goToHome();
    }//GEN-LAST:event_homeLabelMouseClicked

    private void homeTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeTabMouseClicked
        this.goToHome();
    }//GEN-LAST:event_homeTabMouseClicked

    private void insertTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertTabMouseEntered
//        this.insertLabel.setForeground(Color.gray);
    }//GEN-LAST:event_insertTabMouseEntered

    private void insertTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertTabMouseExited
//        this.insertLabel.setForeground(Color.black);
    }//GEN-LAST:event_insertTabMouseExited

    private void insertLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertLabelMouseEntered
        if (this.insertLabel.getForeground() == selectColor) {
            return;
        }
        this.insertLabel.setForeground(Color.gray);
    }//GEN-LAST:event_insertLabelMouseEntered

    private void insertLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertLabelMouseExited
        if (this.insertLabel.getForeground() == selectColor) {
            return;
        }
        this.insertLabel.setForeground(whiteColor);
    }//GEN-LAST:event_insertLabelMouseExited

    private void homeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseEntered
        if (this.homeLabel.getForeground() == selectColor) {
            return;
        }
        this.homeLabel.setForeground(Color.gray);
    }//GEN-LAST:event_homeLabelMouseEntered

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseExited
        if (this.homeLabel.getForeground() == selectColor) {
            return;
        }
        this.homeLabel.setForeground(whiteColor);
    }//GEN-LAST:event_homeLabelMouseExited

    private void insertNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertNameFieldActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed

        // name
        String namei = this.insertNameField.getText();
        if (namei.isEmpty()) {
            this.emptyFieldAlert("ชื่อ");
            return;
        }

        // price
        String priceiStr = this.insertPriceField.getText();
        if (priceiStr.isEmpty()) {
            this.emptyFieldAlert("ราคา");
            return;
        }
        int pricei = Integer.parseInt(priceiStr);

        // quantity
        String quantityStr = this.insertQuantityField.getText();
        if (quantityStr.isEmpty()) {
            this.emptyFieldAlert("จำนวน");
            return;
        }
        int quantityi = Integer.parseInt(quantityStr);

        Product prod = new Product(++this.currentID, namei, pricei, quantityi);

        DNode NEW = new DNode(prod);
        this.INSERTLAST(NEW);
        JOptionPane.showMessageDialog(null, "เพิ่มสำเร็จ");
    }//GEN-LAST:event_insertButtonActionPerformed

    private void insertQuantityFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertQuantityFieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_insertQuantityFieldKeyTyped

    private void searchEmpFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchEmpFieldKeyTyped
        String name = this.searchEmpField.getText();
        String find = name;
        DefaultTableModel obj = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        jTable1.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_searchEmpFieldKeyTyped

    private void searchEmpFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchEmpFieldFocusLost
        if (this.searchEmpField.getText().equals("")) {
            this.searchEmpField.setText("ค้นหา");
            this.searchEmpField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_searchEmpFieldFocusLost

    private void searchEmpFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchEmpFieldFocusGained
        if (this.searchEmpField.getText().equals("ค้นหา")) {
            this.searchEmpField.setText("");
            this.searchEmpField.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_searchEmpFieldFocusGained

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        String sort = this.jComboBox1.getSelectedItem().toString();
        switch (sort) {
            case "ไอดี" ->
                this.SortID();
            case "ชื่อ" ->
                this.SortName();
            case "ราคา" ->
                this.SortPrice();
            case "จำนวน" ->
                this.SortQuantity();
            default ->
                this.SortID();
        }
        this.displayHomePage();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/staciax").toURI());
        } catch (Exception e) {
            // todo
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        this.jLabel6.setForeground(Color.cyan);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        this.jLabel6.setForeground(Color.white);
    }//GEN-LAST:event_jLabel6MouseExited

    private void insertPriceFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertPriceFieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_insertPriceFieldKeyTyped

    private void insertNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertNameFieldKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_insertNameFieldKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int r = this.jTable1.getSelectedRow();
        if (r == -1) {
            JOptionPane.showMessageDialog(null, "กรุณาเลือกสินค้าที่จะลบ");
            return;
        }

        String s = this.jTable1.getValueAt(r, 0).toString();
        int id = Integer.parseInt(s);
        int confirm = JOptionPane.showConfirmDialog(null, "ต้องการจะลบสินค้า ไอดี: " + id + " ใช่หรือไม่", "ยืนยัน", JOptionPane.YES_NO_OPTION);
        if (confirm != 0) {
            return;
        }
        boolean isdel = this.DELTWL(id);
        if (!isdel) {
            JOptionPane.showMessageDialog(null, "ไม่พบไอดี: " + id);
            return;
        }
        this.displayHomePage();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        JTable source = (JTable) evt.getSource();
        int row = this.jTable1.getSelectedRow();
        int col = this.jTable1.getSelectedColumn();

        if (row == -1 || col == -1) {
            return;
        }

        String IdStr = source.getModel().getValueAt(row, 0).toString();

        if (IdStr.isEmpty()) {
            this.displayHomePage();
            return;
        }

        String valueAt = source.getModel().getValueAt(row, col).toString();
        if (valueAt.isEmpty()) {
            this.displayHomePage();
            return;
        }
        DNode node = this.SEARCH(Integer.parseInt(IdStr));
        if (node == null) {
            this.displayHomePage();
            return;
        }

        switch (col) {
            case 1:
                // name
                node.INFOR.name = valueAt;
                break;
            case 2:
                // price
                if (!isNumeric(valueAt)) {
                    break;
                }
                int p = Integer.parseInt(valueAt);
                if (p >= 0) {
                    node.INFOR.price = p;
                }

                break;
            case 3:
                // quantity
                if (!isNumeric(valueAt)) {
                    break;
                }
                int q = Integer.parseInt(valueAt);
                if (q >= 0) {
                    node.INFOR.quantity = q;
                }
                break;
            default:
                break;
        }
        this.displayHomePage();
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        System.out.println("jTable1KeyPressed");
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseExited
//        System.out.println("jTable1MouseExited");
    }//GEN-LAST:event_jTable1MouseExited

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
//        System.out.println("jTable1MouseReleased");
//        this.displayHomePage();
    }//GEN-LAST:event_jTable1MouseReleased

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyTyped

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
//        this.displayHomePage();
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MousePressed

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
            java.util.logging.Logger.getLogger(LinkedListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LinkedListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LinkedListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LinkedListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LinkedListGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JTabbedPane Tab;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JLabel homeEmpTitle;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel homeTab;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel insertEmpTitle;
    private javax.swing.JLabel insertLabel;
    private javax.swing.JTextField insertNameField;
    private javax.swing.JPanel insertPanel;
    private javax.swing.JTextField insertPriceField;
    private javax.swing.JTextField insertQuantityField;
    private javax.swing.JPanel insertTab;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField searchEmpField;
    // End of variables declaration//GEN-END:variables
}
