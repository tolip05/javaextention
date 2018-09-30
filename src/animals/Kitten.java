package animals;

public class Kitten extends Cat{


    private static final String SOUND = "Mau";

    public Kitten(String name, int age, String gender) {
        super(name,age,gender);
    }

    @Override
    protected void setGender(String gender) {
        if (!gender.equals(FEMALE_GENDER)){
            throw new IllegalArgumentException(ErorMessage.INVALID_INPUT_MESSAGE);
        }
        super.setGender(gender);
    }

    public String produceSound(){
        return SOUND;
    }


}
