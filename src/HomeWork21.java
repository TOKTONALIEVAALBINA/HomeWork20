public enum HomeWork21 {
    MONDAY("MONDAY-ДУЙШОМБУ") {
        @Override
        public void study() {
            System.out.println("java technical");
        }

    },
    TUESDAY("TUESDAY-ШЕЙШЕМБИ") {
        @Override
        public void study() {
            System.out.println("java practice and english time");
        }
    },
    WEDNESDAY("WEDNESDAY-ШАРШЕМБИ") {
        @Override
        public void study() {
            System.out.println("java technical");
        }
    },
    THURSDAY("THURSDAY-БЕЙШШЕМБИ") {
        @Override
        public void study() {
            System.out.println("java practice");
        }
    },
    FRIDAY("FRIDAY-ЖУМА") {
        @Override
        public void study() {
            System.out.println("java technical");
        }
    },
    SATURDAY("SATURDAY-ИШЕМБИ") {
        @Override
        public void study() {
            System.out.println("java practice");
        }
    },
    SUNDAY("SUNDAY-ЖЕКШЕИБИ") {
        @Override
        public void study() {
            System.out.println("weekend day");
        }
    };

    private String name;

    public abstract void study();

    HomeWork21(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "HomeWork21{" +
                "name='" + name + '\'' +
                '}';
    }
}
