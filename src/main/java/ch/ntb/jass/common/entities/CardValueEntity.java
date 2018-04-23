package ch.ntb.jass.common.entities;


public enum CardValueEntity {
	SECHS(1),
	SIEBEN(2),
	ACHT(3),
	NEUN(4),
	ZEHN(5),
	UNDER(6),
	OBER(7),
	KOENIG(8),
	ASS(9);
	
	//Fields
	private final int id;
	
	//Constructors
	CardValueEntity(int id){
		this.id = id;
	}
	//Methods
	/** Creates a new CardValueEntity out of its ID representative.
     * @param id The ID which represents the created value.
     * @return A new CardValueEntity.
     */
	public static CardValueEntity getById(int id) {
		switch(id) {
			case 1:
				return SECHS;
			case 2:
				return SIEBEN;
			case 3:
				return ACHT;
			case 4:
				return NEUN;
			case 5:
				return ZEHN;
			case 6:
				return UNDER;
			case 7:
				return OBER;
			case 8:
				return KOENIG;
			case 9:
				return ASS;
		}
		return null;
	}
	
	//Getter and Setters
	public int getId() {
		return id;
	}
}
