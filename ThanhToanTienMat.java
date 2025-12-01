import java.time.LocalDateTime;

public class ThanhToanTienMat extends ThanhToan{
    private double soTienKhachDua;

    public ThanhToanTienMat(String maGiaoDich, LocalDateTime ngayThanhToan, String trangThai, double soTienKhachDua){
        super(maGiaoDich, ngayThanhToan, trangThai);
        this.soTienKhachDua = soTienKhachDua;
    }

    public double tinhTienThoi(double soTienPhaiTra){
        return soTienKhachDua - soTienPhaiTra;
    }

    @Override
    public boolean xuLyThanhToan(double soTienPhaiTra){
        boolean ketQua = soTienKhachDua >= soTienPhaiTra;
        setTrangThai(ketQua ? "Thanh cong" : "That Bai");
        return ketQua;
    }

    @Override
    public String layThongTinGiaoDich(){
        return "Thanh toan tien mat";
    }

    public double getSoTienKhachDua() {
        return soTienKhachDua;
    }

    public void setSoTienKhachDua(double soTienKhachDua) {
        this.soTienKhachDua = soTienKhachDua;
    }
}