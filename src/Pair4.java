public class Pair4<T extends Number> extends Holder<T> {

    private String key;

    public Pair4(String key, T value) {
        super(value);
        this.key = key;
    }

    public void display() {
        System.out.println("key = " + key  + " value = " + getData());
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
