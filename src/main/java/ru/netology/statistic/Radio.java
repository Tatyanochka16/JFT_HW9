package ru.netology.statistic;

public class Radio {

    private int currentVolume;
    private int minNumberRS = 0;
    private int maxNumberRS;
    private int currentNumberRS = minNumberRS;

//    public Radio(int minNumberRS, int maxNumberRS) {
//        this.minNumberRS = minNumberRS;
//        this.maxNumberRS = maxNumberRS;
//        this.currentNumberRS = minNumberRS;
///    }

    public Radio(int size) {
        maxNumberRS = minNumberRS + size - 1;
    }

    public int getCurrentNumberRS() {
        return currentNumberRS;
    }

    public void setCurrentNumberRS(int newCurrentNumberRS) {
        if (newCurrentNumberRS < minNumberRS) {
            return;
        }
        if (newCurrentNumberRS > maxNumberRS) {
            return;
        }
        currentNumberRS = newCurrentNumberRS;
    }

    public void next() {
        if (currentNumberRS >= maxNumberRS) {
            currentNumberRS = minNumberRS;
        } else {
            currentNumberRS = currentNumberRS + 1;
        }
    }

    public void prev() {
        if (currentNumberRS <= minNumberRS) {
            currentNumberRS = maxNumberRS;
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


