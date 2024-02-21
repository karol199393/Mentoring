public class Zad8 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 100, 50, 2000};
        int[][] numbers2D = {{100, 20}, {500, 1000}, {300, 200}, {1000, 50000}};
        int liczbyTrzycyfrowe=0;

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>99)
            {
                liczbyTrzycyfrowe++;
                System.out.println(numbers[i]);
            }
        }

        for(int i=0;i<numbers2D.length;i++)
        {
            for(int j=0;j<numbers2D[i].length;j++)
            if(numbers2D[i][j] >99)
            {
                liczbyTrzycyfrowe++;
                System.out.println(numbers2D[i][j]);
            }
        }

        System.out.println(liczbyTrzycyfrowe);


    }
}
