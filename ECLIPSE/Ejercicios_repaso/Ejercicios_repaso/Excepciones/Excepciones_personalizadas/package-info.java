package Excepciones_personalizadas;
/*
 * Tenemeos una clase para un cajero automático que dispone de dinero sí y solo si ahy saldo.
 *    A. Crear una nueva case de excepciones, de nombre "NoTieneSaldo", cuyo constructor recibe como argumento el saldo disponible (antes de retirar la cantidad).
 *    B. Modificar el método "retirar" para que lance la excepción anterior cuando no haya suficiente saldo, es decir, no se puede sacar dinero por encima del saldo.
 *    Por ejemplo, si inicialmente es 10, y ejecuto:
 *    cajero.retirar(4);
 *    cajero.retirar(5);
 *    cajero.retirar(3); // esta sentencia lanzará la excepción porque en el cajero queda 1 euro disponible y estamos queriendo sacas 3 euros.
 */
