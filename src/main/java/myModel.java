import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

@Getter
@Setter
public class myModel
{
    private String number;

    public String getNumber()
    {
        return number;
    }
    public void setNumber(){
        this.number = number;
    }
}
