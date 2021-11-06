package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class sortServiceTest {

    private sortService sut = new sortService(new BubbleSort<>());

    @Test
    void test() {
        // Given
        String[] args = {"3", "2", "1"};
        // When

        List<String> actual = sut.doSort(Arrays.asList(args));
        // Then

        assertEquals(List.of("1", "2", "3"), actual);
    }
}