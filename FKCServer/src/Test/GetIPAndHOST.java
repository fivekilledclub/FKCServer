package Test;
 
import java.io.InputStream;
import java.net.InetAddress;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class GetIPAndHOST {

    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip.getHostAddress());
    }
 
}