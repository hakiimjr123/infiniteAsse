
public class Rogue extends Champions{

	private String Motion;
	
	
	public Rogue(String Name, String Weapon, int Age) {
		super(Name, Weapon, Age);
		// TODO Auto-generated constructor stub
	}


	public String getMotion() {
		return Motion;
	}


	public void setMotion(String motion) {
		Motion = motion;
		
		this.Motion = motion;
	}


	@Override
	public String toString() {
		return "Rogue [Name=" + getName() + ", Weapon=" + getWeapon() + ", Age=" + getAge() + ", Motion=" + Motion + " ]";
	}

	
	
}
