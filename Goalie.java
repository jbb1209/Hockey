package Hockey;

public class Goalie extends Player {
	public Goalie(String Name)
	{
		
	super(Name);
	}
	
	public void OffenceBehavior()
	{
		OffenceBehavior = new BlockGoalBehavior();
	}
	public void DefenceBehavior()
	{
		
		DefenceBehavior = new BlockGoalBehavior();
		
	}
	public void display()
	{
		System.out.print("Name " + name+" "+OffenceBehavior);
	}




}


