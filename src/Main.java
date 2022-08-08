public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBoxStrings = new MagicBox<>(5);
        MagicBox<Integer> magicBoxIntegers = new MagicBox<>(7);
        magicBoxStrings.add("Круг");
        magicBoxStrings.add("Квадрат");
        magicBoxStrings.add("Треугольник");
        //magicBoxStrings.pick();
        magicBoxStrings.add("Параллелограмм");
        magicBoxStrings.add("Трапеция");
        System.out.println(magicBoxStrings.pick());
        magicBoxIntegers.add(1);
        magicBoxIntegers.add(3);
        //magicBoxIntegers.pick();
        magicBoxIntegers.add(5);
        magicBoxIntegers.add(7);
        magicBoxIntegers.add(9);
        magicBoxIntegers.add(11);
        magicBoxIntegers.add(13);
        System.out.println(magicBoxIntegers.pick());


    }

}
