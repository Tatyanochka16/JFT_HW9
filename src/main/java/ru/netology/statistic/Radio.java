package ru.netology.statistic;

public class Radio {
    private int currentNumberRS;
    private int currentVolume;

    public int getCurrentNumberRS() {
        return currentNumberRS;
    }

    public void setCurrentNumberRS(int newCurrentNumberRS) {
        if (newCurrentNumberRS < 0) {
            return;
        }
        if (newCurrentNumberRS > 9) {
            return;
        }
        currentNumberRS = newCurrentNumberRS;
    }

    public void next() {
        if (currentNumberRS >= 9) {
            currentNumberRS = 0;
        } else {
            currentNumberRS = currentNumberRS + 1;
        }
    }

    public void prev() {
        if (currentNumberRS <= 0) {
            currentNumberRS = 9;
        } else {
            currentNumberRS = currentNumberRS - 1;
        }

    }

    public int getCurrentVolume() {
        return currentVolume;
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

    public void plus() {
        if (currentVolume >= 100) {
            currentVolume = 100;
        } else {
            currentVolume = currentVolume + 1;
        }

    }

    public void mines() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}



