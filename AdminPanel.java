package coffeeshopsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.io.FileWriter;  
public class AdminPanel extends javax.swing.JFrame implements ActionListener{
    public AdminPanel(StringBuilder bill) {
        finalBill=new StringBuilder("");
        finalBill.append(bill.toString());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
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
        btnProcessOrder = new javax.swing.JButton();
        btnAddInventry = new javax.swing.JButton();
        btnAllOrders = new javax.swing.JButton();
        pnlHeadBar = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblLogoText = new javax.swing.JLabel();
        pnlDetails = new javax.swing.JPanel();
        lblLogoText5 = new javax.swing.JLabel();
        lblLogoText6 = new javax.swing.JLabel();
        lblSelectedItems = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        pnlPayment = new javax.swing.JPanel();
        lblLogoText2 = new javax.swing.JLabel();
        radioCash = new javax.swing.JRadioButton();
        radioCard = new javax.swing.JRadioButton();
        btnCardSelect = new javax.swing.JButton();
        lblLogoText3 = new javax.swing.JLabel();
        pnlTransaction = new javax.swing.JPanel();
        lblLogoText4 = new javax.swing.JLabel();
        lblCash = new javax.swing.JLabel();
        txtCash = new javax.swing.JTextField();
        lblCard = new javax.swing.JLabel();
        txtCard = new javax.swing.JComboBox<>();
        btnGenerateRecipt = new javax.swing.JButton();
        setVisible(true);
        setPreferredSize(new Dimension(890,650));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlParent.setBackground(new java.awt.Color(254, 254, 254));

        pnlSide.setBackground(new java.awt.Color(1, 39, 40));

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

        btnProcessOrder.setBackground(new java.awt.Color(1, 39, 40));
        btnProcessOrder.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnProcessOrder.setForeground(new java.awt.Color(254, 254, 254));
        btnProcessOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/coffee.png"))); // NOI18N
        btnProcessOrder.setText("Process Order");
        btnProcessOrder.setBorderPainted(false);
        btnProcessOrder.setIconTextGap(25);
        btnProcessOrder.addActionListener(this);


        btnAddInventry.setBackground(new java.awt.Color(1, 39, 40));
        btnAddInventry.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnAddInventry.setForeground(new java.awt.Color(254, 254, 254));
        btnAddInventry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/order.png"))); // NOI18N
        btnAddInventry.setText("Add Inventry");
        btnAddInventry.setBorderPainted(false);
        btnAddInventry.setIconTextGap(25);
        btnAddInventry.addActionListener(this);


        btnAllOrders.setBackground(new java.awt.Color(1, 39, 40));
        btnAllOrders.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnAllOrders.setForeground(new java.awt.Color(254, 254, 254));
        btnAllOrders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/help.png"))); // NOI18N
        btnAllOrders.setText("All Orders");
        btnAllOrders.setBorderPainted(false);
        btnAllOrders.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAllOrders.setIconTextGap(25);
        btnAllOrders.addActionListener(this);
        btnAllOrders.setVisible(false);

        javax.swing.GroupLayout pnlSideLayout = new javax.swing.GroupLayout(pnlSide);
        pnlSide.setLayout(pnlSideLayout);
        pnlSideLayout.setHorizontalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcessOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAllOrders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddInventry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSideLayout.setVerticalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSideLayout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addGap(0, 0, 0)
                        .addComponent(btnProcessOrder))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(btnAddInventry)
                .addGap(0, 0, 0)
                .addComponent(btnAllOrders)
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
        lblLogoText5.setText("Items Selected:");

        lblLogoText6.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        lblLogoText6.setForeground(new java.awt.Color(31, 12, 12));
        lblLogoText6.setText("Total Price:");

        lblSelectedItems.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        lblTotalPrice.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogoText5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectedItems, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogoText6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblLogoText5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSelectedItems, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogoText6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lblLogoText2.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        lblLogoText2.setForeground(new java.awt.Color(31, 12, 12));
        lblLogoText2.setText("Select Payment Method :");

         ButtonGroup bg=new ButtonGroup();    
       // pnlPayment.add(bg);
        radioCash.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        radioCash.setText("Cash ");
        bg.add(radioCash);

        radioCard.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        radioCard.setText("Card (Visa/Master)");
        bg.add(radioCard);


        btnCardSelect.setBackground(new java.awt.Color(1, 39, 40));
        btnCardSelect.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnCardSelect.setForeground(new java.awt.Color(254, 254, 254));
        btnCardSelect.setText("Process Now");
        btnCardSelect.setBorderPainted(false);
        btnCardSelect.setOpaque(true);

        btnCardSelect.addActionListener(this);

        javax.swing.GroupLayout pnlPaymentLayout = new javax.swing.GroupLayout(pnlPayment);
        pnlPayment.setLayout(pnlPaymentLayout);
        pnlPaymentLayout.setHorizontalGroup(
            pnlPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogoText2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPaymentLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioCash)
                            .addGroup(pnlPaymentLayout.createSequentialGroup()
                                .addComponent(radioCard)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                                .addComponent(btnCardSelect)))))
                .addContainerGap())
        );
        pnlPaymentLayout.setVerticalGroup(
            pnlPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPaymentLayout.createSequentialGroup()
                .addComponent(lblLogoText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioCash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioCard)
                    .addComponent(btnCardSelect))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lblLogoText3.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        lblLogoText3.setForeground(new java.awt.Color(31, 12, 12));
        lblLogoText3.setText("Owner");

        lblLogoText4.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        lblLogoText4.setForeground(new java.awt.Color(31, 12, 12));
        lblLogoText4.setText("Transaction Type :");

        lblCash.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        lblCash.setForeground(new java.awt.Color(31, 12, 12));
        lblCash.setText("Enter Tendered Amount");
        

        lblCard.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        lblCard.setForeground(new java.awt.Color(31, 12, 12));
        lblCard.setText("Select Card");
        


        txtCard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa", "Master" }));
        
        lblCash.setVisible(false);
        lblCard.setVisible(false);
        txtCard.setVisible(false);
        txtCash.setVisible(false);
        btnGenerateRecipt.setVisible(false);

        btnGenerateRecipt.setBackground(new java.awt.Color(1, 39, 40));
        btnGenerateRecipt.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnGenerateRecipt.setForeground(new java.awt.Color(254, 254, 254));
        btnGenerateRecipt.setText("Generate Recipt");
        btnGenerateRecipt.setBorderPainted(false);
        btnGenerateRecipt.setOpaque(true);
        btnGenerateRecipt.addActionListener(this);


        javax.swing.GroupLayout pnlTransactionLayout = new javax.swing.GroupLayout(pnlTransaction);
        pnlTransaction.setLayout(pnlTransactionLayout);
        pnlTransactionLayout.setHorizontalGroup(
            pnlTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransactionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTransactionLayout.createSequentialGroup()
                        .addComponent(lblLogoText4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 291, Short.MAX_VALUE))
                    .addGroup(pnlTransactionLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCash, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCard, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCard, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTransactionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGenerateRecipt)))
                .addContainerGap())
        );
        pnlTransactionLayout.setVerticalGroup(
            pnlTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransactionLayout.createSequentialGroup()
                .addComponent(lblLogoText4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCash)
                    .addComponent(lblCard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGenerateRecipt)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlParentLayout = new javax.swing.GroupLayout(pnlParent);
        pnlParent.setLayout(pnlParentLayout);
        pnlParentLayout.setHorizontalGroup(
            pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParentLayout.createSequentialGroup()
                .addComponent(pnlSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHeadBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlParentLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlParentLayout.createSequentialGroup()
                                .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(lblLogoText3))
                            .addComponent(pnlDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        pnlParentLayout.setVerticalGroup(
            pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlParentLayout.createSequentialGroup()
                .addComponent(pnlHeadBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlParentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLogoText3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    /* public static void main(String args[]) {
          StringBuilder s=new StringBuilder("no any data");
         new AdminPanel(s);
    }
*/
     public void actionPerformed(ActionEvent evt)
    {
       Object clicked=evt.getSource();
        connectdb=new ConnectDB();
        
        if(clicked==btnHome)
        {
            new CoffeeShopHome(1);
            dispose();
        }

        if(clicked==btnAddInventry)
        {
            new Inventry();
        }

        //fetching coffee menu-------------------------------------------------
        if(clicked==btnProcessOrder)
        {   
            System.out.println("btnProcessOrder");

              try
              {
                   //connect to db:
                con=connectdb.connect();
                //create statement:
                ps=con.prepareStatement("SELECT * FROM pendingtransaction order by item");
                //execute statement/query
                rs=ps.executeQuery();
                if (rs.next() == false) 
                {
                    JOptionPane.showMessageDialog(this,"OOPS...No any order..");
                }
                else
                {
                    do
                     {
                     grandTotal=Integer.parseInt(rs.getString(3));
                
                    lblSelectedItems.setText(rs.getString(2));
                    lblTotalPrice.setText(rs.getString(3)+"$");
                    finalPrice=rs.getString(3);
                    finalItems=rs.getString(2);
                   
                     }while(rs.next());//end of while
                }
                

              }
              catch(Exception e)
              {
                System.out.println("Exception:"+e);
              }

     }//end of btnPrcessOrder
     //END OF FETCHING COFFEE MENU---------------------------------------
     if(clicked==btnCardSelect)
     {
        if(lblSelectedItems.getText().toString().equals(""))
        {
            transType="";
            JOptionPane.showMessageDialog(this,"Please fetch order form Menu \"Process Order\"");
        }
        else
        {
            if(radioCard.isSelected())
        {
              transType="card";
              lblCard.setVisible(true);
              txtCard.setVisible(true);
              lblCash.setVisible(false);
              txtCash.setVisible(false);
             btnGenerateRecipt.setVisible(true);

        } 
        else if(radioCash.isSelected())
        {
            lblCash.setVisible(true);
            txtCash.setVisible(true);
            lblCard.setVisible(false);
              txtCard.setVisible(false);
             btnGenerateRecipt.setVisible(true);
            transType="cash";
        }   
        else
        {
            transType="";
            JOptionPane.showMessageDialog(this,"Please select card type Visa/Master");
        }
        }
         
     }


     if(clicked==btnGenerateRecipt)
     {
        if(transType.equals("cash"))
        {
            txtCash.setText(""+grandTotal);
            transType="";
            try
            {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
                 LocalDateTime now = LocalDateTime.now();  
                //System.out.println(dtf.format(now));  

                connectdb=new ConnectDB();
               //connect to db:
                con=connectdb.connect();
               //create statement:
                 StringBuilder id=new StringBuilder("");
                 int ran= (int)(5 + (Math.random() * 394898));
                 id.append(finalItems.toString().substring(0,2)+":"+ran);
                 try
                 {
                     givenChange=Integer.parseInt(txtCash.getText().toString());   
                 }
                 catch(Exception e)
                 {
                    JOptionPane.showMessageDialog(this,"Please enter valid tendered amount.");
                 }

                  ps=con.prepareStatement("insert into cashtransaction values(?,?,?,?,?,?)");
                    ps.setString(1,id.toString());
                   ps.setString(2,dtf.format(now));
                   ps.setString(3,finalItems);
                   ps.setString(4,finalPrice);
                    ps.setString(5,String.valueOf(givenChange));
                    ps.setString(6,String.valueOf(givenChange-grandTotal));

                 ran=ps.executeUpdate();
                if(ran==1)
                {
                    
                    finalBill.append("\n Date & Time: "+dtf.format(now)+"\n");
                    finalBill.append(" Transaction Method : cash\n");
                    finalBill.append(" Tendered Amount : "+givenChange+"\n");
              //     finalBill.append(" Change Given : "+(givenChange - grandTotal)+"\n");


                    finalBill.append("-------------------------------------------\n");
                    JOptionPane.showMessageDialog(this,finalBill.toString());

                    ps=con.prepareStatement("truncate table pendingtransaction");
                    ps.executeUpdate();

                    lblTotalPrice.setText("");
                    lblSelectedItems.setText("");
                    lblCash.setVisible(false);
                   lblCard.setVisible(false);
                        txtCard.setVisible(false);
                    txtCash.setVisible(false);
                   btnGenerateRecipt.setVisible(false);
                    
                    
                }     
            } 
            catch(Exception e)
            {
                System.out.println("Exception is: "+e);
            }
        }
        else if(transType.equals("card"))
        {
            transType="";
            try
            {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                 LocalDateTime now = LocalDateTime.now();  
                //System.out.println(dtf.format(now));  

                connectdb=new ConnectDB();
               //connect to db:
                con=connectdb.connect();
               //create statement:
                 StringBuilder id=new StringBuilder("");
                 int ran= (int)(5 + (Math.random() * 394898));
                 id.append(finalItems.toString().substring(0,2)+":"+ran);
                  ps=con.prepareStatement("insert into cardtransaction values(?,?,?,?,?)");
                    ps.setString(1,id.toString());
                   ps.setString(2,dtf.format(now));
                   ps.setString(3,finalItems);
                   ps.setString(4,finalPrice);
                    ps.setString(5,String.valueOf(txtCard.getItemAt(txtCard.getSelectedIndex())));

                 ran=ps.executeUpdate();
                if(ran==1)
                {
                    
                   finalBill.append("\n Date & Time: "+dtf.format(now)+"\n");
                   finalBill.append("\n Transaction Method : Card.\n");
                   finalBill.append("\n Card Type :"+String.valueOf(txtCard.getItemAt(txtCard.getSelectedIndex()))+".\n");      
                    finalBill.append("-------------------------------------------\n");
                    JOptionPane.showMessageDialog(this,finalBill.toString());

                    ps=con.prepareStatement("truncate table pending transaction");
                    ps.executeUpdate();

                    lblTotalPrice.setText("");
                    lblSelectedItems.setText("");
                    lblCash.setVisible(false);
        lblCard.setVisible(false);
        txtCard.setVisible(false);
        txtCash.setVisible(false);
        btnGenerateRecipt.setVisible(false);
                    
                    
                }
  
            } 
            catch(Exception e)
            {
                System.out.println("Exception is: "+e);
            }
        }
         try{    
                finalBill.append("\n\n\n\n\n");
                FileWriter fw=new FileWriter("transaction.txt",true);    
                fw.write(finalBill.toString());    
                fw.close();    
          }
          catch(Exception e)
          {
            System.out.println(e);
          }
     }
    
    }//end of action listener














    // Variables declaration - do not modify 
     int totalRows=0,i=0,count=0,grandTotal=0,transactionNum=1;
     String transType,finalPrice,finalItems;
    StringBuilder finalBill;
                ConnectDB connectdb;
                Connection con;
                ResultSet rs;
                PreparedStatement ps; 
                int givenChange=0;               
    private javax.swing.JButton btnAddInventry;
    private javax.swing.JButton btnAllOrders;
    private javax.swing.JButton btnCardSelect;
    private javax.swing.JButton btnGenerateRecipt;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnProcessOrder;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCard;
    private javax.swing.JLabel lblCash;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogoText;
    private javax.swing.JLabel lblLogoText2;
    private javax.swing.JLabel lblLogoText3;
    private javax.swing.JLabel lblLogoText4;
    private javax.swing.JLabel lblLogoText5;
    private javax.swing.JLabel lblLogoText6;
    private javax.swing.JLabel lblSelectedItems;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlHeadBar;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlParent;
    private javax.swing.JPanel pnlPayment;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlTransaction;
    private javax.swing.JRadioButton radioCard;
    private javax.swing.JRadioButton radioCash;
    private javax.swing.JComboBox<String> txtCard;
    private javax.swing.JTextField txtCash;
    // End of variables declaration                   
}
