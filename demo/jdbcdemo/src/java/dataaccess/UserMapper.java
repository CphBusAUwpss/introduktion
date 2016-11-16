package dataaccess;

import domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thomas Hartmann - tha@cphbusiness.dk created on Nov 16, 2016 
 */
public class UserMapper {
    public void createUser(){}
//    public User getUser(int id){}
//    public List<User> getAllUsers(){}
//    public void deleteUser(int id){}
    public void editUser(User user){}
    public boolean authenticateUser(String username, String password){
        try {
            String sql = "select username, password from usertable where username = ?";
            Connection con = DB.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                String passwordFromDB = rs.getString("password");
                if(passwordFromDB.equals(password)){
                    return true;
                }
            }else{
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return false;
    }
    
    public static void main(String[] args) {
        UserMapper um = new UserMapper();
        boolean isAuthenticated = um.authenticateUser("testuser", "pasword123");
        if(isAuthenticated)
            System.out.println("YEASS we are in");
        else
            System.out.println("Oh no no access");
    }
}
