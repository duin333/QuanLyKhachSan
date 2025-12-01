import java.time.LocalDate;
import java.util.ArrayList;

public class DatPhong{
    private String maDatPhong;
    private KhachHang khachHang;
    private LocalDate ngayDat;
    private String trangThai;
    private ArrayList<DatPhong_ChiTiet> dsChiTiet;    
    
    public DatPhong(String maDatPhong, KhachHang khachHang, LocalDate ngayDat, String trangThai){
        this.maDatPhong = maDatPhong;
        this.khachHang = khachHang;
        this.ngayDat = ngayDat;
        this.trangThai = trangThai;
        this.dsChiTiet = new ArrayList<>();
    }
    
    public void themChiTiet(DatPhong_ChiTiet chiTiet) { 
        this.dsChiTiet.add(chiTiet); 
    }

    public String getMaDatPhong() {
        return maDatPhong;
    }

    public void setMaDatPhong(String maDatPhong) {
        this.maDatPhong = maDatPhong;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public LocalDate getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(LocalDate ngayDat) {
        this.ngayDat = ngayDat;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public ArrayList<DatPhong_ChiTiet> getDsChiTiet() {
        return dsChiTiet;
    }

    public void setDsChiTiet(ArrayList<DatPhong_ChiTiet> dsChiTiet) {
        this.dsChiTiet = dsChiTiet;
    }
}