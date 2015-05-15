package Ships;

import java.io.Serializable;

/**
 * Write a description of class MatrixTools here.
 * 
 * @author JL
 * @version 07.05.14
 */

public class Ship implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4986167196383399769L;
	private int shipSize;
	private boolean isReady;
	private int reloadTime;
	private int shootArea;
	private int reloadTimeLeft;
	private int[][] coordinates;
	private int isHit = 0;


	/**
	 * Konstruktor der Klasse ship
	 * @param shipSize
	 * @param isReady
	 * @param reloadTime
	 * @param shootArea
	 */


	public Ship(int shipSize, boolean isReady, int reloadTime, int shootArea){
		this.shipSize = shipSize;
		this.isReady = isReady;
		this.reloadTime = reloadTime;
		this.shootArea = shootArea;
	}

	/**
	 * Default Konstruktor der Klasse Ship
	 */

	public Ship(){

	}

	/**
	 * getter ReloadTimeLeft
	 * @return
	 */

	public int getReloadTimeLeft() {
		return reloadTimeLeft;
	}

	/**
	 * Setter ReloadTimeLeft
	 * @param reloadTimeLeft
	 */

	public void setReloadTimeLeft(int reloadTimeLeft) {
		this.reloadTimeLeft = reloadTimeLeft;
		if(this.reloadTimeLeft > 0){
			this.isReady = false;
		}
		else{
			this.isReady = true;
		}
	}

	/**
	 * Getter isReady
	 * @return
	 */

	public boolean isReady() {
		return isReady;
	}

	/**
	 * Setter isReady
	 * @param isReady
	 */

	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}

	/**
	 * getter ReloadTime
	 * @return
	 */

	public int getReloadTime() {
		return reloadTime;
	}

	/**
	 * Setter ReloadTimer
	 * @param reloadTime
	 */

	public void setReloadTime(int reloadTime) {
		this.reloadTime = reloadTime;
	}

	/**
	 * Getter Shootarea
	 * @return
	 */

	public int getShootArea() {
		return shootArea;
	}

	/**
	 * Setter ShootArea
	 * @param shootArea
	 */

	public void setShootArea(int shootArea) {
		this.shootArea = shootArea;
	}

	/**
	 * getterShipSize
	 * @return
	 */

	public int getShipSize() {
		return shipSize;
	}

	/**
	 * Setter Shipsize
	 * @param shipSize
	 */

	public void setShipSize(int shipSize) {
		this.shipSize = shipSize;
	}

	/**
	 * Getter für die Schiffkoordinaten
	 * @return
	 */

	public int[][] getCoordinates() {
		return coordinates;
	}

	/**
	 * Setter für die Schiffskoordinaten
	 * @param coordinates
	 */

	public void setCoordinates(int[][] coordinates){
		this.coordinates = coordinates;
	}

	/**
	 * Methode setzt die Koordinaten eines Schiffs auf 0,0 wenn es getroffen wurde.
	 * @param x
	 * @param y
	 */

	public void setCoordinatesIfHitted(int x, int y) {
		System.out.println("x:" +x);
		System.out.println("y:" +y);
		for(int i = 0; i < this.coordinates[0].length; i++){
		System.out.println("i: "+i);
		System.out.println(this.coordinates[i][0]);
		System.out.println(this.coordinates[i][1]);
			if(this.coordinates[i][1] == x && this.coordinates[i][0] == y){
				coordinates[i][0] = 0;
				coordinates[i][1] = 0;
				isHit++;
				return;
			}
		}




		/*for(int i = 0; i < coordinates[0].length; i++){
			System.out.println("i = "+i);
			if(coordinates[1][i] == x){
				for(int j = 0; j < coordinates.length; j++){
					System.out.println("j = "+j);a
					if(coordinates[i][j] == y){
						coordinates[1][i] = 0;
						coordinates[1][j] = 0;
						isHit++;
						checkIfIsSwimming();
						return;
					}
				}
			}
		}*/
	}

	/**
	 * Methode überprüft, ob Schiff noch schwimmt oder untergegangen ist.
	 * @return
	 */

	public boolean checkIfIsSwimming(){
		if(isHit == shipSize){
			return false;
		}
		return true;
	}

}

