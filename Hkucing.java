public class Hkucing implements hewan {
//class Implements
    @Override
    public void namahewan() {   
        System.out.println("===KUCING===");
    }

    void berkembangbiak() {     
        System.out.println("Berkembang biak dengan cara : Melahirkan");
    }

    @Override
    public void suarahewan() {
        System.out.println("Suara hewan : Meoww");
    }

    @Override
    public void makanan() {
        System.out.println("Makanan : Whiskas");
    }
    
}
