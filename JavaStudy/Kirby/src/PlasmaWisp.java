
public class PlasmaWisp extends AbilityOfEnemy {
	public PlasmaWisp(String skillName) {
		super.skillName = skillName;
	}

	@Override
	protected void useAbility() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("カービーの攻撃:" + super.skillName);
	}
}
