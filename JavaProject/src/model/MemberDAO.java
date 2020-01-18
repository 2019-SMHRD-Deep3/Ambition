package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import view.Mainpa;

public class MemberDAO {

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

//   ȸ������  �μ�Ʈ dao  service�͵� ����.
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

			rows = psmt.executeUpdate(); // ����� �ټ�.
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
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows; // �ټ��� ���Z
	}

//   public int insert(Member member) {
//      int rows = 0;
//      try { // try~catch ����ó��
//         Class.forName("oracle.jdbc.driver.OracleDriver");
//         conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü
//         String sql = "INSERT INTO logininfo VALUES (?,?,?,?,?)";
//         psmt = conn.prepareStatement(sql); // sql���� psmt�� ��ü������.
//         
//         psmt.setString(1, member.getArmy_id());
//         psmt.setString(2, member.getPassword());
//         psmt.setString(3, member.getPasswordCheck());
//         psmt.setInt(4, member.getPhonnumber());
//         psmt.setInt(5, member.getSex());
//         
//         rows = psmt.executeUpdate(); //����� �ټ�.
////         if (rows == 0) {
////            System.out.println("SQL���� Ȯ���ϼ���.");
////         } �̸�ɹ��� �信���ؾ���.
//      } catch (ClassNotFoundException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      } // class ��ü�� �����ؼ� �޸𸮿� �÷��ִ� ����.
//
//      catch (SQLException e) {
//         e.printStackTrace();
//      } finally {
//         try {
//            if(psmt != null) {
//               psmt.close();
//               }
//            if(conn != null) {
//               conn.close();
//               }
//         } catch (SQLException e) {
//            e.printStackTrace();
//         }
//      }
//      return rows; //�ټ��� ���Z
//   }

	public Member selectOne(Member m) {
		Member loginUser = null;

		try { // try~catch ����ó��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü
			String sql = "SELECT * FROM logininfo WHERE army_id = ? AND password =?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getArmy_id());
			psmt.setString(2, m.getPassword());
			rs = psmt.executeQuery(); // �����ϴ°�.

			if (rs.next()) {
				// �ش� ID�� PW�� ���� ����� ����
				String Army_id = rs.getString("Army_id");
				String Password = rs.getString("Password");
				String PasswordCheck = rs.getString("PasswordCheck");
				int phonenumber = rs.getInt("Phonenumber");
				int sex = rs.getInt("sex");

				loginUser = new Member(Army_id, Password, PasswordCheck, phonenumber, sex); // ��ü����
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // class ��ü�� �����ؼ� �޸𸮿� �÷��ִ� ����.

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close(); // SELECT�� ����Ʈ���� �ϳ��������־ �ݴ°͵� �ϳ���.
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return loginUser; // ������ �α��������� �ַ��� ���Ͻ�Ų��. �����ȵǸ� null�̵��������.
	}

	// �ް�������Ʈ ��Ÿ.
	public MemberAll UpdateVacation(MemberAll m) {
		MemberAll UpdateVacation = null;

		try { // try~catch ����ó��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü
			String sql = null;

			if (m.getArmy_id().length() == 10) {

				sql = "update army set vacation = ? where army_id = ?";
			} else if (m.getArmy_id().length() == 8) {
				sql = "update sous set vacation = ? where army_id = ?";

			} else if (m.getArmy_id().length() == 6) {
				sql = "update officer set vacation = ? where army_id = ?";

			} else {
				sql = null;
			}

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getVacaTion());
			psmt.setString(2, m.getArmy_id());
			int rs = psmt.executeUpdate(); // �����ϴ°�.

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // class ��ü�� �����ؼ� �޸𸮿� �÷��ִ� ����.

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close(); // SELECT�� ����Ʈ���� �ϳ��������־ �ݴ°͵� �ϳ���.
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return UpdateVacation; // ������ �α��������� �ַ��� ���Ͻ�Ų��. �����ȵǸ� null�̵��������.
	}

	public void VacationDelete(String Vacationdelete) {

		MemberAll VacationDelete = null;

		try { // try~catch ����ó��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü

			String sql = "delete from vacation_view where army_id = ?";

			System.out.println(Vacationdelete);
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Vacationdelete);

			int rs = psmt.executeUpdate(); // �����ϴ°�.

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // class ��ü�� �����ؼ� �޸𸮿� �÷��ִ� ����.

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close(); // SELECT�� ����Ʈ���� �ϳ��������־ �ݴ°͵� �ϳ���.
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// ������ �α��������� �ַ��� ���Ͻ�Ų��. �����ȵǸ� null�̵��������.
	}

	public void selectDelete(String Army_nameDelte) {

		MemberAll selectDelete = null;

		try { // try~catch ����ó��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü
			String sql = null;

			if (Army_nameDelte.length() == 10) {

				sql = "delete from army where army_id = ?";

			} else if (Army_nameDelte.length() == 8) {
				sql = "delete from sous where army_id = ?";

			} else if (Army_nameDelte.length() == 6) {
				sql = "delete from officer where army_id = ?";

			} else {
				sql = null;
			}

			System.out.println(Army_nameDelte);
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Army_nameDelte);

			int rs = psmt.executeUpdate(); // �����ϴ°�.

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // class ��ü�� �����ؼ� �޸𸮿� �÷��ִ� ����.

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close(); // SELECT�� ����Ʈ���� �ϳ��������־ �ݴ°͵� �ϳ���.
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// ������ �α��������� �ַ��� ���Ͻ�Ų��. �����ȵǸ� null�̵��������.
	}

	public ArrayList<MemberAll> selectAll() {
		ArrayList<MemberAll> list = new ArrayList<>();
		try { // try~catch ����ó��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü

//         String sql = "SELECT * FROM(SELECT  * FROM army UNION all SELECT  * FROM (SELECT  * FROM sous UNION all SELECT  * FROM officer))";
			String sql = "select o.army_id,o.armyclass,o.MOS,o.army_name,o.army_birth,o.sex,o.address,o.bloodtype,o.vacation,o.enlist,o.discharge,s.salary from officer o, salary s where o.rank=s.rank UNION all select a.army_id,a.armyclass,a.MOS,a.army_name,a.army_birth,a.sex,a.address,a.bloodtype,a.vacation,a.enlist,a.discharge,s.salary from army a, salary s where a.rank=s.rank UNION all select so.army_id,so.armyclass,so.MOS,so.army_name,so.army_birth,so.sex,so.address,so.bloodtype,so.vacation,so.enlist,so.discharge,s.salary from sous so, salary s where so.rank=s.rank";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery(); // �����ϴ°�.

			while (rs.next()) { // ���Ϲ����� ȸ�������� ����о���δ�.

				String Army_id = rs.getString("Army_id");
				String ArmyClass = rs.getString("ArmyClass");
				String Mos = rs.getString("Mos");
				String Army_Name = rs.getString("Army_Name");
				String Army_Birth = rs.getString("Army_Birth");
				String Sex = rs.getString("Sex");
				String Address = rs.getString("Address");
				String BloodType = rs.getString("BloodType");
				String Vacation = rs.getString("Vacation");
				String Enlist = rs.getString("Enlist");
				String Discharge = rs.getString("Discharge");
				String RANK = rs.getString("SALARY");// ���Ⱑ DB�� �ִ� ������ ��������

				list.add(new MemberAll(Army_id, ArmyClass, Mos, Army_Name, Army_Birth, Sex, Address, BloodType,
						Vacation, Enlist, Discharge, RANK));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // class ��ü�� �����ؼ� �޸𸮿� �÷��ִ� ����.

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close(); // SELECT�� ����Ʈ���� �ϳ��������־ �ݴ°͵� �ϳ���.
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	public ArrayList<MemberAll> selectVacationview() {
		ArrayList<MemberAll> list = new ArrayList<>();
		try { // try~catch ����ó��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü

//         String sql = "SELECT * FROM(SELECT  * FROM army UNION all SELECT  * FROM (SELECT  * FROM sous UNION all SELECT  * FROM officer))";
			String sql = "SELECT * FROM VACATION_VIEW";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery(); // �����ϴ°�.

			while (rs.next()) { // ���Ϲ����� ȸ�������� ����о���δ�.

				String Army_id = rs.getString("Army_id");
				String ArmyClass = rs.getString("ArmyClass");
//            String Mos = rs.getString("Mos");
				String Army_Name = rs.getString("Army_Name");
				String Vacation = rs.getString("Vacation");
//            String VacationStart = rs.getString("VacationStart");
//            String VacationFinish = rs.getString("VacationFinish");
//         

				list.add(new MemberAll(Army_id, ArmyClass, Army_Name, Vacation));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // class ��ü�� �����ؼ� �޸𸮿� �÷��ִ� ����.

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close(); // SELECT�� ����Ʈ���� �ϳ��������־ �ݴ°͵� �ϳ���.
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	// �޺��ڽ� Ŭ�������� �����ȸ

	public ArrayList<MemberAll> selectClass(String SArmyClass) {
		ArrayList<MemberAll> list = new ArrayList<>();
		try { // try~catch ����ó��
			System.out.println(SArmyClass);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü

//         String sql = "select * from army where armyClass = ?";

			String sql = "select * from (select o.army_id,o.armyclass,o.MOS,o.army_name,o.army_birth,o.sex,o.address,o.bloodtype,o.vacation,o.enlist,o.discharge,s.salary from officer o, salary s where o.rank=s.rank UNION all select a.army_id,a.armyclass,a.MOS,a.army_name,a.army_birth,a.sex,a.address,a.bloodtype,a.vacation,a.enlist,a.discharge,s.salary from army a, salary s where a.rank=s.rank UNION all select so.army_id,so.armyclass,so.MOS,so.army_name,so.army_birth,so.sex,so.address,so.bloodtype,so.vacation,so.enlist,so.discharge,s.salary from sous so, salary s where so.rank=s.rank) where armyclass = ?";

			psmt = conn.prepareStatement(sql);
//         String Class
			psmt.setString(1, SArmyClass);
			rs = psmt.executeQuery(); // �����ϴ°�.

			while (rs.next()) { // ���Ϲ����� ȸ�������� ����о���δ�.

				String Army_id = rs.getString("Army_id");
				String ArmyClass = rs.getString("ArmyClass");
				String Mos = rs.getString("Mos");
				String Army_Name = rs.getString("Army_Name");
				String Army_Birth = rs.getString("Army_Birth");
				String Sex = rs.getString("Sex");
				String Address = rs.getString("Address");
				String BloodType = rs.getString("BloodType");
				String Vacation = rs.getString("Vacation");
				String Enlist = rs.getString("Enlist");
				String Discharge = rs.getString("Discharge");
				String RANK = rs.getString("SALARY");// ���Ⱑ DB�� �ִ� ������ ��������

				list.add(new MemberAll(Army_id, ArmyClass, Mos, Army_Name, Army_Birth, Sex, Address, BloodType,
						Vacation, Enlist, Discharge, RANK));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // class ��ü�� �����ؼ� �޸𸮿� �÷��ִ� ����.

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close(); // SELECT�� ����Ʈ���� �ϳ��������־ �ݴ°͵� �ϳ���.
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	// �̸���ȸ
	public ArrayList<MemberAll> selectName(String SArmyName) {
		ArrayList<MemberAll> list = new ArrayList<>();
		try { // try~catch ����ó��
			System.out.println(SArmyName);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü

//         String sql = "select * from army where armyClass = ?";

			String sql = "select * from (select o.army_id,o.armyclass,o.MOS,o.army_name,o.army_birth,o.sex,o.address,o.bloodtype,o.vacation,o.enlist,o.discharge,s.salary from officer o, salary s where o.rank=s.rank UNION all select a.army_id,a.armyclass,a.MOS,a.army_name,a.army_birth,a.sex,a.address,a.bloodtype,a.vacation,a.enlist,a.discharge,s.salary from army a, salary s where a.rank=s.rank UNION all select so.army_id,so.armyclass,so.MOS,so.army_name,so.army_birth,so.sex,so.address,so.bloodtype,so.vacation,so.enlist,so.discharge,s.salary from sous so, salary s where so.rank=s.rank) where army_name like '%' || ? || '%' || '%' || '%'";

			psmt = conn.prepareStatement(sql);
//         String Class
			psmt.setString(1, SArmyName);
			rs = psmt.executeQuery(); // �����ϴ°�.

			while (rs.next()) { // ���Ϲ����� ȸ�������� ����о���δ�.

				String Army_id = rs.getString("Army_id");
				String ArmyClass = rs.getString("ArmyClass");
				String Mos = rs.getString("Mos");
				String Army_Name = rs.getString("Army_Name");
				String Army_Birth = rs.getString("Army_Birth");
				String Sex = rs.getString("Sex");
				String Address = rs.getString("Address");
				String BloodType = rs.getString("BloodType");
				String Vacation = rs.getString("Vacation");
				String Enlist = rs.getString("Enlist");
				String Discharge = rs.getString("Discharge");
				String RANK = rs.getString("SALARY");// ���Ⱑ DB�� �ִ� ������ ��������

				list.add(new MemberAll(Army_id, ArmyClass, Mos, Army_Name, Army_Birth, Sex, Address, BloodType,
						Vacation, Enlist, Discharge, RANK));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // class ��ü�� �����ؼ� �޸𸮿� �÷��ִ� ����.

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close(); // SELECT�� ����Ʈ���� �ϳ��������־ �ݴ°͵� �ϳ���.
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	// ������ȸ
	public ArrayList<MemberAll> selectMos(String SArmyMos) {
		ArrayList<MemberAll> list = new ArrayList<>();
		try { // try~catch ����ó��
			System.out.println(SArmyMos);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü

//         String sql = "select * from army where armyClass = ?";

			String sql = "select * from (select o.army_id,o.armyclass,o.MOS,o.army_name,o.army_birth,o.sex,o.address,o.bloodtype,o.vacation,o.enlist,o.discharge,s.salary from officer o, salary s where o.rank=s.rank UNION all select a.army_id,a.armyclass,a.MOS,a.army_name,a.army_birth,a.sex,a.address,a.bloodtype,a.vacation,a.enlist,a.discharge,s.salary from army a, salary s where a.rank=s.rank UNION all select so.army_id,so.armyclass,so.MOS,so.army_name,so.army_birth,so.sex,so.address,so.bloodtype,so.vacation,so.enlist,so.discharge,s.salary from sous so, salary s where so.rank=s.rank) where Mos = ?";

			psmt = conn.prepareStatement(sql);
//         String Class
			psmt.setString(1, SArmyMos);
			rs = psmt.executeQuery(); // �����ϴ°�.

			while (rs.next()) { // ���Ϲ����� ȸ�������� ����о���δ�.

				String Army_id = rs.getString("Army_id");
				String ArmyClass = rs.getString("ArmyClass");
				String Mos = rs.getString("Mos");
				String Army_Name = rs.getString("Army_Name");
				String Army_Birth = rs.getString("Army_Birth");
				String Sex = rs.getString("Sex");
				String Address = rs.getString("Address");
				String BloodType = rs.getString("BloodType");
				String Vacation = rs.getString("Vacation");
				String Enlist = rs.getString("Enlist");
				String Discharge = rs.getString("Discharge");
				String RANK = rs.getString("SALARY");// ���Ⱑ DB�� �ִ� ������ ��������

				list.add(new MemberAll(Army_id, ArmyClass, Mos, Army_Name, Army_Birth, Sex, Address, BloodType,
						Vacation, Enlist, Discharge, RANK));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // class ��ü�� �����ؼ� �޸𸮿� �÷��ִ� ����.

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close(); // SELECT�� ����Ʈ���� �ϳ��������־ �ݴ°͵� �ϳ���.
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
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
		try { // try~catch ����ó��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü
			String sql = null;
			if (member.getArmy_id().length() == 10) {

				sql = "INSERT INTO army VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
			} else if (member.getArmy_id().length() == 8) {
				sql = "INSERT INTO sous VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

			} else if (member.getArmy_id().length() == 6) {
				sql = "INSERT INTO officer VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

			} else {
				sql = null;
			}
			psmt = conn.prepareStatement(sql); // sql���� psmt�� ��ü������.

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
			psmt.setString(12, member.getRANK());

			rows = psmt.executeUpdate(); // ����� �ټ�.
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
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows; // �ټ��� ���Z

	}
	// �ص��������

	public int insertVacation(MemberAll member) {
		int rows = 0;
		try { // try~catch ����ó��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü
			String sql = null;

			sql = "INSERT INTO VACATION_VIEW VALUES (?,?,?,?,?,?)";

			psmt = conn.prepareStatement(sql); // sql���� psmt�� ��ü������.

			psmt.setString(1, member.getArmy_id());
			psmt.setString(2, member.getArmyClass());
			psmt.setString(3, member.getArmy_name());
			psmt.setString(4, member.getVacaTion());
			psmt.setString(5, member.getVACATIONSTART());
			psmt.setString(6, member.getVACATIONFINISH());

			rows = psmt.executeUpdate(); // ����� �ټ�.
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
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows; // �ټ��� ���Z

	}

	public int Update(MemberAll m) {

		MemberAll Update = null;

		int rs = 0;

		try { // try~catch ����ó��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü
			String sql = null;
			if (m.getArmy_id().length() == 10) {

				sql = "update army set armyClass = ?, MOS = ?, army_name = ?, army_birth = ?, sex = ?, address = ?, bloodtype = ?, vacation = ?, enlist = ?, discharge = ?, rank = ? where army_id = ?";
			} else if (m.getArmy_id().length() == 8) {
				sql = "update sous  set  armyClass= ?, MOS =? , army_name = ?, army_birth = ?, sex = ?, address = ?, bloodtype = ?, vacation = ?, enlist = ?, discharge = ? , rank = ? where army_id = ?";

			} else if (m.getArmy_id().length() == 6) {
				sql = "update officer  set  armyClass= ?, MOS =? , army_name = ?, army_birth = ?, sex = ?, address = ?, bloodtype = ?, vacation = ?, enlist = ?, discharge = ? , rank = ? where army_id = ?";

			} else {
				sql = null;
			}

			psmt = conn.prepareStatement(sql);

			System.out.println(m.getArmyClass());
			System.out.println(m.getMos());
			System.out.println(m.getArmy_name());
			System.out.println(m.getArmy_birth());
			System.out.println(m.getSex());
			System.out.println(m.getAddress());
			System.out.println(m.getBloodType());
			System.out.println(m.getVacaTion());
			System.out.println(m.getEnlist());
			System.out.println(m.getDischarge());
			System.out.println(m.getVacaTion());
			System.out.println(m.getRANK());
			System.out.println(m.getArmy_id());
			// �Ű����� m ���� ��������
			System.out.println(m.getBloodType());
			psmt.setString(1, m.getArmyClass());
			psmt.setString(2, m.getMos());
			psmt.setString(3, m.getArmy_name());
			psmt.setString(4, m.getArmy_birth());
			psmt.setString(5, m.getSex());
			psmt.setString(6, m.getAddress());
			psmt.setString(7, m.getBloodType());
			psmt.setString(8, m.getVacaTion());
			psmt.setString(9, m.getEnlist());
			psmt.setString(10, m.getDischarge());
			psmt.setString(11, m.getRANK());
			psmt.setString(12, m.getArmy_id());

//         psmt.setString(1, mainpa.getCLASS());
//         psmt.setString(2, mainpa.getMOS());
//         psmt.setString(3, mainpa.getNAME());
//         psmt.setString(4, mainpa.getBIRTH());
//         psmt.setString(5, mainpa.getSEX());
//         psmt.setString(6, mainpa.getADDRESS());
//         psmt.setString(7, mainpa.getBLOODTYPE());
//         psmt.setString(8, mainpa.getVACATION());
//         psmt.setString(9, mainpa.getENLIST());
//         psmt.setString(10, mainpa.getDISCHARGE());
//         psmt.setString(11, mainpa.getRANK());
//         psmt.setString(12, mainpa.getID());
//         
			rs = psmt.executeUpdate(); // �����ϴ°�.

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // class ��ü�� �����ؼ� �޸𸮿� �÷��ִ� ����.

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// SELECT�� ����Ʈ���� �ϳ��������־ �ݴ°͵� �ϳ���.
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rs; // ������ �α��������� �ַ��� ���Ͻ�Ų��. �����ȵǸ� null�̵��������.
	}

	public ArrayList<MemberAll> selectVacation() {
		ArrayList<MemberAll> list = new ArrayList<>();
		try { // try~catch ����ó��

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // Ŀ�ؼǰ�ü

//         String sql = "select * from army where armyClass = ?";

			String sql = "select * from vacation_view";

			psmt = conn.prepareStatement(sql);
//         String Class

			rs = psmt.executeQuery(); // �����ϴ°�.

			while (rs.next()) { // ���Ϲ����� ȸ�������� ����о���δ�.

				String Army_id = rs.getString("Army_id");
				String ArmyClass = rs.getString("ArmyClass");
				String Army_Name = rs.getString("Army_Name");
				String Army_Vacation = rs.getString("Vacation");
				String VacationStart = rs.getString("VacationStart");
				String VacationFinish = rs.getString("VacationFinish");

				list.add(new MemberAll(Army_id, ArmyClass, Army_Name, Army_Vacation, VacationStart, VacationFinish));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // class ��ü�� �����ؼ� �޸𸮿� �÷��ִ� ����.

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close(); // SELECT�� ����Ʈ���� �ϳ��������־ �ݴ°͵� �ϳ���.
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;

	}

}