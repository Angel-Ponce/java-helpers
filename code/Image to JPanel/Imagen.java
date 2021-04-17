package Clases;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * La clase Imagen facilita la colocacion de elementos gráficos, especificamente
 * imagenes dentro de componentes grandes como paneles, de esta manera se puede
 * dar diseño a la GUI
 *
 * @author Angel
 */
public class Imagen extends JPanel {

    int ancho;
    int alto;
    String ruta;

    /**
     * *
     * El constructor de imagen nos ayuda a inicializar una "imagen"
     *
     * @param alto Requiere especificar la altura de la imagen
     * @param ancho Requiere especificar la anchura de la imagen
     * @param ruta Requiere saber en que dirección del proyecto se encuentra la
     * imagén
     */
    public Imagen(int ancho, int alto, String ruta) {
        this.ancho = ancho;
        this.alto = alto;
        this.ruta = ruta;
        this.setSize(ancho, alto);
    }


    /**
     * *
     * El método sobre escrito paint nos facilitará una pintura en un panel, sin
     * obstruir otros componentes.
     *
     * @param g Requiere un objeto de la clase Graphics
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Dimension d = this.getSize();
		ImageIcon img = new ImageIcon(getClass().getResource(ruta));
		g.drawImage(img.getImage(), 0, 0, d.width, d.height, null);
		setOpaque(false);
                
    }

}

/*

	EJEMPLO DE COMO IMPLEMENTARLO
	
	Supone que tienes un panel repleto de botones, cajas de texto, etc.
	Y quieres darle un fondo para que no sea vea tan feo, entonces nombremos a ese panel como
	"contenedor", contenedor sera el panel al que le agregaremos un fondo.
	
	Bueno, ahora, tienes que tener una imagen de fondo para agregar.
	Yo te recomiendo que esa imagen la guardes dentro de un packete que se llame "Images"
	así, todas las imagenes que vayas a usar las metes dentro de ese paquete, tiene que ser un paquete
	dentro del proyecto es decir dentro de la carpeta "src".
	
	Bueno, ya que tienes tu imagen dentro de tu paquete de imagenes entonces ahora tienes que hacer
	una instancia de la clase Imagen (La de arriba) para poder usar el fondo.
	
	Imagen fondo = new Imagen(ancho,alto,"/Images/tuImagen.png");
	
	Esta clase requiere que en el constructor le pases, el ancho y alto de tu imagen,
	también requiere saber en que ubicación estara la imagen, como antes te explique, puede que
	sea mejor tener un paquete exclusivo para las imagenes, puede llamarse como tu quieras,
	pero recuerda entonces que debes cambiar ese nombre en la ruta "/NombreDeTuPaquete/nombreDeTuImagen.png"
	tambien puede ser jpg.
	
	Ahora, para agregar esta imagen al fondo de tu contenedor será así:
	
	contenedor.add(fondo);
	
	Y listo, se abra agregado el fondo correctamente, y no obstruira a los demas componentes que se encuentren
	encima.
	
	Recuerda que contenedor debe ser un objeto de tipo Panel.

*/
