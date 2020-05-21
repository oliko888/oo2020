class Dog implements Animal {
    public void defend() {
        System.out.println("Dog barks and takes defensive position");
    }

    @Override
    public void speak() {
        System.out.println("AUH AUH");

    }

    @Override
    public void eat() {
        System.out.println("Dog regained 15 HP");

    }

    @Override
    public void sleep() {
        System.out.println("Dog went to sleep");

    }

    @Override
    public void beSneaky() {
        System.out.println("Dog is stealthy.");

    }

    @Override
    public void lookAround() {
        System.out.println("Dog looks around for enemies.");

    }

    @Override
    public void attack() {
        System.out.println("Dog dealt a critical hit of 58 damage!");

    }
}