package pt.lighthouselabs.obd.commands.control;

import pt.lighthouselabs.obd.commands.ObdCommand;
import pt.lighthouselabs.obd.enums.AvailableCommandNames;
/**
 * Created by Mateen on 2014-12-11.
 */
public class VINCommand extends ObdCommand {

    private StringBuffer my_VIN= null;

    public VINCommand() {
        super("09 02");

        my_VIN= new StringBuffer();
    }

    /**
     * @param other
     */
    public VINCommand(VINCommand other) {
        super(other);
    }
    protected void performCalculations() {

        String workingData = getResult().replaceAll("[\r\n]", "");


        my_VIN.append(workingData);
    }

    public String getFormattedResult() {
        return my_VIN.toString();
    }
    /*
     * (non-Javadoc)
     *
     * @see pt.lighthouselabs.obd.commands.ObdCommand#getName()
     */
    @Override
    public String getName() {
        return AvailableCommandNames.VIN.getValue();
    }

}
