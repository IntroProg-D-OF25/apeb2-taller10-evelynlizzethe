
import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random random = new Random();

        // Número de estudiantes
        int numEstudiantes = 28;

        // Arrays para almacenar nombres, notas y promedios
        String[] nombres = new String[numEstudiantes];
        double[] acd = new double[numEstudiantes];
        double[] ape = new double[numEstudiantes];
        double[] aa = new double[numEstudiantes];
        double[] promedio = new double[numEstudiantes];

        // Registrar los nombres de los estudiantes
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = tcl.nextLine();
        }

        // Generar las notas aleatorias y calcular los promedios
        double sumaPromedios = 0;
        for (int i = 0; i < numEstudiantes; i++) {
            acd[i] = random.nextDouble() * 10; 
            ape[i] = random.nextDouble() * 10;
            aa[i] = random.nextDouble() * 10;
            promedio[i] = acd[i] * 0.35 + ape[i] * 0.35 + aa[i] * 0.30;
            sumaPromedios += promedio[i];
        }

        // Calcular el promedio del curso
        double promedioCurso = sumaPromedios / numEstudiantes;
        System.out.printf("\nPromedio del curso: %.2f\n", promedioCurso);

        // Estudiantes por encima del promedio del curso
        System.out.println("\nEstudiantes con promedio por encima del promedio del curso:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (promedio[i] > promedioCurso) {
                System.out.printf("%s: %.2f\n", nombres[i], promedio[i]);
            }
        }

        // Estudiantes por debajo del promedio del curso
        System.out.println("\nEstudiantes con promedio por debajo del promedio del curso:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (promedio[i] < promedioCurso) {
                System.out.printf("%s: %.2f\n", nombres[i], promedio[i]);
            }
        }

        // Buscar el estudiante con el mayor y menor promedio
        double maxPromedio = promedio[0];
        double minPromedio = promedio[0];
        String estudianteMax = nombres[0];
        String estudianteMin = nombres[0];

        for (int i = 1; i < numEstudiantes; i++) {
            if (promedio[i] > maxPromedio) {
                maxPromedio = promedio[i];
                estudianteMax = nombres[i];
            }
            if (promedio[i] < minPromedio) {
                minPromedio = promedio[i];
                estudianteMin = nombres[i];
            }
        }

        // Mostrar el estudiante con mayor promedio
        System.out.printf("\nEstudiante con el mayor promedio: %s (%.2f)\n", estudianteMax, maxPromedio);

        // Mostrar el estudiante con menor promedio
        System.out.printf("Estudiante con el menor promedio: %s (%.2f)\n", estudianteMin, minPromedio);
    }
}

/***
 * Ingrese el nombre del estudiante 1: a
Ingrese el nombre del estudiante 2: b
Ingrese el nombre del estudiante 3: c
Ingrese el nombre del estudiante 4: d
Ingrese el nombre del estudiante 5: e
Ingrese el nombre del estudiante 6: f
Ingrese el nombre del estudiante 7: g
Ingrese el nombre del estudiante 8: h
Ingrese el nombre del estudiante 9: i
Ingrese el nombre del estudiante 10: j
Ingrese el nombre del estudiante 11: k
Ingrese el nombre del estudiante 12: l
Ingrese el nombre del estudiante 13: m
Ingrese el nombre del estudiante 14: n 
Ingrese el nombre del estudiante 15: ñ
Ingrese el nombre del estudiante 16: o
Ingrese el nombre del estudiante 17: p
Ingrese el nombre del estudiante 18: q
Ingrese el nombre del estudiante 19: r
Ingrese el nombre del estudiante 20: s
Ingrese el nombre del estudiante 21: t
Ingrese el nombre del estudiante 22: u
Ingrese el nombre del estudiante 23: v
Ingrese el nombre del estudiante 24: x
Ingrese el nombre del estudiante 25: w
Ingrese el nombre del estudiante 26: y
Ingrese el nombre del estudiante 27: z
Ingrese el nombre del estudiante 28: aa

Promedio del curso: 4,73

Estudiantes con promedio por encima del promedio del curso:
b: 6,99
c: 4,96
h: 4,93
j: 8,35
k: 5,38
l: 7,19
q: 8,44
s: 7,12
t: 7,21

Estudiantes con promedio por debajo del promedio del curso:
a: 4,26
d: 2,93
e: 4,25
f: 4,37
g: 4,06
i: 3,95
m: 3,22
n : 2,53
�: 4,70
o: 4,26
p: 2,91
r: 4,07
u: 3,06
v: 4,42
x: 2,91
w: 4,63
y: 3,83
z: 3,14
aa: 4,33

Estudiante con el mayor promedio: q (8,44)
Estudiante con el menor promedio: n  (2,53)
 */
