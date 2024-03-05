package com.msaggik.thirdlessonsearchengine;

import java.util.Arrays;
import java.util.stream.Stream;

public class Algorithm {

    // метод поиска количества встречи слова input в строке data
    public long searchCount(String input, String data) {

        String[] symbols = {"\\n","\\s*\\.\\s*","\\s*,\\s*", "\\s+", ";"}; // массив символов на основе регулярных выражений

        // замена всех выделенных символов на запятую
        for (int i = 0; i < symbols.length; i++) {
            data = data.replaceAll(symbols[i], "_");
        }

        // формирование массива слов из строки путём деления по запятой
        String[] dataArray = data.split("_");

        // создание потока из массива слов
        Stream<String> streamArray = Arrays.stream(dataArray);

        // фильтр потока по слову input и подсчёт количества получившихся слов
        long count = streamArray.filter(input :: equals).count();

        return count;
    }
}
