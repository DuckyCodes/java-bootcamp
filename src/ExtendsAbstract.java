public class ExtendsAbstract extends Abstract {



    @Override
    public void myMethod(){
        System.out.println("ExtndsAbstract");
    }
    public void myAbstractMethod(){
        System.out.println("ExtendsAbstract making abstract");
    }

    public void noAbstractMethod() {
        System.out.println("no AbstractMethod");
    }
}
