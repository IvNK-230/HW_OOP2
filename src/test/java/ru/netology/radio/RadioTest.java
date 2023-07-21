package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio volume = new Radio();
    Radio frequency = new Radio(11);

    @Test
    public void shouldNextVolume() {
        Radio frequency = new Radio(30);
        frequency.setCurrentStation(13);
        frequency.nextStation();
        int expected = 14;
        int actual = frequency.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        volume.setCurrentVolume(13);
        int expected = 13;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUnderMin() {
        volume.setCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        volume.setCurrentVolume(101);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddVolumeAboveMax() {
        volume.setCurrentVolume(100);
        volume.addVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddVolume() {
        volume.setCurrentVolume(50);
        volume.addVolume();
        int expected = 51;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolumeUnderMin() {
        volume.setCurrentVolume(0);
        volume.downVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolume() {
        volume.setCurrentVolume(50);
        volume.downVolume();
        int expected = 49;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationAboveMax() {
        frequency.setCurrentStation(11);
        frequency.nextStation();
        int expected = 1;
        int actual = frequency.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        frequency.setCurrentStation(5);
        frequency.nextStation();
        int expected = 6;
        int actual = frequency.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAboveMax() {
        frequency.setCurrentStation(10);
        frequency.nextStation();
        int expected = 0;
        int actual = frequency.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationsUnderMin() {
        frequency.setCurrentStation(-2);
        frequency.prevStation();
        int expected = 10;
        int actual = frequency.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        frequency.setCurrentStation(5);
        frequency.prevStation();
        int expected = 4;
        int actual = frequency.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
