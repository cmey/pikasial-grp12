/*
 * ImageLoader.java
 *
 * Created on 5 novembre 2007, 15:11
 *
 */

package pikasialgrp12.visualization;

import javax.imageio.ImageIO;

/**
 *
 * @author cyberchrist
 */
public class ImageLoader {
    
    /** Creates a new instance of ImageLoader */
    public ImageLoader() {
    }
    
    
    public String[] getImageFormatSupportedForReading(){
        return ImageIO.getReaderFormatNames();
    }
    
    
    public String[] getImageFormatSupportedForWriting(){
        return ImageIO.getWriterFormatNames();
    }
}
