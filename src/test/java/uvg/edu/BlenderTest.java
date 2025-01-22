
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import uvg.edu.Blender;
import uvg.edu.IBlender;

public class BlenderTest {
    @Test
    public void shouldAnswerWithTrue() {
        IBlender blender = new Blender();

        /* Test para el método isOn, isOff y getState */
        assertFalse(blender.getState()); // Inicialmente apagado
        blender.isOn(); // Encender
        assertTrue(blender.getState()); // Ahora está encendido
        blender.isOff();// Apagado
        assertFalse(blender.getState()); //Ahora está apagada

        /* Test para verificar el método isFull, fill y empty */
        assertFalse(blender.isFull()); // Inicialmente vacía
        blender.fill(); // Llenar la licuadora
        assertTrue(blender.isFull()); // Ahora está llena
        blender.empty(); //Vaciar licuadora
        assertFalse(blender.isFull()); //Ahora está vacia

        /* Test para verificar el método increaseSpeed, decreaseSpeed y getSpeed*/
        assertEquals("La velocidad debe ser inicialmente 0",0, blender.getSpeed()); // Velocidad inicial 0
        blender.increaseSpeed(); //aumenta la velocidad en 1
        blender.increaseSpeed(); //aumenta la velocidad en 1
        assertEquals("La velocidad debe ser 2, 1 + 1 = 2",2, blender.getSpeed()); // Aumentó a 2
        blender.decreaseSpeed(); //disminuye en 1
        assertEquals("La velocidad debe ser 1, 2 - 1 = 1",1, blender.getSpeed()); // Disminuyó a 1



    }
}
