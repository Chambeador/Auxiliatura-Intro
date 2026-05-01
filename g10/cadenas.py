def unir(uno, dos):
    respuesta = uno+dos
    return respuesta



def es_vocal(c):
    respuesta = False
    if c == 'a' or c == 'e' or c == 'i'or c == 'o'or c == 'u':
        respuesta = True
    return respuesta


def contar_vocales(cad):
    cont = 0
    for i in range (len(cad)):
        if es_vocal(cad[i]):
            cont +=1
    return cont


def es_palindromo(cad):
    es_pal = True
    ini = 0
    fin = len(cad)-1
    while ini <= fin:
        if cad[ini] != cad[fin]:
            es_pal = False
        ini+=1
        fin-=1
    return es_pal



def existe_en_pos(cad, pat, pos):
    respuesta = True
    #proceso
    j = 0
   
    for i in range(pos, pos+len(pat)):
        if cad[i] != pat[j]:
            respuesta = False
        j+=1
    return respuesta


def existe_en_pos2(cad, pat, pos):
    respuesta = True
    j = 0
    while j < len(pat) and pos < len(cad):
        if pat[j] != cad[pos]:
            respuesta = False
        j+=1
        pos+=1
    return respuesta


def contar_ocurrencias(cad, pat):
    cant = 0
    for i in range(len(cad)-len(pat)+1):
        if cad[i] == pat[0]:
            if existe_en_pos(cad, pat, i):
                cant+=1
    return cant



               
               

