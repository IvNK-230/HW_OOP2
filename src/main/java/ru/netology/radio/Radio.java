package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation;
    private int quantity = 10;
    private int maxNumberStation = quantity - 1;
    private int minNumberStation = 0;

    public Radio(int quantity) {
        this.maxNumberStation = quantity - 1;
    }

    public Radio() {
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minNumberStation) {
            return;
        }
        if (newCurrentStation > maxNumberStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void addVolume() {                                    // метод для увеличения громкости
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        currentVolume++;
    }

    public void downVolume() {                                   // метод для уменьшения громкости
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
            return;
        }
        currentVolume--;
    }

    public void nextStation() {                                    // метод для следующей станции
        if (currentStation < maxNumberStation) {
            currentStation++;
        } else {
            currentStation = minNumberStation;
        }
    }

    public void prevStation() {                                    // метод для предыдущей станции
        if (currentStation > minNumberStation) {
            currentStation--;
        } else {
            currentStation = maxNumberStation;
        }
    }
}
