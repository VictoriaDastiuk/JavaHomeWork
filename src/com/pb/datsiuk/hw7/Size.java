package com.pb.datsiuk.hw7;

public enum Size {
    XXS(36) {
        @Override
        public String getDescription() {
            return "Дитячий розмір";
        }
    },
    XS(38),
    S(40),
    M(42),
    L(44);

    Size(int euroSize) {
        EuroSize = euroSize;
    }

    public String getDescription() {
        return "Дорослий розмір";
    }

    @Override
    public String toString() {
        return name() + "(" + EuroSize + ") " + getDescription();
    }

    private int EuroSize;
}
