package de01CuoiKi;

public class Person {
    protected String hoTen;
    protected String ngaySinh;
    protected String diaChi;
    protected String gioiTinh;

    public Person(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Ho ten: " + hoTen + ", Ngay sinh: " + ngaySinh + ", Dia chi: " + diaChi + "Gioi tinh: " + gioiTinh;
    }
    
    
}
