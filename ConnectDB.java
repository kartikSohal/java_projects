package coffeeshopsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class ConnectDB {
    private Connection con=null;
    
    public Connection connect()
    {
        if(con==null)
        {
            try
            {
            //for local phpmyadmin     
            
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeemanagementsystem","root","");
           }
            catch(ClassNotFoundException | SQLException e)
            {
                System.out.println("exp:"+e);
                JOptionPane.showMessageDialog(null,"Error: Database not connected");
            }
        }
        else
        {
            System.out.println("already connected");
        }
            return con;
    }
    
    public void disconnect()
    {
        try
        {
           con.close();
           System.out.println("disconnected.");
        }
        catch(Exception e)
        {
           
        }
    }
    public static void main(String[] args) {
        ConnectDB db=new ConnectDB();
        db.connect();
        db.disconnect();
    }
   
   
}




/* 
    DATABASE QUERIES : 

    1. create table inventry(id varchar(10),item varchar(100),price int);

    2. create table pendingtransaction(id varchar(10),item varchar(500),price int);

    3. create table cashtransaction(id varchar(10),datetime date,item_purchased varchar(500),price int,amount_tendered int, change_given int);
    
    4. create table cardtransaction(id varchar(10),datetime date,item_purchased varchar(500),price int,card_type varchar(7));

*/