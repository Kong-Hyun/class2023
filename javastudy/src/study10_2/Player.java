package study10_2;

public class Player {
	
	private PlayerLevelInterface level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	public PlayerLevelInterface getLevel() {
		return level;
	}
	public void levelUp() {
		if(level instanceof BeginnerLevel) {
			level = new AdvancedLevel();
		}else if(level instanceof AdvancedLevel) {
			level = new SuperLevel();
		}else if(level instanceof SuperLevel) {
			System.out.println("You Can't Level Up.");
		}
	}
	public void play(int count) {
		level.go(count);
	}

}
