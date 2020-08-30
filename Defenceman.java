package Hockey;
import java.util.*;
public class Defenceman extends Player{
		Random random = new Random();
		
		public Defenceman(String Name)
		{	
		super(Name);
		}
		
		public void OffenceBehavior()
		{
			int v = random.nextInt(10);
			if(v == 9)
				OffenceBehavior = new SlapShotBehavior();
			else
				OffenceBehavior= new PassBehavior();
		}
		public void DefenceBehavior()
		{
			int v = random.nextInt(2);
			if(v == 0)
				DefenceBehavior = new BlockBehavior();
			else
				DefenceBehavior = new ChasePuckBehavior();
		}
		public void display()
		{
			System.out.print("Name " + name+" "+ OffenceBehavior);
		}
	

}
