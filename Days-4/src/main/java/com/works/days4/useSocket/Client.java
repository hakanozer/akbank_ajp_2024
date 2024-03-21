package com.works.days4.useSocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.clientCall();
    }

    public void clientCall() {

        try {

            Socket socket = new Socket("localhost", 9999);
            PrintStream printStream = new PrintStream(socket.getOutputStream());

            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            printStream.println("Client Connection");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                printStream.println(scanner.nextLine());
                System.out.println("Server:" + bufferedReader.readLine().trim());
            }
        }catch (Exception ex) {
            System.err.println("Client Error: " + ex);
        }

    }

}
