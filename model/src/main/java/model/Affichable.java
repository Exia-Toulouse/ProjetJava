package model;

import contract.IAffichable;

public abstract class Affichable implements IAffichable{
	String typeObject=" ";
	int x, y = 0 ;
	World world;
	Affichable(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void registerWorld(World y){
		this.world=y;
     	}
	
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public void move(){
		
	}
	
	public String get_type(){
		return this.typeObject;
	}
}
