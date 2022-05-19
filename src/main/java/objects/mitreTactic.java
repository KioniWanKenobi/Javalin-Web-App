package objects;

public class mitreTactic {
  String name;
  String id;
  String description;

  public mitreTactic (String name, String id, String description){
     this.name = name;
     this.id = id;
     this.description = description;
  }
  
  public String getName(){
     return name;
  }
  
  public String getid(){
    return id;
  }

  public String getDescription(){
    return description;
  }
   
}
