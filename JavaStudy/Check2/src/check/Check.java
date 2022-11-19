package check;

import check.Pet;
import check.RobotPet;
import constants.Constants;

@SuppressWarnings("unused")
public class Check {

	public static void  main(String[] args) {

		//自分の名前で初期化//
		String  firstName = "akari" ;
		String  lastName = "oyama";
		System.out.println("printNameメソッド→" + printName(firstName,lastName));

		String name ="java吉" ;
		String mastername = "hoge" ;
		String getName = "R2D2" ;
		String getMasterName = "ルーク" ;

		//インスタンス化//
		Pet pt = new Pet(name, mastername) ;
		pt.introduce();
		System.out.println();
		RobotPet rpt = new RobotPet(getName, getMasterName);
		rpt.introduce();
		System.out.println();

	}


//Petクラスのtメソッド//
	public static void pt() {
		System.out.println();
	}


	//RobotPetクラスのメソッド//
	public  void rpt( ) {
		System.out.println();
	}

	//printNameメソッド//
	private static String  printName(String firstName , String lastName) {
			return firstName + lastName ;
		}
}