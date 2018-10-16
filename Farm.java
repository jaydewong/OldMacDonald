class Farm 
{  
  private Animal[] aBunchOfAnimals = new Animal[3];
  public Farm(){
    aBunchOfAnimals[0] = new NamedCow("Elsie","cow", "moo");
    aBunchOfAnimals[1] = new Chick();
    aBunchOfAnimals[2] = new Pig("pig", "oink");
  }
    public void animalSounds(){
      for(int nI = 0; nI < aBunchOfAnimals.length;nI++){
        System.out.println(aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());
      }
    }
}
   //your code here
