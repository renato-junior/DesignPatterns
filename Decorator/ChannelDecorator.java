public abstract class ChannelDecorator extends Channel {
    
    private Channel channel;

    public ChannelDecorator(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void send(String msg) {
        channel.send(msg);
    }
    
}