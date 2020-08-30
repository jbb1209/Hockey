package Hockey;

public class BlockGoalBehavior implements DefenceBehavior , OffenceBehavior{
	public String play() {
		int n = (int)(Math.random()*4);
		if( n == 3)
			return "hand blocks the puck";
		else if (n==2)
			return "catches the puck";
		else if (n==1)
			return "blocks puck with knee pads";
		else
			return "blocks puck with stick";
		}
}
