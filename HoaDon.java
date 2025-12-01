import java.time.LocalDate;
import java.util.ArrayList;

public class HoaDon {
    private String maHoaDon;
    private LocalDate ngayLap; 
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private ArrayList<DatPhong_ChiTiet> dsChiTietDatPhong;
    private ArrayList<LichSuSuDungDichVu> dsLichSuDichVu;
    private ThanhToan thanhToan;

    public HoaDon(String maHoaDon, LocalDate ngayLap, KhachHang khachHang, NhanVien nhanVien){
        this.maHoaDon = maHoaDon;
        this.ngayLap = ngayLap;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.dsChiTietDatPhong = new ArrayList<>();
        this.dsLichSuDichVu = new ArrayList<>();
    }

    public double tinhTongTienPhong(){ 
        double tongPhong = 0;
        for(DatPhong_ChiTiet ct: dsChiTietDatPhong){
            tongPhong += ct.tinhTienDatPhongTheoNgay();
        }
        return tongPhong;
    }
    
    public double tinhTienDichVu(){
        double tongDV = 0;
        for(LichSuSuDungDichVu dv: dsLichSuDichVu){
            tongDV += dv.tinhTien();
        }
        return tongDV;
    }

    public double getTongThanhToan(){
        double tongTienChuaGiam = tinhTongTienPhong() + tinhTienDichVu();
        double phanTramGiam = 0.0;
        
        if(khachHang != null){
             switch(khachHang.getLoaiKhach().toUpperCase()){
                case "VIP":
                    phanTramGiam = 0.15;
                    break;
                case "THANHVIEN":
                    phanTramGiam = 0.05;
                    break;
                default:
                    break;
            }
        }
        
        double soTienGiam = tongTienChuaGiam * phanTramGiam;
        return tongTienChuaGiam - soTienGiam;
    }
    
    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public LocalDate getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDate ngayLap) {
        this.ngayLap = ngayLap;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public ArrayList<DatPhong_ChiTiet> getDsChiTietDatPhong() {
        return dsChiTietDatPhong;
    }

    public void setDsChiTietDatPhong(ArrayList<DatPhong_ChiTiet> dsChiTietDatPhong) {
        this.dsChiTietDatPhong = dsChiTietDatPhong;
    }

    public ArrayList<LichSuSuDungDichVu> getDsLichSuDichVu() {
        return dsLichSuDichVu;
    }

    public void setDsLichSuDichVu(ArrayList<LichSuSuDungDichVu> dsLichSuDichVu) {
        this.dsLichSuDichVu = dsLichSuDichVu;
    }

    public ThanhToan getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(ThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }
}