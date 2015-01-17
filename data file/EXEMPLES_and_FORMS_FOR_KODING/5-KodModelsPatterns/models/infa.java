package models;

public abstract class infa {
	public infa() {}
	int number;
	int index1;
	int index2;
	boolean boll = false;
	String nameOfStep;
	String nameCicleFor1;
	String nameCickeFor2;
	int numOfIf;
	int intUser1;
	int intUser2;
	int intUser3;
	String strUser1;
	String strUser2;
	String strUser3;
	@Override
	public String toString() {
		return"information bar"
				+"| Number of Step->"+number
				+"| index1->"+index1
				+"| index2->"+index2
				+"| boolean->"+boll 
				+"| nameOfStep->"+nameOfStep
				+"| nameCicleFor1->"+nameCicleFor1
				+"| nameCickeFor2->"+nameCickeFor2 
				+"| numOfIf->"+numOfIf
				+"| intUser1->"+intUser1 
				+"| intUser2->"+intUser2
				+"| intUser3->"+intUser3 
				+"| strUser1->"+strUser1
				+"| strUser2->"+strUser2
				+"| strUser3->"+strUser3;
	}
	public infa(int number, int index1, int index2, boolean boll,
			String nameOfStep, String nameCicleFor1, String nameCickeFor2,
			int numOfIf, int intUser1, int intUser2, int intUser3,
			String strUser1, String strUser2, String strUser3) {
		this.number = number;
		this.index1 = index1;
		this.index2 = index2;
		this.boll = boll;
		this.nameOfStep = nameOfStep;
		this.nameCicleFor1 = nameCicleFor1;
		this.nameCickeFor2 = nameCickeFor2;
		this.numOfIf = numOfIf;
		this.intUser1 = intUser1;
		this.intUser2 = intUser2;
		this.intUser3 = intUser3;
		this.strUser1 = strUser1;
		this.strUser2 = strUser2;
		this.strUser3 = strUser3;
		
	}
}
