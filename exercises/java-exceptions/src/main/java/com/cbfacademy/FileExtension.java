package com.cbfacademy;

public class FileExtension {

    // private String fileName;

    // public FileExtension(String fileName) {
    //     this.fileName = fileName;
    // } no need for a constructor cos this will not be instantiated with filename

    public int check (String fileName) throws NullFilenameException {
        int extensionNumber = 0;
        if (fileName == null | fileName == "") {
            throw new NullFilenameException();
        } else if (fileName.contains(".java")) {
            extensionNumber = 1;
        } else if (!fileName.contains(".java")) {
            extensionNumber = 0;
        }
        return extensionNumber;
        
        }
        

};
    
