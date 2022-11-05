package study;

class User {
	private String userName;
	private int id;
	private String password;

	public User() {
		this.userName = "hoge";
		this.id = 123;
		this.password = "abc123";
	}

	public void printAccountinfo() {
		System.out.println("ユーザー名は"+userName);
		System.out.println("IDは"+id);
		System.out.print("パスワードは"+password);

	}

}
