from Imagen import Imagen
from Depredador import Depredador

imagen = [
    [1,0,1,1,0,0,1,1,0,0],
    [0,0,1,0,1,0,1,0,1,1],
    [1,0,1,1,1,1,1,1,1,0],
    [1,1,1,0,0,0,1,1,0,0],
    [1,0,1,1,0,0,0,1,0,1],
    [0,0,1,0,1,1,1,1,1,1],
    [0,1,0,1,1,0,0,0,1,0],
    [1,1,0,0,1,1,1,1,1,1],
    [1,0,1,1,1,0,0,1,1,1],
    [0,0,1,0,1,0,1,1,0,1]
]

huella = [
    [0,1,0,1],
    [0,1,1,1],
    [1,1,0,0],
    [0,1,1,0]
]

d = Depredador("Etrovis", huella)
img = Imagen(imagen)

puntos = img.buscarHuellas(d)
for p in puntos:
    print(f"({p.getX()}, {p.getY()})")

