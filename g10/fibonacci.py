def n_fibo(n: int):
    primero = 0
    segundo = 1
    for i in range(0, n - 2):
        siguiente = primero + segundo
        primero = segundo
        segundo = siguiente
    return siguiente