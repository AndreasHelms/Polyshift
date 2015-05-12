package hamburg.haw.polyshift.Game;

import java.util.ArrayList;

public class GameObject{
	
	public boolean isMovingLeft = false;
	public boolean isMovingRight = false;
	public boolean isMovingUp = false;
	public boolean isMovingDown = false;
    public boolean isLocked = false;
    public boolean allLocked = false;
	public String lastState = "";
	public float movingVelocity = 0.15f;
    public Vector block_position;
    public Vector pixel_position;
	public  float []colors = new float[4];
	boolean isPlayerOne;
    private Mesh mesh;
    public ArrayList<Mesh> border_list = new ArrayList<Mesh>();

    public void setMesh(Mesh mesh) {
        this.mesh = mesh;
        this.pixel_position = new Vector(-1,-1,0);
    }
    public Mesh getMesh() {
        return mesh;
    }

    public void setBorder(Mesh mesh){
        this.border_list.add(mesh);
    }

}
