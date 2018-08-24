
public class Mage extends Champions {
	
	private String Proceeds;
	
	public Mage(String Name, String Weapon, int Age) {
		super(Name, Weapon, Age);
		// TODO Auto-generated constructor stub
	}

	
	
	
	public String getProceeds() {
		return Proceeds;
	}

	public void setProceeds(String proceeds) {
		Proceeds = proceeds;
	}




	@Override
	public String toString() {
		return "Mage [Name=" + getName() + ", Weapon=" + getWeapon() + ", Age=" + getAge() + ", Proceeds =" + Proceeds + "]";
		
	}

	

}
