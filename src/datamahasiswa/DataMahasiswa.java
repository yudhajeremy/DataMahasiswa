/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

/**
 *
 * @author
 * Nama     : Yudha Jeremy Yudhistira
 * Nim      : 10116554
 * Kelas    : PBO - 12
 */
class Mahasiswa{
    public String nama;
    private String nim;
    private double value1;
    private double value2;
    private double value3;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public double getValue3() {
        return value3;
    }

    public void setValue3(double value3) {
        this.value3 = value3;
    }
    public double na(double value1, double value2, double value3){
        return (0.2*value1) + (0.3*value2) + (0.5*value3);
        
    }
    public void info (double na){
        char index;
        String keterangan;
            if (na > 80 && na<100){
              index = 'A';
              keterangan = "Sangat Baik";
            }
            else if(na > 68){
              index = 'B';
              keterangan = "Baik";
            }
            else if(na> 56){
              index = 'C';
              keterangan = "Cukup";
            }
            else if(na> 45){
              index = 'D';
              keterangan = "Kurang";
            }
            else{
              index = 'E';
              keterangan = "Sangat Kurang";          
            }
                System.out.println("Index \t\t = "+index);
                System.out.println("Keterangan \t = "+keterangan);
    }
        

}

public class DataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Yudha Jeremy Yudhistira";
        mhs.setNim("1.01.16.554");
        mhs.setValue1(75);
        mhs.setValue2(45);
        mhs.setValue3(34);
        int i = 1;
        
        while (i<=4){
            System.out.println("Nama ke-"+i+"\t = "+mhs.nama);
            i++;
        }
        System.out.println("\n");
        
        i = 8;
        while (i >= 1) {
            System.out.println("NIM ke- "+i+"\t = "+mhs.getNim()+"."+i);
            i--;
        }
        System.out.println("\n");
        System.out.println("QUIZ \t = "+mhs.getValue1());
        System.out.println("UTS \t = "+mhs.getValue2());
        System.out.println("UAS \t = "+mhs.getValue3());
        System.out.println("\n");
        System.out.println("Nilai Akhir \t = "+mhs.na(mhs.getValue1(), mhs.getValue2(),mhs.getValue3()));
        mhs.info(mhs.na(mhs.getValue1(),mhs.getValue2(),mhs.getValue3()));
    }
    
    
}
