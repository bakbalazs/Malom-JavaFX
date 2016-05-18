package hu.unideb.inf.malom.db.jelszotitkositas;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Bak Balázs
 *
 **/

/**
 *	Szöveget titkosító osztály.
 *
 **/
public class JelszoTitkositas {
	
	/**
	 * A beírt szöveget titkosítja le.
	 * 
	 * @param titkosjelszo A titkosítani kívánt szöveg.
	 * @return A titkosított szöveg.
	 * @throws NoSuchAlgorithmException  sada.
	 **/
	public static String titkositas(String titkosjelszo) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA");
		md.update(titkosjelszo.getBytes());
		byte[] b = md.digest();
		StringBuffer sb = new StringBuffer();
		for(byte bl : b){
			sb.append(Integer.toHexString(bl & 0xff).toString());
		}
		return sb.toString();
	}

}
