
public class SimpleUtilisateur implements Utilisateur {
	private String UserId;
	private String ItemId;
	private float Note;
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getItemId() {
		return ItemId;
	}
	public void setItemId(String itemId) {
		ItemId = itemId;
	}
	public float getNote() {
		return Note;
	}
	public void setNote(float note) {
		Note = note;
	}
	@Override
	public String toString() {
		return "SimpleUtilisateur [UserId=" + UserId + ", ItemId=" + ItemId + ", Note=" + Note + "]";
	}
	
}
