package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String expected = "Привет, умник.";
        String rsl = DummyBot.answer(in);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String rsl = DummyBot.answer(in);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Я стану Java - разработчиком";
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String rsl = DummyBot.answer(in);
        Assert.assertEquals(expected, rsl);
    }
}