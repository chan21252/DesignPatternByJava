package command.command;

import command.receiver.SoftWare;

public class MysqlStopCommand implements Command {

    private SoftWare mysql;

    public MysqlStopCommand() {
        this.mysql = SoftWare.MYSQL;
    }

    @Override
    public void execute() {
        mysql.stop();
    }

    @Override
    public void revoke() {
        mysql.start();
    }
}
