/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mikel
 */

public class MikelsMVC {
   public static void main(String[] args) {

      AlbumAndSong model  = getAlbumInfo();
      View view = new View();
      Controller controller = new Controller(model, view);
      controller.updateView();
      controller.albumName("Time I");
      controller.updateView();
   }

   private static AlbumAndSong getAlbumInfo(){
      AlbumAndSong album = new AlbumAndSong();
      album.setName("Wintersun");
      album.track("Beyond the Dark Sun");
      return album;
   }
}