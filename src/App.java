import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("Inserisci il voto in lettere");
        String votoInLettere=input.nextLine();
        Grade voto= new Grade(votoInLettere);
        System.out.println(voto.getNumericGrade());
    }
}
