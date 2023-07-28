package com.cg.daythree;

public class Encapsule {

		private int Id;
		private String Name;
		private String emailId;
		private long PhNumber;
		private Encapsule(int id, String name, String emailId, long phNumber) {
			super();
			Id = id;
			Name = name;
			this.emailId = emailId;
			PhNumber = phNumber;
		}
		private Encapsule() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public long getPhNumber() {
			return PhNumber;
		}
		public void setPhNumber(long phNumber) {
			PhNumber = phNumber;
		}
		public static void main(String[] args) {
			Encapsule mc = new Encapsule();
		    mc.setId(101);
		    mc.setName("Dhanush");
		    mc.setEmailId("sample@gmail.com");
		    //mc.setPhNumber("9787623451");
		    System.out.println(mc.getId());
		    System.out.println(mc.getName());
		    System.out.println(mc.getEmailId());
		    //System.out.println(mc.getPhNumber());
		

	}

}

