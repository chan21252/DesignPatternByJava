package command;

import command.invoke.Invoker;

public class Client {
    public static void main(String[] args) {
        Invoker cmd = new Invoker();

        cmd.invokeCommand("service mysql start");
        cmd.invokeCommand("service mysql stop");
        cmd.invokeCommand("service tomcat stop");
    }
}
