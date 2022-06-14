
public class ThongTinSv {
    private String maSv;
    private String hoVaTen;
    private int namSinh;
    private double diemTB;

    public ThongTinSv(String maSv, String hoVaTen, int namSinh, double diemTB) {
        this.maSv = maSv;
        this.hoVaTen = hoVaTen;
        if(namSinh>0 && namSinh<2022){
             this.namSinh = namSinh;
        }
       if(diemTB >=0 && diemTB<=10){
             this.diemTB = diemTB;
       }
      
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "ThongTinSv{" + "maSv=" + maSv + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", diemTB=" + diemTB + '}';
    }
    
    
}
