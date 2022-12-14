import java.io.*;

public class ExceptionCheck {

		// TODO 自動生成されたコンストラクター・スタブ
		private static final String CONST_ROPPONGI_HILLS = "六本木ヒルズ" ;
		private static final String CONST_IMPERIAL_HOTEL = "帝国ホテル" ;


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String hogeoffice = CONST_ROPPONGI_HILLS ;

		try {

			if(!hogeoffice.equals(CONST_IMPERIAL_HOTEL)) {
				throw new Exception("オフィスは帝国ホテルだよ。");
			}
      		System.out.println("hogeのオフィスは"+ CONST_IMPERIAL_HOTEL + "です。");
		}catch(Exception e) {
			System.out.println("オフィスが間違っています。");
			System.out.println(e);
		}
	}

}
