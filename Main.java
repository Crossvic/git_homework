public class Main {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        Box<Orange> box2 = new Box<>();
        box2.add(new Orange());
        box2.add(new Orange());

        System.out.println("Масса коробки с яблоками составляет: " + box1.getWeight());
        System.out.println("Масса коробки с апельсинами составляет: " + box2.getWeight());

        System.out.println(box1.compare(box2));
        System.out.println("Масса яблок и апельсинов равна.");

        Box<Apple> box3 = new Box<>();
        box3.add(new Apple());
        box3.add(new Apple());

        System.out.println("Пересыпаем яблоки из первой коробки в третью.");
        box1.moveTo(box3);


        System.out.println("Теперь первая коробка пуста. Ее вес составляет: " + box1.getWeight());

        System.out.println("Масса третьей коробки теперь равна: " + box3.getWeight());
    }
}
