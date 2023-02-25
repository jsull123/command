public class OneMinCommand implements Command {
    private StopWatch stopwatch;

    public OneMinCommand(StopWatch stopWatch){
        this.stopwatch = stopWatch;
    }

    public void execute(){
        stopwatch.countDownOneMin();
    }
}
