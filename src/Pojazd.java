public class Pojazd {
    float maksymalnapredkosc;
    float przebieg=0;

    public float getMaxV() {
        return maksymalnapredkosc;
    }

    public float getPrzebieg() {
        return przebieg;
    }

    public  void setMaxV(float maksymalnapredkosc)
    {
        this.maksymalnapredkosc=maksymalnapredkosc;
    }

    public  void setPrzebieg(float przebieg)
    {
        this.przebieg=przebieg;
    }

    public void dodajPrzebieg(float dodatkowyPrzebieg)
    {
      przebieg+=dodatkowyPrzebieg;
    }

    public String info() {
        return getPrzebieg() + " " + getMaxV();
    }

    public static void main(String[] args) {
        Pojazd pierwszyPojazd=new Pojazd();
        pierwszyPojazd.dodajPrzebieg(400.5F);
        System.out.println(pierwszyPojazd.info());
    }






}
