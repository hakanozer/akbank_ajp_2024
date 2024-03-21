package com.works.days4.useSocket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Server server = new Server();
        server.serverCall();
    }


    public void serverCall() {
        try {
            // Port Permission
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();


            // Read Socket data
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            // Write Socket Data
            PrintStream printStream = new PrintStream(socket.getOutputStream());

            Scanner scanner = new Scanner(System.in);
            while (true) {
                String message = bufferedReader.readLine().trim();
                System.out.println("Gelen: "+ message);
                if (message.equalsIgnoreCase("xxx")) break;

                while (true) {
                    printStream.println(scanner.nextLine());
                    break;
                }
            }

        }catch (Exception ex) {
            System.err.println("serverCall error:" + ex);
        }
    }


}
