public class Main {

    public static void main(String[] args) {

        Channel channel1 = new ZipChannel(new TCPChannel());
        channel1.send("mensagem1");

        Channel channel2 = new ZipChannel(new UDPChannel());
        channel2.send("mensagem2");

        Channel channel3 = new BufferChannel(new ZipChannel(new TCPChannel()));
        channel3.send("mensagem3");

        Channel channel4 = new ZipChannel(new LogChannel(new TCPChannel()));
        channel4.send("mensagem4");

        Channel channel5 = new ZipChannel(new BufferChannel(new LogChannel(new TCPChannel())));
        channel5.send("mensagem5");

    }

}