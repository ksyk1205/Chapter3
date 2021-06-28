package ch16;

public class Player {
	private PlayerLevel level;
	
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradeLevel(PlayerLevel playerLevel) {
		this.level = playerLevel;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}

}
