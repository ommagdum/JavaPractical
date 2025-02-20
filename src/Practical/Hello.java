public class Hello {
    public static void main(String[] args){
        HelloTest h = new HelloTest("TKIET", "Warananagar");
        System.out.println(h.getFn() + " " + h.getLn());
    }
}

class HelloTest{
    private String fn;
    private String ln;

    public String getFn(){
        return fn;
    }

    public String getLn(){
        return ln;
    }

    HelloTest(String fn, String ln){
        this.fn = fn;
        this.ln = ln;
    }
}
