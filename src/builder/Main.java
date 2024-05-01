package builder;

public class Main {
    public static void main(String[] args) {

        Computer.Builder builder = new Computer.Builder();
        Computer computer = builder.setCpu("Intel i7")
                .setRam("16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("NVIDIA GTX 1660")
                .build();

        System.out.println("CPU: " + computer.getCpu());
        System.out.println("RAM: " + computer.getRam());
        System.out.println("Storage: " + computer.getStorage());
        System.out.println("Graphics Card: " + computer.getGraphicsCard());
    }
}
