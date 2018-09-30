package millitary.elite.immplemintation;

import millitary.elite.interfaces.Spy;

public class Spyimpl extends SoldierImpl implements Spy{
    private int codeNumber;
    public Spyimpl(int id, String firstName, String lastName,int codeNumber) {
        super(id, firstName, lastName);
        this.setCodeNumber(codeNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString())
                .append(System.lineSeparator())
                .append("Code Number ").append(this.getCodeNumber());
        return sb.toString();
    }

    private void setCodeNumber(int codeNumber) {
        this.codeNumber = codeNumber;
    }
    @Override
    public int getCodeNumber() {
        return this.codeNumber;
    }
}
