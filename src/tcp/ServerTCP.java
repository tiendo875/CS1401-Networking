
package tcp;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.DataInputStream;

public class ServerTCP {
    public static final int PORT=12345;
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        try{
           ServerSocket gate=new ServerSocket(PORT);
           System.out.println("waiting!!!!!");
           Socket door=gate.accept();
           System.out.println("Connect OK!!!");
           DataOutputStream out=new 
              DataOutputStream(door.getOutputStream());
           //out.writeUTF("Hello from Co Van Anh");
            System.out.println("Enter num1:");
            num1=sc.nextInt();
            System.out.println("Enter num2:");
            num2=sc.nextInt();
            //gui di
            out.writeUTF(num1+":"+num2);
            DataInputStream in=
                    new DataInputStream(door.getInputStream());
            int st=in.readInt();
            System.out.println("Sum: "+st);
           out.close();
           door.close();
           gate.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
        
    
}
