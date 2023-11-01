import model.Constante;
import model.Multiplica;
import model.Soma;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Soma(
                new Constante(5.0),
                new Multiplica(new Constante(2.0),new Constante(3.0))
        ).valor());

    }
}