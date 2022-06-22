def kollatz(num):
    while(num != 1):
        if(num % 2 == 0):
            num = num // 2
        elif(num % 2 == 1):
            num = 3 * num + 1
        print(num)
    return num
    
chislo = int(input())
print(kollatz(chislo))