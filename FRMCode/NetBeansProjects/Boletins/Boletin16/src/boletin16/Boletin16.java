package boletin16;
import com.fran.personal.Personal;
public class Boletin16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personal p1=new Personal("csh@pmail.gl","123456");
        Academia ac1=new Academia(25,"Jose",5,p1);
        System.out.println(ac1.toString());
    }
    
}
