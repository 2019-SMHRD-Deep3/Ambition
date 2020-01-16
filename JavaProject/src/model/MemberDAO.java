package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

   private String url = "jdbc:oracle:thin:@localhost:1521:xe";
   private String user = "hr";
   private String password = "hr";
   private Connection conn = null;
   private PreparedStatement psmt = null;
   private ResultSet rs = null;
   
//   회원가입  인설트 dao  service와도 연동.
   public int insert(Member member) {
      int rows = 0;
      try { // try~catch 예외처리
         Class.forName("oracle.jdbc.driver.OracleDriver");
         conn = DriverManager.getConnection(url, user, password); // 커넥션객체
         String sql = "INSERT INTO logininfo VALUES (?,?,?,?,?)";
         psmt = conn.prepareStatement(sql); // sql문이 psmt로 객체생성됨.
         
         psmt.setString(1, member.getArmy_id());
         psmt.setString(2, member.getPassword());
         psmt.setString(3, member.getPasswordCheck());
         psmt.setInt(4, member.getPhonnumber());
         psmt.setInt(5, member.getSex());
         
         rows = psmt.executeUpdate(); //실행된 줄수.
//         if (rows == 0) {
//            System.out.println("SQL문을 확인하세요.");
//         } 이명령문은 뷰에서해야함.
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } // class 객체를 생성해서 메모리에 올려주는 역할.

      catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if(psmt != null) {
               psmt.close();
               }
            if(conn != null) {
               conn.close();
               }
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
      return rows; //줄수를 리퉌
   }



   public Member selectOne(Member m) {
      Member loginUser = null;
      
      try { // try~catch 예외처리
         Class.forName("oracle.jdbc.driver.OracleDriver");
         conn = DriverManager.getConnection(url, user, password); // 커넥션객체
         String sql = "SELECT * FROM logininfo WHERE army_id = ? AND password =?";
         
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, m.getArmy_id());
         psmt.setString(2, m.getPassword());
         rs = psmt.executeQuery(); //실행하는것.
         
         if(rs.next()) {
            // 해당 ID와 PW를 가진 사람이 존재
            String Army_id = rs.getString("Army_id");
            String Password = rs.getString("Password");
            String PasswordCheck = rs.getString("PasswordCheck");
            int phonenumber = rs.getInt("Phonenumber");
            int sex = rs.getInt("sex");
            
            loginUser = new Member(Army_id, Password, PasswordCheck, phonenumber, sex); //객체생성
         }

         
         
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } // class 객체를 생성해서 메모리에 올려주는 역할.

      catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if(rs != null) rs.close(); //SELECT는 리졸트셋이 하나더열려있어서 닫는것도 하나더.
            if(psmt != null) {
               psmt.close();
               }
            if(conn != null) {
               conn.close();
               }
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
      return loginUser; //생성된 로그인정보를 주려고 리턴시킨다. 생성안되면 null이들어있을것.
   }



   public ArrayList<MemberAll> selectAll() {
      ArrayList<MemberAll> list = new ArrayList<>();
      try { // try~catch 예외처리
         Class.forName("oracle.jdbc.driver.OracleDriver");
         conn = DriverManager.getConnection(url, user, password); // 커넥션객체
         String sql = "SELECT" + 
               " *" + 
               " FROM" + 
               "(" + 
               "SELECT * FROM army " + 
               "UNION all " + 
               "SELECT * FROM" + 
               "(" + 
               "SELECT * FROM sous " + 
               "UNION all " + 
               "SELECT * FROM officer)" + 
               ")";
         
         psmt = conn.prepareStatement(sql);
         
      
         rs = psmt.executeQuery(); //실행하는것.
         
         while(rs.next()) { //와일문으로 회원정보를 계속읽어들인다.
            
            String Army_id = rs.getString("Army_id");
            String ArmyClass = rs.getString("ArmyClass");
            String Mos = rs.getString("Mos");
            String Army_Name = rs.getString("Army_name");
            String Army_Birth = rs.getString("Army_Birth");
            String Sex = rs.getString("Sex");
            String Address = rs.getString("Address");
            String BloodType = rs.getString("BloodType");
            String Vacation = rs.getString("Vacation");
            String Enlist = rs.getString("Enlist");
            String Discharge = rs.getString("Discharge");
         
            
            
            list.add(new MemberAll(Army_id, ArmyClass, Mos, Army_Name, Army_Birth, Sex, Address, BloodType, Vacation, Enlist, Discharge  ));
         }

         
         
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } // class 객체를 생성해서 메모리에 올려주는 역할.

      catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if(rs != null) rs.close(); //SELECT는 리졸트셋이 하나더열려있어서 닫는것도 하나더.
            if(psmt != null) {
               psmt.close();
               }
            if(conn != null) {
               conn.close();
               }
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
      
      return list;
   }



   public int insert(MemberAll member) {
      int rows = 0;
      try { // try~catch 예외처리
         Class.forName("oracle.jdbc.driver.OracleDriver");
         conn = DriverManager.getConnection(url, user, password); // 커넥션객체
         String sql = null;
         if(member.getArmy_id().length()==10) {
            
            sql = "INSERT INTO army VALUES (?,?,?,?,?,?,?,?,?,?,?)";
         }else if(member.getArmy_id().length()==8) {
            sql = "INSERT INTO sous VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            
         }else {
            sql = "INSERT INTO officer VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            
         }
         psmt = conn.prepareStatement(sql); // sql문이 psmt로 객체생성됨.
         
         psmt.setString(1, member.getArmy_id());
         psmt.setString(2, member.getArmyClass());
         psmt.setString(3, member.getMos());
         psmt.setString(4, member.getArmy_name());
         psmt.setString(5, member.getArmy_birth());
         psmt.setString(6, member.getSex());
         psmt.setString(7, member.getAddress());
         psmt.setString(8, member.getBloodType());
         psmt.setString(9, member.getVacaTion());
         psmt.setString(10, member.getEnlist());
         psmt.setString(11, member.getDischarge());
      
         
         
         rows = psmt.executeUpdate(); //실행된 줄수.
//         if (rows == 0) {
//            System.out.println("SQL문을 확인하세요.");
//         } 이명령문은 뷰에서해야함.
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } // class 객체를 생성해서 메모리에 올려주는 역할.

      catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if(psmt != null) {
               psmt.close();
               }
            if(conn != null) {
               conn.close();
               }
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
      return rows; //줄수를 리퉌
      
   }



   

   
   
   
}