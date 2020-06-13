import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController
{
    @Autowired
    myModel modelObj;

    @RequestMapping("api/get")
    public String getNumber(){
     String number = modelObj.getNumber();
     return number;
 }
}
