# Список 
# []
# list_1=[]
# list_1=list()
# list_1=[1,2,3,8]
# print(*list_1)
# for i in list_1:
#     print(i)
# print(len(list_1))

# list_2=[1,5]
# print(list_2)
# list_2.append(8)
# print(list_2)
#добавление эллемента
# list_1=[]
# for i in range(5):
#     list_1.append(i)
#     print(list_1)

#удаление элемента
# list_1=[1,2,3,8]
# print(list_1.pop(0))
# print(list_1)

#добавление элемента на нужную позицию
# list_1=[1,2,3,8]
# print(list_1.insert(2,12))
# print(list_1)
# v=[1,3,8]
# a,b,c=v
# print(v)

#кортеж tuple неизменнеямый список
# t=(1,2,3,5)
# for i in t:
#     print(i)

# Словари
# d={}
# d=dict()

# d['q']='qwerty'
# d['w']='werty'
# print(d['q'])

# dictonary={}
# dictonary={'up':'↑', 'left':'←', 'down':' ↓', 'write':'← ' }
# del dictonary['left'] #delete element
# for item in dictonary:
#     # print('{}:{}'.format(item, dictonary[item]) ) #ключ и значение
#     print(item)
# dictonary[895]=98998
# print(dictonary)

#множества
# colors={'green','white','black'}
# print(colors)
# colors.add('red')
# print(colors)
# # colors.remove('black')
# print(colors)
# colors.discard('black') #проверяет удалено или нет если не удалено то удаляет
# print(colors)
# colors.clear()
# print(colors)


# операции со множествами
# a={1,23,44,5}
# b={23,44,33,3}
# c=a.copy()
# u=a.union(b)
# dl=a.diference(b) #1,33
# dl=b.diference(a) #33,3
# q=a.union(b).difference(a.intersection(b))

#замороженное множество
# a={1,8,6}
# b=frozenset(a)
# print(b)

# list_1=[i for i in range(1,101) if i%2==0] #добавить только четные числа
list_1=[i*2 for i in range(1,101) if i%2==0] #добавить числа умноженные на два