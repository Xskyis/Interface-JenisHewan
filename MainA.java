import java.util.Scanner;

public class MainA {
    public static void main(String[] args) throws Exception {
        //Objek nya
        Hsapi hewan1 = new Hsapi();
        Hular hewan2 = new Hular();
        Hkucing hewan3 = new Hkucing();

        // Scanner nya
        Scanner input = new Scanner(System.in);
        String aksi; 
        //Interface pilihan Jenis hewan
        while (true) {
            System.out.println("=== Jenis-Jenis Hewan ===");
            System.out.println("[1] Sapi");
            System.out.println("[2] Ular");
            System.out.println("[3] Kucing");
            System.out.println("[0] Exit");
            System.out.println("--------------------------");
            System.out.print("Pilih Hewan Mu > ");
            aksi = input.nextLine();
        
            if(aksi.equalsIgnoreCase("1")){
                hewan1.namahewan();hewan1.makanan();hewan1.berkembangbiak();hewan1.suarahewan();
            } else if (aksi.equalsIgnoreCase("2")){
                hewan2.namahewan();hewan2.makanan();hewan2.berkembangbiak();hewan2.suarahewan();
            } else if (aksi.equalsIgnoreCase("3")){
                hewan3.namahewan();hewan3.makanan();hewan3.berkembangbiak();hewan3.suarahewan();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }

    }
