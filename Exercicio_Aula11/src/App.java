import enumerators.EstadoCivilEnum;

public class App {
    public static void main(String[] args) throws Exception {
        EstadoCivilEnum estado1 = EstadoCivilEnum.SOLTEIRO;
        System.out.println(estado1);
        EstadoCivilEnum estado2 = EstadoCivilEnum.CASADO;
        System.out.println(estado2);
    }
}