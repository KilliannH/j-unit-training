package example;

public class Divide {
    public float divideXByY(float x, float y) {
        if(x > 100)
            throw new IllegalArgumentException("X > 100!");
        return x/y;
    }
}
