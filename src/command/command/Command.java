package command.command;

/**
 * 命令接口
 *
 * @author Administrator
 * @since 2020-02-16
 */
public interface Command {
    public void execute();

    public void revoke();
}
