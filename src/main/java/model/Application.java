package model;

public class Application {
	private String firtsname;
	private String lastsname;
	private String email;
	private String applicaiondate;
	private String phonenumber;
	private String experience;
	private String mid;
	private String resumepath;
	private String noiceperiod;
	private String currentlocation;
	public Application() {
		super();
		
	}
	public Application(String firtsname, String lastsname, String email, String applicaiondate, String phonenumber,
			String experience, String mid, String resumepath, String noiceperiod, String currentlocation) {
		super();
		this.firtsname = firtsname;
		this.lastsname = lastsname;
		this.email = email;
		this.applicaiondate = applicaiondate;
		this.phonenumber = phonenumber;
		this.experience = experience;
		this.mid = mid;
		this.resumepath = resumepath;
		this.noiceperiod = noiceperiod;
		this.currentlocation = currentlocation;
	}
	public String getFirtsname() {
		return firtsname;
	}
	public void setFirtsname(String firtsname) {
		this.firtsname = firtsname;
	}
	public String getLastsname() {
		return lastsname;
	}
	public void setLastsname(String lastsname) {
		this.lastsname = lastsname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getApplicaiondate() {
		return applicaiondate;
	}
	public void setApplicaiondate(String applicaiondate) {
		this.applicaiondate = applicaiondate;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getResumepath() {
		return resumepath;
	}
	public void setResumepath(String resumepath) {
		this.resumepath = resumepath;
	}
	public String getNoiceperiod() {
		return noiceperiod;
	}
	public void setNoiceperiod(String noiceperiod) {
		this.noiceperiod = noiceperiod;
	}
	public String getCurrentlocation() {
		return currentlocation;
	}
	public void setCurrentlocation(String currentlocation) {
		this.currentlocation = currentlocation;
	}
}