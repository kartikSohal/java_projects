package coffeeshopsystem;
import javax.swing.*;
import java.awt.event.*;
public class AdminLogin extends javax.swing.JFrame implements ActionListener{
   StringBuilder bill=new StringBuilder("");
    public AdminLogin(StringBuilder billl) {
        initComponents();
        bill.append(billl.toString());
    }                 
    private void initComponents() {
        setVisible(true);
        setResizable(false);
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        pnlParent = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pnlHeadBar = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblLogoText = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblLogoText5 = new javax.swing.JLabel();
        lblLogoText6 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtPwd = new javax.swing.JPasswordField();
        lblLogoText3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlParent.setBackground(new java.awt.Color(254, 254, 254));

        pnlSide.setBackground(new java.awt.Color(1, 39, 40));
         btnHome.setBackground(new java.awt.Color(1, 39, 40));
        btnHome.setBackground(new java.awt.Color(1, 39, 40));
        btnHome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(254, 254, 254));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/home.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setBorderPainted(false);
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.setIconTextGap(25);
        btnHome.addActionListener(this);

        jPanel1.setBackground(new java.awt.Color(212, 47, 34));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );
        javax.swing.GroupLayout pnlSideLayout = new javax.swing.GroupLayout(pnlSide);
        pnlSide.setLayout(pnlSideLayout);
        pnlSideLayout.setHorizontalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
        );
        pnlSideLayout.setVerticalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeadBar.setBackground(new java.awt.Color(212, 47, 34));
        javax.swing.GroupLayout pnlHeadBarLayout = new javax.swing.GroupLayout(pnlHeadBar);
        pnlHeadBar.setLayout(pnlHeadBarLayout);
        pnlHeadBarLayout.setHorizontalGroup(
            pnlHeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlHeadBarLayout.setVerticalGroup(
            pnlHeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlLogo.setBackground(new java.awt.Color(212, 47, 34));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/chef.png"))); // NOI18N

        lblLogoText.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        lblLogoText.setForeground(new java.awt.Color(254, 254, 254));
        lblLogoText.setText("Coffee Shop");

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addGap(54, 54, 54))
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogoText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogoText)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        lblLogoText5.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        lblLogoText5.setForeground(new java.awt.Color(31, 12, 12));
        lblLogoText5.setText("Username");

        lblLogoText6.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        lblLogoText6.setForeground(new java.awt.Color(31, 12, 12));
        lblLogoText6.setText("Password");

        btnReset.setBackground(new java.awt.Color(1, 39, 40));
        btnReset.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(254, 254, 254));
        btnReset.setText("Reset");
        btnReset.setBorderPainted(false);
        btnReset.setOpaque(true);
        btnReset.addActionListener(this);

        txtUser.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        btnLogin.setBackground(new java.awt.Color(1, 39, 40));
        btnLogin.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(254, 254, 254));
        btnLogin.setText("Login");
        btnLogin.setBorderPainted(false);
        btnLogin.setOpaque(true);
        btnLogin.addActionListener(this);

        txtPwd.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogoText6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogoText5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlLoginLayout.createSequentialGroup()
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtPwd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 82, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLogoText5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogoText6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnLogin))
                .addGap(22, 22, 22))
        );

        lblLogoText3.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        lblLogoText3.setForeground(new java.awt.Color(31, 12, 12));
        lblLogoText3.setText("Owner Login");

        javax.swing.GroupLayout pnlParentLayout = new javax.swing.GroupLayout(pnlParent);
        pnlParent.setLayout(pnlParentLayout);
        pnlParentLayout.setHorizontalGroup(
            pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParentLayout.createSequentialGroup()
                .addComponent(pnlSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHeadBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlParentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(pnlParentLayout.createSequentialGroup()
                        .addGroup(pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlParentLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlParentLayout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(lblLogoText3)))
                        .addContainerGap())))
        );
        pnlParentLayout.setVerticalGroup(
            pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlParentLayout.createSequentialGroup()
                .addComponent(pnlHeadBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLogoText3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        
/*
   
    public static void main(String args[]) {
        StringBuilder s=new StringBuilder("no any order");
        new AdminLogin(s);
    }*/
    
    public void actionPerformed(ActionEvent evt)
    {
        Object clicked=evt.getSource();
        if(clicked==btnHome)
        {
            new CoffeeShopHome(1);
            dispose();
        }
        if(clicked==btnReset)
        {
            txtPwd.setText("");
            txtUser.setText("");
        }
     
        if(clicked==btnLogin)
        {
            if(txtUser.getText().toString().equals("admin") && txtPwd.getText().toString().equals("admin"))
            {
                JOptionPane.showMessageDialog(this,"Login Successfull...");
                new AdminPanel(bill);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Invalid username or password");
            }
        }
    }

                 
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogoText;
    private javax.swing.JLabel lblLogoText3;
    private javax.swing.JLabel lblLogoText5;
    private javax.swing.JLabel lblLogoText6;
    private javax.swing.JPanel pnlHeadBar;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlParent;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUser;
    // End of variables declaration                   
}
