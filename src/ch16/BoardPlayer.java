package ch16;

public class BoardPlayer {

	public static void main(String[] args) {
		Player player = new Player();
		
		BeginnerLevel bLevel = new BeginnerLevel();
		player.upgradeLevel(bLevel);
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
