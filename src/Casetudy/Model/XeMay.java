package Model;

public class XeMay extends Xe {
	private float congSuat;

	public XeMay(String bienSoXe, String nhaSanXua,int namSanXuat, String nguoiSoHuu, float congSuat) {
		super(bienSoXe, nhaSanXua, namSanXuat, nguoiSoHuu);
		this.congSuat = congSuat;
	}

	public float getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(float congSuat) {
		this.congSuat = congSuat;
	}
	
	public String toString() {
		return "XeMay{" + "bienSoXe = " + super.getBienSoXe() + ", nhaSanXua = '" + super.getNhaSanXuat() + '\''
				+ ", namSanXuat = '" + super.getNamSanXuat() + '\'' + ", nguoiSoHuu = '" + super.getNguoiSoHuu() + '\''
				+ ", congSuat= '" + this.congSuat + '}';
	}


}
