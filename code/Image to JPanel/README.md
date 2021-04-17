# Image to JPanel
 - Is a default class to use if you want put many images in your project
 - Easy to use

## How to use?
 - Import the class Image in your project
 - Change the default package

## Example

```java
  JPanel container = new JPanel();
  container.setSize(500,500); //Container of image
  
  Image image = new Image(500,500,"/path/yourPaht/yourImage.png"); // yourImage.png should be into project
  
  container.add(image);
  container.repain(); //Now the image is showed 
```
