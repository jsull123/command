import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands;

    public InputHandler(StopWatch watch){
        Command onemin = new OneMinCommand(watch);
        Command fivemin = new FiveMinCommand(watch);
        Command thirtysec = new ThirtySecCommand(watch);

        commands = new HashMap<>();

        commands.put("1", onemin);
        commands.put("5", fivemin);
        commands.put("30", thirtysec);
    }

    public boolean inputEntered(String data){
        if (!commands.containsKey(data)) return false;
        commands.get(data).execute();
        return true;
    }
}
