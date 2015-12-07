// What to do? (Design)
// 100 % Abstract
// 1. abstract methods
// 2. Constants
interface IPlayer  
{
	int DEFAULT_SPEED = 10;  // public static final int DEFAULT_SPEED = 10;
	int MAX_SPEED = 100;
	void jump(); // public abstract void jump();
	void run();
	void attack();
}
interface SuperPower{
	void dynamicPowers();
}

class WhitePlayer implements IPlayer{

	@Override
	public void jump() {
	 System.out.println("White Player Jump Average");
		
	}

	@Override
	public void run() {
		System.out.println("White Player Run Fast...");
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	
}

// How to do
class RedPlayer implements IPlayer,SuperPower
{
	int speed = DEFAULT_SPEED;
	@Override
	public void jump(){
		System.out.println("Red Player Jump High");
	}
	@Override
	public void run(){
		if(speed<MAX_SPEED){
			speed ++;
		}
		System.out.println("Red player run Average "+speed);
	}
	
	@Override
	public void attack(){
		System.out.println("Red Player Attack");
	}
	@Override
	public void dynamicPowers() {
		System.out.println("Red Player Super Powers");
		
	}
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		RedPlayer player = new RedPlayer();
		player.attack();
		player.jump();
		player.run();

	}

}
