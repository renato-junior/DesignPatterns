public class TCPChannel extends Channel {

    @Override
    public void send(String msg) {
        System.out.println("Sending "+msg+" via TCP");
    }

}