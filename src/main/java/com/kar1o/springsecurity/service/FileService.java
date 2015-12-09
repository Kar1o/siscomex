package com.kar1o.springsecurity.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

<<<<<<< HEAD
@Service("fileService")
public class FileService {

	public static final String SAVE_LOCATION = "/home/k/Documents/siscomex-master/files/";

	public boolean saveFile(MultipartFile multipartFile) {
		boolean result = false;
		// set the saved location and create a directory location
		String fileName = multipartFile.getOriginalFilename();
		String location = SAVE_LOCATION;
		File pathFile = new File(location);
		// check if directory exist, if not, create directory
		if (!pathFile.exists()) {
			pathFile.mkdir();
		}

		// create the actual file
		pathFile = new File(location + fileName);
		// save the actual file
		try {
			multipartFile.transferTo(pathFile);
			result = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
=======

@Service("fileService")
public class FileService {

    public static final String SAVE_LOCATION = "/home/kar1o/Workspaces/spring/siscomex/";

    public boolean saveFile(MultipartFile multipartFile){
        boolean result = false;
        //set the saved location and create a directory location
        String fileName  = multipartFile.getOriginalFilename();
        String location = SAVE_LOCATION;
        File pathFile = new File(location);
        //check if directory exist, if not, create directory
        if(!pathFile.exists()){
            pathFile.mkdir();
        }

        //create the actual file
        pathFile = new File(location + fileName);
        //save the actual file
        try {
            multipartFile.transferTo(pathFile);
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
}