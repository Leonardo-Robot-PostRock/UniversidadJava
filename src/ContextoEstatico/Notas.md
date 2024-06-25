Explicación sobre el contexto dinámico y estático en Java:

```markdown
# Contexto Dinámico y Estático en Java

En Java, el contexto dinámico y estático se refiere a cómo y cuándo se resuelven las variables y métodos en tiempo de ejecución y tiempo de compilación. Aquí hay una explicación más detallada de ambos conceptos:

## Contexto Estático

El contexto estático en Java se refiere a todo lo que se resuelve en tiempo de compilación. Esto incluye:

1. **Variables Estáticas**:
   - Declaradas con la palabra clave `static`.
   - Pertenecen a la clase en lugar de a una instancia específica.
   - Se inicializan una vez cuando la clase se carga en la memoria.
   - Son accesibles a través de la clase sin necesidad de crear una instancia de la clase.
   
```java
   public class Ejemplo {
       static int contador = 0;

       public static void incrementarContador() {
           contador++;
       }
   }
```

2. **Métodos Estáticos**:
    - También declarados con la palabra clave `static`.
    - No pueden acceder a variables de instancia o métodos no estáticos directamente.
    - Pueden ser llamados sin crear una instancia de la clase.

   ```
   public class Ejemplo {
       static int contador = 0;

       public static void incrementarContador() {
           contador++;
       }

       public static void main(String[] args) {
           incrementarContador();
           System.out.println("Contador: " + contador);
       }
   }
   ```

3. **Resolución de Sobrecarga de Métodos**:
    - La sobrecarga de métodos se resuelve en tiempo de compilación.
    - La selección de qué método llamar depende del tipo de referencia en tiempo de compilación.

   ```
   public class Ejemplo {
       public void metodo(int a) {
           System.out.println("Método con argumento int");
       }

       public void metodo(String a) {
           System.out.println("Método con argumento String");
       }

       public static void main(String[] args) {
           Ejemplo obj = new Ejemplo();
           obj.metodo(10); // Llama al método con argumento int
           obj.metodo("Hola"); // Llama al método con argumento String
       }
   }
   ```

## Contexto Dinámico

El contexto dinámico en Java se refiere a todo lo que se resuelve en tiempo de ejecución. Esto incluye:

1. **Variables de Instancia**:
    - Declaradas sin la palabra clave `static`.
    - Pertenecen a una instancia específica de la clase.
    - Cada instancia de la clase tiene su propia copia de las variables de instancia.

   ```
   public class Ejemplo {
       int contador = 0;

       public void incrementarContador() {
           contador++;
       }

       public static void main(String[] args) {
           Ejemplo obj1 = new Ejemplo();
           Ejemplo obj2 = new Ejemplo();
           obj1.incrementarContador();
           System.out.println("Contador de obj1: " + obj1.contador);
           System.out.println("Contador de obj2: " + obj2.contador);
       }
   }
   ```

2. **Polimorfismo y Sobreescritura de Métodos**:
    - La sobreescritura de métodos se resuelve en tiempo de ejecución.
    - Permite a una clase derivada proporcionar una implementación específica de un método que ya está definido en su clase base.
    - La selección de qué método llamar depende del tipo del objeto en tiempo de ejecución.

   ```
   class Animal {
       public void hacerSonido() {
           System.out.println("Sonido de animal");
       }
   }

   class Perro extends Animal {
       @Override
       public void hacerSonido() {
           System.out.println("Ladrido");
       }
   }

   public class Ejemplo {
       public static void main(String[] args) {
           Animal miAnimal = new Perro();
           miAnimal.hacerSonido(); // Llama a la implementación de Perro
       }
   }
   ```

En resumen, el contexto estático se refiere a todo lo que se puede resolver en tiempo de compilación, como métodos y variables estáticas, así como la sobrecarga de métodos. El contexto dinámico se refiere a todo lo que se resuelve en tiempo de ejecución, como variables de instancia y la sobreescritura de métodos, lo cual permite el polimorfismo.
```

Este formato usa encabezados, listas, y bloques de código para organizar la información y hacerla fácil de leer. Puedes guardar este contenido en un archivo con la extensión `.md` para que sea interpretado como Markdown.