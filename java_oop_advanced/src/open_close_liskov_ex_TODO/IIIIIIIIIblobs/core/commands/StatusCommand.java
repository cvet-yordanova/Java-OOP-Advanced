package open_close_liskov_ex_TODO.IIIIIIIIIblobs.core.commands;

import open_close_liskov_ex_TODO.IIIIIIIIIblobs.core.BaseCommand;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Blob;

public class StatusCommand extends BaseCommand {

    @Override
    public String execute() {
        StringBuilder sb = new StringBuilder();
        for (Blob blob : super.getBlobRepository().findAll().values()) {
            sb.append(blob).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
