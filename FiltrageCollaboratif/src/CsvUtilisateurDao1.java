import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvUtilisateurDao1 implements UtilisateurDao {
	private File file;
    private CsvFile csvFile;

    private CsvUtilisateurDao1() {
        super();
    }

    public CsvUtilisateurDao1(File file) throws IOException {
        this();
        this.file = file;
        this.csvFile = new CsvFile01(file);
    }
	@Override
	public  List<Utilisateur> findAllUsers(){
		final List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
		
		final List<String[]> data = csvFile.getData();
		final List<String[]> dataSansTitre = data;
	    dataSansTitre.remove(0);

		    for(String[] oneData : data) {
		        Utilisateur utilisateur = tabToUtilisateur(oneData);
		        utilisateurs.add(utilisateur);
		    }
		return utilisateurs;
	}

	private Utilisateur tabToUtilisateur(String[] oneData) {
		SimpleUtilisateur Utilisateur = new SimpleUtilisateur();

		Utilisateur.setUserId((oneData[0]));
		Utilisateur.setItemId(oneData[1]);
		Utilisateur.setNote(Float.parseFloat(oneData[2]));
	

		return Utilisateur;
}	
}
