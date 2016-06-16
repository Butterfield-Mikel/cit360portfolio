/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mikel
 */

public class Controller {
   private AlbumAndSong model;
   private View view;

   public Controller(AlbumAndSong model, View view){
      this.model = model;
      this.view = view;
   }

   public void albumName(String name){
      model.setName(name);		
   }

   public String getStudentName(){
      return model.getAlbum();		
   }

   public void setStudentRollNo(String rollNo){
      model.track(rollNo);		
   }

   public String getTrack(){
      return model.getTrack();		
   }

   public void updateView(){				
      view.showSongInfo(model.getAlbum(), model.getTrack());
   }	
}