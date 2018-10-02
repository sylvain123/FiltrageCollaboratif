import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CsvUtilisateurDao1Test {
	private final static String FILE_NAME = "src/Base_Donnée.csv";
	private static File file;
	private static  UtilisateurDao utilisateurDao;
	@BeforeEach
    public void beforeEach() throws IOException {
        file = CsvFileHelper.getResource(FILE_NAME);
        utilisateurDao = new CsvUtilisateurDao1(file);
    }

    @Test
    public void testFindAllChiens() {

        // Param
        // ...

        // Result
        final int nombreUtilisateur = 100004;

        // Appel
        List<Utilisateur> chiens = utilisateurDao.findAllUsers();

        // Test
        assertEquals(nombreUtilisateur, chiens.size());
    }

    @Test
    public void testUn() {
        // Param
        final String userId = "1";
        final String movieId="31";
        final float note=2.5f;
        

        // Appel
        List<Utilisateur> utilisateurs = utilisateurDao.findAllUsers();
        Utilisateur un = null;

        
		for (Utilisateur utilisateur : utilisateurs) {
            if (utilisateur.getUserId().equals(userId)) {
            	un = utilisateur;
                break;
            }
        }

        // Test
        assertNotNull(un);
        assertEquals(userId, un.getUserId());
        assertEquals(movieId, un.getItemId());
        assertEquals(note, un.getNote());


}
}
