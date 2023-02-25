public class ThirtySecCommand implements Command {
    private StopWatch stopwatch;

    public ThirtySecCommand(StopWatch stopWatch){
        this.stopwatch = stopWatch;
    }

    public void execute(){
        stopwatch.countDownThirtySec();
    }
}
