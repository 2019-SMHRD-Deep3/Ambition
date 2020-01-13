package model;

public class AryMember {
	private String MEMBER_ID;
	private String MEMBER_NAME;
	private int MEMBER_BIRTH;
	private String ARMYCLASS;
	private String POSTION;
	private String ENLIST;
	private String DISCHARGE;
	private String PASSWORD;
	private String PASSWORD2;

	public AryMember(String MEMBER_ID, String PASSWORD) {
		this.MEMBER_ID = MEMBER_ID;
		this.PASSWORD = PASSWORD;
	}

	public String getMEMBER_ID() {
		return MEMBER_ID;
	}

	public void setMEMBER_ID(String mEMBER_ID) {
		MEMBER_ID = mEMBER_ID;
	}

	public String getMEMBER_NAME() {
		return MEMBER_NAME;
	}

	public void setMEMBER_NAME(String mEMBER_NAME) {
		MEMBER_NAME = mEMBER_NAME;
	}

	public int getMEMBER_BIRTH() {
		return MEMBER_BIRTH;
	}

	public void setMEMBER_BIRTH(int mEMBER_BIRTH) {
		MEMBER_BIRTH = mEMBER_BIRTH;
	}

	public String getARMYCLASS() {
		return ARMYCLASS;
	}

	public void setARMYCLASS(String aRMYCLASS) {
		ARMYCLASS = aRMYCLASS;
	}

	public String getPOSTION() {
		return POSTION;
	}

	public void setPOSTION(String pOSTION) {
		POSTION = pOSTION;
	}

	public String getENLIST() {
		return ENLIST;
	}

	public void setENLIST(String eNLIST) {
		ENLIST = eNLIST;
	}

	public String getDISCHARGE() {
		return DISCHARGE;
	}

	public void setDISCHARGE(String dISCHARGE) {
		DISCHARGE = dISCHARGE;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public String getPASSWORD2() {
		return PASSWORD2;
	}

	public void setPASSWORD2(String pASSWORD2) {
		PASSWORD2 = pASSWORD2;
	}

}
