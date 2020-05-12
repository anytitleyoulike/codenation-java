package br.com.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    private final List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    public List<Integer> filterComStream() {
        return ints.stream()
                .filter(inteiro -> inteiro > 5)
                .collect(Collectors.toList());
    }
}
