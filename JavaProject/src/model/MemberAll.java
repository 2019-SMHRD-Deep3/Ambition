package model;

public class MemberAll {

	private String Army_id;
	private String ArmyClass;
	private String Mos;
	private String Army_name;
	private String Army_birth;
	private String Sex;
	private String Address;
	private String BloodType;
	private String VacaTion;
	private String Enlist;
	private String Discharge;
	private String RANK;
	private String VACATIONSTART;

	private String VACATIONFINISH;

	public MemberAll(String army_id, String armyClass, String mos, String army_name, String army_birth, String sex,
			String address, String bloodType, String vacaTion, String enlist, String discharge, String RANK) {
		super();
		Army_id = army_id;
		ArmyClass = armyClass;
		Mos = mos;
		Army_name = army_name;
		Army_birth = army_birth;
		Sex = sex;
		Address = address;
		BloodType = bloodType;
		VacaTion = vacaTion;
		Enlist = enlist;
		Discharge = discharge;
		this.RANK = RANK;
	}

	// 이부분이 출타 등록 부분 생성자.
	public MemberAll(String army_id, String vacation) {
		Army_id = army_id;
		VacaTion = vacation;
	}

	public MemberAll(String army_id, String ArmyClass, String ArmyName, String vacation) {
		Army_id = army_id;
		this.ArmyClass = ArmyClass;
		this.Army_name = ArmyName;
		VacaTion = vacation;
	}

	public MemberAll(String Army_id, String ArmyClass, String Army_Name, String Vacation, String VacationStart,
			String Vacationfinish) {
		this.Army_id = Army_id;
		this.ArmyClass = ArmyClass;
		this.Army_name = Army_Name;
		VacaTion = Vacation;
		VACATIONSTART = VacationStart;
		VACATIONFINISH = Vacationfinish;
	}

	// 여기까지
	public String getVACATIONSTART() {
		return VACATIONSTART;
	}

	public void setVACATIONSTART(String vACATIONSTART) {
		VACATIONSTART = vACATIONSTART;
	}

	public String getVACATIONFINISH() {
		return VACATIONFINISH;
	}

	public void setVACATIONFINISH(String vACATIONFINISH) {
		VACATIONFINISH = vACATIONFINISH;
	}

	public String getArmy_id() {
		return Army_id;
	}

	public void setArmy_id(String army_id) {
		Army_id = army_id;
	}

	public String getArmyClass() {
		return ArmyClass;
	}

	public void setArmyClass(String armyClass) {
		ArmyClass = armyClass;
	}

	public String getMos() {
		return Mos;
	}

	public void setMos(String mos) {
		Mos = mos;
	}

	public String getArmy_name() {
		return Army_name;
	}

	public void setArmy_name(String army_name) {
		Army_name = army_name;
	}

	public String getArmy_birth() {
		return Army_birth;
	}

	public void setArmy_birth(String army_birth) {
		Army_birth = army_birth;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getBloodType() {
		return BloodType;
	}

	public void setBloodType(String bloodType) {
		BloodType = bloodType;
	}

	public String getVacaTion() {
		return VacaTion;
	}

	public void setVacaTion(String vacaTion) {
		VacaTion = vacaTion;
	}

	public String getEnlist() {
		return Enlist;
	}

	public void setEnlist(String enlist) {
		Enlist = enlist;
	}

	public String getDischarge() {
		return Discharge;
	}

	public void setDischarge(String discharge) {
		Discharge = discharge;
	}

	public String getRANK() {
		return RANK;
	}

	public void setRANK(String rANK) {
		RANK = rANK;
	}

}