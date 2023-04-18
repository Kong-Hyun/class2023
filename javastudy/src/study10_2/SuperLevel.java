package study10_2;

public class SuperLevel implements PlayerLevelInterface{
	@Override
	public void run() {
		System.out.println("Super fast run!!!!!!!");
	}
	@Override
	public void jump() {
		System.out.println("Super higher jump!!!");
	}
	@Override
	public void turn() {
		System.out.println("Super quickly turn!");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("SuperLevel>>>>>>>>>>");
	}
	@Override
	public void hack() {
		System.out.println("*hack^&*>>>!@$%$#%&%^$@#$^&@%$&^");
	}
	@Override
	public void slash() {
		System.out.println("~slash^^--<>>!@$%$#%&%^$@#$^&@%$&^>");
	}
	
	


}
