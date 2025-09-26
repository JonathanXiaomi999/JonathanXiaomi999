import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
//        DENGAN INTEGER
        List<Integer> angka = Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> hasil = angka.stream()
                .filter(i -> i % 2 == 0)
                .map(n -> n * n)  //transfomasi lalu menjdi kuadrat
                .collect(Collectors.toList());
        System.out.println(hasil);
    }
}

//DENGAN STRING
//List<String> names = Arrays.asList("Sanz","Sanji","SuperFrince","Kiboy","Kairi","Kumar");
//
//List<String> hasil = names.stream()
//        .filter(nama -> nama.length() <= 5)
//        .collect(Collectors.toList());
//        System.out.println(hasil);