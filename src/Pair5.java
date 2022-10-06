public class Pair5<K, V> extends Holder<V>  {

    private K key;

    public Pair5(K key, V data) {
        super(data);
        this.key = key;
    }

    public void display() {
        System.out.println("key = " + key  + " value = " + getData());
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
