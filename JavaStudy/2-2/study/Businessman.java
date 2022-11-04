package study;

public class Businessman {
	    private String name; //なまえ
	    private int gender; //性別(1:男　2:女)
	    private int length; //身長
	    private int weight; //体重
	    private String skilll; //特技
	    private String hoby; //趣味

	    //コンストラクタ
	    public Businessman() {
	      this.name = "サラリーマン金太郎";
	      this.gender = 1;
	      this.length = 180;
	      this.weight = 80;
	      this.skilll = "商談";
	      this.hoby = "編み物";
	    }

	public void sales() {
	  System.out.println(this.name + "は外回りにいってきます！");
	}

	public void rest() {
	  System.out.println(this.name + "は" + this.hoby + "をして休憩しています。");
	}
	    public String skill() {
		return this.skilll;
	    }
}
