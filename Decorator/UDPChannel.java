public class UDPChannel extends Channel {

    @Override
    public void send(String msg) {
        System.out.println("Sending "+msg+" via UDP");
    }

}