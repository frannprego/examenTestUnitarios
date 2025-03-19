## Examen de Test Unitarios

---

### Enunciado

Con el código de este repositorio realiza:

- (*4 puntos*) Los test unitarios de los **dos** métodos, utiliza test **parametrizados**. Suponiendo que la `string` DNI, siempre es un DNI válido.
- (*2 puntos*) En el código, hay un error, ¿lo pudiste comprabar en los test? ¿Plantea la solución?
- (*3 puntos*) Si no hubiera una comprobación previamente encuanto a la longitud de la `string` del DNI, ¿Qué hay que cambiar en los tests para que comprueben estos casos?

Entrega tu repositorio con el código y los test. Además un `Readme` explicando y justificando cada apartado

Formato del `Readme` *1 punto*

---




# Examen de Test Unitarios

## Justificación de los apartados

### 1. Tests Unitarios
He utilizado dos tests unitarios usando `@ParameterizedTest` y `@CsvSource` para testear los métodos `comprobarDNI` y `calcularLetraDNI`.

### 2. Error en el Código
**Error detectado:** EL error se encuentra en el metodo `comprobarDNI` y `calcularLetraDNI` ya que si el DNI ingresado no es numérico, el método  lanzará una excepción.

**Solución:**Una solución podría ser: Antes de hacer la conversión, se debe verificar que la cadena contenga solo números.

### 3. Comprobacion previa de la Longitud del DNI

Si no existiese una comprobación previa de la longitud del DNI, en los tests se deberían incluir casos con DNI de longitudes incorrectas, como por ejemplo :

```java
@CsvSource({
    "123456789, F, false"   // Más de 8 caracteres
    "1234567, F, false",   // Menos de 8 caracteres
})
