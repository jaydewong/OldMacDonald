class NamedCow extends Cow {
  
  private String myName;
  public NamedCow(String name, String type, String sound){ //fix tmrw
    myName = name;
  }
  
  public getName(){
    return myName;
  }
  
}
