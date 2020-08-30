package Hockey;


public abstract class Player {
	protected String name;
	boolean offence;
	 OffenceBehavior OffenceBehavior;
	DefenceBehavior DefenceBehavior;
	public Player(String aName)
	{
		this.name = aName;
	}
	public abstract void display();
	public void OffenceBehavior()
	{
		play();
	}
	public void DefenceBehavior()
	{
		play();
	}
	public void setOffenceBehavior(OffenceBehavior offenceBehavior) {
		OffenceBehavior = offenceBehavior;
	}
	public void setDefenceBehavior(DefenceBehavior defenceBehavior) {
		DefenceBehavior = defenceBehavior;
	}
	public  String play()
	{
		return "not playing";
	}
	public void turnover()
	{
		
	}
	
}
