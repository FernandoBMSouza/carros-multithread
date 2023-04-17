public class Main {
    public static void main(String[] args) throws Exception {

        int SIZE = 4;
        Carro[] carros = new Carro[SIZE];
        Thread[] threads = new Thread[SIZE];
        String name;

        // Runtime runtime = Runtime.getRuntime();
        // System.out.println(runtime.availableProcessors());

        for (int i = 0; i < SIZE; i++) {
            name = "Carro_" + (i + 1);
            carros[i] = new Carro(name);
        }

        for (int i = 0; i < SIZE; i++) {
            threads[i] = new Thread(carros[i]);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        // for (Thread thread : threads) {
        // thread.join();
        // }
    }
}
