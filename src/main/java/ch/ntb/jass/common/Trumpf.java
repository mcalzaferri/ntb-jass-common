package ch.ntb.jass.common;

public enum Trumpf {
	SCHIEBEN(GameMode.SCHIEBEN,null),
	EICHEL(GameMode.TRUMPF,CardColor.EICHEL),
	ROSE(GameMode.TRUMPF,CardColor.ROSE),
	SCHILTE(GameMode.TRUMPF,CardColor.SCHILTE),
	SCHELLE(GameMode.TRUMPF,CardColor.SCHELLE),
	OBENABE(GameMode.OBENABE,null),
	UNEUFE(GameMode.UNEUFE,null);
	
	//Datenfelder
	private final GameMode gameMode;
	private final CardColor trumpfColor;
	
	//Konstruktoren
	Trumpf(GameMode gameMode, CardColor trumpfColor){
		this.gameMode = gameMode;
		this.trumpfColor = trumpfColor;
	}
	
	//Methoden
	public int getScoreMultiplicator(){
		if(gameMode == GameMode.TRUMPF) {
			return gameMode.getScoreMultiplicator() * trumpfColor.getScoreMultiplicator();
		}else {
			return gameMode.getScoreMultiplicator();
		}
	}
	
	//Getter und Setter
	public GameMode getGameMode() {
		return gameMode;
	}
	
	public CardColor getTrumpfColor() {
		return trumpfColor;
	}
}
