import java.time.LocalDateTime;

public class ThanhToanThe extends ThanhToan {
    private String maGiaoDichNgoai; 

    public ThanhToanThe(String maGiaoDich, LocalDateTime ngayThanhToan, String trangThai, String maGiaoDichNgoai){
        super(maGiaoDich, ngayThanhToan, trangThai);
        this.maGiaoDichNgoai = maGiaoDichNgoai;
    }   

    @Override
    public boolean xuLyThanhToan(double soTien){
        boolean ketQua = maGiaoDichNgoai != null && !maGiaoDichNgoai.isEmpty();
        setTrangThai(ketQua ? "Thanh cong" : "That bai");
        return ketQua;
    }

    @Override
    public String layThongTinGiaoDich(){
        return "Thanh toan the (Ma GD: " + maGiaoDichNgoai + ")";
    }

    public String getMaGiaoDichNgoai() {
        return maGiaoDichNgoai;
    }
    
    public void setMaGiaoDichNgoai(String maGiaoDichNgoai) {
        this.maGiaoDichNgoai = maGiaoDichNgoai;
    }
}