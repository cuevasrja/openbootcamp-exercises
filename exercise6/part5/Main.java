package com.exercise6.part5;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>(3, 1);

        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
            System.out.println(numbers.capacity());
        }

        /*Como se puede ver, si se agregan 1000 elementos teniendo un incremento de capacidad 1 gastariamos muchos
        recursos computacionales, ya que para aumentar la capacidad se crearía un nuevo vector que sobreescriba el
        anterior, así que, poniendo como ejemplo cuando se crea el elemento número 900. Para aumentar la capacidad,
        se crearía un vector con los 900 elementos mientras tenemos un vector con 899 elementos, lo que indudablemente,
        consumiría muchos recursos y haría mas lenta la aplicación*/

        System.out.println(numbers);
    }
}
