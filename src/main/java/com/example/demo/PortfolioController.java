package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;
import java.util.List;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String index(Model model) {
        // Your Projects
        List<Project> myProjects = List.of(
            new Project("Java Backend", "Spring Boot MVC Portfolio", "Java, Maven, Thymeleaf"),
            new Project("Cloud Deployment", "Running on AWS/GCP", "Docker, GCP/AWS")
        );

        // Your Skill Categories
        Map<String, String> skills = Map.of(
            "Backend/Blockchain", "Java, Laravel, Node.js, Python, Solidity, Ethers.js",
            "Frontend/Mobile", "React.js, Vue3.js, React Native, Android Java",
            "Databases", "MySQL, PostgreSQL, MongoDB, Firebase",
            "Cloud/DevOps", "Google Cloud, AWS, CI/CD, Docker, Cloudflare",
            "Tools", "Jira, Confluence, Slack, Asana"
        );
        
        model.addAttribute("projects", myProjects);
        model.addAttribute("skills", skills);
        
        return "index"; 
    }
}