public class Pair2 extends Holder<Integer> {

    private String key;

    public Pair2(String key, Integer value) {
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
