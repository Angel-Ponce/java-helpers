# Animator Swing Components
 - Is a default class to use if you want to move your swing components in your application
 - Easy to use
 
 ## How to use?
 - Add the class Animator in your project
 - Change the default package
 - Use the static method to move your components
 
 ## Example
 
 ```java
 JPanel panel = new JPanel();
 panel1.setBounds(0,0,500,500) //Panel in some frame at (0,0) position and (500,500) size
 Animator.animate(panel1, new Point(100,200)); //Move the panel to (100,200) possition :D
 ```
