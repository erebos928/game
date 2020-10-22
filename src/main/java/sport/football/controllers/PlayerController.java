package sport.football.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sport.football.dataaccess.PlayerRepository;
import sport.football.entities.Player;

import java.util.List;

import javax.sql.DataSource;

@Controller
public class PlayerController{
	@Autowired
	PlayerRepository playerRepository;
	
	LocalContainerEntityManagerFactoryBean entityManagerFactory;
//    @GetMapping("/home")
//    public String listPlayers(Model model){
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("liga");
//        EntityManager em = emf.createEntityManager();
//        List<Player> players = em.createQuery("select player from Player player").getResultList();
//        //Map<Nationality,List<Player>> bPlayers = players.stream().collect(groupingBy(Player::getNationality));
//        model.addAttribute("players",players);
//        return "players.html";
//    }
    @GetMapping("/wagner")
    public String listPlayer2(Model model) {
    	List<Player> players = playerRepository.findAll();
    	model.addAttribute("players",players);
    	
    	return "players.html";
    }
}