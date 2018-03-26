package practice13.common;

public class Item {

	private String name;
	private int additionalDamage;
	
	public void setName(String Name) {
		this.name=Name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAdditionalDamage(int i) {
		this.additionalDamage=i;
	}
	
	public int getAdditionalDamage() {
		return this.additionalDamage;
	}
	
	public Item (String nom, int addDamage){
		this.name = nom;
		this.additionalDamage = addDamage;
	}
}
