public class KhachHang {
    private String maKH;
    private String hoTen;
    private String soDT;
    private String soCMND;
    private String diaChi;
    private String loaiKhach;

    public KhachHang(String maKH, String hoTen, String soDT, String soCMND, String diaChi, String loaiKhach){
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.soDT = soDT;
        this.soCMND = soCMND;
        this.diaChi = diaChi;
        this.loaiKhach = loaiKhach;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiKhach(){
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }
}