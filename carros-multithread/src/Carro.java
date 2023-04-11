import java.util.Random;

public class Carro implements Runnable {
    private float _speed;
    private int _position, _offset;
    private long time = 0, startTime;
    private String _name;
    private Random random;
    static int finishLine = 200;

    public Carro(String name) {
        this._name = name;
        this.random = new Random();
    }

    private void SetSpeed(int a, float t) {
        _speed = _speed + a * t;
    }

    private void SetPosition(float t) {
        _offset = (int) (_speed * t);
        _position = _position + _offset;
    }

    @Override
    public void run() {
        while (_position < finishLine) {
            startTime = System.currentTimeMillis();
            SetSpeed(random.nextInt(8) + 1, time);
            SetPosition(time);
            System.out.println(_name + " andou " + _offset + "m e já percorreu " + _position + "m");
            time += System.currentTimeMillis() - startTime;
        }
        System.out.println(_name + " alcançou a linha de chegada");
    }
}
