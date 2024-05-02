package br.com.rafaelmoura.gamestore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.rafaelmoura.gamestore.Model.Game;
import br.com.rafaelmoura.gamestore.Repository.GameRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class GameController {

    @Autowired
    GameRepository gameRepository;
    
    @GetMapping("/list")
    public ModelAndView getListGame() {
        ModelAndView mv = new ModelAndView("game-list");
        mv.addObject("games", gameRepository.findAll());
        return mv;
    }
    @GetMapping("/addgame")
    public String getAddGame() {
        return "game-add";
    }
    @PostMapping("/addgame")
    public String postAddGame(Game game) {
        gameRepository.save(game);
        return "redirect:/list";
    }
    
    

}
