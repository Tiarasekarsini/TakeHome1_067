/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.a.takehome1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ASUS
 */

@Controller
public class iniController {
    public static String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "/src/main/resources/static";
    @RequestMapping("/nexthealing")
    
    public String healduls(
            @RequestParam(value = "nTempatwisata") String form1,
            @RequestParam(value = "lokasiTW") String form2,
            @RequestParam(value = "gambarTW") MultipartFile form3,
            Model kurir
    )throws IOException {
        
        StringBuilder fileNames = new StringBuilder();
        Path fileNameAndPath = Paths.get(UPLOAD_DIRECTORY, form3.getOriginalFilename());
        fileNames.append(form3.getOriginalFilename());
        Files.write(fileNameAndPath, form3.getBytes());
        
        kurir.addAttribute("pTW", form1);
        kurir.addAttribute("pLokasi",form2);
        kurir.addAttribute("pgambarTW", form3.getOriginalFilename());
        
        return "view";
    }    
}
