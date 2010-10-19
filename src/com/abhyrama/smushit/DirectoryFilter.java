/*
 * A command line interface to yahoo!'s smush.it lossless image compression utility - http://www.smushit.com/ysmush.it/
 * http://bitbucket.org/abhirama/smushit
 *
 * Copyright 2010, Abhirama
 * Licensed under the MIT license.
 * http://abhirama.wordpress.com/
 */
package com.abhyrama.smushit;

import java.io.FileFilter;
import java.io.File;

public class DirectoryFilter implements FileFilter {

  public boolean accept(File file) {
    return file.isDirectory();
  }
}
