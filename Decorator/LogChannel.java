public class LogChannel extends ChannelDecorator {

    public LogChannel(Channel channel) {
        super(channel);
    }

    public void send(String msg) {
        logData();
        super.send(msg);
    }

    private void logData() {
        System.out.println("Logging data.");
    }

}