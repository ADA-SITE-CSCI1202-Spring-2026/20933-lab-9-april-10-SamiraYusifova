public class numericclass <T extends Number>{
    private T value;
    public numericclass(T value){
        this.value = value;
    }
    public T getvalue(){
        return value;
    }

    public double reciprocal(){
        return 1.0 / value.doubleValue();

    }
    public double factionalpart(){
        double d= value.doubleValue();
        return d - Math.floor(d);
    }
    public< U extends Number> boolean absequal(numericclass<U> other){
        return Math.abs(this.value.doubleValue()) == Math.abs(other.getvalue().doubleValue());
    }
}