def es_par(numero: int) -> str:
    respuesta = "El numero es impar"
    if numero % 2 == 0:
        respuesta = "El numero es par"
    return respuesta