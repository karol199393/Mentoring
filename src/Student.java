public class Student {

        String imie;
        String nazwisko;
        int rokStudiow;

        public String getImie() {
            return imie;

    }

        public String getNazwisko() {
            return nazwisko;
        }

        public int getRokStudiow(){
            return rokStudiow;
        }

        public String info(){
            return getImie()+" " +getNazwisko()+ " " + getRokStudiow();
        }

}
