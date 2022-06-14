
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class menu {

    Scanner sc = new Scanner(System.in);
    List<ThongTinSv> sv = new ArrayList();

    public void menu() {
        System.out.println("-------------------- DANH SACH --------------------");
        int k = 0;
        do {
           
            System.out.println("1. Them SV vao danh sach");
            System.out.println("2. Kiem tra danh sach");
            System.out.println("3. So luong SV trong danh sach");
            System.out.println("4. Xoa het danh sach");
            System.out.println("5. Kiem tra 1 SV dua tren MSV");
            System.out.println("6. Xoa SV theo MSV");
            System.out.println("7. Tim kiem SV theo ten");
            System.out.println("8. Xuat danh sach SV diem tu cao -> thap");
            System.out.println("9. Xuat");
            System.out.println("Nhap phuong thuc ban muon su dung : ");
            int n = sc.nextInt();
            switch (n) {
                
                case 1: {
                    // nhập danh sach sinh viên
                    String hoVaTen, maSv;
                    int namSinh, soLuong;
                    double diemTB;
                    System.out.println("Nhap so luong SV muon them : ");
                    soLuong = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < soLuong; i++) {
                        System.out.println("Nhap Sv thu : " +(i+1));
                        System.out.println("Nhap MSV");
                        maSv = sc.nextLine();
                        System.out.println("Nhap ten SV : ");
                        hoVaTen = sc.nextLine();
                        System.out.println("Nhap nam sinh : ");
                        namSinh = sc.nextInt();
                        System.out.println("Nhap diem TB : ");
                        diemTB = sc.nextDouble();
                        sc.nextLine();
                        sv.add(new ThongTinSv(maSv, hoVaTen, namSinh, diemTB));
                        
                    }
                    break;
                }
                case 2: {
                    // kiểm tra danh sách xem có rỗng hay không
                    System.out.println("Danh sach co rong hay khong : " + sv.isEmpty());
                    break;
                }
                case 3: {
                    // kiểm tra số lượng sinh viên có trong danh sách
                    System.out.println("So luong SV co trong danh sach la : " + sv.size());
                    break;
                }
                case 4: {
                    // xóa toàn bộ danh sách
                    sv.clear();
                    break;
                }
                case 5: {
                    // tìm sinh viên xem có trong danh sách hay không
                    sc.nextLine();
                    System.out.println("Nhap MSV muon tim : ");
                    String mSV = sc.nextLine();
                    Iterator<ThongTinSv> it = sv.iterator();
                    while (it.hasNext()) {
                        ThongTinSv i = it.next();
                        if (i.getMaSv().equals(mSV)) {
                            System.out.println("Co Sv trong danh sach voi MSV vua nhap!");
                        } else {
                            System.out.println("Khong co Sv trong danh sach voi MSV vua nhap!");
                        }
                    }
                    break;
                }
                case 6: {
                    // xóa 1 sinh viên
                    sc.nextLine();
                    System.out.println("Nhap MSV muon xoa : ");
                    String mSV = sc.nextLine();
                    Iterator<ThongTinSv> it = sv.iterator();
                    while (it.hasNext()) {
                        ThongTinSv i = it.next();
                        if (i.getMaSv().equals(mSV)) {
                            sv.remove(i);
                        }
                       
                    }
                     for (ThongTinSv thongTinSv : sv) {
                            System.out.println(sv.toString());
                        }
                    break;

                }
                case 7: {
                    // tìm kiếm sinh viên theo tên
                    sc.nextLine();
                    System.out.println("Nhap ten muon tim kiem : ");
                    String name = sc.nextLine();
                    Iterator<ThongTinSv> it = sv.iterator();
                    while (it.hasNext()) {
                        ThongTinSv next = it.next();
                        if (next.getHoVaTen().equals(name)) {
                            System.out.println(sv.toString());
                        }
                        else{
                            System.out.println("Khong co SV ban vua nhap trong danh sach!");
                        }
                    }
                    break;
                }
                case 8: {
                    // sắp xếp sinh viên theo điểm trung bình
                   sapXep();
                    break;
                }
                case 9: {
                    for (ThongTinSv sv1 : sv) {
                        System.out.println(sv1.toString());
                    }
                    break;
                }
            }
                System.out.println("Nhap 1 de tiep tuc thuc hien phim khac de thoat!!!!");
                 k = sc.nextInt();
            
        } while (k == 1);
       
    }
     public void sapXep(){
         Collections.sort(sv, new Comparator<ThongTinSv>() {
             @Override
             public int compare(ThongTinSv o1, ThongTinSv o2) {
                return o1.getDiemTB()>o2.getDiemTB()?-1:(o1.getDiemTB()<o2.getDiemTB()?1 : 0);
             }
         });
         for (ThongTinSv thongTinSv : sv) {
             System.out.println(thongTinSv.toString());
         }
        }
}
