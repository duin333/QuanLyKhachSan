import java.time.LocalDate;

public class TestTinhToan {

    public static LoaiPhong createLoaiPhong(String ma, double gia) {
        return new LoaiPhong(ma, "Ten Loai", gia, "Tien Ich");
    }

    public static KhachHang createKhachHang(String ma, String loai) {
        return new KhachHang(ma, "Ten KH", "SDT", "CMND", "Dia Chi", loai);
    }
    
    public static void testTinhSoDem() {
        try {
            LocalDate ngayNhan = LocalDate.of(2025, 12, 1);
            LocalDate ngayTra = LocalDate.of(2025, 12, 4); 
            Phong p1 = new Phong("P101", "Phong Thuong", createLoaiPhong("LT", 100.0)); 
            DatPhong_ChiTiet ct = new DatPhong_ChiTiet("CT1", p1, ngayNhan, ngayTra);
            
            long soDemThucTe = ct.getSoDem();
            
            if (soDemThucTe == 3) {
                System.out.println("PASS: Tinh So Dem chinh xac.");
            } else {
                System.out.println("FAIL: Tinh So Dem sai, thuc te: " + soDemThucTe);
            }
        } catch (Exception e) {
            System.out.println("FAIL (Exception): " + e.getMessage());
        }
    }

    public static void testTinhTienPhong() {
        LocalDate ngayNhan = LocalDate.of(2025, 12, 1);
        LocalDate ngayTra = LocalDate.of(2025, 12, 3);
        LoaiPhong lp = createLoaiPhong("LVIP", 500.0);
        Phong p2 = new Phong("P202", "Phong VIP", lp);
        DatPhong_ChiTiet ct = new DatPhong_ChiTiet("CT2", p2, ngayNhan, ngayTra);
        
        double tongTienKyVong = 1000.0;
        if (Math.abs(ct.tinhTienDatPhongTheoNgay() - tongTienKyVong) < 0.01) {
            System.out.println("PASS: Tinh tong tien phong dung.");
        } else {
            System.out.println("FAIL: Tong tien phong sai.");
        }
    }

    public static void testTongThanhToanKhachVIP() {
        KhachHang khVIP = createKhachHang("KH02", "VIP");
        HoaDon hd = new HoaDon("HD02", LocalDate.now(), khVIP, null);
        
        LoaiPhong lp = createLoaiPhong("LVIP", 500.0);
        Phong p1 = new Phong("P202", "VIP", lp);
        DatPhong_ChiTiet ct = new DatPhong_ChiTiet("CT2", p1, LocalDate.now(), LocalDate.now().plusDays(2));
        hd.getDsChiTietDatPhong().add(ct);
        
        DichVu dv = new DichVu("DV01", "An sang", 100.0, "phan");
        LichSuSuDungDichVu lsdv = new LichSuSuDungDichVu("LS1", LocalDate.now(), 2, dv);
        hd.getDsLichSuDichVu().add(lsdv);
        
        double tongKyVong = 1020.0;
        double tongThucTe = hd.getTongThanhToan();
        
        if (Math.abs(tongThucTe - tongKyVong) < 0.01) {
            System.out.println("PASS: Tong tien Khach VIP dung. Thuc te: " + tongThucTe);
        } else {
            System.out.println("FAIL: Tong tien Khach VIP sai. Ky vong: " + tongKyVong + ", Thuc te: " + tongThucTe);
        }
    }
}