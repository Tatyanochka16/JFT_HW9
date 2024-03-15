package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetNumberRS() {
        Radio setRS = new Radio();
        setRS.setCurrentNumberRS(0);
        int expected = 0;
        int actual = setRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberRSAboveMax() {
        Radio setRS = new Radio();
        setRS.setCurrentNumberRS(16);
        int expected = 0;
        int actual = setRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberRSUnderMin() {
        Radio setRS = new Radio();
        setRS.setCurrentNumberRS(-1);
        int expected = 0;
        int actual = setRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextAboveMAx() {
        Radio nextRS = new Radio();
        nextRS.setCurrentNumberRS(9);
        nextRS.next();
        int expected = 0;
        int actual = nextRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNearMin() {
        Radio nextRS = new Radio();
        nextRS.setCurrentNumberRS(0);
        nextRS.next();
        int expected = 1;
        int actual = nextRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext() {
        Radio nextRS = new Radio();
        nextRS.setCurrentNumberRS(5);
        nextRS.next();
        int expected = 6;
        int actual = nextRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNearMin() {
        Radio prevRS = new Radio();
        prevRS.setCurrentNumberRS(0);
        prevRS.prev();
        int expected = 9;
        int actual = prevRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev() {
        Radio prevRS = new Radio();
        prevRS.setCurrentNumberRS(5);
        prevRS.prev();
        int expected = 4;
        int actual = prevRS.getCurrentNumberRS();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        Radio setV = new Radio();
        setV.setCurrentVolume(80);
        int expected = 80;
        int actual = setV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio setV = new Radio();
        setV.setCurrentVolume(101);
        int expected = 0;
        int actual = setV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUnderMin() {
        Radio setV = new Radio();
        setV.setCurrentVolume(-1);
        int expected = 0;
        int actual = setV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolume() {
        Radio nextV = new Radio();
        nextV.setCurrentVolume(20);
        nextV.plus();
        int expected = 21;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeOnMax() {
        Radio nextV = new Radio();
        nextV.setCurrentVolume(100);
        nextV.plus();
        int expected = 100;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeNearMax() {
        Radio nextV = new Radio();
        nextV.setCurrentVolume(99);
        nextV.plus();
        int expected = 100;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeOnMin() {
        Radio nextV = new Radio();
        nextV.setCurrentVolume(0);
        nextV.plus();
        int expected = 1;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeNearMin() {
        Radio nextV = new Radio();
        nextV.setCurrentVolume(1);
        nextV.plus();
        int expected = 2;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinesVolume() {
        Radio nextV = new Radio();
        nextV.setCurrentVolume(55);
        nextV.mines();
        int expected = 54;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinesVolumeOnMin() {
        Radio nextV = new Radio();
        nextV.setCurrentVolume(0);
        nextV.mines();
        int expected = 0;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinesVolumeNearMin() {
        Radio nextV = new Radio();
        nextV.setCurrentVolume(1);
        nextV.mines();
        int expected = 0;
        int actual = nextV.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
