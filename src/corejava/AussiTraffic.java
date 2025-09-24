package corejava;

public class AussiTraffic implements CentralTraffic {
	
	public static void main(String[] args) {
		
		CentralTraffic a = new AussiTraffic();
		a.redStop();
		a.flashYellow();
		a.greenGo();
		
		AussiTraffic at= new AussiTraffic();
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		
		System.out.println("Green go impelmentation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		
		System.out.println("red stop impelmentation");
		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		
		System.out.println("flash yellow impelmentation");
		
	}
	
	public void walkOnSymbol() {
		
		System.out.println("Custom signaml for Aussie");
	}

}
