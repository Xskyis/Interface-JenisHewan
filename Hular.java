public class Hular implements hewan {
//class Implements
    @Override
    public void namahewan() {   
        System.out.println("===ULAR===");
    }

    void berkembangbiak() {     
        System.out.println("Berkembang Biak dengan cara : Bertelur");
    }
    @Override
    public void suarahewan() {
        System.out.println("Suara Hewan : Ssshhhh");
    }

    @Override
    public void makanan() {
        System.out.println("Makanan : Daging");
    }    

}