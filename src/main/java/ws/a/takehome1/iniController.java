/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.a.takehome1;

import java.sql.Blob;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ASUS
 */

@Controller
public class iniController {
    @RequestMapping("/nexthealing")
    
    public String healduls(
            @RequestParam(value = "nTempatwisata") String form1,
            @RequestParam(value = "lokasiTW") String form2,
            @RequestParam(value = "gambarTW") String form3,
            Model kurir
    ){
        kurir.addAttribute("pTW", form1);
        kurir.addAttribute("pLokasi",form2);
        kurir.addAttribute("pgambarTW", form3);
        
        return "view";
    
    }    
}
