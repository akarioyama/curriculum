package keisho2;

//（大きな概念としての）社員クラス
class Employee {

 /** empId: 社員番号*/
 private int empId;

 /** name: 氏名*/
 private String name;

 /** コンストラクタ: 引数なし */
 public Employee() {
 }

 /**
   * コンストラクタ: 引数あり
   * @param empId
   * @param name
   */
 public Employee(int empId, String name) {
     this.empId = empId;
     this.name = name;
 }

 // ... フィールド変数のゲッターとセッター（※省きます）

 /**
  * 社員情報をコンソールへ出力するメソッド
  */
 public void printEmployeeInfo() {
	    super.printEmployeeInfo();
	    System.out.println("研修生フラグ: " + this.isTrainee);
	}

}
