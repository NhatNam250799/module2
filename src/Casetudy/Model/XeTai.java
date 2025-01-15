package Model;

public class XeTai extends Xe {
	private float taiTrong;

	public XeTai(String bienSoXe, String nhaSanXua,int namSanXuat, String nguoiSoHuu, float taiTrong) {
		super(bienSoXe, nhaSanXua, namSanXuat, nguoiSoHuu);
		this.taiTrong = taiTrong;
	}

	public float gettaiTrong() {
		return taiTrong;
	}

	public void setTrongTai(float trongTai) {
		this.taiTrong = trongTai;
	}

	public String toString() {
		return "XeMay{" + "bienSoXe = " + super.getBienSoXe() + ", nhaSanXua = '" + super.getNhaSanXuat() + '\''
				+ ", namSanXuat = '" + super.getNamSanXuat() + '\'' + ", nguoiSoHuu = '" + super.getNguoiSoHuu() + '\''
				+ ", trongTai= '" + this.taiTrong + '}';
	}
}
