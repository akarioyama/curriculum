package study;

import study.Businessman;

public class BusinessmanMain {

	public static void main(String[] args) {
		  Businessman bm = new Businessman();
		        bm.sales();
		  bm.rest();
		System.out.println(bm.skill() + "が得意です！");
	}
}
