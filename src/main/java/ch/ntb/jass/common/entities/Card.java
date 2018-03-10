package ch.ntb.jass.common.entities;

public class Card {
	private CardColor color;
	private CardValue value;
	public Card(CardColor c, CardValue v) {
		color = c;
		value = v;
	}
	public CardValue getValue() {
		return value;
	}
	public CardColor getColor() {
		return color;
	}
}
