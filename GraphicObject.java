import javax.sound.midi.Synthesizer;

abstract public class GraphicObject {    
    int x,y;
    
    abstract void draw();
    abstract void resize();
}
