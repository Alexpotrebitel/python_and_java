Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Введите число n: ");
int n = scanner.nextInt();

// Вычисление n-го треугольного числа
int triangleNumber = 0;
for (int i = 1; i <= n; i++) {
triangleNumber += i;
}
System.out.println("n-ое треугольное число: " + triangleNumber);

// Вычисление факториала числа n
int factorial = 1;
for (int i = 1; i <= n; i++) {
factorial *= i;
}
System.out.println("Факториал числа n: " + factorial);
}
}
```

Вывести все простые числа от 1 до 1000:

public class Main {
public static void main(String[] args) {
for (int i = 2; i <= 1000; i++) {
boolean isPrime = true;
for (int j = 2; j < i; j++) {
if (i % j == 0) {
isPrime = false;
break;
}
}
if (isPrime) {
System.out.println(i);
}
}
}
}


Реализовать простой калькулятор:


import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double firstNumber, secondNumber;
String operator;

System.out.print("Введите первое число: ");
firstNumber = scanner.nextDouble();
System.out.print("Введите второе число: ");
secondNumber = scanner.nextDouble();
System.out.print("Введите операцию (+, -, *, /): ");
operator = scanner.next();

double result;
switch (operator) {
case "+":
result = firstNumber + secondNumber;
break;
case "-":
result = firstNumber - secondNumber;
break;
case "*":
result = firstNumber * secondNumber;
break;
case "/":
result = firstNumber / secondNumber;
break;
default:
System.out.println("Некорректный оператор");
return;
}

System.out.println("Результат операции: " + result);
}
}
```

Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

public class Main {
public static void main(String[] args) {
for (int q = 0; q <= 9; q++) {
for (int w = 0; w <= 9; w++) {
for (int e = 0; e <= 9; e++) {
if ((q != w) && (w != e) && (q != e)) {
int temp1 = q * 10 + w;
int temp2 = w * 10 + e;
int sum = temp1 + temp2;
if (sum == e * 10 + q) {
System.out.println(q + "" + w + " + " + w + "" + e + " = " + e + "" + q);
}
}
}
}
}
}
}

Вывести все простые числа от 1 до 1000
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Введите число n: ");
int n = scanner.nextInt()
