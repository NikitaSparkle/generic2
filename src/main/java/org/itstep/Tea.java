package org.itstep;

// FIXME: реализовать интерфейс Comparable<Tea>. Метод compareTo() должен производить сравнение по цене +
public class Tea implements Comparable<Tea> {
    private final String name;
    private final double price;

    public Tea(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Tea other) {
        int res = 2;
        if (this.price > other.price) {
            res = 1;
        } else {
            if (this.price == other.price) {
                res = 0;
            } else {
                if (this.price < other.price) {
                    res = -1;
                }
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "Чай: " + name + " Цена: " + price;
    }
}
