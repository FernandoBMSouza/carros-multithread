public class Main {
    public static void main(String[] args) throws Exception {
        Carro[] carros = new Carro[2];
        carros[0] = new Carro("Carro_01");
        carros[1] = new Carro("Carro_02");

        Thread t1 = new Thread(carros[0]);
        Thread t2 = new Thread(carros[1]);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
