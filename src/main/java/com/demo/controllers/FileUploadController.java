package com.demo.controllers;

import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

  @RequestMapping(value = "/uploadFile")
  public String uploadFile() {
    return "uploadFile";
  }

  /**
   * Uploads the file.
   * 
   * @return
   */
  @RequestMapping(value = "/handleUpload")
  public String handleUpload(@RequestParam("file")
  MultipartFile file) {

    // validate the file
    try {
      if (!file.isEmpty()) {
        byte[] bytes = file.getBytes();
        FileOutputStream fos = new FileOutputStream(
            "C:\\Dev\\workspaces\\java-playground\\SpringMVCApplication\\SpringMVCApplication\\myFile.jpg");
        fos.write(bytes);
        fos.close();
        System.out.println("File uploaded successfully");
      }
    }
    catch (Exception e) {
      System.out.println("error uploading the file : " + e);
    }

    return "uploadComplete";
  }
}
