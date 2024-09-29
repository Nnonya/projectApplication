package com.projectapp.projectApplication;

public class Project {
   private Long Id;
   private String month;
   private String description;

   public Project(Long id, String month, String description) {
      Id = id;
      this.month = month;
      this.description = description;
   }

   public Long getId() {
      return Id;
   }

   public void setId(Long id) {
      Id = id;
   }

   public String getMonth() {
      return month;
   }

   public void setMonth(String month) {
      this.month = month;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }
}
