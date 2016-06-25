
import java.util.Scanner;
import httpurltool.Collection;
import httpurltool.IP;
import httpurltool.Json;
import httpurltool.Ping;
import httpurltool.SocketIO;
import httpurltool.SourceCode;

public class MikelsURLtool {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Mikel's URL tool.");
        System.out.println("Type 1 to see the source code of a website.");
        System.out.println("Type 2 to see the ip address of a website.");
        System.out.println("Type 3 to get the HTTP response from a website.");
        System.out.println("Type 4 to get the HTTP response and the ip address in JSON format.");
        System.out.println("Type 5 for a list of example URLs that work.");
        System.out.println("Type 6 to connect to a website on port 80");
        
        String choice;
        choice = input.nextLine();

        switch (choice) {

            case "1":
                SourceCode.sourceCode(args);
                break;
            case "2":
                IP.ip(args);
                break;
            case "3":
                Ping.ping(args);
                break;
            case "4":
                Json.json(args);
                break;
            case "5":
                Collection.collection(args);
                break;
            case "6":
                SocketIO.socket(args);
                break;
            default:
                System.out.println("Error on input, please try again.");
                break;
        }

    }
}
