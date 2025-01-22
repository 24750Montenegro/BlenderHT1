/**
 * This Java class contains JUnit tests for a Blender implementation, testing its power status, filling
 * capacity, and speed control functionalities.
 * 
 * Javier Alvarado - 24546
 * Jonathan Tubac - 24484
 * Juan Montenegro - 24750
 */
package uvg.edu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import uvg.edu.Blender;
import uvg.edu.IBlender;

public class BlenderTest {
    IBlender blender = new Blender();
    @Test
    public void Encender() {
        
        assertEquals(0, blender.checkPowerStatus());
        blender.switchPowerStatus();
        assertEquals(1, blender.checkPowerStatus());
        blender.switchPowerStatus();
        assertEquals(0, blender.checkPowerStatus());        
    }
    
    @Test
    public void Llenado(){
        assertFalse(blender.isFull());
        blender.fillBlender("Fresa", 100);
        assertEquals(100, blender.actualCapacity(), 0.001);
        blender.fillBlender("banano");
        assertTrue(blender.isFull());
        assertEquals(1000, blender.actualCapacity(), 0.001);
        blender.emptyBlender(800);
        assertEquals(200, blender.actualCapacity(), 0.001);
        assertFalse(blender.isFull());
        blender.emptyBlender();
        assertEquals(0, blender.actualCapacity(), 0.001);
        assertFalse(blender.isFull());
    }

    @Test
    public void Velocidad(){
        assertEquals(0, blender.checkSpeed());
        blender.increaseSpeed();
        assertEquals(1, blender.checkSpeed());
        blender.increaseSpeed();
        assertEquals(2, blender.checkSpeed());
        blender.increaseSpeed();
        assertEquals(3, blender.checkSpeed());
        blender.decreaseSpeed();
        assertEquals(2, blender.checkSpeed());
        blender.decreaseSpeed();
        assertEquals(1, blender.checkSpeed());
        blender.decreaseSpeed();
        assertEquals(0, blender.checkSpeed());
    }
}
