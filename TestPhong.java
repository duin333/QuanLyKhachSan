public class TestPhong {
    
    public static LoaiPhong createLoaiPhong(String ma, double gia) {
        return new LoaiPhong(ma, "Ten Loai", gia, "Tien Ich");
    }

    public static KhachSan createKhachSan() {
        return new KhachSan("KS01", "Green", "Dia Chi", "1234");
    }

    public static void testKiemTraTrangThaiPhong() {
        LoaiPhong lp = createLoaiPhong("L1", 100.0);
        Phong p = new Phong("P101", "Phong Thuong", lp);
        
        p.danhDauDaThue();
        if (p.getTrangThai().equals("DANG_THUE") && !p.kiemTraTrong()) {
            System.out.println("PASS: Danh dau Da Thue thanh cong.");
        } else {
            System.out.println("FAIL: Danh dau Da Thue that bai.");
        }
    }
    
    public static void testThemPhongThanhCong() {
        KhachSan ks = createKhachSan();
        Phong p1 = new Phong("P101", "Phong Thuong", createLoaiPhong("L1", 100.0));
        Phong p2 = new Phong("P102", "Phong Thuong", createLoaiPhong("L1", 100.0));
        
        int soPhongBanDau = ks.getDanhSachPhong().size();
        
        ks.themPhong(p1);
        ks.themPhong(p2);
        
        int soPhongSauThem = ks.getDanhSachPhong().size();
        
        if (soPhongSauThem == soPhongBanDau + 2) {
            System.out.println("PASS: Them 2 phong vao Khach San thanh cong.");
        } else {
            System.out.println("FAIL: Them phong that bai. So luong phong: " + soPhongSauThem);
        }
    }


    public static void testTimPhongThanhCong() {
        KhachSan ks = createKhachSan();
        Phong p1 = new Phong("P201", "Vip", createLoaiPhong("L2", 300.0));
        ks.themPhong(p1);
        
        Phong foundPhong = ks.timPhong("p201");
        
        if (foundPhong != null && foundPhong.getMaPhong().equalsIgnoreCase("P201")) {
            System.out.println("PASS: Tim phong thanh cong.");
        } else {
            System.out.println("FAIL: Khong tim thay phong P201.");
        }
    }
    
    public static void testXoaPhongThanhCong() {
        KhachSan ks = createKhachSan();
        Phong p1 = new Phong("P201", "Vip", createLoaiPhong("L2", 300.0));
        ks.themPhong(p1);
        
        int soPhongBanDau = ks.getDanhSachPhong().size();
        boolean ketQuaXoa = ks.xoaPhong("P201"); 
        int soPhongSauXoa = ks.getDanhSachPhong().size();
        
        if (ketQuaXoa && soPhongSauXoa == soPhongBanDau - 1) {
            System.out.println("PASS: Xoa phong thanh cong.");
        } else {
            System.out.println("FAIL: Xoa phong that bai.");
        }
    }
}