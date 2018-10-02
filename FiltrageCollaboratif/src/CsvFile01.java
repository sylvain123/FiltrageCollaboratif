import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFile01 implements CsvFile {
	public final static char SEPARATOR = ',';

    private File file;
    private List<String> lines;
    private List<String[] > data;

    private CsvFile01() {
    }

    public CsvFile01(File file) throws IOException {
        this.file = file;

        // Init
        init();
    }

    private void init() throws IOException {
        lines = CsvFileHelper.readFile(file);

        data = new ArrayList<String[] >(lines.size());
        String sep = new Character(SEPARATOR).toString();
        for (String line : lines) {
            String[] oneData = line.split(sep);
            data.add(oneData);
        }
    }

	public void setFile(File file) {
		this.file = file;
	}

	public void setLines(List<String> lines) {
		this.lines = lines;
	}

	public void setData(List<String[]> data) {
		this.data = data;
	}

	public File getFile() {
		return file;
	}

	public List<String> getLines() {
		return lines;
	}

	public List<String[]> getData() {
		return data;
	}
}
