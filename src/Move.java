/* Move Class is where it contains the attack moves */

public class Move {
	
	private String attackName;
	private int energyCost;
	private int damage;
	private String special; 
	private String[]attack = new String[4];
	
    //Constructor
    public Move(String[] tempArray,int i) { //Each Attack contains 4 datas
    	int numAttacks = Integer.parseInt(tempArray[5]);
    	attackName = tempArray[6+i];
    	energyCost = Integer.parseInt(tempArray[7+i]);
    	damage = Integer.parseInt(tempArray[8+i]);
    	special = tempArray[9+i];
    	attack[0] = attackName;
    	attack[1] = ""+energyCost;
    	attack[2] = ""+damage;
    	attack[3] = special;
    	
    }
    //Getters and Setters
    public String[]getAttack(){
    	return attack;
    }
    
    public String getAttackName(){
    	return attackName;
    }
    
    public int getAttackCost(){
    	return energyCost;
    }
  
}