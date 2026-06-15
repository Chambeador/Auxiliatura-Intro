from Punto import Punto

class Imagen:
    
    def __init__(self, imagen):
        self.__imagen = imagen
    
    def buscarHuellas(self, depredador):
        
        huella = depredador.getHuella()
        puntos = []
        
        tam = len(self.__imagen)
        for k in range(4):
            for i in range(tam):
                for j in range(tam):
                    if self.__match(huella, i, j):
                        puntito = Punto(i,j)
                        puntos.append(puntito)
            depredador.girarEste()
            huella = depredador.getHuella()
            
        return puntos
    
    def __match(self, huellita, x, y):

        tam_huella = len(huellita)
        tam_imagen = len(self.__imagen)
        respuesta = True

        if x + tam_huella > tam_imagen:
            respuesta = False
        elif y + tam_huella > tam_imagen:
            respuesta = False
        else:

            x_copia = x
            y_copia = y

            for i in range(tam_huella):

                for j in range(tam_huella):

                    if huellita[i][j] != self.__imagen[x][y]:
                        respuesta = False

                    y += 1

                x += 1
                y = y_copia

        return respuesta
                    
                    
            
        
        
        
        
        
        
        
        
        
        
        
