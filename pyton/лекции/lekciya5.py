# def f(x):
#     return x*x
# a=f
# print(type (a))

# calc1=lambda a,b: a+b

# def calc2(a,b):
#     return a*b

# def math(op,x,y):
#     print(op(x,y))

# math(calc1,5,45)

# data=[1,2,3,5,8,15,23,38]
# res=()
# for i in data:
#     if el%2==0:
#         res.append(i,i**2)
# print(res)

# не рабоает
# def select (f,col):
#     return [f(x) for x in col]
# def where (f,col):
#     return [x for x in col if f(x)]
# data=[1,2,3,5,8,15,23,38]
# res=select(int, data)
# print(res)
# res=where(lambda x:x%2==0,res) 
# print(res) 
# res=select(x:(x,x**2),res)         

#работает
# list_1=[x for x in range(1,20)]
# print(list_1)
# list_1=list(map(lambda x: x+10,list_1))
# print(list_1)

#работает
# data= '15 156 4 45 53'
# print(data)
# data=data.split()
# print(data)

# data= '15 156 4 45 53'
# print(data)
# data=list(map(int,data.split))
# print(data)

# data =[15,65,9,36,179]
# rest=list(filter(lambda x:x%10==5,data))
# print(rest)
#работает
# data=[1,2,3,5,8,15,23,38]
# res=map(int,data)
# print(res)
# res=filter(lambda x:x%2==0,res)
# print(res)
# res=list(map(lambda x:(x,x**2),res))
# print(res)

# colors=['red','green','blue']
# data=open('file.txt','a',encoding='utf8')
# data.writlines(colors)
# data.close()
#работает
# with open('file.txt','w') as data:
#     data.write('line 1\n')
#     data.write('line 2\n')
# print(56)

# path='file.txt'
# data=open('file.txt','r')
# for line in data:
#     print(line)
# data.close()
