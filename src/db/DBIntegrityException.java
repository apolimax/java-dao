package db;

public class DBIntegrityException extends RuntimeException {

	private static final long serialVersionUID = -8136478296170204346L;
	
	public DBIntegrityException(String msg) {
		super(msg);
	}

}
