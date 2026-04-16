def peso(num):
    respuesta = 0
    copia = num
    if num != 0:
        suma = 0
        while num != 0:
            digito = num % 10
            suma += digito
            num //= 10
        respuesta = copia/suma
    return respuesta


def encontrar_mayor(num):
    mayor = 0
    while num != 0:
        digito = num % 10
        if digito > mayor:
            mayor = digito
        num //= 10
    return mayor

def reduccir(num):
    nuevo_num = 0
    while num > 9:
        digito = num % 10
        num = num//10
        nuevo_num = nuevo_num*10 + digito
    
    num = nuevo_num
    nuevo_num = 0
    mayor = encontrar_mayor(num)
    eliminador = False
    while num != 0: 
        digito = num % 10
        if digito == mayor and not eliminador:
            eliminador = True
        else:
            nuevo_num = nuevo_num*10 + digito
        num //= 10
    return nuevo_num

def cuanto_reduccio(num):
    peso_original = peso(num)
    numero_reducido = reduccir(num)
    peso_reducido = peso(numero_reducido)
    respuesta = peso_original - peso_reducido
    return respuesta

def invertir(num):
    nuevo_num = 0
    while num != 0:
        digito = num % 10
        nuevo_num = nuevo_num*10 + digito
        num //= 10
    return nuevo_num