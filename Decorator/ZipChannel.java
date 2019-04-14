public class ZipChannel extends ChannelDecorator {

    public ZipChannel(Channel channel) {
        super(channel);
    }

    public void send(String msg) {
        compressData();
        super.send(msg);
    }

    private void compressData() {
        System.out.println("Compressing data.");
    }

}