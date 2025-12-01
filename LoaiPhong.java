public class LoaiPhong {
    private String maLoai;
    private String tenLoai;
    private double giaThue;
    private String tienIch;

    public LoaiPhong(String maLoai, String tenLoai, double giaThue, String tienIch){
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.giaThue = giaThue;
        this.tienIch = tienIch;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public double getGiaThue(){
        return giaThue;
    }

    public void setGiaThue(double giaThue) {
        this.giaThue = giaThue;
    }

    public String getTienIch() {
        return tienIch;
    }

    public void setTienIch(String tienIch) {
        this.tienIch = tienIch;
    }
}