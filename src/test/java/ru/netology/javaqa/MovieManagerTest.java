package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void shouldAddFilms() {
        MovieManager films = new MovieManager();
        films.add("Бладшот");
        films.add("Вперёд");
        films.add("Отель Белград");

        String[] expected = {"Бладшот", "Вперёд", "Отель Белград"};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowWhereLimitIsMoreThanQuantity() {
        MovieManager films = new MovieManager();
        films.add("Бладшот");
        films.add("Вперёд");
        films.add("Отель Белград");

        String[] expected = {"Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowWhereLimitIsLessThanQuantity() {
        MovieManager films = new MovieManager(3);
        films.add("Бладшот");
        films.add("Вперёд");
        films.add("Отель Белград");
        films.add("Джентльмены");
        films.add("Человек-невидимка");
        films.add("Тролли.Мировой тур");
        films.add("Номер один");
        films.add("Бойцовский клуб");
        films.add("Красотка");

        String[] expected = {"Красотка", "Бойцовский клуб", "Номер один"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

