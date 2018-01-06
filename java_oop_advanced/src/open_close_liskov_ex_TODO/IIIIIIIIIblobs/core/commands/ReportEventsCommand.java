package open_close_liskov_ex_TODO.IIIIIIIIIblobs.core.commands;

import open_close_liskov_ex_TODO.IIIIIIIIIblobs.annotations.Inject;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.core.BaseCommand;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.utility.MutableBoolean;

public class ReportEventsCommand extends BaseCommand {

    @Inject
    private MutableBoolean isEventToggled;

    @Override
    public String execute() {
        this.isEventToggled.setFlag(true);
        return null;
    }
}
