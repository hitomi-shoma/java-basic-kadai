package CarExec_Chapter15;

import kadai_015.Car_Chapter15;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// インスタンス化
				Car_Chapter15 gear = new Car_Chapter15(1,10);
				Car_Chapter15 speed = new Car_Chapter15(3,30); 
				// ギアの値により速度を変える(gearChange)(引数：int afterGear)
				gear.gearChange(3);
				//	速度変更
				speed.run();

	}

}
