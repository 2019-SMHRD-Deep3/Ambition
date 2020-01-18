package model;

public class Member {
   
   private String Army_id;
   private String Password;
   private String PasswordCheck;
   private int phonnumber;
   private int sex;
   
   public Member(String army_id, String password, String passwordCheck, int phonnumber, int sex) {
      super();
      Army_id = army_id;
      Password = password;
      PasswordCheck = passwordCheck;
      this.phonnumber = phonnumber;
      this.sex = sex;
   }
   
   public Member() {
      
   }
   
   public Member(String army_id, String password) {
      Army_id = army_id;
      Password = password;
   }
   
   public String getArmy_id() {
      return Army_id;
   }
   public void setArmy_id(String army_id) {
      Army_id = army_id;
   }
   public String getPassword() {
      return Password;
   }
   public void setPassword(String password) {
      Password = password;
   }
   public String getPasswordCheck() {
      return PasswordCheck;
   }
   public void setPasswordCheck(String passwordCheck) {
      PasswordCheck = passwordCheck;
   }
   public int getPhonnumber() {
      return phonnumber;
   }
   public void setPhonnumber(int phonnumber) {
      this.phonnumber = phonnumber;
   }
   public int getSex() {
      return sex;
   }
   public void setSex(int sex) {
      this.sex = sex;
   }
   
   
   

}