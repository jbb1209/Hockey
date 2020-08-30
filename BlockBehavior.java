package Hockey;

public class BlockBehavior implements DefenceBehavior {
	public String play() {
	int n = (int)(Math.random()*3);
	if( n == 3)
		return "Blocks player from passing";
	else if (n==2)
		return "blocks player from shooting";
	else 
		return "checks player with puck";
	}
}
