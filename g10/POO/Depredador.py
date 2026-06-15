
class Depredador:
    
    def __init__(self, nombre, huella):
        self.__nombre = nombre
        self.__huella = huella
        
    def getHuella(self):
        return self.__huella
    def getNombre(self):
        return self.__nombre
    
    def setHuella(self, huella):
        self.__huella = huella
    
    def setNombre(self, nombre):
        self.__nombre = nombre
        
    def girarEste(self):
        tam = len(self.__huella)
        girado = []
        for j in range(tam):
            fila = []
            for i in range(tam-1, -1, -1):
                fila.append(self.__huella[i][j])
            girado.append(fila)
        self.setHuella(girado)
    
    
    
