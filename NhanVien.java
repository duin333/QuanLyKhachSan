public class NhanVien {
    private String maNV;
    private String tenNV;
    private String chucVu;
    private String sdt;

    public NhanVien(String maNV, String tenNV, String chucVu, String sdt){
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.chucVu = chucVu;
        this.sdt = sdt;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}