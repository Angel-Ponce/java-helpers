# FlatLaf 1.0
 - Is a library to change the LookAndFeel of your java applications
 - Easy to use

## How to use?
 - Import the jar library in your project
 - Set the LookAndFeel application with FlatLaf

## Example

```java
  try{
    UIManager.setLookAndFeel(new FlatDarkLaf());
  }catch(UnsupportedLookAndFeelException e){
    System.out.println("An error was ocurred: "+e);
  }
```

## References
You can get more information [here](https://www.formdev.com/flatlaf/)
