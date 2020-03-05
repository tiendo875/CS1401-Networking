
package tcp;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ClientTCP {
    public static final int PORT=12345;
    public static void main(String[] args) {
        try{
           Socket door=new Socket("localhost", PORT);
           DataInputStream in=new 
               DataInputStream(door.getInputStream());
           String st=in.readUTF();
            System.out.println(st);
            String[] n=st.split(":");
            int sum=Integer.parseInt(n[0])+
                      Integer.parseInt(n[1]);
            DataOutputStream out=
                    new DataOutputStream(door.getOutputStream());
            out.writeInt(sum);
            in.close();
            door.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
