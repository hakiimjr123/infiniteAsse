
public class Warrior extends Champions {
	
	private String Movements;

	public Warrior(String Name, String Weapon, int Age) {
		super(Name, Weapon, Age);
		// TODO Auto-generated constructor stub
	}

	public String getMovements() {
		return Movements;
	}

	public void setMovements(String movements) {
		
		
		this.Movements = movements;
	}

	@Override
	public String toString() {
		return "Warrior [ Name=" + getName() + ", Weapon=" + getWeapon() + ", Age=" + getAge() + "  Movements=" + Movements +" ]";
	}

	
	
	
	
	
	
	
	

	
	
}
