package interfaces;
/**
 * 2. 司令をこなす側: 七海クラス
 * <pre>public interface インターフェース名 {}<pre>
 */
public class Nanaumi implements OrderFromMotoki, OrderFromShihandai{

	private String name;
	private String date;

	public Nanaumi (String n, String yyyyMM) {
		name = n;
		date = yyyyMM;
	}

	 /*
	 * 司令（インターフェース）が増えた際にOverrideした各メソッドそれぞれを修正することになると、
	 * 修正箇所を探すことは大変だし、賢くない書き方になるので一箇所にまとめましょう！
	 * 以下はOverrideしたメソッドの処理を実行する際に、フラグを立てて該当す処理をさせるメソッドの例
	 */
	  // 司令をこなす！
	private void submitOrder(final int shoriFlg) {
		String nameAnd = name + "、";
		 // 勤務表
		if (shoriFlg ==0) {
			System.out.println(nameAnd + date + "の勤務表出しました");
		// 交通費
		}else if (shoriFlg == 1) {
			System.out.println(nameAnd + date + "の交通費を出しました");
			 // その他
		}else {
		System.out.println(nameAnd + "本当はまだ何も出してません");
		}
	}

	  // 言いづらいけど、何もしてません！←
	public void doNothing() {
		submitOrder(-1);
	}
	/* ----- インターフェースのメソッドを Override して {} 内に 処理を記述！ ----- */
	@Override
	// 勤務表出せや！: OrderFromMotoki
	public void daseyaKinmuhyo() {
		// TODO 自動生成されたメソッド・スタブ
		submitOrder(0);
	}

	@Override
	// できれば交通費も出せや！: OrderFromMotoki
	public void daseyaKotsuhi() {
		// TODO 自動生成されたメソッド・スタブ
		submitOrder(1);
	}

	@Override
	 // セブンイレブン行けや！: OrderFromMotokiのお邪魔虫メソッド
	  // （わざわざsubmitOrder(int)で処理させる必要もないよね！
	public void goToSevenEleven() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("先にセブンイレブン行ってきやす");
	}

	public String doCreateJavaCurriculum() {
		return "JAVAカリキュラム完成しました！";
	}
}
