
package pattern_bunse;

public class divider_adapter implements DivideInterface {
    DivideInterface divide;
    
    public divider_adapter(char s)
    {
        if (s=='/') {
            divide=(DivideInterface) new divider();
            
        }
        else if (s=='*') {
       divide=(DivideInterface) new divider();

        }
    }

    divider_adapter() {
         }

    public void BigDecimal(int i, int i0) {
         }
}
