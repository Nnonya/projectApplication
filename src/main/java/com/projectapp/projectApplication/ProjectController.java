package com.projectapp.projectApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectController {
   private List<Project> projects =
       new ArrayList<>();

   public ProjectController(){
      Project project1 =
          new Project(1L, "January",
              "Create a calculator app");
      projects.add(project1);
   }

   @GetMapping("/projects")
   public List<Project> getAllProjects(){
      return projects;
   }
}
