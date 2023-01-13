package com.example;

public class Counter {
    private long current = 0;

    public long getCurrent() {
        return current;
    }

    public long inc() {
        inc(1L);
        return current;
    }

    private void inc(long val) {
        current += val;
    }




}
