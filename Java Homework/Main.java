public class Main 
{
    public static void main(String[] args) 
    {
        PlantType tree = new PlantType();
        tree.name = "Thicky Boi";
        tree.size = 20.25;
        tree.isTree = true;
        System.out.println(tree.name);
        System.out.println(tree.size);
        System.out.println("Tree? "+ tree.isTree);

        PlantType cactus = new PlantType();
        cactus.name = "Cactus Jack";
        cactus.size = 5.50;
        cactus.isTree = false;
        System.out.println(cactus.name);
        System.out.println(cactus.size);
        System.out.println("Tree? " + cactus.isTree);

        tree.setColor(Color.BROWN);
        tree.setSize(50);
        System.out.println(tree.name);
        System.out.println(tree.getColor());
        System.out.println(tree.getSize());

        cactus.setColor(Color.BROWN);
        cactus.setSize(5);
        System.out.println(cactus.name);
        System.out.println(cactus.getColor());
        System.out.println(cactus.getSize());
    }
}
