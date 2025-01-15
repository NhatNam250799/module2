package Model;

public abstract class Xe {
	private String bienSoXe;
	private String nhaSanXuat;
	private int namSanXuat;
	private String nguoiSoHuu;

	public Xe(String bienSoXe, String nhaSanXua, int namSanXuat, String nguoiSoHuu) {
		super();
		this.bienSoXe = bienSoXe;
		this.nhaSanXuat = nhaSanXua;
		this.namSanXuat = namSanXuat;
		this.nguoiSoHuu = nguoiSoHuu;
	}

	public String getBienSoXe() {
		return bienSoXe;
	}

	public void setBienSoXe(String bienSoXe) {
		this.bienSoXe = bienSoXe;
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXua) {
		this.nhaSanXuat = nhaSanXua;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public String getNguoiSoHuu() {
		return nguoiSoHuu;
	}

	public void setNguoiSoHuu(String nguoiSoHuu) {
		this.nguoiSoHuu = nguoiSoHuu;
	}

}
