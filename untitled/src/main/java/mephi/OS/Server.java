package mephi.OS;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

public class Server { //Соединение через TCP/IP протокол
    public static void main(String[] args) throws IOException {

        try (ServerSocket server = new ServerSocket(8000)) { //serverscoket instanceof Cloaseable

            Comparator<Client> comp = (Client c1, Client c2)->{
                int diff = c1.priority - c2.priority;
                if (diff < 0) return -1;
                else if (diff == 0) return 0;
                else return 1;
            };

            Queue<Client> priorityQueue = new PriorityBlockingQueue<Client>(10,comp);
            System.out.println("Server started!");

            while (true) {
                Phone phone = new Phone(server);
                new Thread(() -> {
                    String requestID=phone.readLine();
                    //System.out.println("Request:" + requestID);
                    Client client = new Client(Integer.parseInt(requestID));
                    addDatatoQueue(priorityQueue,client);
                   // System.out.println("Request:" + request);
                   // String response = (int) (Math.random() * 30 - 10) + " ";
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    pollDatafromQueue(priorityQueue);
                    //phone.writeLine(response);
                   // System.out.println("Response:" + response);
                    try {
                        phone.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
            }

                } catch (IOException e)  {
                    throw new RuntimeException(e);
                }
        }

        private static void addDatatoQueue (Queue<Client> queue, Client newClient){
        queue.add(newClient);
            System.out.println("Принят клиент с id =" + newClient.getId());
            System.out.println("Приоритет =" + newClient.getPriority());
        }

        private static void pollDatafromQueue(Queue<Client> queue){
        Client client=queue.poll();
            System.out.println("Обработка клиента с id=" + client.getId());
            System.out.println("Приоритет =" + client.getPriority());
        }
    }