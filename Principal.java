package Switch_Case2;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal{

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
DecimalFormat formatodovalor = new DecimalFormat("Impostos Aplicados--$:00.00");

 System.out.println("Insira o nome de uma arma:");
 String arma = input.next();
 System.out.println("Arma inserida:" + arma);
 

switch (arma) {
 
    case "Colt_1911":
    Integer preco = 234;
    System.out.println("__Arma Americana__");    
    System.out.println("--Calibre 9mm--");    
    System.out.println("PREÇO DA ARMA: " + formatodovalor.format(preco));
    break;

    case "UZI":
    Integer preco2 = 367;
    System.out.println("__Arma Israelense__");
    System.out.println("--Calibre 22mm--");
    System.out.println("PREÇO DA ARMA:" + formatodovalor.format(preco2));
      break;
    
    case "Ak47":
    System.out.println("__Arma Russa__");
    System.out.println("--Calibre 7,62x39mm");
      break;
   
    case "MP40":
    System.out.println("__Arma Alemã__");   
    System.out.println("--Calibre 9x19mm--");
      break;
    
    default:
    System.out.println("Insira o nome de uma arma por favor!");
      break;
     }
     input.close();
  }


}
    

