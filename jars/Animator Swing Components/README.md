# AnimatonClass
 - Is a library to animate your components
 - Easy to use

## How to use?
 - Import the jar library in your project
 - Import the library in your classes

## Example
```java
  //ATENTION, import the library :
  import AppPackage.AnimationClass;
  
  public class SomeClass{
    public void makeButton(){
    
      JButton button = new JButton("Hi, im a button");
      button.setSize(150,50); 
      
      int xInitial = 100;
      int xFinal = 200;
      
      AnimationClass animator = new AnimationClass(); //Instance of the class
      animator.jButtonXRight(xFinal,xInitial, 2, 1, button); //Animate the button from 100 x position to 200 x position with 2:1 relation
      
    }
  }
  
```
