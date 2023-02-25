public class FiveMinCommand implements Command {
    private StopWatch stopwatch;

    public FiveMinCommand(StopWatch stopWatch){
        this.stopwatch = stopWatch;
    }

    public void execute(){
        stopwatch.countDownFiveMin();
    }
}
