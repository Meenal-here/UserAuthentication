package DataAccessObject;
import model.UserLoginFormBean;
import java.sql.*;
import java.util.ArrayList;
public class UserLoginFormAction {
    
    public boolean insertRecords(UserLoginFormBean data)
    {
        boolean flag = false;
        try
        {
            String query = "insert into user_login(username,email, contact,gender,securityKey,securityAns,passwordLogin,roleType) values(?,?,?,?,?,?,?,?)";
            PreparedStatement ps;
            ps = DBConnection.getMySQLConnection().prepareStatement(query);
            
           
            ps.setString(1, data.getUserName());
            ps.setString(2, data.getEmail());
            ps.setLong(3,data.getContactName()); // assuming contact number is numeric
            ps.setString(4,data.getGender());
            ps.setString(5,data.getSecurityKey());
            ps.setString(6,data.getSecurityAnswer());
            ps.setString(7,data.getPassword());
            ps.setString(8,data.getRoletype());
            
            if(ps.executeUpdate()>0)
            {
                flag = true;
            } 
        }
        
        catch(Exception ex)
        {
         System.out.println(ex);
         flag = false;
        }

        return flag;
        
     }
    
     public UserLoginFormBean searchRecords(String userName)
     {
         UserLoginFormBean data = null;
         
         try
         {
            String query = "select * from user_login where username = ?";
            PreparedStatement ps = DBConnection.getMySQLConnection().prepareStatement(query); 
            ps.setString(1, userName);
                       
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                data = new UserLoginFormBean();
                data.setUserName(rs.getString(1));
                data.setEmail(rs.getString(2));
                data.setContactName(rs.getLong(3));
                data.setGender(rs.getString(4));
                data.setSecurityKey(rs.getString(5));
                data.setSecurityAnswer(rs.getString(6));
                data.setPassword(rs.getString(7));
                data.setRoletype(rs.getString(8));
            }
    
         }
         catch(Exception ex)
         {
             System.out.println(ex);
             data = null;
         }
         
         return data;
     }
     
     public boolean updateRecords(UserLoginFormBean data)
    {
        boolean flag = false;
        
        try
        {
            String query = "UPDATE user_Login SET email=?, contact=?, gender=?, securityKey=?, securityAns = ?, passwordLogin = ?, roleType = ? WHERE username = ?";
            PreparedStatement ps= DBConnection.getMySQLConnection().prepareStatement(query);
            
            ps.setString(1, data.getEmail());
            ps.setLong(2, data.getContactName());
            ps.setString(3, data.getGender());
            ps.setString(4, data.getSecurityKey());
            ps.setString(5, data.getSecurityAnswer());
            ps.setString(6, data.getPassword());
            ps.setString(7, data.getRoletype());
            ps.setString(8, data.getUserName());
            
            if(ps.executeUpdate()>0)
            {
                flag = true;
            }
                
        }
        catch(Exception e)
        {
            System.out.println(e);
            flag = false;
        }
        return flag;
   }
     
     public boolean deleteRecords(String username)
    {
        boolean flag = false;
        
        try
        {
            String query = "DELETE FROM user_Login WHERE username = ?";
            PreparedStatement ps= DBConnection.getMySQLConnection().prepareStatement(query);
            
            ps.setString(1, username);
           
            
            if(ps.executeUpdate()>0)
            {
                flag = true;
            }
                
        }
        catch(Exception e)
        {
            System.out.println(e);
            flag = false;
        }
        return flag;
    }   
     
     public boolean updatePassword(UserLoginFormBean data)
    {
        boolean flag = false;
        
        try
        {
            String query = "UPDATE user_Login SET passwordLogin = ? WHERE username = ?";
            PreparedStatement ps= DBConnection.getMySQLConnection().prepareStatement(query);
            
            ps.setString(1, data.getPassword());
            ps.setString(2, data.getUserName());
            
            if(ps.executeUpdate()>0)
            {
                flag = true;
            }
                
        }
        catch(Exception e)
        {
            System.out.println(e);
            flag = false;
        }
        return flag;
   }
     
     public ArrayList<UserLoginFormBean> getAllRecords()
     {  ArrayList<UserLoginFormBean> list = null;
         try
         {
            String query = "select username,email,contact,gender,roleType from user_login";
            PreparedStatement ps = DBConnection.getMySQLConnection().prepareStatement(query);                        
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                list = new ArrayList<UserLoginFormBean>();
                do
                {
                    UserLoginFormBean data = new UserLoginFormBean();
                    data.setUserName(rs.getString(1));
                    data.setEmail(rs.getString(2));
                    data.setContactName(rs.getLong(3));
                    data.setGender(rs.getString(4));
                    data.setRoletype(rs.getString(5));                    
                    list.add(data);

                    
                }
                while(rs.next());
            }
            
         }
         
         catch(Exception ex)
         {
             System.out.println(ex);
             return null;
         }
         
         return list;
     }
 }


