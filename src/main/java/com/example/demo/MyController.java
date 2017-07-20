package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by rickiecashwell on 6/26/17.
 */
@Controller
public class MyController {
    @Autowired
    MyRepo repo;
    Random rand = new Random();

    @RequestMapping("/")
    public String home(Model model){
        Integer id = rand.nextInt(4)+1;
        if(id != null) {
            model.addAttribute("word", repo.getWordbyId(id).getWord());
            model.addAttribute("theme", repo.getWordbyId(id).getTheme());
            model.addAttribute("characters", repo.getWordbyId(id).getwordCount());
            ArrayList<String> characters = new ArrayList<>();
            for (int i = 0; i < repo.getWordbyId(id).getWord().length(); i++) {
                char charcter = repo.getWordbyId(id).getWord().charAt(i);
                characters.add(Character.toString(charcter));
            }
            
            model.addAttribute("char",characters);
        }else{
            model.addAttribute("word", new Word());
        }

        return "index";

    }

}
