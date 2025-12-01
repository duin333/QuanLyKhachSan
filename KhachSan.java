import java.util.ArrayList;

public class KhachSan {
    private String maKhachSan;
    private String tenKhachSan;
    private String diaChi;
    private String soDienThoai;
    private ArrayList<Phong> danhSachPhong;
    private ArrayList<KhachHang> danhSachKhachHang;
    private ArrayList<NhanVien> danhSachNhanVien;

    public KhachSan(String maKhachSan, String tenKhachSan, String diaChi, String soDienThoai) {
        this.maKhachSan = maKhachSan;
        this.tenKhachSan = tenKhachSan;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.danhSachPhong = new ArrayList<>();
        this.danhSachKhachHang = new ArrayList<>();
        this.danhSachNhanVien = new ArrayList<>();
    }
    
    public void themPhong(Phong phong) {
        this.danhSachPhong.add(phong);
    }

    public boolean xoaPhong(String maPhong){
        Phong phongCanXoa = timPhong(maPhong); 
        
        if (phongCanXoa != null) {
            this.danhSachPhong.remove(phongCanXoa);
            System.out.println("Da xoa phong: " + maPhong);
            return true;
        } else {
            System.out.println("Khong tim thay phong de xoa!");
            return false;
        }
    }

    public Phong timPhong(String maPhong){
        for(Phong p: danhSachPhong)
        {
            if(p.getMaPhong().equalsIgnoreCase(maPhong))
                {
                    return p;
                } //so sanh chuoi trong java ko dc dung ==
        }
        return null;
    }
    public void themKhachHang(KhachHang khachHang) {
        this.danhSachKhachHang.add(khachHang);
    }

    public void themNhanVien(NhanVien nhanVien) {
        this.danhSachNhanVien.add(nhanVien);
    }
    
    public String getMaKhachSan() {
        return maKhachSan;
    }

    public String getTenKhachSan() {
        return tenKhachSan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public ArrayList<Phong> getDanhSachPhong() {
        return danhSachPhong;
    }

    public ArrayList<KhachHang> getDanhSachKhachHang() {
        return danhSachKhachHang;
    }

    public ArrayList<NhanVien> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }
}
