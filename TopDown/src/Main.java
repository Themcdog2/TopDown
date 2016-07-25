import org.lwjgl.input.Cursor;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.ImageData;

public class Main extends BasicGame{
	//TODO IN ORDER OF IMPORTANCE
	/* Add game loop
	 * Add multi-resolution tile based rendering support (800*600) (1280*800) (1920*1080) ect.
	 * I have no idea how to do that ^^
	 * Sprite sheet?
	 * 
	 * 
	 * 
	 */
	
	
	
	

	public static void main(String[] args){
		 try {
			new AppGameContainer(new Main("Game"), 800, 600, false).start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
		
	}
	
	public Main(String title) {
		super(title);
		
	}
	
	//This should be used to init our sprites, images and other items that need to be put in memory
	@Override
	public void init(GameContainer e) throws SlickException {
	
		
	}
	
	//Doing rendering in another class for organization purposes 
	@Override
	public void render(GameContainer e, Graphics g) throws SlickException {
		
		
	}

	
	//Doing updates in another class for organization purposes
	@Override
	public void update(GameContainer e, int tick) throws SlickException {
		
		
	}
	
	//Don't want a static main class, try to reference it as little as possible
	
}
