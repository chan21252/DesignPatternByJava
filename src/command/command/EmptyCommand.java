package command.command;

public class EmptyCommand implements Command {

    private EmptyCommand() {
    }

    public static EmptyCommand getInstance() {
        return EmptyCommandInstance.INSTANCE;
    }

    @Override
    public void execute() {
        //do nothing
    }

    @Override
    public void revoke() {
        //do nothing
    }

    private static class EmptyCommandInstance {
        private final static EmptyCommand INSTANCE = new EmptyCommand();
    }
}
