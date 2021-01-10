package coffeeshopsystem;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;
public class Inventry extends javax.swing.JFrame implements ActionListener{

    public Inventry() {
        initComponents();
    }
    private void initComponents() {
        setVisible(true);
        setResizable(false);
        pnlDetails = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlInventry = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inventryTable = new javax.swing.JTable();
        pnlDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlDetails.setAutoscrolls(true);

        jLabel7.setBackground(new java.awt.Color(17, 11, 5));
        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel7.setText("Add New Inventry");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel4.setText("Item Name");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel5.setText("Item Price");

        txtItem.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        txtItem.setOpaque(true);

        txtPrice.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        txtPrice.setOpaque(true);

        btnAddItem.addActionListener(this);
        btnAddItem.setText("Add Item");
        btnAddItem.setBounds(60,130,150,50);
        pnlDetails.add(btnAddItem);
        btnAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/add.png"))); // NOI18N
        btnRefresh=new JButton("Refresh");
        btnRefresh.setBounds(20,200,90,50);
        pnlDetails.add(btnRefresh);
        btnRefresh.addActionListener(this);
        
        btnUpdate=new JButton("Update");
        btnUpdate.setBounds(120,200,90,50);
        pnlDetails.add(btnUpdate);
        btnUpdate.addActionListener(this);
      
        btnDelete=new JButton("Delete");
        btnDelete.setBounds(220,200,90,50);
        pnlDetails.add(btnDelete);
        btnDelete.addActionListener(this);

        javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDetailsLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(3, 3, 3)
                                .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDetailsLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel7)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetailsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnAddItem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jLabel8.setBackground(new java.awt.Color(17, 11, 5));
        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel8.setText("Inventry");


        model=new DefaultTableModel(0,5);
        inventryTable=new JTable(model);
        String header[]={"Sr. No.","Item","Price"};
        model.setColumnIdentifiers(header);

        inventryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_UsersMouseClicked(evt);
            }
        });


        jScrollPane2.setViewportView(inventryTable);

        javax.swing.GroupLayout pnlInventryLayout = new javax.swing.GroupLayout(pnlInventry);
        pnlInventry.setLayout(pnlInventryLayout);
        pnlInventryLayout.setHorizontalGroup(
            pnlInventryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInventryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(pnlInventryLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInventryLayout.setVerticalGroup(
            pnlInventryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventryLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(pnlInventry);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );
        pack();
    }// </editor-fold>                        

    public static void main(String args[]) {
        new Inventry();
    }

    public void actionPerformed(ActionEvent evt)
    {
        Object clicked=evt.getSource();
        connectdb=new ConnectDB();

        if(clicked==btnRefresh)
        {
                    fetchData();

        }
      
        if(clicked==btnAddItem)
        {
            StringBuilder id=new StringBuilder("");
             if(txtItem.getText().toString().equals("") || txtPrice.getText().toString().equals(""))
            {
                JOptionPane.showMessageDialog(this,"Please fill both field(Item and price).");
            }
            else
            {
                int ran= (int)(5 + (Math.random() * 394898));
            id.append(txtItem.getText().toString().substring(0,2)+":"+ran);
             try
            {
                
               //connect to db:
                con=connectdb.connect();
               //create statement:
                ps=con.prepareStatement("insert into inventry values(?,?,?)");
                ps.setString(1,id.toString());
                ps.setString(2,txtItem.getText().toString());
                ps.setString(3,txtPrice.getText().toString());
                ran=ps.executeUpdate();
                if(ran==1)
                {
                    JOptionPane.showMessageDialog(this,"Record Added Successfully");
                    fetchData();
                }

                
            } 
            catch(Exception e)
            {
                System.out.println("Exception is: "+e);
            }
            }
            
        }

        if(clicked==btnUpdate)
        {
            if(txtItem.getText().toString().equals("") || txtPrice.getText().toString().equals(""))
            {
                JOptionPane.showMessageDialog(this,"Please select a row from inventry table.");
            }
            else
            {
                try
            {
                
               //connect to db:
                con=connectdb.connect();
               //create statement:
                ps=con.prepareStatement("update inventry set item=? , price=? where id=?");
                
                ps.setString(1,txtItem.getText().toString());
                ps.setString(2,txtPrice.getText().toString());
                ps.setString(3,id.toString());
                int ran=ps.executeUpdate();
                if(ran==1)
                {
                    JOptionPane.showMessageDialog(this,"Record Update Successfully");
                    txtItem.setText("");
                    txtPrice.setText("");
                    
                    fetchData();
                }

                
            } 
            catch(Exception e)
            {
                System.out.println("Exception is: "+e);
            }
            }
        }
        if(clicked==btnDelete)
        {
            if(txtItem.getText().toString().equals("") || txtPrice.getText().toString().equals(""))
            {
                JOptionPane.showMessageDialog(this,"Please select a row from inventry table.");
            }
            else
            {
                try
            {
                
               //connect to db:
                con=connectdb.connect();
               //create statement:
                ps=con.prepareStatement("delete from inventry where id=?");    
                ps.setString(1,id.toString());
                int ran=ps.executeUpdate();
                if(ran==1)
                {
                    JOptionPane.showMessageDialog(this,"Record Deleted Successfully");
                    txtItem.setText("");
                    txtPrice.setText("");
                    fetchData();
                }

                
            } 
            catch(Exception e)
            {
                System.out.println("Exception is: "+e);
            }
            }
        }
    }//end actionlistener
    void jTable_Display_UsersMouseClicked(java.awt.event.MouseEvent evt) {                                                  
       // Get The Index Of The Slected Row 
        int i = inventryTable.getSelectedRow();

        TableModel model = inventryTable.getModel();
        
         // Display Slected Row In JTexteFields
        id=model.getValueAt(i,0).toString();
        txtItem.setText(model.getValueAt(i,1).toString());

        txtPrice.setText(model.getValueAt(i,2).toString());
    }     
    void fetchData()
    {
        model.setRowCount(0);
              try
              {
                   //connect to db:
                con=connectdb.connect();
               //create statement:
                ps=con.prepareStatement("SELECT * FROM inventry");
                //execute statement/query
                rs=ps.executeQuery();
                while(rs.next())
                {
                    model.addRow(new Object[]{rs.getString(1), rs.getString(2),rs.getString(3)});
                }
              }
              catch(Exception e)
              {
                System.out.println("Exception:"+e);
              }
    }

    // Variables declaration - do not modify     
    Connection con;
    ConnectDB connectdb;
    PreparedStatement ps;
    ResultSet rs;
    JButton btnRefresh;
    String id;
    private DefaultTableModel model;
    private javax.swing.JButton btnAddItem,btnUpdate,btnDelete,btnHome;//btnDel,btnDel;
    private javax.swing.JTable inventryTable;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlInventry;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration                   
}
