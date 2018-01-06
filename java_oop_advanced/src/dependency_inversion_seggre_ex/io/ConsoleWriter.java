package dependency_inversion_seggre_ex.io;

import dependency_inversion_seggre_ex.contracts.Writer;

public class ConsoleWriter implements Writer {

    @Override
    public void writeLine(String output) {
        System.out.println(output);
    }
}
