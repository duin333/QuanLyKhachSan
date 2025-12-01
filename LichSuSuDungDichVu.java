import java.time.LocalDate;

public class LichSuSuDungDichVu {
    private String maSuDung;
    private LocalDate ngaySuDung;
    private int soLuong;
    private DichVu dichVu;

    public LichSuSuDungDichVu(String maSuDung, LocalDate ngaySuDung, int soLuong, DichVu dichVu){
        this.maSuDung = maSuDung;
        this.ngaySuDung = ngaySuDung;
        this.soLuong = soLuong;
        this.dichVu = dichVu;
    }

    public double tinhTien(){
        if(dichVu != null){
            return soLuong * dichVu.getGiaDichVu(); 
        }
        return 0;   
    }

    public String getMaSuDung() {
        return maSuDung;
    }

    public void setMaSuDung(String maSuDung) {
        this.maSuDung = maSuDung;
    }

    public LocalDate getNgaySuDung() {
        return ngaySuDung;
    }

    public void setNgaySuDung(LocalDate ngaySuDung) {
        this.ngaySuDung = ngaySuDung;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }
}