
package url;
import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {
    public static void main(String[] args) {
        try{
          URL url= new URL("https://dantri.com.vn/xa-hoi/pho-tay-ha-noi-dong-duc-tro-lai-nhu-chua-he-co-covid-19-20200224095815365.htm");
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getFile());
            System.out.println(url.getPath());
        }catch(MalformedURLException e){
            System.out.println(e);
        }
    }
    
}
