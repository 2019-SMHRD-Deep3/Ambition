package controller;

import java.util.ArrayList;

import model.Member;
import model.MemberAll;
import model.MemberDAO;

public class MemberManagementService {
   
   //데이터베이스에 직접 접근하는 객체 >- Data Access Object
   private MemberDAO dao = new MemberDAO();

   
   public boolean memberJoin(Member member) {
      int rows = dao.insert(member);
      if(rows == 0) {
         return false;
      }else {
         return true;
      }
      
   }

   public Member memberLogin(Member m) {
      Member loginUser = dao.selectOne(m);
      return loginUser;
   }
   
   public MemberAll VacationUpdate(MemberAll m) {
      MemberAll UpdateVacation = dao.UpdateVacation(m);
      return UpdateVacation;
   }
   
   public boolean memberEnroll(MemberAll member) {
      int rows = dao.insert(member);
      if(rows == 0) {
         return false;
      }else {
         return true;
      }
      
   }
   
   
   

//   public ArrayList<Member> memberLookup(String id) {
//      
//      
//      
//      return dao.selectAll(id);
//   }

   public ArrayList<MemberAll> MemberAllLookup() {
      // TODO Auto-generated method stub
      return dao.selectAll();
   }

   
   
   
}