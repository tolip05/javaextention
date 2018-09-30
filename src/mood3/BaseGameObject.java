package mood3;

public abstract class BaseGameObject implements GameObject{
    private String userName;
    private String hashedPassword;
    private int level;

    protected BaseGameObject(String userName, int level) {
        this.userName = userName;
        this.hashedPassword = generateHashedPassword();
        this.level = level;
    }

    protected String getUserName() {
        return this.userName;
    }

    protected int getLevel() {
        return this.level;
    }

    protected abstract String generateHashedPassword();

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s%n",this.userName
                ,this.hashedPassword,this.getClass().getSimpleName());
    }
}
