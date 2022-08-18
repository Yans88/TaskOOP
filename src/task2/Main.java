package task2;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.Console;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String aksi;
        System.out.println("+++++ CALCULATOR +++++");
        System.out.println("1: Open Calculator");
        System.out.println("99: Exit");
        System.out.print("Masukkan pilihan anda : ");
        aksi = input.nextLine();
        if(aksi.equalsIgnoreCase("1")){

            option1();
        } else if (aksi.equalsIgnoreCase("99")){
            System.exit(0);
        } else {
            System.out.println("Kamu memasukkan pilihan yang salah!");
        }
    }


    public static void option1(){
        clearConsole();
        Scanner input = new Scanner(System.in);
        System.out.println("+++++ CALCULATOR +++++");
        System.out.print("Masukkan value 1 : ");
        try {
            int value1 = input.nextInt();
            System.out.print("Masukkan value 2 : ");
            int value2 = input.nextInt();

            operation(value1, value2);
        } catch (Exception e) {
            System.out.println("Error : Input hanya boleh angka");
            input.nextLine();
        }
    }

    public static void operation(int value1, int value2){

        Scanner input = new Scanner(System.in);
        String operator;
        System.out.println("+++++ CALCULATOR +++++");
        System.out.println("Please Enter Calculation Operation :");
        System.out.println("1. Add Value");
        System.out.println("2. Sub Value");
        System.out.println("3. Multiply Value");
        System.out.println("4. Divide Value");
        System.out.println("99: Exit");
        System.out.println("++++++++++++++");
        System.out.print("Pilihan anda : ");
        operator = input.nextLine();
        clearConsole();
        System.out.println("+++++ CALCULATOR +++++");
        System.out.println("Pilihan anda : "+operator);
        Operation op = new Operation();
        op.setValue1(value1);
        op.setValue2(value2);
        if(operator.equalsIgnoreCase("1")){
            op.addValue();
        } else if (operator.equalsIgnoreCase("2")){
            op.subValue();
        } else if (operator.equalsIgnoreCase("3")){
            op.multiplyValue();
        }else if (operator.equalsIgnoreCase("4")){
            op.divideValue();
        }else if (operator.equalsIgnoreCase("99")){
            System.out.print("Anda keluar");
            System.exit(0);
        } else {
            System.out.print("Kamu memasukkan pilihan yang salah!");
            System.exit(0);
        }
        op.showResult();
    }

    public static void clearConsole() {
        try {
            Robot pressbot = new Robot();
            pressbot.keyPress(17); // Holds CTRL key.
            pressbot.keyPress(76); // Holds L key.
            pressbot.keyRelease(17); // Releases CTRL key.
            pressbot.keyRelease(76); // Releases L key.
            Thread.sleep(50);
        } catch (AWTException | InterruptedException ex) {
            System.out.print(ex.getMessage());
        }
    }


}
