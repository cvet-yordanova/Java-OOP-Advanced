package blob_open_liskov.src.commands;


import blob_open_liskov.src.factories.AttackFactory;
import blob_open_liskov.src.factories.BehaviourFactory;
import blob_open_liskov.src.interfaces.*;
import blob_open_liskov.src.models.BlobImpl;

public class AddCommand extends AbstractCommand {

    //todo konstruktora kakyv e
    public AddCommand(Repository blobRepository, String[] args, Repository blobRepository1, String[] args1) {
        super(blobRepository, args);
    }

    @Override
    public String execute() {
        //?	create <name> <health> <damage> <behavior> <attack>
        Behavior behavior = BehaviourFactory.createUnit(super.getArgs());
        Attack attack = AttackFactory.createUnit(super.getArgs());
        BlobImpl blob = new BlobImpl(super.getArgs()[1], Integer.parseInt(super.getArgs()[2]), Integer.parseInt(super.getArgs()[3]), behavior, attack);
        super.getBlobRepository().add(blob);
        return null;
    }

}
