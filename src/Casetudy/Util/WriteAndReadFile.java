package Util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Model.XeMay;
import Model.XeOTo;
import Model.XeTai;

public class WriteAndReadFile {
	public static final String FILE_PATH_O_TO = "casestudy/src/data/oTo.csv";
	public static final String FILE_PATH_XE_MAY = "casestudy/src/data/xeMay.csv";
	public static final String FILE_PATH_XE_TAI = "casestudy/src/data/xeTai.csv";

	public static List<XeOTo> readFileOTo() {
		File file = new File(FILE_PATH_O_TO);
		FileReader fr = null;
		BufferedReader br = null;
		List<XeOTo> oToList = new ArrayList<XeOTo>();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = null;
			do {
				line = br.readLine();
				if (line != null) {
					String bienSoXe = line.split(",")[0];
					String nhaSanXuat = line.split(",")[1];
					int namSanXuat = Integer.parseInt(line.split(",")[2]);
					String nguoiSoHuu = line.split(",")[3];
					int soChoNgoi = Integer.parseInt(line.split(",")[4]);
					String loaiXe = line.split(",")[5];
					oToList.add(new XeOTo(bienSoXe, nhaSanXuat, namSanXuat, nguoiSoHuu, soChoNgoi, loaiXe));
				}
			} while (line != null);
			br.close();
		} catch (EOFException e) {
			oToList = new ArrayList<XeOTo>();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return oToList;
	}

	public static List<XeMay> readFileXeMay() {
		File file = new File(FILE_PATH_XE_MAY);
		FileReader fr = null;
		BufferedReader br = null;
		List<XeMay> xeMayList = new ArrayList<XeMay>();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = null;
			do {
				line = br.readLine();
				if (line != null) {
					String bienKiemSoat = line.split(",")[0];
					String tenHangSanXuat = line.split(",")[1];
					int namSanXuat = Integer.parseInt(line.split(",")[2]);
					String chuSoHuu = line.split(",")[3];
					float congSuat = Integer.parseInt(line.split(",")[4]);
					xeMayList.add(new XeMay(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, congSuat));
				}
			} while (line != null);
			br.close();
		} catch (EOFException e) {
			xeMayList = new ArrayList<XeMay>();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xeMayList;
	}

	public static List<XeTai> readFileXeTai() {
		File file = new File(FILE_PATH_XE_TAI);
		FileReader fr = null;
		BufferedReader br = null;
		List<XeTai> xeTaiList = new ArrayList<XeTai>();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = null;
			do {
				line = br.readLine();
				if (line != null) {
					String bienKiemSoat = line.split(",")[0];
					String tenHangSanXuat = line.split(",")[1];
					int namSanXuat = Integer.parseInt(line.split(",")[2]);
					String chuSoHuu = line.split(",")[3];
					float trongTai = Integer.parseInt(line.split(",")[4]);
					xeTaiList.add(new XeTai(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, trongTai));
				}
			} while (line != null);
			br.close();
		} catch (EOFException e) {
			xeTaiList = new ArrayList<XeTai>();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xeTaiList;
	}

	public static void writeFileOTo(List<XeOTo> oToList) throws IOException {
		File file = new File(FILE_PATH_O_TO);
		FileWriter fw = new FileWriter(file, false);
		BufferedWriter bw = new BufferedWriter(fw);
		boolean first = true;
		for (XeOTo oTo : oToList) {
			if (!first) {
				bw.newLine();
			}
			bw.write(oTo.getBienSoXe() + "," + oTo.getNhaSanXuat() + "," + oTo.getNamSanXuat() + ","
					+ oTo.getNguoiSoHuu() + "," + oTo.getSoChoNgoi() + "," + oTo.getLoaiXe());
			first = false;
		}
		bw.close();
	}

	public static void writeFileXeMay(List<XeMay> xeMayList) throws IOException {
		File file = new File(FILE_PATH_XE_MAY);
		FileWriter fw = new FileWriter(file, false);
		BufferedWriter bw = new BufferedWriter(fw);
		boolean first = true;
		for (XeMay xeMay : xeMayList) {
			if (!first) {
				bw.newLine();
			}
			bw.write(xeMay.getBienSoXe() + "," + xeMay.getNhaSanXuat() + "," + xeMay.getNamSanXuat() + ","
					+ xeMay.getNguoiSoHuu() + "," + xeMay.getCongSuat());
			first = false;
		}
		bw.close();
	}

	public static void writeFileXeTai(List<XeTai> xeTaiList) throws IOException {
		File file = new File(FILE_PATH_XE_TAI);
		FileWriter fw = new FileWriter(file, false);
		BufferedWriter bw = new BufferedWriter(fw);
		boolean first = true;
		for (XeTai xeTai : xeTaiList) {
			if (!first) {
				bw.newLine();
			}
			bw.write(xeTai.getBienSoXe() + "," + xeTai.getNhaSanXuat() + "," + xeTai.getNamSanXuat() + ","
					+ xeTai.getNguoiSoHuu() + "," + xeTai.gettaiTrong());
			first = false;
		}
		bw.close();
	}

}