def encontrar_maximo(lista: list[int]) -> int:
    mayor_elemento = lista[0]
    for i in range(len(lista)):
        elemento = lista[i]
        if elemento > mayor_elemento:
            mayor_elemento = elemento
    return mayor_elemento


    
def encontrar_suma(lista):
    sumita = 0
    for i in range(len(lista)):
        elemento = lista[i]
        sumita += elemento
    return sumita


def existe(lista, elemento_b):
    respuesta = False
    for i in range(len(lista)):
        elemento = lista[i]
        if elemento == elemento_b:
            respuesta = True
    return respuesta

def eliminar_ocurrencias(lista):
    respuesta = []
    for i in range(len(lista)):
        elemento = lista[i]
        if existe(respuesta, elemento) == False:
            respuesta.append(elemento)
    return respuesta



def eliminar_divisores(lista, k):
    for i in range(len(lista)):
        if lista[i] % k == 0:
            lista[i] = -1
            
    cantidad_de_unos = lista.count(-1)
    for _ in range(cantidad_de_unos):
        lista.remove(-1)
    return lista


def invertir(lista):
    inicio = 0
    final = len(lista)-1
    while inicio < final:
        #intercambiar el valor de la
        #lista en la posicion inicio y final
        auxiliar = lista[inicio]
        lista[inicio] = lista[final]
        lista[final] = auxiliar
        #modificar inicio y final para que el bucle acabe
        inicio += 1
        final -=1
    return lista
    
        


    
    
    



        
            
    


    


                            
