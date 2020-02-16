package command.invoke;

import command.command.Command;
import command.command.EmptyCommand;
import command.command.MysqlStartCommand;
import command.command.MysqlStopCommand;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    private static Map<String, Command> commandMap;

    static {
        commandMap = new HashMap<String, Command>();
        commandMap.put("service mysql start", new MysqlStartCommand());
        commandMap.put("service mysql stop", new MysqlStopCommand());
    }

    public void invokeCommand(String commandLine) {
        Command command = commandMap.get(commandLine);
        if (command != null) {
            command.execute();
        } else {
            EmptyCommand.getInstance().execute();
        }
    }
}
