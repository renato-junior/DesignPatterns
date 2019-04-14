public class BufferChannel extends ChannelDecorator {

    public BufferChannel(Channel channel) {
        super(channel);
    }

    public void send(String msg) {
        putDataInBuffer();
        super.send(msg);
    }

    private void putDataInBuffer() {
        System.out.println("Buffering data.");
    }

}