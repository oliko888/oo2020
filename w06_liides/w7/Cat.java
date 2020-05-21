class Cat implements Animal {
    public void beSneaky() {
      System.out.println("Cat is sneaking around the house");
    }

    @Override
    public void speak() {
      System.out.println("MJAUUUUU");

    }

    @Override
    public void eat() {
      System.out.println("Cat regained 15 HP.");

    }

    @Override
    public void sleep() {
      System.out.println("Cat went to sleep");

    }

    @Override
    public void lookAround() {
      System.out.println("Cat is looking around the house");

    }

    @Override
    public void attack() {
      System.out.println("Cat dealt 8 damage.");

    }

    @Override
    public void defend() {
      System.out.println("Cat defended. -1 HP");

    }
  }