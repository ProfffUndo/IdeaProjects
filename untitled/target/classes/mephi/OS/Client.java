package mephi.OS;

import java.io.*;
import java.net.Socket;
import java.util.Random;

public class Client {
    Random rand = new Random();
    int priority;
    private static int lastID = 0;
    int id;
    public static void main(String[] args) {
        try (Phone phone = new Phone ("127.0.0.1",8000))
        {
            Client client = new Client();
            System.out.println("Connected to Server");
            Client request = client;
            //System.out.println("Создан клиент с id=" + client.getId());
           // System.out.println("Приоритет =" + client.getPriority());
            phone.writeLine(String.valueOf(client.getId()));

            String response = phone.readLine();
            System.out.println("Response:"+response);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public Client(){
        lastID++;
        id=lastID;
        priority=rand.nextInt(100);
    }
    public Client(int id){
        this.id=id;
        priority=rand.nextInt(100);
    }

    public int getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }
}