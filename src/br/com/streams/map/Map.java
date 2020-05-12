package br.com.streams.map;

import java.util.List;
import java.util.stream.Collectors;

public class Map {

    public List<Long> mapComStreams(List<Pessoa> pessoas) {
        return pessoas.stream()
                .map(p-> p.getId())
                .collect(Collectors.toList()
        );
    }
}
