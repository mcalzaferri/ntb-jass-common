package ch.ntb.jass.common.entities;

public class TeamEntity {
	public PlayerEntity player1;
	public PlayerEntity player2;
	public int teamId;
	
	//Methods
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof TeamEntity)
			return this.teamId == ((TeamEntity)obj).teamId;
		else
			return super.equals(obj);
	}
}
