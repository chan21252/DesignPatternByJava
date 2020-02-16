package command.command;

import command.receiver.SoftWare;

public class MysqlStartCommand implements Command {

    private SoftWare mysql;

    public MysqlStartCommand() {
        this.mysql = SoftWare.MYSQL;
    }

    @Override
    public void execute() {
        mysql.start();
    }

    @Override
    public void revoke() {
        mysql.stop();
    }
}
