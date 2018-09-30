package mood3;

public class Archangel extends BaseGameObject {
    private int mana;

    protected Archangel(String userName, int level,int mana) {
        super(userName, level);
        this.mana = mana;
    }

    @Override
    protected String generateHashedPassword() {
        return new StringBuilder(super.getUserName()).reverse().toString()
                + (super.getUserName().length() * 21);
    }

    @Override
    public String toString() {
        return String.format("%s%s",super.toString(),(this.mana * super.getLevel()));
    }
}
