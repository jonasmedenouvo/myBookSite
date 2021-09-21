/**
 * 
 */
package com.mybooksite.repository;

import java.io.IOException;
import java.util.List;

/**
 * @author jonas
 *
 */
public interface IbookWriter {
	List<String> writeBook() throws IOException;

}
