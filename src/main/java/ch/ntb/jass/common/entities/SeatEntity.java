package ch.ntb.jass.common.entities;

/**
 * Defines one of the four seats at the table.
 * Use this class to define the location of a player at the table.
 */
public enum SeatEntity {
	NOTATTABLE(0),
	SEAT1(1),
	SEAT2(2),
	SEAT3(3),
	SEAT4(4);
	
	private final int seatNr;
	
	private SeatEntity(int seatNr) {
		this.seatNr = seatNr;
	}
	
	public static SeatEntity getBySeatNr(int seatNr) {
		switch(seatNr) {
		case 1:
			return SEAT1;
		case 2:
			return SEAT2;
		case 3:
			return SEAT3;
		case 4:
			return SEAT4;
		default:
			return NOTATTABLE;
		}
	}
	
	public int getSeatNr() {
		return seatNr;
	}
}
