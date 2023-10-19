import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;

class AddMessageHandler implements URLHandler {
    StringBuilder message = new StringBuilder();
    int messageNumber = 0;

    public String handleRequest(URI url) {
        String path = url.getPath();
        if (path.equals("/add-message")) {
            String query = url.getQuery();
            if (query != null) {
                String[] parameters = query.split("=");
                if (parameters.length == 2 && "s".equals(parameters[0])) {
                    String newMessage = parameters[1];
                    messageNumber++;
                    message.append(messageNumber).append(". ").append(newMessage).append("\n");
                }
            }
            return message.toString();
        } else {
            return "404 Not Found!";
        }
    }
}

public class AddMessageServer {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        AddMessageHandler handler = new AddMessageHandler();
        Server.start(port, handler);
    }
}
