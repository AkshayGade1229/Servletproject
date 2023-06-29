package servletproject;

public class Registration_entities {

	private int id;
	private String name;
	private String lastname;
	private String mobno;
	private String emailid;
	private String address;
	private String password;
	
	public Registration_entities() {

	}

	public Registration_entities(int id, String name, String lastname, String mobno, String emailid, String address,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.mobno = mobno;
		this.emailid = emailid;
		this.address = address;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

		}
