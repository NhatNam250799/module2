package BaiTap;

public class LopChiGhiTrongJava {
	private String name;
	private String password;

	public void setUsername(String username) {
		if (username != null && !username.trim().isEmpty()) {
			this.name = username;
		} else {
			System.out.println("Tên người dùng không hợp lệ!");
		}
	}

	public void setPassword(String password) {
		if (password != null && password.length() >= 6) {
			this.password = password;
		} else {
			System.out.println("Mật khẩu phải có ít nhất 6 ký tự!");
		}
	}

	public static void main(String[] args) {
		LopChiGhiTrongJava account = new LopChiGhiTrongJava();

		account.setUsername("JohnDoe");
		account.setPassword("secure123");

		System.out.println("Thông tin tài khoản đã được thiết lập.");
	}
}
