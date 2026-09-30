package qa.guru;

public class JavaTaskFirst {

    static void main() {
        // --------------------- beg_zone_int ---------------------
        // 0: применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int intA = 15;
        int intB = 40;
        // Вычисления
        int sumInts = intA + intB;
        int diffInts = intA - intB;
        int prodInts = intA * intB;
        int divInts = intB / intA;
        int remainsInts = intA % intB;
        // Вывод результатов
        System.out.println("-------- Операции над примитивами int");
        System.out.println("Сумма примитивов int: " + sumInts);
        System.out.println("Разность примитивов int: " + diffInts);
        System.out.println("Произведение примитивов int: " + prodInts);
        System.out.println("Частное примитивов int: " + divInts);
        System.out.println("Остаток примитивов int: " + remainsInts);
        System.out.println("\n");
        // --------------------- end_zone_int ---------------------

        // --------------------- beg_zone_int_double --------------
        // 1: применить несколько арифметических операций над int и double в одном выражении
        int intC = -17;
        double doubleA = 12.5;
        // Вычисления
        double diffMix = doubleA - intC;
        double prodMix = doubleA * intC;
        double remainsMix = intC % doubleA;
        // Вывод результатов
        System.out.println("-------- Операции над int и double");
        System.out.println("Разница int и double переменных: " + diffMix);
        System.out.println("Произведение int и double переменных: " + prodMix);
        System.out.println("Остаток int и double переменных: " + remainsMix);
        System.out.println("\n");
        // --------------------- end_zone_int_double --------------

        // --------------------- beg_zone_logic_operation ---------
        // 2: применить несколько логических операций ( < , >, >=, <= )
        int age = 45;
        int rating = 30;
        boolean haveLittleChildren = true;
        boolean trustedClient = false; // по-умолчанию не доверяем
        float mortgagePercentage = 25; // процент ипотеки по-умолчанию
        // Вычисление
        if (rating >= 25) {
            if (age >= 18 && age < 45) {
                if (!haveLittleChildren) {
                    mortgagePercentage = 22.1F;
                } else {
                    mortgagePercentage = 12.3F;
                }
                trustedClient = true;
            } else if ((age < 50) || ((age < 60) && haveLittleChildren)) {
                if (haveLittleChildren) {
                    mortgagePercentage = 15.2F;
                } else {
                    mortgagePercentage = 23.6F;
                }
            }
        } else {
            trustedClient = false;
            mortgagePercentage = 50.50F;
        }
        // Вывод результата
        String outMsg = trustedClient ?
                "Клиенту одобрена ипотека с процентом %s.".formatted(mortgagePercentage) :
                "Клиенту НЕ одобрена ипотека!".formatted(mortgagePercentage);
        System.out.println("-------- Демонстрация логических операций");
        System.out.println(outMsg);
        System.out.println("\n");
        // --------------------- end_zone_logic_operation ---------

        // --------------------- beg_zone_ranges ------------------
        // 3: прочитать про диапазоны типов данных
        System.out.println("-------- Диапазоны различных типов данных");
        System.out.println("MIN_BYTE = " + Byte.MIN_VALUE);
        System.out.println("MAX_BYTE = " + Byte.MAX_VALUE);
        System.out.println("MIN_CHAR = " + (int) Character.MIN_VALUE);
        System.out.println("MAX_CHAR = " + (int) Character.MAX_VALUE);
        System.out.println("MIN_SHORT = " + Short.MIN_VALUE);
        System.out.println("MAX_SHORT = " + Short.MAX_VALUE);
        System.out.println("MIN_INT = " + Integer.MIN_VALUE);
        System.out.println("MAX_INT = " + Integer.MAX_VALUE);
        System.out.println("MIN_LONG = " + Long.MIN_VALUE);
        System.out.println("MAX_LONG = " + Long.MAX_VALUE);
        System.out.println("MIN_FLOAT = " + Float.MIN_VALUE);
        System.out.println("MAX_FLOAT = " + Float.MAX_VALUE);
        System.out.println("MIN_DOUBLE = " + Double.MIN_VALUE);
        System.out.println("MAX_DOUBLE = " + Double.MAX_VALUE);
        System.out.println("\n");
        // --------------------- end_zone_ranges ------------------

        // --------------------- beg_zone_overflow ----------------
        // 4: получить переполнение при арифметической операции
        // Вычисления
        short maxShortPlusOne = (short) (Short.MAX_VALUE + 1);
        long minLongMinusOne = Long.MIN_VALUE - 1;
        float maxFloatPlusDelta = 1.01F * Float.MAX_VALUE;
        double maxDoublePlusDelta = 1.01 * Double.MAX_VALUE;
        // Вывод результатов
        System.out.println("-------- Примеры переполнений при арифметических операций");
        System.out.println("SHORT_MAX_VALUE + 1 = " + maxShortPlusOne);
        System.out.println("LONG_MIN_VALUE - 1 = " + minLongMinusOne);
        System.out.println("FLOAT_MAX_VALUE + MAX_1_PERCENT = " + maxDoublePlusDelta);
        System.out.println("DOUBLE_MAX_VALUE + MAX_1_PERCENT = " + maxFloatPlusDelta);
        System.out.println("-------- Конец\n");
        // --------------------- end_zone_overflow ----------------
    }
}
