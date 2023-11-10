public abstract class AbstractImplementsInterface implements Interface{


    void noInterface() {
        System.out.println("doesn't need interface");
    }

    @Override
    public void interfaces()  {
        System.out.println("abstract implements interface");
    }
    abstract void justAbstract();
}
