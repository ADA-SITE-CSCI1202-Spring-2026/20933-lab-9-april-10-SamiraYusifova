public class pairclass<K,V> {
    private K key;
    private V value;

    public pairclass(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
    public pairclass<V,K> swap(){
        return new pairclass<>(value, key);

    }

    public static <K,V> pairclass<V,K> of ( K key, V value ){
        return new pairclass<>(value, key);
    }
    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}