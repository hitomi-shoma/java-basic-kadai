package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// インスタンス化
				Car_Chapter15 car = new Car_Chapter15(1,10);
				// ギアの値により速度を変える(gearChange)(引数：int afterGear)
				car.gearChange(3);
				//	速度変更
				car.run();

	}

}
