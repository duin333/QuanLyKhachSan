public class TestToChuc {
    
    public static KhachSan createKhachSan() {
        return new KhachSan("KS01", "Green", "Dia Chi", "1234");
    }

    public static KhachHang createKhachHang(String ma) {
        return new KhachHang(ma, "Ten KH", "SDT", "CMND", "Dia Chi", "THUONG");
    }
    
    public static NhanVien createNhanVien(String ma) {
        return new NhanVien(ma, "Ten NV", "Chuc vu", "SDT");
    }

    public static void testThemKhachHang() {
        KhachSan ks = createKhachSan();
        KhachHang kh1 = createKhachHang("KH01");
        
        ks.themKhachHang(kh1);
        
        if (ks.getDanhSachKhachHang().size() == 1) {
            System.out.println("PASS: Them Khach Hang thanh cong.");
        } else {
            System.out.println("FAIL: Them Khach Hang that bai.");
        }
    }

    public static void testThemNhanVien() {
        KhachSan ks = createKhachSan();
        NhanVien nv1 = createNhanVien("NV01");
        
        ks.themNhanVien(nv1);
        
        if (ks.getDanhSachNhanVien().size() == 1) {
            System.out.println("PASS: Them Nhan Vien thanh cong.");
        } else {
            System.out.println("FAIL: Them Nhan Vien that bai.");
        }
    }
}