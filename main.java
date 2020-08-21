import java.util.Scanner;

public class simbol {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrNums = new int[5];

        String[] symbols = { // 15 simbolos, 14 indices.
                "!",
                "#",
                "$",
                "%",
                "&",
                "/",
                "(",
                ")",
                "=",
                "?",
                "¡",
                "¿",
                "}",
                "]",
                "{",
        };

        /* Pidiendo datos */

        for (int i = 0; i < arrNums.length; i++) {
            System.out.println(">> Introduzca 5 numeros (max: 5, min: 1): ");
            arrNums[i] = sc.nextInt();

            /* Condicionales */

            if(arrNums[i] > 5 || arrNums[i] < 0) {
                System.out.println(">> Error, como máximo solo se puede hasta el número 5.");
                break;
            }

            if(arrNums[i] == 1){
                System.out.println("# Numero: " + arrNums[i]);
                System.out.println("# Simbolo: " + symbols[0] + "\n");
            }
            else if(arrNums[i] == 2){
                System.out.println("# Numero: " + arrNums[i]);
                System.out.println("# Simbolo: " + symbols[1] + symbols[2] + "\n");
            }
            else if(arrNums[i] == 3){
                System.out.println("# Numero: " + arrNums[i]);
                System.out.println("# Simbolo: " + symbols[3] + symbols[4] + symbols[5] + "\n");
            }
            else if(arrNums[i] == 4){
                System.out.println("# Numero: " + arrNums[i]);
                System.out.println("# Simbolo: " + symbols[6] + symbols[7] + symbols[8] + symbols[9] + "\n");
            }
            else if(arrNums[i] == 5){
                System.out.println("# Numero: " + arrNums[i]);
                System.out.println("# Simbolo: " + symbols[10] + symbols[11] + symbols[12] + symbols[13] + symbols[14] + "\n");
            }

            }
        }
    }
