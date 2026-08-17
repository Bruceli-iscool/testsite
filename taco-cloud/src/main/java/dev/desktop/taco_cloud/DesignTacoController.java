package dev.desktop.taco_cloud;
// controller class to handle http get requests on path /design

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import lombok.extern.slf4j.Slf4j;
import dev.desktop.taco_cloud.Ingredient;
import dev.desktop.taco_cloud.Taco;
import dev.desktop.taco_cloud.Ingredient.Type;;

@Slf4j
@Controller
// requests that the path is /design
@RequestMapping("/design")
@SessionAttributes("tacoOrder")
public class DesignTacoController {
    
}
