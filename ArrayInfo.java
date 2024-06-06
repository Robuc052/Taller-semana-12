
package com.mycompany.tallers12;

/**
 *
 * @author James Honeyman - Roberto Cubillan
 */
public class ArrayInfo {

    public static String getDefinicion() {
        return """
               Definicion de un ArrayList:
               
               Es una clase que permite almacenar datos en memoria de forma similar a los Arrays, con la ventaja
               de que el numero de elementos que almacena, lo hace de forma dinamica, es decir,no es necesario
               declarar su tamano como pasa con los Arrays.
               
               Fuente: https://luismoralescotoli.wordpress.com/2016/10/01/definicion-y-utilizacion-de-arraylist-clase-string-tokenizer/#respond 
               
               """;
    }

    public static String getDiferencias() {
        return """
               Diferencias entre ArrayList y Arreglo o Vector:
               
               1. Tama\u00f1o: Los ArrayLists pueden cambiar de tama\u00f1o dinamicamente, mientras que los arreglos tienen un tama\u00f1o fijo.
               
               2. Tipado: Para definir el tipo de dato a guardar en un arraylist hay que usar uso unicamente de clases,
                  mientras que los array  pueden almacenar tipos de datos tanto primitivos como clases
               
               3. Manipulacion: ArrayList al ser una clase tambien tiene sus propios metodos que permiten mucha mas comodidad par manipular datos
                  mientras que en un arreglo el manejo de los datos tiene que ser manual, generando mas codigo
               
               4. Dimensiones: El arreglo se puede dimensionar para convertirse en una matriz, mientras que el ArrayList solamenete ser\u00e1 de una dimension. 
               
               5. Inportacion: para utilizar la Clase ArrayList es nesesaria la importacion por un paquete java.util.
               
               6. Rendimiento: los Areglos pueden saer mas eficientes en memoria y tiempo de acceso debida a la capacidad estatica
                  en los ArrayList puede haber sobrecarga cuando nesecita redimensionarse, haciendo que la eliminacion y y adicion sea mas lenta. 
               
               Fuente:https://www.geeksforgeeks.org/difference-between-list-and-arraylist-in-java/ 
               
               """;
    }

    public static String getMetodos() {
        return """
               M\u00e9todos de la clase ArrayList:
               
               1. lista.Add(objeto)
               2. lista.Clear()
               3. lista.Remove(object)
               4. lista.Reverse()
               
               Fuente: https://learn.microsoft.com/es-es/dotnet/api/system.collections.arraylist?view=net-8.0 
               
               """;
    }

    public static String getConclusiones() {
        return """
               Conclusiones sobre el uso de ArrayList:
               
               La clase arraylist es una clase interesante, pues ofrece varias funcionalidad y comodidades al momento de trabajar
               con lista a niber unidimensional, resumiendo la cantidad de codigo y mejorando la comprencion del mismo.
               sin duda una herramineta muy util a tener en cuenta para la elaboracion de un codigo.""";
    }

}
