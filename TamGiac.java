/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da_giac;

public class TamGiac extends DaGiac{
    public static int a,b,c;

    public TamGiac(int a, int b, int c, int so_canh) {
        super(so_canh);
        TamGiac.a = a;
        TamGiac.b = b;
        TamGiac.c = c;
    }
    
    public static boolean kiemTra(){
        int kt=0;
        if(a+b>c) kt++;
        if(b+c>a) kt++;
        if(a+c>b) kt++;
        if(kt==3){
            return true;
        }else{
            return false;
        }
    }
    
    public static double dienTich(){
        double p=(a+b+c)/2;
        double s=Math.sqrt(p*(p-a)*( p-b)*( p-c));
        if(kiemTra()==true){
            return s;
        }else{
        return -1; 
        }
    }

    @Override
    double chuVi() {
        if(kiemTra()==true){
            return a+b+c;
        }else{
        return -1; 
        }
    }

    @Override
    public String toString() {
       
        return "";
    }
}
