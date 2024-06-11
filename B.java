import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

public class B extends A{

     public void print()
    {
        A a=new A();
        System.out.println(a.email);
        System.out.println(a.psp);
        super.print();
        System.out.println('B');
    }
}
