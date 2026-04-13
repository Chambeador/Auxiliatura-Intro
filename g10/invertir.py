def invertir(n):
    nuevo_n = 0
    while n != 0:
        ultimo = n % 10
        n = n // 10
        nuevo_n = nuevo_n * 10 + ultimo
    return nuevo_n