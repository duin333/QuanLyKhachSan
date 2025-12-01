import java.time.LocalDateTime;

public class TestThanhToan {

    private static final double SO_TIEN_PHAI_TRA = 500.0;

    public static void testThanhToanTheThanhCong() {
        ThanhToanThe ttThe = new ThanhToanThe("TT001", LocalDateTime.now(), "Dang xu ly", "REF_OK_12345");
        boolean ketQua = ttThe.xuLyThanhToan(SO_TIEN_PHAI_TRA);
        
        if (ketQua && ttThe.getTrangThai().equals("Thanh cong")) {
            System.out.println("PASS: Giao dich the thanh cong.");
        } else {
            System.out.println("FAIL: Giao dich the that bai. Trang thai: " + ttThe.getTrangThai());
        }
    }

    public static void testThanhToanTienMatThieuTien() {
        ThanhToanTienMat ttTienMat = new ThanhToanTienMat("TT004", LocalDateTime.now(), "Dang xu ly", 499.99);
        boolean ketQua = ttTienMat.xuLyThanhToan(SO_TIEN_PHAI_TRA);
        
        if (!ketQua && ttTienMat.getTrangThai().equals("That Bai")) {
            System.out.println("PASS: Giao dich tien mat that bai do thieu tien.");
        } else {
            System.out.println("FAIL: Giao dich tien mat khong that bai.");
        }
    }
    
    public static void testThanhToanTienMatTinhTienThoi() {
        ThanhToanTienMat ttTienMat = new ThanhToanTienMat("TT005", LocalDateTime.now(), "Dang xu ly", 600.0);
        double tienThoiThucTe = ttTienMat.tinhTienThoi(SO_TIEN_PHAI_TRA); 
        
        if (Math.abs(tienThoiThucTe - 100.0) < 0.01) {
            System.out.println("PASS: Tien thoi tinh chinh xac. Thoi: " + tienThoiThucTe);
        } else {
            System.out.println("FAIL: Tien thoi tinh sai. Thuc te: " + tienThoiThucTe);
        }
    }
}