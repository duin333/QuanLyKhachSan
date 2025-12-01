import java.time.LocalDateTime;

public abstract class ThanhToan implements IThanhToan{
    protected String maGiaoDich;
    protected LocalDateTime ngayThanhToan; 
    protected String trangThai;

    public ThanhToan(String maGiaoDich, LocalDateTime ngayThanhToan, String trangThai){
        this.maGiaoDich = maGiaoDich;
        this.ngayThanhToan = ngayThanhToan;
        this.trangThai = trangThai;  
    }

    public abstract boolean xuLyThanhToan(double soTien);
    public abstract String layThongTinGiaoDich();
    
    public void setTrangThai(String trangThai){
        this.trangThai = trangThai;
    }
    
    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public LocalDateTime getNgayThanhToan() {
        return ngayThanhToan;
    }

    public String getTrangThai() {
        return trangThai;
    }
}