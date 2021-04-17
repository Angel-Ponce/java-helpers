# Connecter
 - Is a default class to use if you want to get a easy connections with your databases
 - Esasy to use

## How to use?
 - Import the class Connecter in your project
 - Import the necesary librarys to use, you can get this librarys at [Library](https://github.com/Angel-Ponce/java-helpers/tree/main/jars/mysql/mysql-connector)
 - Change the default package

## Example

```java
Connecter c = new Connecter(); //Instance of class Connecter
try{
    c.conexion = c.getConexion(); //Getting the connection
    c.ps = (PreparedStatement) c.conexion.prepareStatement("SELECT age, name FROM users_table"); //Some query to execute
    c.rs = c.ps.executeQuery(); //Execute query
    while(c.rs.next()){ //Getting data result
      System.out.println("The name of user: "+c.rs.getString("name"));
      System.out.println("The age of user: "+c.rs.getInt("age"));
    }
}catch(SQLException e){
  System.err.println("An error was ocurred "+e);
}
```
