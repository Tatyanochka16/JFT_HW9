package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetNumberRS() {
        ru.netology.statistic.Radio setRS = new ru.netology.statistic.Radio(10);
        setRS.setCurrentNumberRS(0);
        int expected = 0;
        int actual = setRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberRSAboveMax() {
        ru.netology.statistic.Radio setRS = new ru.netology.statistic.Radio(10);
        setRS.setCurrentNumberRS(16);
        int expected = 0;
        int actual = setRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberRSUnderMin() {
        ru.netology.statistic.Radio setRS = new ru.netology.statistic.Radio(10);
        setRS.setCurrentNumberRS(-1);
        int expected = 0;
        int actual = setRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextAboveMAx() {
        ru.netology.statistic.Radio nextRS = new ru.netology.statistic.Radio(10);
        nextRS.setCurrentNumberRS(9);
        nextRS.next();
        int expected = 0;
        int actual = nextRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNearMin() {
        ru.netology.statistic.Radio nextRS = new ru.netology.statistic.Radio(10);
        nextRS.setCurrentNumberRS(0);
        nextRS.next();
        int expected = 1;
        int actual = nextRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext() {
        ru.netology.statistic.Radio nextRS = new ru.netology.statistic.Radio(10);
        nextRS.setCurrentNumberRS(5);
        nextRS.next();
        int expected = 6;
        int actual = nextRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNearMin() {
        ru.netology.statistic.Radio prevRS = new ru.netology.statistic.Radio(10);
        prevRS.setCurrentNumberRS(0);
        prevRS.prev();
        int expected = 9;
        int actual = prevRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev() {
        ru.netology.statistic.Radio prevRS = new ru.netology.statistic.Radio(10);
        prevRS.setCurrentNumberRS(5);
        prevRS.prev();
        int expected = 4;
        int actual = prevRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        ru.netology.statistic.Radio setV = new ru.netology.statistic.Radio(10);
        setV.setCurrentVolume(80);
        int expected = 80;
        int actual = setV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        ru.netology.statistic.Radio setV = new ru.netology.statistic.Radio(10);
        setV.setCurrentVolume(101);
        int expected = 0;
        int actual = setV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUnderMin() {
        ru.netology.statistic.Radio setV = new ru.netology.statistic.Radio(10);
        setV.setCurrentVolume(-1);
        int expected = 0;
        int actual = setV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolume() {
        ru.netology.statistic.Radio nextV = new ru.netology.statistic.Radio(10);
        nextV.setCurrentVolume(20);
        nextV.plus();
        int expected = 21;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeOnMax() {
        ru.netology.statistic.Radio nextV = new ru.netology.statistic.Radio(10);
        nextV.setCurrentVolume(100);
        nextV.plus();
        int expected = 100;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeNearMax() {
        ru.netology.statistic.Radio nextV = new ru.netology.statistic.Radio(10);
        nextV.setCurrentVolume(99);
        nextV.plus();
        int expected = 100;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeOnMin() {
        ru.netology.statistic.Radio nextV = new ru.netology.statistic.Radio(10);
        nextV.setCurrentVolume(0);
        nextV.plus();
        int expected = 1;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeNearMin() {
        ru.netology.statistic.Radio nextV = new ru.netology.statistic.Radio(10);
        nextV.setCurrentVolume(1);
        nextV.plus();
        int expected = 2;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinesVolume() {
        ru.netology.statistic.Radio nextV = new ru.netology.statistic.Radio(10);
        nextV.setCurrentVolume(55);
        nextV.mines();
        int expected = 54;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinesVolumeOnMin() {
        ru.netology.statistic.Radio nextV = new ru.netology.statistic.Radio(10);
        nextV.setCurrentVolume(0);
        nextV.mines();
        int expected = 0;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinesVolumeNearMin() {
        ru.netology.statistic.Radio nextV = new ru.netology.statistic.Radio(10);
        nextV.setCurrentVolume(1);
        nextV.mines();
        int expected = 0;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}

