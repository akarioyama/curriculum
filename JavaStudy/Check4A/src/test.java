import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String TIME_FORMAT = "yyyy/MM/dd HH:mm:ss";;
		Calendar cal = Calendar.getInstance();
		 //SimpleDateformatクラスでフォーマットパターンを設定する(日付のフォーマット)
		 SimpleDateFormat sdFormat = new SimpleDateFormat(TIME_FORMAT);
		  // PreparedStatementで使用するため、String型に変換
		 //現在時刻
		 String login_time = sdFormat.format(cal.getTime());

		 System.out.print(login_time);

	}

}
