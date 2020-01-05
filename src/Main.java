import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int i = 0;
        int los;
        int odp;

        Random rnd = new Random();
        los = rnd.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zgadnij liczbę od 1 do 10!");
        do{
            i++;
            System.out.println("Podaj liczbę: ");
            odp = scanner.nextInt();
            if(odp > los){
                System.out.println("Niestety nie zgadłeś, moja liczba jest mniejsza");
            }
            else if(odp < los){
                System.out.println("Nie zgadłeś, moja liczba jest większa");
            }

        }while(odp != los);
        System.out.println("Brawo, zgadłeś za " + i + " razem");

       /* for(int j = 100; j > 0; j--){
            System.out.println(rnd.nextInt(10));    //użycie funkcji nextInt z bound wyklucza nam wydrukowanie wartości którą podamy - tutaj 10tka
        } */
    }
}
