import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class CsvFileHelperTest {
	private final static String FILE_NAME = "src/Base_Donnée.csv";
	@Test
	public void testGetResource() {
		final String fileName = FILE_NAME;
		final File file = CsvFileHelper.getResource(fileName);
		assertTrue(file.exists());
	}
	
	@Test
	public void testReadFile() throws IOException {
	    // Param
	    final String fileName = FILE_NAME;

	    // Result
	    final int nombreLigne = 100005;

	    // Appel
	    final File file = CsvFileHelper.getResource(fileName);
	    List<String> lines = CsvFileHelper.readFile(file);

	    // Test
	   assertEquals(nombreLigne, lines.size());
	}
}
