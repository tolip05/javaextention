package millitary.elite.immplemintation;

import millitary.elite.interfaces.Repair;
import millitary.elite.interfaces.SpecialisesSoldier;

import java.util.Collection;

public abstract class SpecialisesSoldierimpl extends PrivateImpl implements SpecialisesSoldier{
    private static final String AIRFORCES = "Airforces";
    private static final String MARINES = "Marines";
    private String corps;

    public SpecialisesSoldierimpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    private void setCorps(String corps) {
        if (MARINES.equals(corps) || AIRFORCES.equals(corps)){

        this.corps = corps;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append(String.format("Corps: %s",this.getCorps()));
        return sb.toString();
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    public abstract Collection<Repair> getRepairs();
}
