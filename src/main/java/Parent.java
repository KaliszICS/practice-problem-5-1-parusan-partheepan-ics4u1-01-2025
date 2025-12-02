public class Parent extends Person {
    private Parent spouse;
    private Child[] children;
    
   
    public Parent(String name, int age, Parent spouse) {
        super(name, age);  
        this.spouse = spouse;
        this.children = new Child[0];  
    }
    
    
    public Parent(String name, int age) {
        this(name, age, null);  
    }
    
   
    public Parent getSpouse() {
        return spouse;
    }
    
   
    public void setSpouse(Parent spouse) {
        this.spouse = spouse;
    }
    
  
    public Child[] getChildren() {
        return children;
    }
    
   
    public void setChildren(Child[] children) {
        this.children = children;
    }
    

    public void addChild(Child child) {
    
        Child[] newChildren = new Child[children.length + 1];
        
        for (int i = 0; i < children.length; i++) {
            newChildren[i] = children[i];
        }
        
        newChildren[children.length] = child;
        
       
        children = newChildren;
    }
}