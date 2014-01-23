package server;
/*****************************************************************
 * Datei:     Main.java
 * Verfasser: Marc Gottschall
 * Version:   1.1
 * Datum:     12.12.13
 * 
 * Letzte �nderungen
 * - 
 * - Dokumentation mit javadocs erstellt(\Server - Client incl. Doku (MG)\doc)
 * - Nachricht kann jetzt vom Benutzer eingegeben werden 
 * - Datum bei Ausgabe der Nachricht auf dem Server eingef�gt 
 * - Kommentare eingef�gt
 *
 **************************************************************** */



import java.io.IOException;			// signalisiert Ein-/Ausgabefehler



/**  
 * Hauptklasse
 * */
public class Main 
{

	
	
	/** Hauptteil 
	 * erstellt ein Objekt der Klasse <code>Server</code> und f�hrt die darin enthaltene Methode "<code>starten</code>"auf.
	 * Au�erdem werden Fehlermeldungen vom Error-Stream abgefangen und ausgegeben.
	 * @see Server#Server()
	 * @see Server#starten()
	 * */	
	public static void main(String[] args) throws IOException 
	{
		final Server server = new Server();								
       
    	while(true)
	    {

	    	try 
	    	{
	    		server.starten();												// Server wird gestartet und ist empfangsbereit
		    } 
	    	
	    	
	    	catch (IOException e) 												// signalisiert Ein-/Ausgabefehler
	    	{
		        e.printStackTrace();
	        } 
	    	

		}
	 }
	    
	
}
	
