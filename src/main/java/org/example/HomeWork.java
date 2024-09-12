package org.example;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Сигнатуры методов в данном классе не менять
 */
public class HomeWork {

    /**
     * <h1>Задание 1.</h1>
     * Реализовать метод, который подсчитывает количество подходящих по условию узлов от 0 до N.
     * <br/>
     * Пример 1:
     * список 1, 2, 3, 4, 5
     * условие x < 4
     * ответ 3
     * <br/>
     * Пример 2:
     * список 1, 2, 3, 4, 5
     * условие x < 0
     * ответ 0
     *
     * @param list односвязный список
     * @param pred условие
     * @param <T>  - тип хранимых значений в списке
     * @return количество узлов от 0 до N, где N позиция на которой первый раз условие вернуло fals
     */
    public <T> int partitionBy(Node<T> list, Predicate<T> pred) {
        int result = 0;
        if (Objects.isNull(list)) return result;
        if (pred.test(list.getValue())) result++;
        result += partitionBy(list.getNext(), pred);
        return result;
    }

    /**
     * <h1>Задание 2.</h1>
     * Реализовать метод поиска элемента на позиции N в переданном односвязном списке.
     *
     * @param list односвязный список
     * @param n    позиция искомого элемента
     * @param <T>
     * @return сам элемент
     */
    public <T> T findNthElement(Node<T> list, int n) {
        if (Objects.isNull(list)) throw new IndexOutOfBoundsException("Элемент не найден");
        if (n == list.getIndex()) return list.getValue();
        return findNthElement(list.getNext(), n);
    }
}