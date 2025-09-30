import java.io.File;
import java.io.IOException;
import java.util.Random;

public class RandomWallpaper {
    
    private static final  String FOLDER_PATH = "/home/tea/Изображения/";


    public static void main(String[] args) throws IOException, InterruptedException {
        
        File dir = new File(FOLDER_PATH);

        System.out.println("Uri: " + FOLDER_PATH);

        if(!dir.isDirectory()){
            System.err.println("folder not found" + FOLDER_PATH);
            return;
        }

        File[] imageFiles = dir.listFiles((file) -> 
                file.isFile() && 
                    (file.getName().toLowerCase().endsWith(".jpg") ||
                    file.getName().toLowerCase().endsWith(".png") ||
                    file.getName().toLowerCase().endsWith(".jpeg"))
        );

        if(imageFiles == null || imageFiles.length == 0 ){
            System.out.println("Is folder empty!");
            return;
        }

        Random rand = new Random();
        int randomIndex = rand.nextInt(imageFiles.length);
        File randomImage = imageFiles[randomIndex];
        String absolutePath = randomImage.getAbsolutePath();

        String uri = "file://" + absolutePath.replace(" ","%20") ;

        String[] command ={
            "gsettings",
            "set",
            "org.gnome.desktop.background",
            "picture-uri",
            uri
        };
        String[] commandDark ={
            "gsettings",
            "set",
            "org.gnome.desktop.background",
            "picture-uri-dark",
            uri
        };

        String[] optionsCommand = {
            "gsettings",
            "set",
            "org.gnome.desktop.background",
            "picture-options",
            "zoom"
        };

        new ProcessBuilder(optionsCommand).start().waitFor();

        Process process = new ProcessBuilder(command).start();
        Process processDark = new ProcessBuilder(commandDark).start();

        int exitCode = process.waitFor();
        int exitCodeDark = processDark.waitFor();

        if(exitCode == 0 && exitCodeDark == 0) {
            System.out.println("Your wallpaper changed");
        } else {
            System.out.println("ERROR, not cahnged");
        }




        
        






        





        
    }



    


}
