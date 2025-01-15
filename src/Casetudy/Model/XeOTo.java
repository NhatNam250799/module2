package Model;

public class XeOTo extends Xe {
	private int soChoNgoi;
	private String loaiXe;

	public XeOTo(String bienSoXe, String nhaSanXua, int namSanXuat, String nguoiSoHuu, int soChoNgoi,
			String loaiXe) {
		super(bienSoXe, nhaSanXua, namSanXuat, nguoiSoHuu);
		this.soChoNgoi = soChoNgoi;
		this.loaiXe = loaiXe;
	}

	public int getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXeString(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	@Override
	public String toString() {
		return "O to{" + "bienSoXe = " + super.getBienSoXe() + ", nhaSanXuat = '" + super.getNhaSanXuat() + '\''
				+ ", namSanXuat = '" + super.getNamSanXuat() + '\'' + ", nguoiSoHuu = '" + super.getNguoiSoHuu() + '\''
				+ ", soChoNgoi= '" + this.soChoNgoi + '\'' + ", loaiXe = '" + this.soChoNgoi + '}';
	}

}
