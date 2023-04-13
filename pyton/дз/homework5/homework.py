# Усложнение задач выделены (*). Они необязательны для решения и нужны для тех, кому мало выполнить обычное задание.
# Если вы хотите решить усложненное задание - сначала сделайте задание обычной сложности.

# 5.1[26]: Напишите рекурсивную функцию для возведения числа a в степень b. Разрешается использовать только операцию умножения. Циклы использовать нельзя
# Примеры/Тесты:
# <function_name>(2,0) -> 1
# <function_name>(2,1) -> 2
# <function_name>(2,3) -> 8
# <function_name>(2,4) -> 16
# def power(a, b):
#     if b == 0:
#         return 1
#     return a * power(a, b-1)

# a = int(input("Введите число a: "))
# b = int(input("Введите число b: "))
# print(power(a, b))

# 5.2[28]: Напишите рекурсивную функцию sum(a, b), возвращающую сумму двух целых неотрицательных чисел. Из всех арифметических операций допускаются только +1 и -1. Циклы использовать нельзя
# Примеры/Тесты:
# <function_name>(0,0) -> 0
# <function_name>(0,2) -> 2
# <function_name>(3,0) -> 3
def sum(a, b):
    if b == 0:
        return a
    return sum(a+1, b-1)

a = int(input("Введите первое число: "))
b = int(input("Введите второе число: "))
print("Сумма чисел равна", sum(a, b))