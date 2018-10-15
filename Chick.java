class Chick implements Animal 
{     
    private String myType;
    private String mySound;
    double x = Math.random()*1;
    public Chick(){
      myType = "chick";
      if(x < 0.5){
      mySound = "cluck";
      }else{
        mySound = "cheep";
      }
    }
    public String getSound(){
      return mySound;
    }
    public String getType(){
      return myType;
    }
     //your code here
}
