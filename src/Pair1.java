public class Pair1 extends Holder {
    private String key;

    public Pair1(String key, Object value) {
        super(value);
        this.key = key;
    }

    public void display() {
        System.out.println("key = " + key + " value = " + getData());
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
