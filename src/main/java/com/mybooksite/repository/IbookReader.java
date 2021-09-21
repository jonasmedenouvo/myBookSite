package com.mybooksite.repository;

import java.io.IOException;
import java.util.List;

/**
 * @author jonas
 *
 */
public interface IbookReader {
	List<String> readBook() throws IOException;

}
