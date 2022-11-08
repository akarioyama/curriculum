package keisho2;

//社員（Employee）を継承したhogeの社員クラス
class hogeEmployee extends Employee {

 /** isTrainee: 研修生フラグ（研修生であるかどうかを true/false で判断するためのフィールド変数） */
 boolean isTrainee;

 public hogeEmployee() {
	 hogeEmployee bm = new hogeEmployee(10192 , "佐藤優輝");
 }

 /**
   * コンストラクタ: 引数あり
   * @param empId
   * @param name
   */
 public hogeEmployee(int empId, String name) {
	// ①挙動確認: 親クラス（Employee）のコンストラクタを呼び出す
	 super(empId, name);
     // ③挙動確認: thisを指定せずに格納する その1
     boolean tmpIsTrainee;
     if (empId != 10192) {
         tmpIsTrainee = true;
     } else {
         tmpIsTrainee = false;
     }
     this.isTrainee  = tmpIsTrainee;
     System.out.println(this.isTrainee ? "研修生です" : "研修生ではありません");
 }

 /**
   * コンストラクタ: 引数あり
   * @param empId
   * @param name
   * @param isTrainee
   */
 public hogeEmployee(int empId, String name, boolean isTrainee) {

     // ①挙動確認: 親クラス（Employee）のコンストラクタを呼び出す
     super(empId, name);

     // ②挙動確認: 自クラスのフィールド変数（isTrainee）へコンストラクタの引数を格納する
     this.isTrainee = isTrainee;

     // ③挙動確認: thisを指定せずに格納する その2
     isTrainee = true;
     System.out.println(this.isTrainee ? "研修生です" : "研修生ではありません");

     // ④挙動確認: thisとsuperで同じメソッドを呼び出す
     this.printEmployeeInfo();
     super.printEmployeeInfo();
 }
 /**
  * 社員情報をコンソールへ出力するメソッド（研修生フラグを含む）
  */
 public void printEmployeeInfo() {
	    super.printEmployeeInfo();
	    System.out.println("研修生フラグ: " + this.isTrainee);
	}

 // ... フィールド変数のゲッターとセッター（※省きます）
}