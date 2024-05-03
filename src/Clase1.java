import java.util.Scanner;

public class Clase1 {
    public static void main(String[] args) {
        String movie = "";
        double evaluacion = 0;
        int totalDeEvaluaciones = 0;

        print("Ingrese el nombre de una película");
        movie = inputScan().nextLine();

        print("Ingrese la evaluación de la película (1-5)");
        Scanner scanner = inputScan();

        while (esDouble(scanner)){
            evaluacion += scanner.nextDouble();
            totalDeEvaluaciones++;

            print("Ingrese otra evaluación o escriba Fin para finalizar");
            scanner = inputScan();
        }

        print(
            "La película " + movie +
            " obtuvo la calificación promedio de " + getPromedio(evaluacion, totalDeEvaluaciones)
        );
    }

    public static void print(String text){

        System.out.println(text);
    }

    public static Scanner inputScan(){

        return new Scanner(System.in);
    }

    public static boolean esDouble(Scanner scanner){

        return scanner.hasNextDouble();
    }

    public static double getPromedio(double evaluaciones, int totalDeEvaluaciones){
        return evaluaciones / totalDeEvaluaciones;
    }
}

