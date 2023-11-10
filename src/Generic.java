public class Generic <T>{
    T thingToPrint;

    public  Generic() {

    }
    public Generic(T thingToPrint) {
        this.thingToPrint =  thingToPrint;
    }
    public void print() {
        System.out.println(thingToPrint);
    }
    public void print1(T number) {
        System.out.println(number);
    }
}
