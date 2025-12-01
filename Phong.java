import java.util.ArrayList;

public class Phong {
    private String maPhong;
    private String tenPhong;
    private LoaiPhong loaiPhong;
    private String trangThai; 
    private ArrayList<LichSuSuDungDichVu> dsLSDV;

    public Phong(String maPhong, String tenPhong, LoaiPhong loaiPhong){
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.loaiPhong = loaiPhong;
        this.trangThai = "TRONG";
        this.dsLSDV = new ArrayList<>();
    }

    public boolean kiemTraTrong(){
        return this.trangThai.equalsIgnoreCase("TRONG");
    }

    public void danhDauDaThue(){
        this.trangThai = "DANG_THUE";
    }
    
    public void danhDauTrong(){
        this.trangThai = "TRONG";
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public LoaiPhong getLoaiPhong(){
        return loaiPhong;  
    }
    
    public void setLoaiPhong(LoaiPhong loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public ArrayList<LichSuSuDungDichVu> getDsLSDV() {
        return dsLSDV;
    }

    public void setDsLSDV(ArrayList<LichSuSuDungDichVu> dsLSDV) {
        this.dsLSDV = dsLSDV;
    }
    
    public void themLichSuSuDungDichVu(LichSuSuDungDichVu ls) {
        this.dsLSDV.add(ls);
    }
}