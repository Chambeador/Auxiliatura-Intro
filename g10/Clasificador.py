def clasificar_triangulo(ladoA: int, ladoB: int, ladoC: int) -> str:
    respuesta = "Es un triangulo valido"

    if ladoA + ladoB > ladoC and ladoB + ladoC > ladoA and ladoA + ladoC > ladoB:
        if ladoA == ladoB and ladoA == ladoC and ladoB == ladoC:
            respuesta = "El triangulo es equilatero"
        elif ladoA != ladoB and ladoA != ladoC and ladoB != ladoC:
            respuesta = "El triangulo es Escaleno"
        else:
            respuesta = "El triangulo es Isoceles"
    else:
        respuesta = "No es un triangulo"

    return respuesta