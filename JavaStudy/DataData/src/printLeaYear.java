
public class printLeaYear {
	public static void main (String[]args) {
		int year = 2021;
		boolean isLeapYear = false; {
			  if (year % 4 == 0) {
			        if ((year % 100) == 0) {
			            isLeapYear = ((year % 400) == 0);
			        } else {
			            isLeapYear = true;
			        }
			    }
			    System.out.println(year + "年はうるう年" + (isLeapYear ? "です。" : "ではありません。"));
			}
			}
		}