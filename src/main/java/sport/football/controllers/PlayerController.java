package sport.football.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sport.football.entities.Player;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Controller
public class PlayerController{
    @GetMapping("/home")
    public String listPlayers(Model model){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("liga");
        EntityManager em = emf.createEntityManager();
        List<Player> players = em.createQuery("select player from Player player").getResultList();
        //Map<Nationality,List<Player>> bPlayers = players.stream().collect(groupingBy(Player::getNationality));
        model.addAttribute("players",players);
        return "players.html";
    }
}