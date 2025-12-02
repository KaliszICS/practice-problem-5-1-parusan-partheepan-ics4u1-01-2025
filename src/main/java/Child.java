public class Child extends Person {
    private Parent parent1;
    private Parent parent2;
    private Child[] siblings;
    
   
    public Child(String name, int age, Parent parent1, Parent parent2) {
        super(name, age);  
        this.parent1 = parent1;
        this.parent2 = parent2;
        this.siblings = new Child[0];  
        
        if (parent1 != null) {
            parent1.addChild(this);
        }
        if (parent2 != null) {
            parent2.addChild(this);
        }
    }
    

    public Parent getParent1() {
        return parent1;
    }
    
    public Parent getParent2() {
        return parent2;
    }
    
    /**
     * Returns all siblings of this child
     * @return an array of Child objects
     */
    public Child[] getSiblings() {
        return siblings;
    }
    
  
    public void setSiblings(Child[] siblings) {
        this.siblings = siblings;
    }

    public void addSibling(Child sibling) {
        
        Child[] newSiblings = new Child[siblings.length + 1];
        
      
        for (int i = 0; i < siblings.length; i++) {
            newSiblings[i] = siblings[i];
        }
        
        newSiblings[siblings.length] = sibling;
        
        
        siblings = newSiblings;
    }
}