package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// インスタンス化
		Car_Chapter15 car = new Car_Chapter15(1,10);
		// ギアの値により速度を変える(gearChange)(引数：int afterGear)		
		
		for(int i = 2; i <= 5; i++) {	
			car.gearChange(i);
			car.run();
		}
		System.out.println();
		
		for( int i = 4; i >= 1; i--) {
			car.gearChange(i);
			car.run();
		}

	}

}
