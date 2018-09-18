public class ComputerTest {
    public static void main(String[] args) {
        Procesor procesor1 = new Procesor("Intel", "Procesor 1", "1GH");
        Memory memory1 = new Memory("Kingston", "Model1", 256, "16HG");
        Computer computer1 = new Computer("Lenovo", procesor1, memory1);

        Procesor procesor2 = new Procesor("IBM", "Procesor 2", "2GH");
        Memory memory2 = new Memory("WD", "Model 2", 512, "8GH");
        Computer computer2 = new Computer("Dell", procesor2, memory2);

        System.out.println();
        System.out.printf("Komputer %s z procesorem %s i pamięcią %s\n", computer1.name, computer1.procesor.producent, computer1.memory.producent);
        System.out.printf("Komputer %s z procesorem %s i pamięcią %s", computer2.name, computer2.procesor.producent, computer2.memory.producent);
    }
}
