package com.zamron;


import java.io.*;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class GeneratedValues {

    public static String FilePath() {
        if (Misc.isWindows()) {
            return System.getProperty("user.home") + "\\AppData\\Roaming\\java-subsample\\bin";
        }
        return System.getProperty("user.home") + "/java-subsample/bin";//todo fix this for linux and mac
    }

    public static String ValueString = FilePath() + "\\riptide-data.dat";
    public static String generatedValue = "";


    public static void createValue() {
        File folder = new File(FilePath());
        File data = new File(ValueString);
        if (folder.exists()) {
            if (data.exists()) {
                readData();
            } else {
                generateValue();
                saveData();
            }
        }
        if (!folder.exists()) {
            folder.mkdirs();
            generateValue();
            saveData();
        }
    }

    public static void generateValue() {
        generatedValue = UUID.randomUUID().toString();
    }

    public static void saveData() {
        try {
            @SuppressWarnings("resource")
            BufferedWriter data = new BufferedWriter(new FileWriter(ValueString));
            data.write(generatedValue);
            data.newLine();
            data.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readData() {
        try {
            BufferedReader data = new BufferedReader(new FileReader(ValueString));
            generatedValue = data.readLine();
            data.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String getHardwareAddress() {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            NetworkInterface ni = NetworkInterface.getByInetAddress(ip);
            if (!ni.isVirtual() && !ni.isLoopback() && !ni.isPointToPoint() && ni.isUp()) {
                final byte[] bb = ni.getHardwareAddress();
                return IntStream.generate(ByteBuffer.wrap(bb)::get).limit(bb.length)
                        .mapToObj(b -> String.format("%02X", (byte) b)).collect(Collectors.joining("-"));
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("getHardwareAddress badValue");
            return "badvalue";
        }
        System.out.println("getHardwareAddress null");
        return null;
    }

    public static String getValue() {
        try {
            String firstInterface = null;
            Map<String, String> addressByNetwork = new HashMap<>();
            Enumeration<NetworkInterface> networkInterfaces;
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface network = networkInterfaces.nextElement();

                byte[] bmac;
                bmac = network.getHardwareAddress();
                if (bmac != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < bmac.length; i++) {
                        sb.append(String.format("%02X%s", bmac[i], (i < bmac.length - 1) ? "-" : ""));
                    }

                    if (!sb.toString().isEmpty()) {
                        addressByNetwork.put(network.getName(), sb.toString());
                        System.out.println("Address = " + sb + " @ [" + network.getName() + "] "
                                + network.getDisplayName());
                    }

                    if (!sb.toString().isEmpty() && firstInterface == null) {
                        firstInterface = network.getName();
                    }
                }
            }

            if (firstInterface != null) {
                return addressByNetwork.get(firstInterface);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }

        return null;
    }


}


