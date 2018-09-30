package cat_lady;

public abstract class Cat {
    private String name;
    private String type;

    protected Cat(String name,String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.type + " " + this.name;
    }
}
