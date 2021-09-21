package com.mybooksite.service;

import java.io.IOException;
import java.util.List;

import com.mybooksite.repository.IbookReader;

/**
 * This class reads the documents provided
 */
public class ReaderService implements IbookReader{
	
	private String filepath;

	
	public ReaderService(String filepath) {
		// TODO Auto-generated method stub
		this.filepath = filepath;
	}


	@Override
	public List<String> readBook() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
