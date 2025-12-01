public class ChayTestChinh {
    public static void main(String[] args) {
        System.out.println("=========== BAT DAU CHAY CAC HAM TEST NGHIEP VU ===========");
        
        // --- TEST TINH TOAN ---
        TestTinhToan.testTinhSoDem();
        TestTinhToan.testTinhTienPhong();
        TestTinhToan.testTongThanhToanKhachVIP();

        // --- TEST THANH TOAN ---
        TestThanhToan.testThanhToanTheThanhCong();
        TestThanhToan.testThanhToanTienMatThieuTien();
        TestThanhToan.testThanhToanTienMatTinhTienThoi();

        // --- TEST QUAN LY PHONG ---
        TestPhong.testKiemTraTrangThaiPhong();
        TestPhong.testThemPhongThanhCong();
        TestPhong.testTimPhongThanhCong();
        TestPhong.testXoaPhongThanhCong();
        
        // --- TEST QUAN LY NHAN SU/KHACH HANG ---
        TestToChuc.testThemKhachHang();
        TestToChuc.testThemNhanVien();
        
        System.out.println("\n=========== KET THUC CHAY CAC HAM TEST ===========");
    }
}