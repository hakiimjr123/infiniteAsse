
public class Champions {
	
	private String Name;
	private String Weapon;
	private int Age;
	
	
	public Champions(String Name, String Weapon, int Age) {
		
		this.Name = Name;
		this.Weapon = Weapon;
		this.Age = Age;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}




	public String getWeapon() {
		return Weapon;
	}


	public void setWeapon(String weapon) {
		Weapon = weapon;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	@Override
	public String toString() {
		return "Champions [Name=" + Name + ", Weapon=" + Weapon + ", Age=" + Age + "]";
	}
	
	
	
	
	
	
	
	
}



