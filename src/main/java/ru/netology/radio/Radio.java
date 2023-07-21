package ru.netology.radio;

public class Radio {
    public int currentVolume;                // создаем переменную для уровня громкости
    public int currentStation;         // создаем переменную для частоты рабиосигнала

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void addVolume() {                            // метод для увеличения громкости
        if (currentVolume >= 100) {
            currentVolume = 100;
        } else {
            currentVolume++;
        }
    }

    public void downVolume() {                            // метод для уменьшения громкости
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume--;
        }

    }

    public void nextStation() {                                    // метод для next
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
        ;
    }

    public void prevStation() {                                    // метод для prev
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }
}
