package millitary.elite.immplemintation;

import millitary.elite.interfaces.Repair;

public class RepairImpl implements Repair{
    private String partName;
    private int hours;


    public RepairImpl(String partName, int hours) {
        this.setPartName(partName);
        this.setHours(hours);
    }
     @Override
     public String getPartName() {
        return this.partName;
    }
     @Override
     public int getHours() {
        return this.hours;
    }

    private void setHours(int hours) {
        this.hours = hours;
    }

    private void setPartName(String partName) {
        this.partName = partName;
    }

    @Override
    public String toString() {
        return String.format
                ("  Part Name: %s Hours Worked: %d",this.getPartName(),this.getHours());
    }
}
