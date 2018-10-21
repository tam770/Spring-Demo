package model;

import java.util.LinkedHashMap;

public class student 
{ 
	private String fname;
	private String lname;
	private String country;
	private String lang1;
	private String[] os;
	
	private LinkedHashMap<String,String> lhm;
	public student(){
		lhm=new LinkedHashMap<String,String>();
		lhm.put("IN", "india");
		lhm.put("US", "united state");
		lhm.put("UK", "united kindom");
		lhm.put("FN", "franch");
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	    public void setCountry(String country) {
			
			this.country = country;
		}

		public String getCountry() {
			return country;
		}
		
		public LinkedHashMap<String, String> getLhm() {
			return lhm;
		}

		public String getLang1() {
			return lang1;
		}

		public void setLang1(String lang1) {
			this.lang1 = lang1;
		}

		public String[] getOs() {
			return os;
		}

		public void setOs(String[] os) {
			this.os = os;
		}
		
	
}
