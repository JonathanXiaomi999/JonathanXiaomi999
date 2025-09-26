public class ContohEnum {
   public enum hari {
        SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGGU
    }

    public static void main(String[] args) {
        hari hari_ini = hari.SENIN;
        System.out.println(hari_ini);
    }
}
