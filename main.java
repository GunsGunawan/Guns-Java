public class main {
    public static void main(String[] args) throws Exception {
        pegawai rizky = new pegawai (111,"rizky",23,"Helper",2000000,7000000,1000000);
        System.out.println(rizky.getnik());
        rizky.setnik (111);
        System.out.println(rizky.getNama());
        rizky.setNama("rizky");
        System.out.println(rizky.getumur());
        rizky.setumur (23);
        System.out.println(rizky.getjabatan());
        rizky.setjabatan ("Helper");
        System.out.println(rizky.getgaji());
        rizky.setgaji(2000000); 
        System.out.println(rizky.gettunjangan());
        rizky.settuntungan(7000000);
        System.out.println(rizky.getlembur());
        rizky.setlembur(1000000);
    }
}   