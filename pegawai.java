
public class pegawai {
    public static void main(String[] args) throws Exception {}
    private int nik;
    private String nama;
    private int umur;
    private String jabatan;
    private int gaji;
    private int tunjangan;
    private int lembur;

    public pegawai(int nik, String nama, int umur, String jabatan, int gaji, int tunjangan, int lembur) {
        this.nik = nik;
        this.nama = "Rizky";
        this.umur = umur;
        this.jabatan= "Helper";
        this.gaji= gaji;
        this.tunjangan= tunjangan;
        this.lembur= lembur;

    }
    
        public int getnik() {
        return nik;
    }
    public void setnik(int nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getumur() {
        return umur;
    }
    public void setumur(int umur) {
        this.umur = umur;
    }

    public String getjabatan() {
        return jabatan;
    }
    public void setjabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getgaji() {
        return gaji;
    }
    public void setgaji(int gaji) {
        this.gaji = gaji;
    }

    public int gettunjangan() {
        return tunjangan;
    }
    public void settuntungan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getlembur() {
        return lembur;
    }
    public void setlembur(int lembur) {
        this.lembur = lembur;
    }

    public void perkenalan(){
        System.out.println("Nama Pegawai "+ this.nik);
        System.out.println("Nama Pegawai "+ this.nama);
        System.out.println("Nama Pegawai "+ this.jabatan);
        System.out.println("Nama Pegawai "+ this.gaji);
        System.out.println("Nama Pegawai "+ this.tunjangan);
        System.out.println("Nama Pegawai "+ this.lembur);
    }
}
//     public class pangkat extends pegawai{
//         private String jabatan;

//         public pangkat(int nik, String nama, int umur,String jabatan) {
//             super (nik, nama, umur);
//             this.jabatan = "Helper";
//         }

//         public String getJabatan() {
//             return jabatan;
//         }

//         public void setJabatan(String jabatan) {
//             this.jabatan = jabatan;
//         }
        
//         public void perkenalan(){
//             System.out.println("Nama Pegawai "+ super.getNama()+ 
//                     "/nJabatan Pegawai "+ this.jabatan);
//         }                      
//     }
// }   
//     public class gaji extends pegawai{
//         private int gaji;
//         private int tunjangan;
//         private int lembur;

//         public gaji(int nik, String nama, int umur,String jabatan, int gaji, int tunjangan) {
//             super (nik, nama, umur);
//             this.gaji = 3000000;
//             this.tunjangan = 7000000;
//             this.lembur = 1000000;
//         }

//         public int getgaji() {
//             return gaji;
//         }

//         public void setgaji(int gaji) {
//             this.gaji = gaji;
//         }

//         public int gettunjangan(){
//             return tunjangan;
//         }
//         public void settunjangan(int tunjangan){
//             this.tunjangan = tunjangan;
//         }

//         public int getlembur(){
//             return lembur; 
//         }
//         public void setlembur(int lembur){
//             this.lembur = lembur;
//         }

//         public void perkenalan(){
//             System.out.println("Nama Pegawai "+ super.getNama()+
//                     "/ngaji pegawai "+ this,gaji)
//         }
//     }
// }    