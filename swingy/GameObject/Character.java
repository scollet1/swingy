package GameObject;

public class Character extends GameObject {
	private String _name;
	private int _lvl;
	private int _exp;
	private int _atk;
	private int _def;
	private int _hp;
	private Weapon _wep;
	private Armor _arm;
	private Helm _helm;
	
	Character(String name) {
		
	}

	public int Attack() {
		return (this._atk + this._wep);
	}
	public void TakeDamage(int dmg) {
		this._hp -= dmg + this._arm;
	}

}
