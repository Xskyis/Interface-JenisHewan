public class Hsapi implements hewan {
//class Implements
    @Override
    public void namahewan() {   
        System.out.println("===SAPI===");
    }

    void berkembangbiak() {     
        System.out.println("Berkembang Biak Dengan Cara : Melahirkan");
    }

    @Override
    public void suarahewan() {
        System.out.println("Suara Hewan : Mooo");
    }

    @Override
    public void makanan() {
        System.out.println("Makanan : Rumput");
    }
}
