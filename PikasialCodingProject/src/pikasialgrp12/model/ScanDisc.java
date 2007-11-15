import java.io.*;
import java.util.*;

public class ScanDisc{

    public Vector allMyImage;		// vecteur de l'ensemble des fichiers.
    private File[] fileList;		// tableau de la liste des fichiers.

    public ScanDisc(String vRacine){
        allMyImage = new Vector();
        this.fileList = lister( new File(vRacine)); 
        selectImage(this.fileList);	// remplissage de allMyImage.
    }

	public void selectImage(File[] vFileList){
        String filePath;
        String morceau;
        for(int i=0;i<vFileList.length;i++){
            if(vFileList[i].isDirectory()){
                selectImage(lister(vFileList[i]));
            }
            else{
				morceau = vFileList[i].getName();
				filePath = vFileList[i].getPath();
                if(morceau.endsWith(".jpg") || morceau.endsWith(".png") || morceau.endsWith(".gif") || morceau.endsWith(".bmp")){
					allMyImage.add(vFileList[i]);
					System.out.println("nom de l\'image : "+morceau);
					System.out.println("chemin complet de l\'image : "+filePath);
				}
            }
        }
    }

    public File[] lister(File fichierCourant){
        File[] retour = fichierCourant.listFiles(); 
        return retour; 
    }

	public static void main(String args[]){
		new ScanDisc("c://");
	}
}
