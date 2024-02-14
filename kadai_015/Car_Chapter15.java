package kadai_015;

public class Car_Chapter15 {

	// フィールド（内部データ）
	private int gear;
	private int speed;
	
	//	コンストラクタ(初期化)
	public Car_Chapter15( int gear,int speed ) {
		this.gear = gear;
		this.speed = speed;
	}
	
	// メソッド：
	public void gearChange( int afterGear ) {
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		
		this.gear = afterGear;
	//	switch文で条件分岐させる
		switch (this.gear) {
		
		case 1 -> speed = 10;
		case 2 -> speed = 20;
		case 3 -> speed = 30;
		case 4 -> speed = 40;
		case 5 -> speed = 50;
		default -> speed = 10;
		
		}
	}
	
	public void run() {
		System.out.println("ギアは" + gear + "、速度は時速" + speed + "kmです");
	}
	
}
