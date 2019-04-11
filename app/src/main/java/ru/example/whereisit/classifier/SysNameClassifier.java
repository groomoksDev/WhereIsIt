package ru.example.whereisit.classifier;

public enum SysNameClassifier {
    B0(0),//Заголовок
    B1(1),//В-1 3-Я Раздевалка Помещение сушки
    B2(2),//В-2 Гараж
    B3(3),//В-3 Склад Михельсон
    B4(4),//В-4 Склад Михельсон
    B5(5),//В-5 Сушилка 2-ой раздевалки
    B6(6),//В-6 Сушилка 4-ой раздевалки
    B7(7),//В-7 Сушилка 3-ей раздевалки
    B8(8),//В-8 Сушилка 4-ой раздевалки
    B9(9),//В-9 Сушилка 1-ой раздевалки
    B10(10),//В-10 Гостевой туалет
    B11(11),//В-11 Туалет для инвалидов
    B12(12);//В-12 Помещение - КАФЕ

    private final Integer sysName;

    SysNameClassifier(Integer sysName) {
        this.sysName = sysName;
    }

    public Integer getValue() {
        return sysName;
    }

    public static SysNameClassifier getSysNameClassifier(Integer position) {
        for (SysNameClassifier sysNameClassifier : SysNameClassifier.values()) {
            if (sysNameClassifier.sysName.equals(position)) {
                return sysNameClassifier;
            }
        }
        return null;
    }
}
