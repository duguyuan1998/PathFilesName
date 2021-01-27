package com.duguyuan;

import java.io.File;
import java.util.Scanner;

public class PathFilesName {

    /**
     * 输出指定目录下的所有文件名
     */
    public static void listFiles(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        File file = new File(path);
        if (file.isDirectory()) {
            listFiles(file);
        }
        in.close();
    }

}
