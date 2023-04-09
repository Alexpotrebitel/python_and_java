# 3.1[16]: Дан список целых чисел. Требуется вычислить, сколько раз встречается некоторое число X в этом списке.
# Пользователь вводит число X с клавиатуры. Список можно считать заданным.
# Если такого числа в списке нет - вывести -1.

# Примеры/Тесты:
# Input:   [10, 5, 7, 3, 3, 0, 5, 7, 2, 8], x = 3
# Output:  2

# Input:   [10, 5, 7, 3, 3, 0, 5, 7, 2, 8], x = 20
# Output:  -1

# lst = [10, 5, 7, 3, 3, 0, 5, 7, 2, 8]
# x = int(input("Введите число X: "))
# count = 0
# for num in lst:
#     if num == x:
#         count += 1
# if count == 0:
#     print(-1)
# else:
#     print(count)
    
  
#   3.2[18]: Требуется найти в списке целых чисел самый близкий по величине элемент к заданному числу X. Пользователь вводит это число с клавиатуры, список можно считать заданным. Введенное число не обязательно содержится в списке.
# Примеры/Тесты:
# Input: [10, 5, 7, 3, 3, 2, 5, 7, 3, 8], X = 0
# Output: 2
# Input: [10, 5, 7, 3, 3, 2, 5, 7, 3, 8], X = 9
# Output: 10  
    
#     Для решения этой задачи можно перебрать все элементы списка и найти элемент, который наиболее близок к заданному числу X. Можно рассчитать разницу между каждым элементом и X и сохранить индекс элемента, для которого эта разница наименьшая. Вот пример кода на Python:

# python

# lst = [10, 5, 7, 3, 3, 2, 5, 7, 3, 8]
# x = int(input("Введите число X: "))
# closest_num = None
# closest_diff = None
# for num in lst:
#     diff = abs(num - x)
#     if closest_diff is None or diff < closest_diff:
#         closest_diff = diff
#         closest_num = num
# print(closest_num)


# 3.3[20]: В настольной игре Скрабл (Scrabble) каждая буква имеет определенную ценность.
# В случае с английским алфавитом очки распределяются так:
# A, E, I, O, U, L, N, S, T, R – 1 очко;
# D, G – 2 очка;
# B, C, M, P – 3 очка;
# F, H, V, W, Y – 4 очка;
# K – 5 очков;
# J, X – 8 очков;
# Q, Z – 10 очков.

# А русские буквы оцениваются так:
# А, В, Е, И, Н, О, Р, С, Т – 1 очко;
# Д, К, Л, М, П, У – 2 очка;
# Б, Г, Ё, Ь, Я – 3 очка;
# Й, Ы – 4 очка;
# Ж, З, Х, Ц, Ч – 5 очков;
# Ш, Э, Ю – 8 очков;
# Ф, Щ, Ъ – 10 очков.

# Напишите программу, которая вычисляет стоимость введенного пользователем слова. Будем считать, что на вход подается только одно слово, которое содержит либо только английские, либо только русские буквы и заранее известно какой алфавит надо использовать.

# Примеры/Тесты:
# Input:   ноутбук
# Output:  12

# Input:   notebook
# Output:  14

#вариант1 работает
# Создаем словарь со значениями очков для каждой буквы
#scores = {'A': 1, 'B': 3, 'C': 3, 'D': 2, 'E': 1, 'F': 4, 'G': 2, 'H': 4, 'I': 1, 'J': 8, 'K': 5, 'L': 1, 'M': 3, 'N': 1, 'O': 1, 'P': 3, 'Q': 10, 'R': 1, 'S': 1, 'T': 1, 'U': 1, 'V': 4, 'W': 4, 'X': 8, 'Y': 4, 'Z': 10}
# Вводим слово с клавиатуры и переводим все буквы в верхний регистр
#word = input("Введите слово: ").upper()
# Инициализируем переменную для хранения общей стоимости слова
#total_score = 0
# Перебираем каждую букву в слове и добавляем ее стоимость к общей стоимости
# for letter in word:
#     total_score += scores[letter]
# print(total_score)

#вариант 2
# scrabble_piont_table = {
# 1: 'AEIOULNSTRАВЕИНОРСТ',
# 2: 'DGДКЛМПУ',
# 3: 'BCMPБГЁЬ',
# 4: 'FHVWYЙЫ',
# 5: 'KЖЗХЦЧ',
# 8: 'JXШЭЮ',
# 10: 'QZФЩЪ',
# }

# word = input('Type your word:')
# sum_letters = 0

# for char in word:
# for point, chars in scrabble_piont_table.items():

#     if char.lower() in chars.lower():
#         sum_letters += point
# print(sum_letters)
#вариант 3
word = input("Введите слово: ")
letters = dict.fromkeys(['A','E','I','O','U','L','N','S','T','R'], 1)
letters.update(dict.fromkeys(['А','В','Е','И','Н','Р','О','С','Т'], 1))
letters.update(dict.fromkeys(['D','G'], 2))
letters.update(dict.fromkeys(['Д','К','Л','М','П','У'], 2))
letters.update(dict.fromkeys(['F','H','V','W','Y'], 4))
letters.update(dict.fromkeys(['Б','Г','Ё','Ь','Я'], 3))
letters.update(dict.fromkeys(['Й','Ы'], 4))
letters.update(dict.fromkeys(['K'], 5))
letters.update(dict.fromkeys(['Ж','З','Х','Ц','Ч'], 5))
letters.update(dict.fromkeys(['J','X'], 8))
letters.update(dict.fromkeys(['Ш','Э','Ю'], 8))
letters.update(dict.fromkeys(['Q','Z'], 10))
letters.update(dict.fromkeys(['Ф','Щ','Ъ'], 10))
  
    

sum_of_points=0

print(sum(letters[letter.upper()] for letter in word if letter.upper() in letters))
# for letter in word:
#     try:
#         sum_of_points+=letters[letter.upper()]
#     expect:
#         continue
# print(sum_of_points)  
#print(sum(letters[letter.upper()] for letter in word if letter.upper() in letters))
