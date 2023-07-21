package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(13);

        int expected = 13;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUnderMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.addVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        volume.addVolume();

        int expected = 51;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolumeUnderMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.downVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        volume.downVolume();

        int expected = 49;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationAboveMax() {
        Radio frequency = new Radio();
        frequency.setCurrentStation(11);
        frequency.nextStation();

        int expected = 1;
        int actual = frequency.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextStation() {
        Radio frequency = new Radio();
        frequency.setCurrentStation(5);
        frequency.nextStation();

        int expected = 6;
        int actual = frequency.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAboveMax() {
        Radio frequency = new Radio();
        frequency.setCurrentStation(9);
        frequency.nextStation();

        int expected = 0;
        int actual = frequency.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationsUnderMin() {
        Radio frequency = new Radio();
        frequency.setCurrentStation(-2);
        frequency.prevStation();

        int expected = 9;
        int actual = frequency.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio frequency = new Radio();
        frequency.setCurrentStation(5);
        frequency.prevStation();

        int expected = 4;
        int actual = frequency.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
