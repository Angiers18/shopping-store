package shoppingstore.main;

import shoppingstore.models.Buy;
import shoppingstore.models.Card;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Ingresa el limite de la tarjeta");
        Scanner teclado = new Scanner(System.in);
        int balance = teclado.nextInt();

        Card newUser = new Card(balance);

        String choice =
                """
                Presiona:
                1. Continuar  -- 2. Salir
                """;

        System.out.println("\n**********************************\n");
        System.out.println("Bienvenido/a ");
        System.out.println("Límite de tarjeta: " + newUser.getBalance());
        System.out.println("\n**********************************\n");

        int selection = 1;

        while (selection != 2){


            System.out.println("Ingresa el valor de la compra: ");
            double value = teclado.nextDouble();
            System.out.println("Ingresa descripción de la compra: ");
            String description = teclado.next();

            Buy newBuy = new Buy(value, description);

            boolean success = newUser.processBuy(newBuy);


            if(success){
                System.out.println("\n");
                System.out.println("**Compra realizada!**");
                System.out.println("\n");
                System.out.println(choice);
                selection = teclado.nextInt();
                
            } else{

                System.out.println("Saldo insuficiente!");
                selection = 2;

            }

           }



            System.out.println("\n**********************************\n");
            System.out.println("*** Lista de Compras ***");
            for (Buy buy : newUser.getBuyList()) {
                System.out.println(buy.getDescription() + " - " + buy.getValue());
            }
            System.out.println("\n**********************************\n");
            System.out.println("\n  Saldo restante: " + newUser.getBalance());

    }


    }

