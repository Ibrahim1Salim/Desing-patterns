package builder;

class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;

    private Computer() {}

    // Getters
    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    // Builder class
    static class Builder {
        private Computer computer;

        Builder() {
            computer = new Computer();
        }

        Builder setCpu(String cpu) {
            computer.cpu = cpu;
            return this;
        }

        Builder setRam(String ram) {
            computer.ram = ram;
            return this;
        }

        Builder setStorage(String storage) {
            computer.storage = storage;
            return this;
        }

        Builder setGraphicsCard(String graphicsCard) {
            computer.graphicsCard = graphicsCard;
            return this;
        }


        Computer build() {
            return computer;
        }
    }
}