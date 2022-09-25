public class Main {

    public static void main(String[] args) {

        MagicBox<String> box1 = new MagicBox<>(3);
        MagicBox<Integer> box2 = new MagicBox<>(5);

        System.out.println(box1.add("Мяч"));
        System.out.println(box1.add("Заяц"));
        System.out.println(box1.add("Гвоздь"));
        System.out.println(box1.add("Череп"));
        System.out.println(box1.pick());
        System.out.println(box1.pick());

        System.out.println(box2.add(0));
        System.out.println(box2.add(1));
        System.out.println(box2.pick());
    }
}