import java.util.HashMap;
import java.util.Scanner;

public class TugasLamaranKerja {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        System.out.print("nama pelamar :");
        String input1= scanner.nextLine();
        hashMap.put("namaPelamar",input1);
        System.out.print("umur :");
        String input2= scanner.nextLine();
        hashMap.put("umur",input2);
        System.out.print("job :");
        String input3= scanner.nextLine();
        hashMap.put("job",input3);
        System.out.print("Perusahaan :");
        String input4= scanner.nextLine();
        hashMap.put("perusahaan",input4);
        System.out.println(hashMap);
    }
}
