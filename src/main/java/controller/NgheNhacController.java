package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.NgheNhacService;
import moduls.NgheNhac;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import service.NgheNhacService;

import java.io.File;
import java.io.IOException;

@Controller
public class NgheNhacController {
    NgheNhacService ngheNhacService=new NgheNhacService();

    @RequestMapping("home")
    public ModelAndView  home(){
        ModelAndView modelAndView=new ModelAndView("home");
        modelAndView.addObject("list",ngheNhacService.list);
        return modelAndView;
    }
    @PostMapping("create")
    public String create(@ModelAttribute NgheNhac ngheNhac,@RequestParam MultipartFile upload) throws IOException {
        String nameMusic=upload.getOriginalFilename();
        FileCopyUtils.copy(upload.getBytes(),new File("C:\\Users\\Admin\\IdeaProjects\\BTJames\\src\\main\\webapp\\filemusic"+nameMusic));
        String url = "/music/" + nameMusic;
        ngheNhac.setFileMusic(url);
        ngheNhacService.save(ngheNhac);
        return "redirect:/home";
    }
    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView=new ModelAndView("create");
        modelAndView.addObject("list",new NgheNhac());

        return modelAndView;
    }
}
