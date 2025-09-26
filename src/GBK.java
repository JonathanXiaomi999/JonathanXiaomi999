import java.util.Scanner;

public class GBK {

    static int Scoreuser = 0 ;
    static int ScoreBot = 0;

    public static void main(String[] args) {
        System.out.println("======================================================");
        System.out.println("Selamat datang di game gunting(✌️) kertas(🖐️) batu(✊)");
        System.out.println("======================================================");
        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Score kamu : " + Scoreuser + "  Score Bot : " + ScoreBot);
            System.out.println("Pilih sala satu : gunting/kertas/batu ");
            String PilihanUser = scan.nextLine();
            String PilihanBot = Pilahanbot();
            System.out.println("pilihan kamu : " + PilihanUser );
            System.out.println("Pilihan bot : "+ PilihanBot);
            String hasilgame = hasilgamenya(PilihanUser,PilihanBot);
            System.out.println(hasilgame);
            System.out.println("Score kamu : " + Scoreuser + "  Score Bot : " + ScoreBot);
            System.out.println("Mau main lagi? (Y/N)");
            String mainlagi = scan.nextLine();

            if (mainlagi.equals("N")) {
                break;
            }
        }


    }


        public static String Pilahanbot() {
            double nilaibot = Math.random() * 3;
            int nilaibulat = (int) nilaibot;

            if (nilaibulat == 0) {
                return "gunting";
            } else if (nilaibulat == 1) {
                return "kertas";
            } else if (nilaibulat == 2) {
                return "batu";
            }


            return "";
        }

        public static String hasilgamenya(String PilihanUser, String PilihanBot) {
            String hasilgame = "";

            if (PilihanUser.equals("kertas") && PilihanBot.equals("gunting")) {
                hasilgame = "Yah Masa kalah sama bot";
                ScoreBot++;
            } else if (PilihanUser.equals("gunting") && PilihanBot.equals("batu")) {
                hasilgame = "yah Masa kalah sama bot";
                ScoreBot++;
            } else if (PilihanUser.equals("batu") && PilihanBot.equals("kertas")) {
                hasilgame = "Yah Masa kalah sama bot";
                ScoreBot++;
            } else if (PilihanUser.equals("gunting") && PilihanBot.equals("gunting")) {
                hasilgame = "SERI CUY";
            } else if (PilihanUser.equals("kertas") && PilihanBot.equals("kertas")) {
                hasilgame = "SERI CUY";
            } else if (PilihanUser.equals("batu") && PilihanBot.equals("batu")) {
                hasilgame = "SERI CUY";
            } else if (PilihanUser.equals("gunting") && PilihanBot.equals("kertas")) {
                hasilgame = "Selamat Kamu Menang ✨🏆";
                Scoreuser++;
            } else if (PilihanUser.equals("kertas") && PilihanBot.equals("batu")) {
                hasilgame = "Selamat Kamu Menang ✨🏆";
                Scoreuser++;
            } else if (PilihanUser.equals("batu") && PilihanBot.equals("gunting")) {
                hasilgame = "Selamat Kamu Menang ✨🏆";
                Scoreuser++;
            } else {
                System.out.println("Pilihannya cuma gunting/kertas/batu, Cuy");
                System.exit(0);
            }
            return hasilgame;
        }

}
