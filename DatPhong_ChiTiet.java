import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatPhong_ChiTiet {
    private String maCTDP;
    private Phong phong;
    private LocalDate ngayNhanPhong; 
    private LocalDate ngayTraPhong; 

    public DatPhong_ChiTiet(String maCTDP, Phong phong, LocalDate ngayNhanPhong, LocalDate ngayTraPhong){
        this.maCTDP = maCTDP;
        this.phong = phong;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
    }

    public long getSoDem() {
        if(ngayNhanPhong != null && ngayTraPhong != null){
            return ChronoUnit.DAYS.between(ngayNhanPhong, ngayTraPhong);
        }
        return 0;
    }

    public double tinhTienDatPhongTheoNgay(){
        if(phong != null && phong.getLoaiPhong() != null){
            return getSoDem() * phong.getLoaiPhong().getGiaThue();
        }
        return 0;
    }
    
    public String getMaCTDP() {
        return maCTDP;
    }

    public void setMaCTDP(String maCTDP) {
        this.maCTDP = maCTDP;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public LocalDate getNgayNhanPhong() {
        return ngayNhanPhong;
    }

    public void setNgayNhanPhong(LocalDate ngayNhanPhong) {
        this.ngayNhanPhong = ngayNhanPhong;
    }

    public LocalDate getNgayTraPhong() {
        return ngayTraPhong;
    }

    public void setNgayTraPhong(LocalDate ngayTraPhong) {
        this.ngayTraPhong = ngayTraPhong;
    }
}