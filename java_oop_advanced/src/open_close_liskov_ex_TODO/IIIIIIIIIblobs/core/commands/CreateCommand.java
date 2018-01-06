package open_close_liskov_ex_TODO.IIIIIIIIIblobs.core.commands;

import open_close_liskov_ex_TODO.IIIIIIIIIblobs.annotations.Inject;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.core.BaseCommand;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.factories.AttackFactory;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.factories.BehaviorFactory;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.factories.BlobFactory;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.factories.ObserverFactory;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Attack;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Behavior;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Blob;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.OutputWriter;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.utility.MutableBoolean;

public class CreateCommand extends BaseCommand {

    @Inject
    private MutableBoolean isEventToggled;
    @Inject
    private OutputWriter writer;

    @Override
    public String execute() {
        Behavior behavior = BehaviorFactory.create(super.getParams().get(3));
        Attack attack = AttackFactory.create(super.getParams().get(4));

        Blob blob = BlobFactory.create(super.getParams().get(0), Integer.parseInt(super.getParams().get(1)), Integer.parseInt(super.getParams().get(2)), behavior, attack);

        super.getBlobRepository().add(blob);

        if (this.isEventToggled.isFlag()) {
            blob.attach(ObserverFactory.createTogglesBehaviorObserver(blob, this.writer));
            blob.attach(ObserverFactory.createDeadBlobObserver(blob, this.writer));
        }

        return null;
    }
}
