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
   
   
   public int insert(Member member) {
      int rows = 0;
      try { // try~catch ����ó��
         Class.forName("oracle.jdbc.driver.OracleDriver");
         conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü
         String sql = "INSERT INTO logininfo VALUES (?,?,?,?,?)";
         psmt = conn.prepareStatement(sql); // sql���� psmt�� ��ü������.
         
         psmt.setString(1, member.getArmy_id());
         psmt.setString(2, member.getPassword());
         psmt.setString(3, member.getPasswordCheck());
         psmt.setInt(4, member.getPhonnumber());
         psmt.setInt(5, member.getSex());
         
         rows = psmt.executeUpdate(); //����� �ټ�.
//         if (rows == 0) {
//            System.out.println("SQL���� Ȯ���ϼ���.");
//         } �̸�ɹ��� �信���ؾ���.
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } // class ��ü�� �����ؼ� �޸𸮿� �÷��ִ� ����.

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
      return rows; //�ټ��� ���Z
   }



   public Member selectOne(Member m) {
      Member loginUser = null;
      
      try { // try~catch ����ó��
         Class.forName("oracle.jdbc.driver.OracleDriver");
         conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü
         String sql = "SELECT * FROM logininfo WHERE army_id = ? AND password =?";
         
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, m.getArmy_id());
         psmt.setString(2, m.getPassword());
         rs = psmt.executeQuery(); //�����ϴ°�.
         
         if(rs.next()) {
            // �ش� ID�� PW�� ���� ����� ����
            String Army_id = rs.getString("Army_id");
            String Password = rs.getString("Password");
            String PasswordCheck = rs.getString("PasswordCheck");
            int phonenumber = rs.getInt("Phonenumber");
            int sex = rs.getInt("sex");
            
            loginUser = new Member(Army_id, Password, PasswordCheck, phonenumber, sex); //��ü����
         }

         
         
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } // class ��ü�� �����ؼ� �޸𸮿� �÷��ִ� ����.

      catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if(rs != null) rs.close(); //SELECT�� ����Ʈ���� �ϳ��������־ �ݴ°͵� �ϳ���.
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
      return loginUser; //������ �α��������� �ַ��� ���Ͻ�Ų��. �����ȵǸ� null�̵��������.
   }



   public ArrayList<Member> selectAll(String login_id) {
      ArrayList<Member> list = new ArrayList<>();
      try { // try~catch ����ó��
         Class.forName("oracle.jdbc.driver.OracleDriver");
         conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü
         String sql = "SELECT * FROM logininfo WHERE army_id != ?";
         
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, login_id);
      
         rs = psmt.executeQuery(); //�����ϴ°�.
         
         while(rs.next()) { //���Ϲ����� ȸ�������� ����о���δ�.
            
            String Army_id = rs.getString("Army_id");
            String Password = rs.getString("Password");
         
            
            
            list.add(new Member(Army_id,password)); //��ü����
         }

         
         
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } // class ��ü�� �����ؼ� �޸𸮿� �÷��ִ� ����.

      catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if(rs != null) rs.close(); //SELECT�� ����Ʈ���� �ϳ��������־ �ݴ°͵� �ϳ���.
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

   
   
   
}